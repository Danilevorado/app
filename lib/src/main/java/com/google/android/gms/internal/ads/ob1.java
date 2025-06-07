package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ob1 implements l11, o81 {

    /* renamed from: m, reason: collision with root package name */
    private final mc0 f13126m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f13127n;

    /* renamed from: o, reason: collision with root package name */
    private final ed0 f13128o;

    /* renamed from: p, reason: collision with root package name */
    private final View f13129p;

    /* renamed from: q, reason: collision with root package name */
    private String f13130q;

    /* renamed from: r, reason: collision with root package name */
    private final an f13131r;

    public ob1(mc0 mc0Var, Context context, ed0 ed0Var, View view, an anVar) {
        this.f13126m = mc0Var;
        this.f13127n = context;
        this.f13128o = ed0Var;
        this.f13129p = view;
        this.f13131r = anVar;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void D() {
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final void h() {
        if (this.f13131r == an.APP_OPEN) {
            return;
        }
        String strI = this.f13128o.i(this.f13127n);
        this.f13130q = strI;
        this.f13130q = String.valueOf(strI).concat(this.f13131r == an.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void j() {
        this.f13126m.b(false);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void p() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f13129p;
        if (view != null && this.f13130q != null) {
            this.f13128o.x(view.getContext(), this.f13130q);
        }
        this.f13126m.b(true);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void v(aa0 aa0Var, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f13128o.z(this.f13127n)) {
            try {
                ed0 ed0Var = this.f13128o;
                Context context = this.f13127n;
                ed0Var.t(context, ed0Var.f(context), this.f13126m.a(), aa0Var.d(), aa0Var.b());
            } catch (RemoteException e5) {
                ze0.h("Remote Exception to get reward item.", e5);
            }
        }
    }
}
