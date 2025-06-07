package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class u {
    public static ld0 a(l lVar, boolean z10) throws Throwable {
        ld0 ld0VarA = new b0().a(lVar, z10 ? null : i3.f9492a);
        if (ld0VarA == null || ld0VarA.a() == 0) {
            return null;
        }
        return ld0VarA;
    }

    public static w b(jm2 jm2Var) {
        jm2Var.g(1);
        int iU = jm2Var.u();
        long jK = jm2Var.k();
        long j10 = iU;
        int i10 = iU / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jZ = jm2Var.z();
            if (jZ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZ;
            jArrCopyOf2[i11] = jm2Var.z();
            jm2Var.g(2);
            i11++;
        }
        jm2Var.g((int) ((jK + j10) - jm2Var.k()));
        return new w(jArrCopyOf, jArrCopyOf2);
    }
}
