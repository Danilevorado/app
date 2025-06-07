package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class uz1 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16504a;

    /* renamed from: b, reason: collision with root package name */
    private final nu0 f16505b;

    uz1(Context context, nu0 nu0Var) {
        this.f16504a = context;
        this.f16505b = nu0Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        try {
            ((l50) dz1Var.f7558b).P4(hn2Var.f9237a0);
            ((l50) dz1Var.f7558b).m3(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f16504a), new tz1(dz1Var, null), (u30) dz1Var.f7559c);
        } catch (RemoteException e5) {
            m3.n1.l("Remote exception loading an app open RTB ad", e5);
            throw new io2(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        h12 h12Var = new h12(hn2Var, (l50) dz1Var.f7558b, d3.b.APP_OPEN_AD);
        ku0 ku0VarA = this.f16505b.a(new tx0(un2Var, hn2Var, dz1Var.f7557a), new da1(h12Var, null), new lu0(hn2Var.f9239b0));
        h12Var.b(ku0VarA.b());
        ((y02) dz1Var.f7559c).M5(ku0VarA.f());
        return ku0VarA.h();
    }
}
