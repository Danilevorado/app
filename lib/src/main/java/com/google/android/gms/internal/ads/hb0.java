package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hb0 extends ab0 {

    /* renamed from: m, reason: collision with root package name */
    private final u3.d f9089m;

    /* renamed from: n, reason: collision with root package name */
    private final u3.c f9090n;

    public hb0(u3.d dVar, u3.c cVar) {
        this.f9089m = dVar;
        this.f9090n = cVar;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void H(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
        u3.d dVar = this.f9089m;
        if (dVar != null) {
            dVar.b(this.f9090n);
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void y(k3.w2 w2Var) {
        if (this.f9089m != null) {
            this.f9089m.a(w2Var.h());
        }
    }
}
