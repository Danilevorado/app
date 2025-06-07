package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class yn4 {
    public static void a(long j10, jm2 jm2Var, s0[] s0VarArr) {
        int iM;
        while (true) {
            if (jm2Var.i() <= 1) {
                return;
            }
            int iC = c(jm2Var);
            int iC2 = c(jm2Var);
            int iK = jm2Var.k() + iC2;
            if (iC2 == -1 || iC2 > jm2Var.i()) {
                ad2.e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iK = jm2Var.l();
            } else if (iC == 4 && iC2 >= 8) {
                int iS = jm2Var.s();
                int iW = jm2Var.w();
                if (iW == 49) {
                    iM = jm2Var.m();
                    iW = 49;
                } else {
                    iM = 0;
                }
                int iS2 = jm2Var.s();
                if (iW == 47) {
                    jm2Var.g(1);
                    iW = 47;
                }
                boolean z10 = iS == 181 && (iW == 49 || iW == 47) && iS2 == 3;
                if (iW == 49) {
                    z10 &= iM == 1195456820;
                }
                if (z10) {
                    b(j10, jm2Var, s0VarArr);
                }
            }
            jm2Var.f(iK);
        }
    }

    public static void b(long j10, jm2 jm2Var, s0[] s0VarArr) {
        int iS = jm2Var.s();
        if ((iS & 64) != 0) {
            int i10 = iS & 31;
            jm2Var.g(1);
            int iK = jm2Var.k();
            for (s0 s0Var : s0VarArr) {
                int i11 = i10 * 3;
                jm2Var.f(iK);
                s0Var.a(jm2Var, i11);
                if (j10 != -9223372036854775807L) {
                    s0Var.e(j10, 1, i11, 0, null);
                }
            }
        }
    }

    private static int c(jm2 jm2Var) {
        int i10 = 0;
        while (jm2Var.i() != 0) {
            int iS = jm2Var.s();
            i10 += iS;
            if (iS != 255) {
                return i10;
            }
        }
        return -1;
    }
}
