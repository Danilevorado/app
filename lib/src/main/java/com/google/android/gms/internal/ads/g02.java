package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g02 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8544a;

    /* renamed from: b, reason: collision with root package name */
    private final xv0 f8545b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8546c;

    public g02(Context context, xv0 xv0Var, Executor executor) {
        this.f8544a = context;
        this.f8545b = xv0Var;
        this.f8546c = executor;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        k3.h4 h4Var;
        k3.h4 h4Var2 = un2Var.f16412a.f14851a.f7446e;
        if (h4Var2.f24664z) {
            h4Var = new k3.h4(this.f8544a, d3.z.d(h4Var2.f24655q, h4Var2.f24652n));
        } else {
            h4Var = (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && hn2Var.f9251h0) ? new k3.h4(this.f8544a, d3.z.e(h4Var2.f24655q, h4Var2.f24652n)) : ho2.a(this.f8544a, hn2Var.f9274v);
        }
        k3.h4 h4Var3 = h4Var;
        if (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && hn2Var.f9251h0) {
            ((ap2) dz1Var.f7558b).s(this.f8544a, h4Var3, un2Var.f16412a.f14851a.f7445d, hn2Var.f9275w.toString(), m3.w0.l(hn2Var.f9272t), (u30) dz1Var.f7559c);
        } else {
            ((ap2) dz1Var.f7558b).r(this.f8544a, h4Var3, un2Var.f16412a.f14851a.f7445d, hn2Var.f9275w.toString(), m3.w0.l(hn2Var.f9272t), (u30) dz1Var.f7559c);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, final hn2 hn2Var, dz1 dz1Var) throws io2 {
        final View viewF;
        if (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && hn2Var.f9251h0) {
            y30 y30VarH = ((ap2) dz1Var.f7558b).h();
            if (y30VarH == null) {
                ze0.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new io2(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (View) l4.b.L0(y30VarH.c());
                boolean zE = y30VarH.e();
                if (viewF == null) {
                    throw new io2(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zE) {
                    try {
                        viewF = (View) qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.f02
                            @Override // com.google.android.gms.internal.ads.w93
                            public final ab3 a(Object obj) {
                                return this.f8070a.c(viewF, hn2Var, obj);
                            }
                        }, of0.f13190e).get();
                    } catch (InterruptedException | ExecutionException e5) {
                        throw new io2(e5);
                    }
                }
            } catch (RemoteException e10) {
                throw new io2(e10);
            }
        } else {
            viewF = ((ap2) dz1Var.f7558b).f();
        }
        xv0 xv0Var = this.f8545b;
        tx0 tx0Var = new tx0(un2Var, hn2Var, dz1Var.f7557a);
        final ap2 ap2Var = (ap2) dz1Var.f7558b;
        av0 av0VarA = xv0Var.a(tx0Var, new hv0(viewF, null, new bx0() { // from class: com.google.android.gms.internal.ads.e02
            @Override // com.google.android.gms.internal.ads.bx0
            public final k3.m2 a() {
                return ap2Var.g();
            }
        }, (in2) hn2Var.f9274v.get(0)));
        av0VarA.i().r0(viewF);
        av0VarA.c().o0(new at0((ap2) dz1Var.f7558b), this.f8546c);
        ((y02) dz1Var.f7559c).M5(av0VarA.g());
        return av0VarA.h();
    }

    final /* synthetic */ ab3 c(View view, hn2 hn2Var, Object obj) {
        return qa3.h(pw0.a(this.f8544a, view, hn2Var));
    }
}
