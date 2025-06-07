package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
final class p1 implements wn4 {

    /* renamed from: a, reason: collision with root package name */
    private final x f13512a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13513b;

    /* renamed from: c, reason: collision with root package name */
    private final s f13514c = new s();

    /* synthetic */ p1(x xVar, int i10, o1 o1Var) {
        this.f13512a = xVar;
        this.f13513b = i10;
    }

    private final long c(l lVar) throws EOFException, InterruptedIOException {
        while (lVar.c() < lVar.f() - 6) {
            x xVar = this.f13512a;
            int i10 = this.f13513b;
            s sVar = this.f13514c;
            long jC = lVar.c();
            byte[] bArr = new byte[2];
            bo4 bo4Var = (bo4) lVar;
            bo4Var.E(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.j();
                bo4Var.g((int) (jC - lVar.e()), false);
            } else {
                jm2 jm2Var = new jm2(16);
                System.arraycopy(bArr, 0, jm2Var.h(), 0, 2);
                jm2Var.e(o.a(lVar, jm2Var.h(), 2, 14));
                lVar.j();
                bo4Var.g((int) (jC - lVar.e()), false);
                if (t.c(jm2Var, xVar, i10, sVar)) {
                    break;
                }
            }
            bo4Var.g(1, false);
        }
        if (lVar.c() < lVar.f() - 6) {
            return this.f13514c.f15024a;
        }
        ((bo4) lVar).g((int) (lVar.f() - lVar.c()), false);
        return this.f13512a.f17318j;
    }

    @Override // com.google.android.gms.internal.ads.wn4
    public final vn4 a(l lVar, long j10) throws EOFException, InterruptedIOException {
        long jE = lVar.e();
        long jC = c(lVar);
        long jC2 = lVar.c();
        ((bo4) lVar).g(Math.max(6, this.f13512a.f17311c), false);
        long jC3 = c(lVar);
        return (jC > j10 || jC3 <= j10) ? jC3 <= j10 ? vn4.f(jC3, lVar.c()) : vn4.d(jC, jE) : vn4.e(jC2);
    }

    @Override // com.google.android.gms.internal.ads.wn4
    public final /* synthetic */ void b() {
    }
}
