package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b9 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f18839a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f18840b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f18841c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f18842d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f18843e;

    /* renamed from: f, reason: collision with root package name */
    public static final b8 f18844f;

    static {
        byte[] bArr = new byte[0];
        f18842d = bArr;
        f18843e = ByteBuffer.wrap(bArr);
        int i10 = b8.f18838a;
        z7 z7Var = new z7(bArr, 0, 0, false, null);
        try {
            z7Var.c(0);
            f18844f = z7Var;
        } catch (d9 e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iD = d(length, bArr, 0, length);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    static Object f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    static Object g(Object obj, Object obj2) {
        return ((y9) obj).z0().q((y9) obj2).p();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f18840b);
    }

    public static boolean i(byte[] bArr) {
        return fb.e(bArr);
    }
}
