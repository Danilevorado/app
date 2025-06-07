package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class qa1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final da1 f14206a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14207b;

    public qa1(da1 da1Var, q44 q44Var) {
        this.f14206a = da1Var;
        this.f14207b = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Set setSingleton = Collections.singleton(new x81((h01) this.f14207b.b(), of0.f13191f));
        k44.b(setSingleton);
        return setSingleton;
    }
}
