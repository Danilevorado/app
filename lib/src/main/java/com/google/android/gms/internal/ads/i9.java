package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
abstract class i9 {
    public static Pair a(l lVar) throws oh0, EOFException, InterruptedIOException {
        lVar.j();
        h9 h9VarD = d(1684108385, lVar, new jm2(8));
        ((bo4) lVar).h(8, false);
        return Pair.create(Long.valueOf(lVar.e()), Long.valueOf(h9VarD.f9064b));
    }

    public static g9 b(l lVar) throws oh0, EOFException, InterruptedIOException {
        byte[] bArr;
        jm2 jm2Var = new jm2(16);
        h9 h9VarD = d(1718449184, lVar, jm2Var);
        gt1.f(h9VarD.f9064b >= 16);
        bo4 bo4Var = (bo4) lVar;
        bo4Var.E(jm2Var.h(), 0, 16, false);
        jm2Var.f(0);
        int iQ = jm2Var.q();
        int iQ2 = jm2Var.q();
        int iP = jm2Var.p();
        int iP2 = jm2Var.p();
        int iQ3 = jm2Var.q();
        int iQ4 = jm2Var.q();
        int i10 = ((int) h9VarD.f9064b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            bo4Var.E(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = sv2.f15565f;
        }
        ((bo4) lVar).h((int) (lVar.c() - lVar.e()), false);
        return new g9(iQ, iQ2, iP, iP2, iQ3, iQ4, bArr);
    }

    public static boolean c(l lVar) {
        jm2 jm2Var = new jm2(8);
        int i10 = h9.a(lVar, jm2Var).f9063a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((bo4) lVar).E(jm2Var.h(), 0, 4, false);
        jm2Var.f(0);
        int iM = jm2Var.m();
        if (iM == 1463899717) {
            return true;
        }
        ad2.b("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    private static h9 d(int i10, l lVar, jm2 jm2Var) throws oh0, EOFException, InterruptedIOException {
        while (true) {
            h9 h9VarA = h9.a(lVar, jm2Var);
            int i11 = h9VarA.f9063a;
            if (i11 == i10) {
                return h9VarA;
            }
            ad2.e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = h9VarA.f9064b + 8;
            if (j10 > 2147483647L) {
                throw oh0.c("Chunk is too large (~2GB+) to skip; id: " + h9VarA.f9063a);
            }
            ((bo4) lVar).h((int) j10, false);
        }
    }
}
