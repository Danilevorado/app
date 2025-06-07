package b5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4484a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4485b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f4486c;

    public q(Executor executor, a aVar, h0 h0Var) {
        this.f4484a = executor;
        this.f4485b = aVar;
        this.f4486c = h0Var;
    }

    @Override // b5.d0
    public final void c(i iVar) {
        this.f4484a.execute(new p(this, iVar));
    }
}
