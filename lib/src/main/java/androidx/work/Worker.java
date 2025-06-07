package androidx.work;

import android.content.Context;
import androidx.work.c;
import androidx.work.impl.utils.futures.d;
import b1.e;

/* loaded from: classes.dex */
public abstract class Worker extends c {

    /* renamed from: q, reason: collision with root package name */
    d f4000q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f4000q.q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f4000q.r(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f4002m;

        b(d dVar) {
            this.f4002m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4002m.q(Worker.this.getForegroundInfo());
            } catch (Throwable th) {
                this.f4002m.r(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract c.a doWork();

    public e getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.c
    public u5.a getForegroundInfoAsync() {
        d dVarU = d.u();
        getBackgroundExecutor().execute(new b(dVarU));
        return dVarU;
    }

    @Override // androidx.work.c
    public final u5.a startWork() {
        this.f4000q = d.u();
        getBackgroundExecutor().execute(new a());
        return this.f4000q;
    }
}
