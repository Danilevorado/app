package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ko1 implements xn1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f11173a;

    /* renamed from: b, reason: collision with root package name */
    private final z62 f11174b;

    ko1(long j10, Context context, do1 do1Var, km0 km0Var, String str) {
        this.f11173a = j10;
        ll2 ll2VarW = km0Var.w();
        ll2VarW.a(context);
        ll2VarW.b(new k3.h4());
        ll2VarW.x(str);
        z62 z62VarA = ll2VarW.f().a();
        this.f11174b = z62VarA;
        z62VarA.U0(new jo1(this, do1Var));
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void a() {
        this.f11174b.A();
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void b(k3.c4 c4Var) {
        this.f11174b.C1(c4Var);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void d() {
        this.f11174b.f1(l4.b.p1(null));
    }
}
