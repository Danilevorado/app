package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.an2;
import com.google.android.gms.internal.ads.ci2;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.d70;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.ez;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.ho1;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.je1;
import com.google.android.gms.internal.ads.km0;
import com.google.android.gms.internal.ads.le1;
import com.google.android.gms.internal.ads.ll2;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.s52;
import com.google.android.gms.internal.ads.sj2;
import com.google.android.gms.internal.ads.ua0;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.w60;
import com.google.android.gms.internal.ads.zu;
import j3.s;
import java.util.HashMap;
import k3.a1;
import k3.f2;
import k3.h4;
import k3.k1;
import k3.k3;
import k3.m0;
import k3.q0;
import k3.w;
import l3.d;
import l3.d0;
import l3.f;
import l3.g;
import l3.x;
import l3.y;
import l4.a;
import l4.b;

/* loaded from: classes.dex */
public class ClientApi extends a1 {
    @Override // k3.b1
    public final k1 A0(a aVar, int i10) {
        return km0.e((Context) b.L0(aVar), null, i10).f();
    }

    @Override // k3.b1
    public final ua0 A1(a aVar, String str, o30 o30Var, int i10) {
        Context context = (Context) b.L0(aVar);
        an2 an2VarX = km0.e(context, o30Var, i10).x();
        an2VarX.a(context);
        an2VarX.o(str);
        return an2VarX.d().a();
    }

    @Override // k3.b1
    public final q0 A3(a aVar, h4 h4Var, String str, o30 o30Var, int i10) {
        Context context = (Context) b.L0(aVar);
        ci2 ci2VarU = km0.e(context, o30Var, i10).u();
        ci2VarU.o(str);
        ci2VarU.a(context);
        return i10 >= ((Integer) w.c().b(ir.R4)).intValue() ? ci2VarU.d().a() : new k3();
    }

    @Override // k3.b1
    public final f2 G1(a aVar, o30 o30Var, int i10) {
        return km0.e((Context) b.L0(aVar), o30Var, i10).o();
    }

    @Override // k3.b1
    public final d70 J0(a aVar) {
        Activity activity = (Activity) b.L0(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelF = AdOverlayInfoParcel.f(activity.getIntent());
        if (adOverlayInfoParcelF == null) {
            return new y(activity);
        }
        int i10 = adOverlayInfoParcelF.f5539w;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new y(activity) : new d(activity) : new d0(activity, adOverlayInfoParcelF) : new g(activity) : new f(activity) : new x(activity);
    }

    @Override // k3.b1
    public final uu R0(a aVar, a aVar2) {
        return new le1((FrameLayout) b.L0(aVar), (FrameLayout) b.L0(aVar2), 231004000);
    }

    @Override // k3.b1
    public final zu U4(a aVar, a aVar2, a aVar3) {
        return new je1((View) b.L0(aVar), (HashMap) b.L0(aVar2), (HashMap) b.L0(aVar3));
    }

    @Override // k3.b1
    public final rd0 W1(a aVar, o30 o30Var, int i10) {
        return km0.e((Context) b.L0(aVar), o30Var, i10).s();
    }

    @Override // k3.b1
    public final ez Z0(a aVar, o30 o30Var, int i10, cz czVar) {
        Context context = (Context) b.L0(aVar);
        ho1 ho1VarM = km0.e(context, o30Var, i10).m();
        ho1VarM.a(context);
        ho1VarM.b(czVar);
        return ho1VarM.d().f();
    }

    @Override // k3.b1
    public final q0 i2(a aVar, h4 h4Var, String str, o30 o30Var, int i10) {
        Context context = (Context) b.L0(aVar);
        sj2 sj2VarV = km0.e(context, o30Var, i10).v();
        sj2VarV.a(context);
        sj2VarV.b(h4Var);
        sj2VarV.x(str);
        return sj2VarV.f().a();
    }

    @Override // k3.b1
    public final w60 j1(a aVar, o30 o30Var, int i10) {
        return km0.e((Context) b.L0(aVar), o30Var, i10).p();
    }

    @Override // k3.b1
    public final q0 k1(a aVar, h4 h4Var, String str, o30 o30Var, int i10) {
        Context context = (Context) b.L0(aVar);
        ll2 ll2VarW = km0.e(context, o30Var, i10).w();
        ll2VarW.a(context);
        ll2VarW.b(h4Var);
        ll2VarW.x(str);
        return ll2VarW.f().a();
    }

    @Override // k3.b1
    public final q0 s2(a aVar, h4 h4Var, String str, int i10) {
        return new s((Context) b.L0(aVar), h4Var, str, new ff0(231004000, i10, true, false));
    }

    @Override // k3.b1
    public final m0 x1(a aVar, String str, o30 o30Var, int i10) {
        Context context = (Context) b.L0(aVar);
        return new s52(km0.e(context, o30Var, i10), context, str);
    }

    @Override // k3.b1
    public final da0 z3(a aVar, o30 o30Var, int i10) {
        Context context = (Context) b.L0(aVar);
        an2 an2VarX = km0.e(context, o30Var, i10).x();
        an2VarX.a(context);
        return an2VarX.d().b();
    }
}
