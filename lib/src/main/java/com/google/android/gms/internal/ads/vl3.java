package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class vl3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16770a = Charset.forName("UTF-8");

    public static final cw3 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new ul3("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i10] = (byte) cCharAt;
        }
        return cw3.b(bArr);
    }
}
