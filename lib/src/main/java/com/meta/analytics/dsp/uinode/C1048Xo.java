package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1048Xo implements C1 {
    public static byte[] A06;
    public static String[] A07 = {"HjdDham6vZahXcTgWUbgEUyOKT1h9oJK", "zmqCaLmLP1EpiJCwLkXvkq6", "CCbuEfBP0uWpi7Hb1GvcX1U", "o4gQJY", "SL8jfjRVMuAieuHRUGCaPmGht5z7gRIo", "vKspY8ykEL6aMh62Xj5Lb9b4d0l6Zd9e", "qubnoWgXtnI1btvkRUNPdfYA8lWuJej8", "m2UxGDvrz36qppfZRjFAvHiLdTY4MpZ4"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[4].charAt(10) != 'A') {
                throw new RuntimeException();
            }
            A07[4] = "JIPli7exaIAIPM4JFFKoxJbhk98Su8Fy";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-102, -67, -79, -11, 6, 3, -14, 5, -6, 0, -1, 4, -26, 4, -50, -115, -127, -48, -57, -57, -44, -58, -43, -44, -98, -44, -56, 27, 17, 34, 13, 27, -27, -60, -72, 12, 1, 5, -3, -19, 11, -43, -83, -46, -33, -40, -43, -77, -40, -50, -49, -30, -110, -42, -49, -40, -47, -34, -46, -89};
    }

    static {
        A02();
    }

    public C1048Xo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            this.A05 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j10) {
        return IF.A0B(this.A04, j10, true, true);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j10) {
        int iA00 = A00(j10);
        C2 c22 = new C2(this.A04[iA00], this.A03[iA00]);
        if (c22.A01 < j10) {
            int chunkIndex = this.A00;
            if (iA00 != chunkIndex - 1) {
                int chunkIndex2 = iA00 + 1;
                long j11 = this.A04[chunkIndex2];
                int chunkIndex3 = iA00 + 1;
                C2 seekPoint = new C2(j11, this.A03[chunkIndex3]);
                return new C0(c22, seekPoint);
            }
        }
        return new C0(c22);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 42) + this.A00 + A01(25, 8, 104) + Arrays.toString(this.A01) + A01(15, 10, 33) + Arrays.toString(this.A03) + A01(33, 9, 88) + Arrays.toString(this.A04) + A01(1, 14, 81) + Arrays.toString(this.A02) + A01(0, 1, 49);
    }
}
