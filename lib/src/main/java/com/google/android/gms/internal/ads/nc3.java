package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class nc3 implements oc3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ il3 f12584a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dk3 f12585b;

    nc3(il3 il3Var, dk3 dk3Var) {
        this.f12584a = il3Var;
        this.f12585b = dk3Var;
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final hc3 a(Class cls) throws GeneralSecurityException {
        try {
            return new od3(this.f12584a, this.f12585b, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final hc3 b() {
        il3 il3Var = this.f12584a;
        return new od3(il3Var, this.f12585b, il3Var.g());
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Set c() {
        return this.f12584a.j();
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Class d() {
        return this.f12584a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Class f() {
        return this.f12585b.getClass();
    }
}
