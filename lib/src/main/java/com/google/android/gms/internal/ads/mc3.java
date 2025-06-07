package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class mc3 implements oc3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dk3 f12064a;

    mc3(dk3 dk3Var) {
        this.f12064a = dk3Var;
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final hc3 a(Class cls) throws GeneralSecurityException {
        try {
            return new kc3(this.f12064a, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final hc3 b() {
        dk3 dk3Var = this.f12064a;
        return new kc3(dk3Var, dk3Var.g());
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Set c() {
        return this.f12064a.j();
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Class d() {
        return this.f12064a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final Class f() {
        return null;
    }
}
