package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class tk {
    public static int a(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return i4.l.a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] b(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tk.b(java.lang.String, boolean):java.lang.String[]");
    }
}
