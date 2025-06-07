package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class lc3 implements oc3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hc3 f11482a;

    lc3(hc3 hc3Var) {
        this.f11482a = hc3Var;
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final hc3 a(Class cls) {
        if (this.f11482a.d().equals(cls)) {
            return this.f11482a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final hc3 b() {
        return this.f11482a;
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Set c() {
        return Collections.singleton(this.f11482a.d());
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Class d() {
        return this.f11482a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Class f() {
        return null;
    }
}
