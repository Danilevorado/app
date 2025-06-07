package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class d0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f7130a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f7131b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7132c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7133d;

    public d0(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        gt1.d(length == length2);
        boolean z10 = length2 > 0;
        this.f7133d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f7130a = jArr;
            this.f7131b = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.f7130a = jArr3;
            long[] jArr4 = new long[i10];
            this.f7131b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f7132c = j10;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f7132c;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return this.f7133d;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        if (!this.f7133d) {
            p0 p0Var = p0.f13489c;
            return new m0(p0Var, p0Var);
        }
        int iK = sv2.k(this.f7131b, j10, true, true);
        p0 p0Var2 = new p0(this.f7131b[iK], this.f7130a[iK]);
        if (p0Var2.f13490a != j10) {
            long[] jArr = this.f7131b;
            if (iK != jArr.length - 1) {
                int i10 = iK + 1;
                return new m0(p0Var2, new p0(jArr[i10], this.f7130a[i10]));
            }
        }
        return new m0(p0Var2, p0Var2);
    }
}
