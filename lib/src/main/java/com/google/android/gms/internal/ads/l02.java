package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class l02 extends y40 {

    /* renamed from: m, reason: collision with root package name */
    private final dz1 f11279m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ m02 f11280n;

    /* synthetic */ l02(m02 m02Var, dz1 dz1Var, k02 k02Var) {
        this.f11280n = m02Var;
        this.f11279m = dz1Var;
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void s(String str) {
        ((y02) this.f11279m.f7559c).X1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void u4(y30 y30Var) {
        this.f11280n.f11894d = y30Var;
        ((y02) this.f11279m.f7559c).p();
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void v2(l4.a aVar) {
        this.f11280n.f11893c = (View) l4.b.L0(aVar);
        ((y02) this.f11279m.f7559c).p();
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final void y(k3.w2 w2Var) {
        ((y02) this.f11279m.f7559c).I1(w2Var);
    }
}
