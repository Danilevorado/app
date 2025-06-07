package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
abstract class JobIntentService extends Service {

    /* renamed from: t, reason: collision with root package name */
    static final Object f21628t = new Object();

    /* renamed from: u, reason: collision with root package name */
    static final HashMap f21629u = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    CompatJobEngine f21630m;

    /* renamed from: n, reason: collision with root package name */
    WorkEnqueuer f21631n;

    /* renamed from: o, reason: collision with root package name */
    CommandProcessor f21632o;

    /* renamed from: p, reason: collision with root package name */
    boolean f21633p = false;

    /* renamed from: q, reason: collision with root package name */
    boolean f21634q = false;

    /* renamed from: r, reason: collision with root package name */
    boolean f21635r = false;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f21636s = new ArrayList();

    final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        CommandProcessor() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem genericWorkItemA = JobIntentService.this.a();
                if (genericWorkItemA == null) {
                    return null;
                }
                JobIntentService.this.g(genericWorkItemA.getIntent());
                genericWorkItemA.complete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onCancelled(Void r12) {
            JobIntentService.this.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            JobIntentService.this.i();
        }
    }

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000L);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000L);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        CompatWorkItem(Intent intent, int i10) {
            this.mIntent = intent;
            this.mStartId = i10;
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }
    }

    private static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        ComponentNameWithWakeful(ComponentName componentName, boolean z10) {
            this.componentName = componentName;
            this.useWakefulService = z10;
        }
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public void complete() {
                String str;
                String str2;
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.mJobWork);
                        } catch (IllegalArgumentException e5) {
                            e = e5;
                            str = JobServiceEngineImpl.TAG;
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        } catch (SecurityException e10) {
                            e = e10;
                            str = JobServiceEngineImpl.TAG;
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        }
                    }
                }
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                    return new WrapperWorkItem(jobWorkItemDequeueWork);
                } catch (SecurityException e5) {
                    Log.e(TAG, "Failed to run mParams.dequeueWork()!", e5);
                    return null;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.mService.b();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return zB;
        }
    }

    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        JobWorkEnqueuer(Context context, ComponentName componentName, int i10) {
            super(componentName);
            ensureJobId(i10);
            this.mJobInfo = new JobInfo.Builder(i10, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        abstract void enqueueWork(Intent intent);

        void ensureJobId(int i10) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i10;
            } else {
                if (this.mJobId == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i10, Intent intent, boolean z10) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f21628t) {
            WorkEnqueuer workEnqueuerF = f(context, componentName, true, i10, z10);
            workEnqueuerF.ensureJobId(i10);
            try {
                workEnqueuerF.enqueueWork(intent);
            } catch (IllegalStateException e5) {
                if (!z10) {
                    throw e5;
                }
                f(context, componentName, true, i10, false).enqueueWork(intent);
            }
        }
    }

    public static void d(Context context, Class cls, int i10, Intent intent, boolean z10) {
        c(context, new ComponentName(context, (Class<?>) cls), i10, intent, z10);
    }

    static WorkEnqueuer f(Context context, ComponentName componentName, boolean z10, int i10, boolean z11) {
        WorkEnqueuer compatWorkEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z11);
        HashMap map = f21629u;
        WorkEnqueuer workEnqueuer = (WorkEnqueuer) map.get(componentNameWithWakeful);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (Build.VERSION.SDK_INT < 26 || z11) {
            compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i10);
        }
        WorkEnqueuer workEnqueuer2 = compatWorkEnqueuer;
        map.put(componentNameWithWakeful, workEnqueuer2);
        return workEnqueuer2;
    }

    GenericWorkItem a() {
        GenericWorkItem genericWorkItemDequeueWork;
        CompatJobEngine compatJobEngine = this.f21630m;
        if (compatJobEngine != null && (genericWorkItemDequeueWork = compatJobEngine.dequeueWork()) != null) {
            return genericWorkItemDequeueWork;
        }
        synchronized (this.f21636s) {
            if (this.f21636s.size() > 0) {
                return (GenericWorkItem) this.f21636s.remove(0);
            }
            return null;
        }
    }

    boolean b() {
        CommandProcessor commandProcessor = this.f21632o;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.f21633p);
        }
        this.f21634q = true;
        return h();
    }

    void e(boolean z10) {
        if (this.f21632o == null) {
            this.f21632o = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f21631n;
            if (workEnqueuer != null && z10) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f21632o.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList arrayList = this.f21636s;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f21632o = null;
                ArrayList arrayList2 = this.f21636s;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f21635r) {
                    this.f21631n.serviceProcessingFinished();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.f21630m;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21630m = new JobServiceEngineImpl(this);
            this.f21631n = null;
        }
        this.f21631n = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f21636s) {
            this.f21635r = true;
            this.f21631n.serviceProcessingFinished();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f21631n.serviceStartReceived();
        synchronized (this.f21636s) {
            ArrayList arrayList = this.f21636s;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i11));
            e(true);
        }
        return 3;
    }
}
