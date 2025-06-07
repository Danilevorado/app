package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ly3 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f11868a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f11869b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f11870c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11871d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f11872e;

    /* renamed from: f, reason: collision with root package name */
    public static final fx3 f11873f;

    static {
        byte[] bArr = new byte[0];
        f11871d = bArr;
        f11872e = ByteBuffer.wrap(bArr);
        int i10 = fx3.f8472e;
        f11873f = fx3.h(bArr, 0, 0, false);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f11869b);
    }
}
