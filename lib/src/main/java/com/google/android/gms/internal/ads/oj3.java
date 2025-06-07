package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class oj3 implements dj3 {

    /* renamed from: a, reason: collision with root package name */
    private final cw3 f13289a;

    /* renamed from: b, reason: collision with root package name */
    private final cw3 f13290b;

    private oj3(byte[] bArr, byte[] bArr2) {
        this.f13289a = cw3.b(bArr);
        this.f13290b = cw3.b(bArr2);
    }

    static oj3 a(byte[] bArr) {
        return new oj3(bArr, zv3.c(bArr));
    }
}
