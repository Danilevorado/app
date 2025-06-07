package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class h73 extends c43 {

    /* renamed from: r, reason: collision with root package name */
    final transient z33 f9049r;

    h73(Map map, z33 z33Var) {
        super(map);
        this.f9049r = z33Var;
    }

    @Override // com.google.android.gms.internal.ads.x43
    final Map e() {
        return p();
    }

    @Override // com.google.android.gms.internal.ads.x43
    final Set f() {
        return q();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // com.google.android.gms.internal.ads.u43
    protected final /* bridge */ /* synthetic */ Collection h() {
        return this.f9049r.a();
    }
}
