package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.e3;
import com.onesignal.f0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
class r2 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f22323e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static r2 f22324f;

    /* renamed from: d, reason: collision with root package name */
    private Long f22325d = 0L;

    static class a extends c {

        /* renamed from: m, reason: collision with root package name */
        private WeakReference f22326m;

        a(Service service) {
            this.f22326m = new WeakReference(service);
        }

        @Override // com.onesignal.r2.c
        protected void a() {
            e3.a(e3.z.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.f22326m.get() != null) {
                ((Service) this.f22326m.get()).stopSelf();
            }
        }
    }

    static class b extends c {

        /* renamed from: m, reason: collision with root package name */
        private WeakReference f22327m;

        /* renamed from: n, reason: collision with root package name */
        private JobParameters f22328n;

        b(JobService jobService, JobParameters jobParameters) {
            this.f22327m = new WeakReference(jobService);
            this.f22328n = jobParameters;
        }

        @Override // com.onesignal.r2.c
        protected void a() {
            e3.a(e3.z.DEBUG, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + r2.q().f22344a);
            boolean z10 = r2.q().f22344a;
            r2.q().f22344a = false;
            if (this.f22327m.get() != null) {
                ((JobService) this.f22327m.get()).jobFinished(this.f22328n, z10);
            }
        }
    }

    static abstract class c implements Runnable {

        class a implements f0.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BlockingQueue f22329a;

            a(BlockingQueue blockingQueue) {
                this.f22329a = blockingQueue;
            }

            @Override // com.onesignal.f0.b
            public f0.f a() {
                return f0.f.SYNC_SERVICE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.onesignal.f0.b
            public void b(f0.d dVar) {
                f0.d obj = dVar;
                if (dVar == null) {
                    obj = new Object();
                }
                this.f22329a.offer(obj);
            }
        }

        c() {
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            synchronized (s0.f22343c) {
                r2.q().f22325d = 0L;
            }
            if (e3.E0() == null) {
                a();
                return;
            }
            e3.f21886g = e3.t0();
            s3.k();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                f0.g(e3.f21882e, false, false, new a(arrayBlockingQueue));
                Object objTake = arrayBlockingQueue.take();
                if (objTake instanceof f0.d) {
                    s3.w((f0.d) objTake);
                }
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            s3.u(true);
            e3.f0().d();
            a();
        }
    }

    r2() {
    }

    static r2 q() {
        if (f22324f == null) {
            synchronized (f22323e) {
                if (f22324f == null) {
                    f22324f = new r2();
                }
            }
        }
        return f22324f;
    }

    @Override // com.onesignal.s0
    protected Class c() {
        return SyncJobService.class;
    }

    @Override // com.onesignal.s0
    protected Class d() {
        return SyncService.class;
    }

    @Override // com.onesignal.s0
    protected int e() {
        return 2071862118;
    }

    @Override // com.onesignal.s0
    protected String f() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    void p(Context context) {
        synchronized (s0.f22343c) {
            this.f22325d = 0L;
            if (f0.m(context)) {
                return;
            }
            a(context);
        }
    }

    void r(Context context, long j10) {
        e3.a(e3.z.VERBOSE, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j10);
        t(context, j10);
    }

    protected void s(Context context) {
        e3.a(e3.z.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        t(context, 30000L);
    }

    protected void t(Context context, long j10) {
        synchronized (s0.f22343c) {
            if (this.f22325d.longValue() == 0 || e3.B0().b() + j10 <= this.f22325d.longValue()) {
                if (j10 < 5000) {
                    j10 = 5000;
                }
                i(context, j10);
                this.f22325d = Long.valueOf(e3.B0().b() + j10);
                return;
            }
            e3.a(e3.z.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f22325d);
        }
    }
}
