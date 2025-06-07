package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class k12 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f10772a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f10773b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f10774c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f10775d;

    public k12(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f10772a = q44Var;
        this.f10773b = q44Var2;
        this.f10774c = q44Var3;
        this.f10775d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = (Context) this.f10772a.b();
        ff0 ff0VarA = ((cn0) this.f10773b).a();
        bb1 bb1Var = (bb1) this.f10774c.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new j12(context, ff0VarA, bb1Var, bb3Var);
    }
}
