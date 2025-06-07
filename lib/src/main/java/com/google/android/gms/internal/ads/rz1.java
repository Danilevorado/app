package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class rz1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f15017a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f15018b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f15019c;

    public rz1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f15017a = q44Var;
        this.f15018b = q44Var2;
        this.f15019c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = (Context) this.f15017a.b();
        nu0 nu0Var = (nu0) this.f15018b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new qz1(context, nu0Var, bb3Var);
    }
}
