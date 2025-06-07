package h1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class o implements i1.a {

    /* renamed from: n, reason: collision with root package name */
    private final Executor f24012n;

    /* renamed from: o, reason: collision with root package name */
    private Runnable f24013o;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque f24011m = new ArrayDeque();

    /* renamed from: p, reason: collision with root package name */
    final Object f24014p = new Object();

    static class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final o f24015m;

        /* renamed from: n, reason: collision with root package name */
        final Runnable f24016n;

        a(o oVar, Runnable runnable) {
            this.f24015m = oVar;
            this.f24016n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24016n.run();
                synchronized (this.f24015m.f24014p) {
                    this.f24015m.a();
                }
            } catch (Throwable th) {
                synchronized (this.f24015m.f24014p) {
                    this.f24015m.a();
                    throw th;
                }
            }
        }
    }

    public o(Executor executor) {
        this.f24012n = executor;
    }

    void a() {
        Runnable runnable = (Runnable) this.f24011m.poll();
        this.f24013o = runnable;
        if (runnable != null) {
            this.f24012n.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f24014p) {
            this.f24011m.add(new a(this, runnable));
            if (this.f24013o == null) {
                a();
            }
        }
    }

    @Override // i1.a
    public boolean x() {
        boolean z10;
        synchronized (this.f24014p) {
            z10 = !this.f24011m.isEmpty();
        }
        return z10;
    }
}
