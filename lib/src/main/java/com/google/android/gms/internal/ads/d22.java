package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class d22 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7166a;

    /* renamed from: b, reason: collision with root package name */
    private final yb1 f7167b;

    /* renamed from: c, reason: collision with root package name */
    private d40 f7168c;

    /* renamed from: d, reason: collision with root package name */
    private final ff0 f7169d;

    public d22(Context context, yb1 yb1Var, ff0 ff0Var) {
        this.f7166a = context;
        this.f7167b = yb1Var;
        this.f7169d = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        try {
            ((l50) dz1Var.f7558b).P4(hn2Var.f9237a0);
            b22 b22Var = null;
            if (this.f7169d.f8254o < ((Integer) k3.w.c().b(ir.A1)).intValue()) {
                ((l50) dz1Var.f7558b).l5(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f7166a), new c22(this, dz1Var, b22Var), (u30) dz1Var.f7559c);
            } else {
                ((l50) dz1Var.f7558b).G2(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f7166a), new c22(this, dz1Var, b22Var), (u30) dz1Var.f7559c, un2Var.f16412a.f14851a.f7450i);
            }
        } catch (RemoteException e5) {
            throw new io2(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws w22 {
        if (!un2Var.f16412a.f14851a.f7448g.contains(Integer.toString(6))) {
            throw new w22(2, "Unified must be used for RTB.");
        }
        pd1 pd1VarD0 = pd1.d0(this.f7168c);
        if (!un2Var.f16412a.f14851a.f7448g.contains(Integer.toString(pd1VarD0.N()))) {
            throw new w22(1, "No corresponding native ad listener");
        }
        rd1 rd1VarD = this.f7167b.d(new tx0(un2Var, hn2Var, dz1Var.f7557a), new be1(pd1VarD0), new rf1(null, null, this.f7168c));
        ((y02) dz1Var.f7559c).M5(rd1VarD.f());
        return rd1VarD.h();
    }
}
