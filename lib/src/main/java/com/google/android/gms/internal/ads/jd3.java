package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class jd3 implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    private final byte[] f10442m;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jd3 jd3Var = (jd3) obj;
        int length = this.f10442m.length;
        int length2 = jd3Var.f10442m.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f10442m;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = jd3Var.f10442m[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jd3) {
            return Arrays.equals(this.f10442m, ((jd3) obj).f10442m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10442m);
    }

    public final String toString() {
        return pv3.a(this.f10442m);
    }
}
