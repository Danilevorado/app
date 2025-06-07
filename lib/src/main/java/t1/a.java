package t1;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import t1.p;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27127a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f27128b;

    /* renamed from: c, reason: collision with root package name */
    final Map f27129c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f27130d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f27131e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f27132f;

    /* renamed from: g, reason: collision with root package name */
    private volatile c f27133g;

    /* renamed from: t1.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0189a implements ThreadFactory {

        /* renamed from: t1.a$a$a, reason: collision with other inner class name */
        class RunnableC0190a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Runnable f27134m;

            RunnableC0190a(Runnable runnable) {
                this.f27134m = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f27134m.run();
            }
        }

        ThreadFactoryC0189a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0190a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    interface c {
        void a();
    }

    static final class d extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final r1.f f27137a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f27138b;

        /* renamed from: c, reason: collision with root package name */
        v f27139c;

        d(r1.f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f27137a = (r1.f) n2.k.d(fVar);
            this.f27139c = (pVar.f() && z10) ? (v) n2.k.d(pVar.e()) : null;
            this.f27138b = pVar.f();
        }

        void a() {
            this.f27139c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0189a()));
    }

    a(boolean z10, Executor executor) {
        this.f27129c = new HashMap();
        this.f27130d = new ReferenceQueue();
        this.f27127a = z10;
        this.f27128b = executor;
        executor.execute(new b());
    }

    synchronized void a(r1.f fVar, p pVar) {
        d dVar = (d) this.f27129c.put(fVar, new d(fVar, pVar, this.f27130d, this.f27127a));
        if (dVar != null) {
            dVar.a();
        }
    }

    void b() {
        while (!this.f27132f) {
            try {
                c((d) this.f27130d.remove());
                c cVar = this.f27133g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(d dVar) {
        v vVar;
        synchronized (this) {
            this.f27129c.remove(dVar.f27137a);
            if (dVar.f27138b && (vVar = dVar.f27139c) != null) {
                this.f27131e.b(dVar.f27137a, new p(vVar, true, false, dVar.f27137a, this.f27131e));
            }
        }
    }

    synchronized void d(r1.f fVar) {
        d dVar = (d) this.f27129c.remove(fVar);
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized p e(r1.f fVar) {
        d dVar = (d) this.f27129c.get(fVar);
        if (dVar == null) {
            return null;
        }
        p pVar = (p) dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f27131e = aVar;
            }
        }
    }
}
