package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class be2 {

    /* renamed from: a, reason: collision with root package name */
    private int f6440a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f6441b = new long[32];

    public be2(int i10) {
    }

    public final int a() {
        return this.f6440a;
    }

    public final long b(int i10) {
        if (i10 >= 0 && i10 < this.f6440a) {
            return this.f6441b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f6440a);
    }

    public final void c(long j10) {
        int i10 = this.f6440a;
        long[] jArr = this.f6441b;
        if (i10 == jArr.length) {
            this.f6441b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f6441b;
        int i11 = this.f6440a;
        this.f6440a = i11 + 1;
        jArr2[i11] = j10;
    }
}
