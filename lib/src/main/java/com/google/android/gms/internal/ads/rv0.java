package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class rv0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final hv0 f14982a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14983b;

    public rv0(hv0 hv0Var, q44 q44Var) {
        this.f14982a = hv0Var;
        this.f14983b = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Set setSingleton = Collections.singleton(new x81((sw0) this.f14983b.b(), of0.f13191f));
        k44.b(setSingleton);
        return setSingleton;
    }
}
