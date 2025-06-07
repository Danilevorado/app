package kotlinx.coroutines.scheduling;

import bc.o;
import java.util.concurrent.Executor;
import yb.q;

/* loaded from: classes2.dex */
public final class b extends q implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public static final b f24986o = new b();

    /* renamed from: p, reason: collision with root package name */
    private static final yb.c f24987p = m.f25006n.f(o.d("kotlinx.coroutines.io.parallelism", ub.f.a(64, bc.m.a()), 0, 0, 12, null));

    private b() {
    }

    @Override // yb.c
    public void c(kb.e eVar, Runnable runnable) {
        f24987p.c(eVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c(kb.f.f24958m, runnable);
    }

    @Override // yb.c
    public String toString() {
        return "Dispatchers.IO";
    }
}
