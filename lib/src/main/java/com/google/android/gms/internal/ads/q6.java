package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class q6 extends u6 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f14157o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f14158p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f14159n;

    q6() {
    }

    public static boolean j(jm2 jm2Var) {
        return k(jm2Var, f14157o);
    }

    private static boolean k(jm2 jm2Var, byte[] bArr) {
        if (jm2Var.i() < 8) {
            return false;
        }
        int iK = jm2Var.k();
        byte[] bArr2 = new byte[8];
        jm2Var.b(bArr2, 0, 8);
        jm2Var.f(iK);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final long a(jm2 jm2Var) {
        return f(j0.c(jm2Var.h()));
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f14159n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final boolean c(jm2 jm2Var, long j10, r6 r6Var) {
        k9 k9VarY;
        if (k(jm2Var, f14157o)) {
            byte[] bArrCopyOf = Arrays.copyOf(jm2Var.h(), jm2Var.l());
            int i10 = bArrCopyOf[9] & 255;
            List listD = j0.d(bArrCopyOf);
            if (r6Var.f14643a != null) {
                return true;
            }
            i7 i7Var = new i7();
            i7Var.s("audio/opus");
            i7Var.e0(i10);
            i7Var.t(48000);
            i7Var.i(listD);
            k9VarY = i7Var.y();
        } else {
            if (!k(jm2Var, f14158p)) {
                gt1.b(r6Var.f14643a);
                return false;
            }
            gt1.b(r6Var.f14643a);
            if (this.f14159n) {
                return true;
            }
            this.f14159n = true;
            jm2Var.g(8);
            ld0 ld0VarB = y0.b(c63.t(y0.c(jm2Var, false, false).f16510b));
            if (ld0VarB == null) {
                return true;
            }
            i7 i7VarB = r6Var.f14643a.b();
            i7VarB.m(ld0VarB.d(r6Var.f14643a.f10896j));
            k9VarY = i7VarB.y();
        }
        r6Var.f14643a = k9VarY;
        return true;
    }
}
