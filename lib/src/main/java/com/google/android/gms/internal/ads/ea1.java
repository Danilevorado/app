package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class ea1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final da1 f7694a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7695b;

    public ea1(da1 da1Var, q44 q44Var) {
        this.f7694a = da1Var;
        this.f7695b = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Set setSingleton = Collections.singleton(new x81((h01) this.f7695b.b(), of0.f13191f));
        k44.b(setSingleton);
        return setSingleton;
    }
}
