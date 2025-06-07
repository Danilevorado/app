package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zb1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18512a;

    public zb1(q44 q44Var) {
        this.f18512a = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Set setSingleton = ((wb1) this.f18512a).a().e() != null ? Collections.singleton("banner") : Collections.emptySet();
        k44.b(setSingleton);
        return setSingleton;
    }
}
