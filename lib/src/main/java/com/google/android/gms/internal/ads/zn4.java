package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zn4 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18667a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18668b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f18669c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f18670d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f18671e;

    /* renamed from: f, reason: collision with root package name */
    private final long f18672f;

    public zn4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18668b = iArr;
        this.f18669c = jArr;
        this.f18670d = jArr2;
        this.f18671e = jArr3;
        int length = iArr.length;
        this.f18667a = length;
        if (length <= 0) {
            this.f18672f = 0L;
        } else {
            int i10 = length - 1;
            this.f18672f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f18672f;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        int iK = sv2.k(this.f18671e, j10, true, true);
        p0 p0Var = new p0(this.f18671e[iK], this.f18669c[iK]);
        if (p0Var.f13490a >= j10 || iK == this.f18667a - 1) {
            return new m0(p0Var, p0Var);
        }
        int i10 = iK + 1;
        return new m0(p0Var, new p0(this.f18671e[i10], this.f18669c[i10]));
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f18667a + ", sizes=" + Arrays.toString(this.f18668b) + ", offsets=" + Arrays.toString(this.f18669c) + ", timeUs=" + Arrays.toString(this.f18671e) + ", durationsUs=" + Arrays.toString(this.f18670d) + ")";
    }
}
