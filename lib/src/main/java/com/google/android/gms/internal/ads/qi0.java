package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qi0 extends m3.b0 {

    /* renamed from: c, reason: collision with root package name */
    final lh0 f14329c;

    /* renamed from: d, reason: collision with root package name */
    final yi0 f14330d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14331e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f14332f;

    qi0(lh0 lh0Var, yi0 yi0Var, String str, String[] strArr) {
        this.f14329c = lh0Var;
        this.f14330d = yi0Var;
        this.f14331e = str;
        this.f14332f = strArr;
        j3.t.A().f(this);
    }

    @Override // m3.b0
    public final void a() {
        try {
            this.f14330d.x(this.f14331e, this.f14332f);
        } finally {
            m3.b2.f25197i.post(new oi0(this));
        }
    }

    @Override // m3.b0
    public final ab3 b() {
        return (((Boolean) k3.w.c().b(ir.O1)).booleanValue() && (this.f14330d instanceof hj0)) ? of0.f13190e.g(new Callable() { // from class: com.google.android.gms.internal.ads.ni0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12646a.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.f14330d.y(this.f14331e, this.f14332f, this));
    }

    public final String e() {
        return this.f14331e;
    }
}
