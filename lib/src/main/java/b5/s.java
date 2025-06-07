package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s implements f, e, c, d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4489a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4490b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f4491c;

    public s(Executor executor, a aVar, h0 h0Var) {
        this.f4489a = executor;
        this.f4490b = aVar;
        this.f4491c = h0Var;
    }

    @Override // b5.c
    public final void a() {
        this.f4491c.r();
    }

    @Override // b5.f
    public final void b(Object obj) {
        this.f4491c.q(obj);
    }

    @Override // b5.d0
    public final void c(i iVar) {
        this.f4489a.execute(new r(this, iVar));
    }

    @Override // b5.e
    public final void d(Exception exc) {
        this.f4491c.p(exc);
    }
}
