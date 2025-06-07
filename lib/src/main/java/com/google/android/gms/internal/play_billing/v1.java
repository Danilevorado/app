package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f19658a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f19659b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f19660c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f19661d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f19662e;

    /* renamed from: f, reason: collision with root package name */
    public static final u0 f19663f;

    static {
        byte[] bArr = new byte[0];
        f19661d = bArr;
        f19662e = ByteBuffer.wrap(bArr);
        int i10 = u0.f19654a;
        s0 s0Var = new s0(bArr, 0, 0, false, null);
        try {
            s0Var.c(0);
            f19663f = s0Var;
        } catch (x1 e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        Objects.requireNonNull(obj, "messageType");
        return obj;
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f19659b);
    }
}
