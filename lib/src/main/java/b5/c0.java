package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class c0 implements f, e, c, d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4463a;

    /* renamed from: b, reason: collision with root package name */
    private final h f4464b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f4465c;

    public c0(Executor executor, h hVar, h0 h0Var) {
        this.f4463a = executor;
        this.f4464b = hVar;
        this.f4465c = h0Var;
    }

    @Override // b5.c
    public final void a() {
        this.f4465c.r();
    }

    @Override // b5.f
    public final void b(Object obj) {
        this.f4465c.q(obj);
    }

    @Override // b5.d0
    public final void c(i iVar) {
        this.f4463a.execute(new b0(this, iVar));
    }

    @Override // b5.e
    public final void d(Exception exc) {
        this.f4465c.p(exc);
    }
}
