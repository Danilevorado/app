package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class kb1 implements a31, l3.t, f21 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f10944m;

    /* renamed from: n, reason: collision with root package name */
    private final nk0 f10945n;

    /* renamed from: o, reason: collision with root package name */
    private final hn2 f10946o;

    /* renamed from: p, reason: collision with root package name */
    private final ff0 f10947p;

    /* renamed from: q, reason: collision with root package name */
    private final an f10948q;

    /* renamed from: r, reason: collision with root package name */
    l4.a f10949r;

    public kb1(Context context, nk0 nk0Var, hn2 hn2Var, ff0 ff0Var, an anVar) {
        this.f10944m = context;
        this.f10945n = nk0Var;
        this.f10946o = hn2Var;
        this.f10947p = ff0Var;
        this.f10948q = anVar;
    }

    @Override // l3.t
    public final void C(int i10) {
        this.f10949r = null;
    }

    @Override // l3.t
    public final void L0() {
    }

    @Override // l3.t
    public final void b() {
        if (this.f10949r == null || this.f10945n == null) {
            return;
        }
        if (((Boolean) k3.w.c().b(ir.L4)).booleanValue()) {
            return;
        }
        this.f10945n.c("onSdkImpression", new q.a());
    }

    @Override // l3.t
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        if (this.f10949r == null || this.f10945n == null) {
            return;
        }
        if (((Boolean) k3.w.c().b(ir.L4)).booleanValue()) {
            this.f10945n.c("onSdkImpression", new q.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final void m() {
        zy1 zy1Var;
        yy1 yy1Var;
        an anVar = this.f10948q;
        if ((anVar == an.REWARD_BASED_VIDEO_AD || anVar == an.INTERSTITIAL || anVar == an.APP_OPEN) && this.f10946o.U && this.f10945n != null && j3.t.a().d(this.f10944m)) {
            ff0 ff0Var = this.f10947p;
            String str = ff0Var.f8253n + "." + ff0Var.f8254o;
            String strA = this.f10946o.W.a();
            if (this.f10946o.W.b() == 1) {
                yy1Var = yy1.VIDEO;
                zy1Var = zy1.DEFINED_BY_JAVASCRIPT;
            } else {
                zy1Var = this.f10946o.Z == 2 ? zy1.UNSPECIFIED : zy1.BEGIN_TO_RENDER;
                yy1Var = yy1.HTML_DISPLAY;
            }
            l4.a aVarA = j3.t.a().a(str, this.f10945n.P(), "", "javascript", strA, zy1Var, yy1Var, this.f10946o.f9261m0);
            this.f10949r = aVarA;
            if (aVarA != null) {
                j3.t.a().b(this.f10949r, (View) this.f10945n);
                this.f10945n.i1(this.f10949r);
                j3.t.a().d0(this.f10949r);
                this.f10945n.c("onSdkLoaded", new q.a());
            }
        }
    }

    @Override // l3.t
    public final void w0() {
    }

    @Override // l3.t
    public final void x4() {
    }
}
