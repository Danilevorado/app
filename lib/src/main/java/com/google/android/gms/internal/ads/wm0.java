package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class wm0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17199a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17200b;

    public wm0(q44 q44Var, q44 q44Var2) {
        this.f17199a = q44Var;
        this.f17200b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ep1 ep1Var = (ep1) this.f17199a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setSingleton = ((Boolean) k3.w.c().b(ir.f10144y1)).booleanValue() ? Collections.singleton(new x81(ep1Var, bb3Var)) : Collections.emptySet();
        k44.b(setSingleton);
        return setSingleton;
    }
}
