package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final x f16507a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16508b;

    public v(x xVar, long j10) {
        this.f16507a = xVar;
        this.f16508b = j10;
    }

    private final p0 a(long j10, long j11) {
        return new p0((j10 * 1000000) / this.f16507a.f17313e, this.f16508b + j11);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f16507a.a();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        gt1.b(this.f16507a.f17319k);
        x xVar = this.f16507a;
        w wVar = xVar.f17319k;
        long[] jArr = wVar.f16920a;
        long[] jArr2 = wVar.f16921b;
        int iK = sv2.k(jArr, xVar.b(j10), true, false);
        p0 p0VarA = a(iK == -1 ? 0L : jArr[iK], iK != -1 ? jArr2[iK] : 0L);
        if (p0VarA.f13490a == j10 || iK == jArr.length - 1) {
            return new m0(p0VarA, p0VarA);
        }
        int i10 = iK + 1;
        return new m0(p0VarA, a(jArr[i10], jArr2[i10]));
    }
}
