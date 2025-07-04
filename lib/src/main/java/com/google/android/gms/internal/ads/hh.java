package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public abstract class hh {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f9136a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9137b = 0;

    public static long a(double d10, int i10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / displayMetrics.density);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr2 = f9136a;
            int i12 = i10 + i10;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }
}
