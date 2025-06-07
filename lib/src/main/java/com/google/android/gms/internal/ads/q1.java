package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class q1 extends xn4 {
    public q1(final x xVar, int i10, long j10, long j11) {
        long j12;
        un4 un4Var = new un4() { // from class: com.google.android.gms.internal.ads.n1
            @Override // com.google.android.gms.internal.ads.un4
            public final long a(long j13) {
                return xVar.b(j13);
            }
        };
        p1 p1Var = new p1(xVar, i10, null);
        long jA = xVar.a();
        long j13 = xVar.f17318j;
        int i11 = xVar.f17312d;
        if (i11 > 0) {
            j12 = ((i11 + xVar.f17311c) / 2) + 1;
        } else {
            int i12 = xVar.f17309a;
            long j14 = 4096;
            if (i12 == xVar.f17310b && i12 > 0) {
                j14 = i12;
            }
            j12 = (((j14 * xVar.f17315g) * xVar.f17316h) / 8) + 64;
        }
        super(un4Var, p1Var, jA, 0L, j13, j10, j11, j12, Math.max(6, xVar.f17311c));
    }
}
