package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class mc2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12061a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12062b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12063c;

    public mc2(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f12061a = q44Var;
        this.f12062b = q44Var2;
        this.f12063c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new kc2(bb3Var, ((qm0) this.f12062b).a(), (Set) this.f12063c.b());
    }
}
