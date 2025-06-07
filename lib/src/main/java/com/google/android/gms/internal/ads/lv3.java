package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public final class lv3 implements nv3 {
    @Override // com.google.android.gms.internal.ads.nv3
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
