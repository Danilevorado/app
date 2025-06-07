package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import androidx.work.impl.u;
import androidx.work.impl.v;
import b1.j;
import g1.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements e {

    /* renamed from: p, reason: collision with root package name */
    private static final String f4119p = j.i("SystemJobService");

    /* renamed from: m, reason: collision with root package name */
    private e0 f4120m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f4121n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final v f4122o = new v();

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        JobParameters jobParameters;
        j.e().a(f4119p, mVar.b() + " executed on JobScheduler");
        synchronized (this.f4121n) {
            jobParameters = (JobParameters) this.f4121n.remove(mVar);
        }
        this.f4122o.a(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            e0 e0VarN = e0.n(getApplicationContext());
            this.f4120m = e0VarN;
            e0VarN.p().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.e().k(f4119p, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e0 e0Var = this.f4120m;
        if (e0Var != null) {
            e0Var.p().n(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f4120m == null) {
            j.e().a(f4119p, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m mVarA = a(jobParameters);
        if (mVarA == null) {
            j.e().c(f4119p, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f4121n) {
            if (this.f4121n.containsKey(mVarA)) {
                j.e().a(f4119p, "Job is already being executed by SystemJobService: " + mVarA);
                return false;
            }
            j.e().a(f4119p, "onStartJob for " + mVarA);
            this.f4121n.put(mVarA, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f4015b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f4014a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f4016c = b.a(jobParameters);
                }
            }
            this.f4120m.z(this.f4122o.c(mVarA), aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4120m == null) {
            j.e().a(f4119p, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m mVarA = a(jobParameters);
        if (mVarA == null) {
            j.e().c(f4119p, "WorkSpec id not found!");
            return false;
        }
        j.e().a(f4119p, "onStopJob for " + mVarA);
        synchronized (this.f4121n) {
            this.f4121n.remove(mVarA);
        }
        u uVarA = this.f4122o.a(mVarA);
        if (uVarA != null) {
            this.f4120m.B(uVarA);
        }
        return !this.f4120m.p().j(mVarA.b());
    }
}
