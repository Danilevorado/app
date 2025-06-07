package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class mv3 implements nv3 {
    @Override // com.google.android.gms.internal.ads.nv3
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
