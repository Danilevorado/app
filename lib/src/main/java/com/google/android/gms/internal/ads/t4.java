package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class t4 implements y4 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f15680a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15681b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15682c;

    private t4(long[] jArr, long[] jArr2, long j10) {
        this.f15680a = jArr;
        this.f15681b = jArr2;
        this.f15682c = j10 == -9223372036854775807L ? sv2.w(jArr2[jArr2.length - 1]) : j10;
    }

    public static t4 a(long j10, n3 n3Var, long j11) {
        int length = n3Var.f12383q.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += n3Var.f12381o + n3Var.f12383q[i12];
            j12 += n3Var.f12382p + n3Var.f12384r[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new t4(jArr, jArr2, j11);
    }

    private static Pair d(long j10, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iK = sv2.k(jArr, j10, true, true);
        long j11 = jArr[iK];
        long j12 = jArr2[iK];
        int i10 = iK + 1;
        if (i10 == jArr.length) {
            lValueOf = Long.valueOf(j11);
            lValueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            lValueOf = Long.valueOf(j10);
            lValueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.y4
    public final long b() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f15682c;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        Pair pairD = d(sv2.y(Math.max(0L, Math.min(j10, this.f15682c))), this.f15681b, this.f15680a);
        p0 p0Var = new p0(sv2.w(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new m0(p0Var, p0Var);
    }

    @Override // com.google.android.gms.internal.ads.y4
    public final long i(long j10) {
        return sv2.w(((Long) d(j10, this.f15680a, this.f15681b).second).longValue());
    }
}
