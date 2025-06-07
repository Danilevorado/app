package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cw3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7104a;

    private cw3(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f7104a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static cw3 b(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new cw3(bArr, 0, bArr.length);
    }

    public final int a() {
        return this.f7104a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f7104a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cw3) {
            return Arrays.equals(((cw3) obj).f7104a, this.f7104a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7104a);
    }

    public final String toString() {
        return "Bytes(" + pv3.a(this.f7104a) + ")";
    }
}
