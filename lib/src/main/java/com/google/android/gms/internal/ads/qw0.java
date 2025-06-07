package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class qw0 implements a31, f21 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f14512m;

    /* renamed from: n, reason: collision with root package name */
    private final nk0 f14513n;

    /* renamed from: o, reason: collision with root package name */
    private final hn2 f14514o;

    /* renamed from: p, reason: collision with root package name */
    private final ff0 f14515p;

    /* renamed from: q, reason: collision with root package name */
    private l4.a f14516q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f14517r;

    public qw0(Context context, nk0 nk0Var, hn2 hn2Var, ff0 ff0Var) {
        this.f14512m = context;
        this.f14513n = nk0Var;
        this.f14514o = hn2Var;
        this.f14515p = ff0Var;
    }

    private final synchronized void a() {
        yy1 yy1Var;
        zy1 zy1Var;
        if (this.f14514o.U) {
            if (this.f14513n == null) {
                return;
            }
            if (j3.t.a().d(this.f14512m)) {
                ff0 ff0Var = this.f14515p;
                String str = ff0Var.f8253n + "." + ff0Var.f8254o;
                String strA = this.f14514o.W.a();
                if (this.f14514o.W.b() == 1) {
                    yy1Var = yy1.VIDEO;
                    zy1Var = zy1.DEFINED_BY_JAVASCRIPT;
                } else {
                    yy1Var = yy1.HTML_DISPLAY;
                    zy1Var = this.f14514o.f9246f == 1 ? zy1.ONE_PIXEL : zy1.BEGIN_TO_RENDER;
                }
                l4.a aVarA = j3.t.a().a(str, this.f14513n.P(), "", "javascript", strA, zy1Var, yy1Var, this.f14514o.f9261m0);
                this.f14516q = aVarA;
                Object obj = this.f14513n;
                if (aVarA != null) {
                    j3.t.a().b(this.f14516q, (View) obj);
                    this.f14513n.i1(this.f14516q);
                    j3.t.a().d0(this.f14516q);
                    this.f14517r = true;
                    this.f14513n.c("onSdkLoaded", new q.a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final synchronized void l() {
        nk0 nk0Var;
        if (!this.f14517r) {
            a();
        }
        if (!this.f14514o.U || this.f14516q == null || (nk0Var = this.f14513n) == null) {
            return;
        }
        nk0Var.c("onSdkImpression", new q.a());
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final synchronized void m() {
        if (this.f14517r) {
            return;
        }
        a();
    }
}
