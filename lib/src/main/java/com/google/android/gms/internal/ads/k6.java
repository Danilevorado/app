package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class k6 extends u6 {

    /* renamed from: n, reason: collision with root package name */
    private x f10841n;

    /* renamed from: o, reason: collision with root package name */
    private j6 f10842o;

    k6() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final long a(jm2 jm2Var) {
        if (!j(jm2Var.h())) {
            return -1L;
        }
        int i10 = (jm2Var.h()[2] & 255) >> 4;
        if (i10 == 6) {
            jm2Var.g(4);
            jm2Var.C();
        } else if (i10 == 7) {
            i10 = 7;
            jm2Var.g(4);
            jm2Var.C();
        }
        int iA = t.a(jm2Var, i10);
        jm2Var.f(0);
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f10841n = null;
            this.f10842o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final boolean c(jm2 jm2Var, long j10, r6 r6Var) {
        byte[] bArrH = jm2Var.h();
        x xVar = this.f10841n;
        if (xVar == null) {
            x xVar2 = new x(bArrH, 17);
            this.f10841n = xVar2;
            r6Var.f14643a = xVar2.c(Arrays.copyOfRange(bArrH, 9, jm2Var.l()), null);
            return true;
        }
        if ((bArrH[0] & Byte.MAX_VALUE) == 3) {
            w wVarB = u.b(jm2Var);
            x xVarF = xVar.f(wVarB);
            this.f10841n = xVarF;
            this.f10842o = new j6(xVarF, wVarB);
            return true;
        }
        if (!j(bArrH)) {
            return true;
        }
        j6 j6Var = this.f10842o;
        if (j6Var != null) {
            j6Var.b(j10);
            r6Var.f14644b = this.f10842o;
        }
        Objects.requireNonNull(r6Var.f14643a);
        return false;
    }
}
