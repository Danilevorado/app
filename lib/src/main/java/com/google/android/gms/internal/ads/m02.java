package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class m02 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11891a;

    /* renamed from: b, reason: collision with root package name */
    private final xv0 f11892b;

    /* renamed from: c, reason: collision with root package name */
    private View f11893c;

    /* renamed from: d, reason: collision with root package name */
    private y30 f11894d;

    public m02(Context context, xv0 xv0Var) {
        this.f11891a = context;
        this.f11892b = xv0Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws io2 {
        try {
            ((l50) dz1Var.f7558b).P4(hn2Var.f9237a0);
            k02 k02Var = null;
            if (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && hn2Var.f9251h0) {
                ((l50) dz1Var.f7558b).c5(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f11891a), new l02(this, dz1Var, k02Var), (u30) dz1Var.f7559c, un2Var.f16412a.f14851a.f7446e);
            } else {
                ((l50) dz1Var.f7558b).M3(hn2Var.V, hn2Var.f9275w.toString(), un2Var.f16412a.f14851a.f7445d, l4.b.p1(this.f11891a), new l02(this, dz1Var, k02Var), (u30) dz1Var.f7559c, un2Var.f16412a.f14851a.f7446e);
            }
        } catch (RemoteException e5) {
            throw new io2(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, final hn2 hn2Var, final dz1 dz1Var) throws io2 {
        final View view;
        if (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && hn2Var.f9251h0) {
            try {
                view = (View) l4.b.L0(this.f11894d.c());
                boolean zE = this.f11894d.e();
                if (view == null) {
                    throw new io2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zE) {
                    try {
                        view = (View) qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.i02
                            @Override // com.google.android.gms.internal.ads.w93
                            public final ab3 a(Object obj) {
                                return this.f9471a.c(view, hn2Var, obj);
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
            view = this.f11893c;
        }
        av0 av0VarA = this.f11892b.a(new tx0(un2Var, hn2Var, dz1Var.f7557a), new hv0(view, null, new bx0() { // from class: com.google.android.gms.internal.ads.j02
            @Override // com.google.android.gms.internal.ads.bx0
            public final k3.m2 a() throws io2 {
                try {
                    return ((l50) dz1Var.f7558b).c();
                } catch (RemoteException e11) {
                    throw new io2(e11);
                }
            }
        }, (in2) hn2Var.f9274v.get(0)));
        av0VarA.i().r0(view);
        ((y02) dz1Var.f7559c).M5(av0VarA.f());
        return av0VarA.h();
    }

    final /* synthetic */ ab3 c(View view, hn2 hn2Var, Object obj) {
        return qa3.h(pw0.a(this.f11891a, view, hn2Var));
    }
}
