package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class n12 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12358a;

    /* renamed from: b, reason: collision with root package name */
    private final bb1 f12359b;

    public n12(Context context, bb1 bb1Var) {
        this.f12358a = context;
        this.f12359b = bb1Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        try {
            ((l50) dz1Var.f7558b).P4(hn2Var.f9237a0);
            ((l50) dz1Var.f7558b).S4(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f12358a), new m12(this, dz1Var, null), (u30) dz1Var.f7559c);
        } catch (RemoteException e5) {
            m3.n1.l("Remote exception loading a interstitial RTB ad", e5);
            throw new io2(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        h12 h12Var = new h12(hn2Var, (l50) dz1Var.f7558b, d3.b.INTERSTITIAL);
        aa1 aa1VarC = this.f12359b.c(new tx0(un2Var, hn2Var, dz1Var.f7557a), new da1(h12Var, null));
        h12Var.b(aa1VarC.b());
        ((y02) dz1Var.f7559c).M5(aa1VarC.f());
        return aa1VarC.i();
    }
}
