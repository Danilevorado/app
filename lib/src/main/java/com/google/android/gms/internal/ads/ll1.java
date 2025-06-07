package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class ll1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11652a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11653b;

    public ll1(q44 q44Var, q44 q44Var2) {
        this.f11652a = q44Var;
        this.f11653b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setSingleton = ((Boolean) k3.w.c().b(ir.A4)).booleanValue() ? Collections.singleton(new x81(((fm1) this.f11653b).b(), bb3Var)) : Collections.emptySet();
        k44.b(setSingleton);
        return setSingleton;
    }
}
