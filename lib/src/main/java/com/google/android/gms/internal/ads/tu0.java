package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class tu0 extends ex0 {

    /* renamed from: i, reason: collision with root package name */
    private final nk0 f16045i;

    /* renamed from: j, reason: collision with root package name */
    private final int f16046j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f16047k;

    /* renamed from: l, reason: collision with root package name */
    private final iu0 f16048l;

    /* renamed from: m, reason: collision with root package name */
    private final jb1 f16049m;

    /* renamed from: n, reason: collision with root package name */
    private final m81 f16050n;

    /* renamed from: o, reason: collision with root package name */
    private final y11 f16051o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f16052p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16053q;

    tu0(cx0 cx0Var, Context context, nk0 nk0Var, int i10, iu0 iu0Var, jb1 jb1Var, m81 m81Var, y11 y11Var) {
        super(cx0Var);
        this.f16053q = false;
        this.f16045i = nk0Var;
        this.f16047k = context;
        this.f16046j = i10;
        this.f16048l = iu0Var;
        this.f16049m = jb1Var;
        this.f16050n = m81Var;
        this.f16051o = y11Var;
        this.f16052p = ((Boolean) k3.w.c().b(ir.U4)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.ex0
    public final void a() {
        super.a();
        nk0 nk0Var = this.f16045i;
        if (nk0Var != null) {
            nk0Var.destroy();
        }
    }

    public final int h() {
        return this.f16046j;
    }

    public final void i(cl clVar) {
        nk0 nk0Var = this.f16045i;
        if (nk0Var != null) {
            nk0Var.j1(clVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    public final void j(Activity activity, pl plVar, boolean z10) {
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f16047k;
        }
        if (this.f16052p) {
            this.f16050n.b();
        }
        if (((Boolean) k3.w.c().b(ir.A0)).booleanValue()) {
            j3.t.r();
            if (m3.b2.b(activity2)) {
                ze0.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f16051o.b();
                if (((Boolean) k3.w.c().b(ir.B0)).booleanValue()) {
                    new ox2(activity2.getApplicationContext(), j3.t.v().b()).a(this.f8015a.f16413b.f15924b.f11674b);
                    return;
                }
                return;
            }
        }
        if (this.f16053q) {
            ze0.g("App open interstitial ad is already visible.");
            this.f16051o.u(fp2.d(10, null, null));
        }
        if (this.f16053q) {
            return;
        }
        try {
            this.f16049m.a(z10, activity2, this.f16051o);
            if (this.f16052p) {
                this.f16050n.a();
            }
            this.f16053q = true;
        } catch (ib1 e5) {
            this.f16051o.h0(e5);
        }
    }

    public final void k(long j10, int i10) {
        this.f16048l.a(j10, i10);
    }
}
