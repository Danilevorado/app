package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nb0 extends ab0 {

    /* renamed from: m, reason: collision with root package name */
    private final v3.b f12570m;

    /* renamed from: n, reason: collision with root package name */
    private final ob0 f12571n;

    public nb0(v3.b bVar, ob0 ob0Var) {
        this.f12570m = bVar;
        this.f12571n = ob0Var;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void H(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
        ob0 ob0Var;
        v3.b bVar = this.f12570m;
        if (bVar == null || (ob0Var = this.f12571n) == null) {
            return;
        }
        bVar.b(ob0Var);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void y(k3.w2 w2Var) {
        v3.b bVar = this.f12570m;
        if (bVar != null) {
            bVar.a(w2Var.h());
        }
    }
}
