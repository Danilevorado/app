package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class wv3 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f17281a = new vv3();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f17281a.get()).nextBytes(bArr);
        return bArr;
    }
}
