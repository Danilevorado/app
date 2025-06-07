package k3;

/* loaded from: classes.dex */
public final class y3 extends f0 {

    /* renamed from: m, reason: collision with root package name */
    private final d3.d f24820m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f24821n;

    public y3(d3.d dVar, Object obj) {
        this.f24820m = dVar;
        this.f24821n = obj;
    }

    @Override // k3.g0
    public final void d() {
        Object obj;
        d3.d dVar = this.f24820m;
        if (dVar == null || (obj = this.f24821n) == null) {
            return;
        }
        dVar.b(obj);
    }

    @Override // k3.g0
    public final void q0(w2 w2Var) {
        d3.d dVar = this.f24820m;
        if (dVar != null) {
            dVar.a(w2Var.h());
        }
    }
}
