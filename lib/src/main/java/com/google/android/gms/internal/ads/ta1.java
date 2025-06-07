package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class ta1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f15750a;

    public ta1(q44 q44Var) {
        this.f15750a = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Set setSingleton = Collections.singleton(new x81((mb1) this.f15750a.b(), of0.f13191f));
        k44.b(setSingleton);
        return setSingleton;
    }
}
