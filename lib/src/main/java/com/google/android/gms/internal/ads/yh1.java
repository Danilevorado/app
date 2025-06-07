package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class yh1 extends iv {

    /* renamed from: m, reason: collision with root package name */
    private final Context f18047m;

    /* renamed from: n, reason: collision with root package name */
    private final pd1 f18048n;

    /* renamed from: o, reason: collision with root package name */
    private pe1 f18049o;

    /* renamed from: p, reason: collision with root package name */
    private kd1 f18050p;

    public yh1(Context context, pd1 pd1Var, pe1 pe1Var, kd1 kd1Var) {
        this.f18047m = context;
        this.f18048n = pd1Var;
        this.f18049o = pe1Var;
        this.f18050p = kd1Var;
    }

    private final du N5(String str) {
        return new xh1(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final boolean B() {
        l4.a aVarF0 = this.f18048n.f0();
        if (aVarF0 == null) {
            ze0.g("Trying to start OMID session before creation.");
            return false;
        }
        j3.t.a().d0(aVarF0);
        if (this.f18048n.b0() == null) {
            return true;
        }
        this.f18048n.b0().c("onSdkLoaded", new q.a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final boolean H0(l4.a aVar) {
        pe1 pe1Var;
        Object objL0 = l4.b.L0(aVar);
        if (!(objL0 instanceof ViewGroup) || (pe1Var = this.f18049o) == null || !pe1Var.g((ViewGroup) objL0)) {
            return false;
        }
        this.f18048n.c0().S0(N5("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void U(String str) {
        kd1 kd1Var = this.f18050p;
        if (kd1Var != null) {
            kd1Var.l(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void b3(l4.a aVar) {
        kd1 kd1Var;
        Object objL0 = l4.b.L0(aVar);
        if (!(objL0 instanceof View) || this.f18048n.f0() == null || (kd1Var = this.f18050p) == null) {
            return;
        }
        kd1Var.p((View) objL0);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final k3.m2 c() {
        return this.f18048n.U();
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final nu e() {
        return this.f18050p.N().a();
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final qu e0(String str) {
        return (qu) this.f18048n.S().get(str);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final l4.a g() {
        return l4.b.p1(this.f18047m);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final String i() {
        return this.f18048n.k0();
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final String i4(String str) {
        return (String) this.f18048n.T().get(str);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final List k() {
        q.g gVarS = this.f18048n.S();
        q.g gVarT = this.f18048n.T();
        String[] strArr = new String[gVarS.size() + gVarT.size()];
        int i10 = 0;
        for (int i11 = 0; i11 < gVarS.size(); i11++) {
            strArr[i10] = (String) gVarS.i(i11);
            i10++;
        }
        for (int i12 = 0; i12 < gVarT.size(); i12++) {
            strArr[i10] = (String) gVarT.i(i12);
            i10++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final boolean k0(l4.a aVar) {
        pe1 pe1Var;
        Object objL0 = l4.b.L0(aVar);
        if (!(objL0 instanceof ViewGroup) || (pe1Var = this.f18049o) == null || !pe1Var.f((ViewGroup) objL0)) {
            return false;
        }
        this.f18048n.a0().S0(N5("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void l() {
        kd1 kd1Var = this.f18050p;
        if (kd1Var != null) {
            kd1Var.a();
        }
        this.f18050p = null;
        this.f18049o = null;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void n() {
        String strB = this.f18048n.b();
        if ("Google".equals(strB)) {
            ze0.g("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(strB)) {
            ze0.g("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        kd1 kd1Var = this.f18050p;
        if (kd1Var != null) {
            kd1Var.Y(strB, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void p() {
        kd1 kd1Var = this.f18050p;
        if (kd1Var != null) {
            kd1Var.o();
        }
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final boolean q() {
        kd1 kd1Var = this.f18050p;
        return (kd1Var == null || kd1Var.C()) && this.f18048n.b0() != null && this.f18048n.c0() == null;
    }
}
