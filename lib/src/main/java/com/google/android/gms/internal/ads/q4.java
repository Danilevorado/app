package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
final class q4 {

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f14127a = new jm2(8);

    /* renamed from: b, reason: collision with root package name */
    private int f14128b;

    private final long b(l lVar) {
        bo4 bo4Var = (bo4) lVar;
        int i10 = 0;
        bo4Var.E(this.f14127a.h(), 0, 1, false);
        int i11 = this.f14127a.h()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        bo4Var.E(this.f14127a.h(), 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f14127a.h()[i10] & 255) + (i14 << 8);
        }
        this.f14128b += i13 + 1;
        return i14;
    }

    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        long jF = lVar.f();
        long j10 = 1024;
        if (jF != -1 && jF <= 1024) {
            j10 = jF;
        }
        bo4 bo4Var = (bo4) lVar;
        bo4Var.E(this.f14127a.h(), 0, 4, false);
        long jA = this.f14127a.A();
        this.f14128b = 4;
        while (jA != 440786851) {
            int i10 = (int) j10;
            int i11 = this.f14128b + 1;
            this.f14128b = i11;
            if (i11 == i10) {
                return false;
            }
            bo4Var.E(this.f14127a.h(), 0, 1, false);
            jA = ((jA << 8) & (-256)) | (this.f14127a.h()[0] & 255);
        }
        long jB = b(lVar);
        long j11 = this.f14128b;
        if (jB != Long.MIN_VALUE && (jF == -1 || j11 + jB < jF)) {
            while (true) {
                long j12 = this.f14128b;
                long j13 = j11 + jB;
                if (j12 < j13) {
                    if (b(lVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jB2 = b(lVar);
                    if (jB2 < 0) {
                        return false;
                    }
                    if (jB2 != 0) {
                        int i12 = (int) jB2;
                        bo4Var.g(i12, false);
                        this.f14128b += i12;
                    }
                } else if (j12 == j13) {
                    return true;
                }
            }
        }
        return false;
    }
}
