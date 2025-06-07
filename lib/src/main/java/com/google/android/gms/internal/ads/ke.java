package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes.dex */
public abstract class ke {
    public static String a(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z10) {
        byte[] bArrDecode = Base64.decode(str, true != z10 ? 2 : 11);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
