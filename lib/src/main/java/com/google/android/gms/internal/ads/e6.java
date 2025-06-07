package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f7643a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7644b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7645c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7646d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7647e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7648f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7649g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7650h;

    public e6(b6 b6Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        gt1.d(length == length2);
        int length3 = jArr.length;
        gt1.d(length3 == length2);
        int length4 = iArr2.length;
        gt1.d(length4 == length2);
        this.f7643a = b6Var;
        this.f7645c = jArr;
        this.f7646d = iArr;
        this.f7647e = i10;
        this.f7648f = jArr2;
        this.f7649g = iArr2;
        this.f7650h = j10;
        this.f7644b = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int iK = sv2.k(this.f7648f, j10, true, false); iK >= 0; iK--) {
            if ((this.f7649g[iK] & 1) != 0) {
                return iK;
            }
        }
        return -1;
    }

    public final int b(long j10) {
        for (int i10 = sv2.i(this.f7648f, j10, true, false); i10 < this.f7648f.length; i10++) {
            if ((this.f7649g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }
}
