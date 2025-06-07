package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class h32 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8988a;

    /* renamed from: b, reason: collision with root package name */
    private final lj1 f8989b;

    public h32(Context context, lj1 lj1Var) {
        this.f8988a = context;
        this.f8989b = lj1Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        try {
            ((l50) dz1Var.f7558b).P4(hn2Var.f9237a0);
            if (un2Var.f16412a.f14851a.f7456o.f14418a == 3) {
                ((l50) dz1Var.f7558b).h4(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f8988a), new g32(this, dz1Var, null), (u30) dz1Var.f7559c);
            } else {
                ((l50) dz1Var.f7558b).Z2(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f8988a), new g32(this, dz1Var, null), (u30) dz1Var.f7559c);
            }
        } catch (RemoteException e5) {
            m3.n1.l("Remote exception loading a rewarded RTB ad", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        h12 h12Var = new h12(hn2Var, (l50) dz1Var.f7558b, d3.b.REWARDED);
        hj1 hj1VarC = this.f8989b.c(new tx0(un2Var, hn2Var, dz1Var.f7557a), new ij1(h12Var));
        h12Var.b(hj1VarC.b());
        ((y02) dz1Var.f7559c).M5(hj1VarC.n());
        return hj1VarC.k();
    }
}
