package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
final class r4 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f14606d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14607a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f14608b;

    /* renamed from: c, reason: collision with root package name */
    private int f14609c;

    public static int b(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            long j10 = f14606d[i11] & i10;
            i11++;
            if (j10 != 0) {
                return i11;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f14606d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final int a() {
        return this.f14609c;
    }

    public final long d(l lVar, boolean z10, boolean z11, int i10) throws EOFException, InterruptedIOException {
        if (this.f14608b == 0) {
            if (!lVar.C(this.f14607a, 0, 1, z10)) {
                return -1L;
            }
            int iB = b(this.f14607a[0] & 255);
            this.f14609c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14608b = 1;
        }
        int i11 = this.f14609c;
        if (i11 > i10) {
            this.f14608b = 0;
            return -2L;
        }
        if (i11 != 1) {
            ((bo4) lVar).C(this.f14607a, 1, i11 - 1, false);
        }
        this.f14608b = 0;
        return c(this.f14607a, this.f14609c, z11);
    }

    public final void e() {
        this.f14608b = 0;
        this.f14609c = 0;
    }
}
