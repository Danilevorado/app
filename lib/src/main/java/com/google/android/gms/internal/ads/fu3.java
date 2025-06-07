package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class fu3 extends ThreadLocal {
    fu3() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) fv3.f8456b.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
