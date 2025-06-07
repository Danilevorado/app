package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class z8 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long b(jm2 jm2Var, int i10, int i11) {
        jm2Var.f(i10);
        if (jm2Var.i() < 5) {
            return -9223372036854775807L;
        }
        int iM = jm2Var.m();
        if ((8388608 & iM) != 0 || ((iM >> 8) & 8191) != i11 || (iM & 32) == 0 || jm2Var.s() < 7 || jm2Var.i() < 7 || (jm2Var.s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        jm2Var.b(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((bArr[4] & 255) >> 7);
    }
}
