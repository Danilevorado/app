package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EC implements XV {
    public static byte[] A03;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 75, 29, 9, 25, 2, 107, 47, 42, 63, 42, 107, 56, 34, 49, 46, 107, 38, 34, 56, 38, 42, 63, 40, 35, 113, 107, 0, 52, 36, 63, 5, 51, 51, 61, 51, 36};
    }

    public EC(long[] jArr, long[] jArr2, long j10) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j10;
    }

    public static EC A00(long j10, long j11, By by, C0654Hz c0654Hz) {
        int iA0E;
        long j12 = j11;
        c0654Hz.A0Z(10);
        int numFrames = c0654Hz.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = by.A03;
        long jA0F = IF.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int iA0I = c0654Hz.A0I();
        int numFrames2 = c0654Hz.A0I();
        int iA0I2 = c0654Hz.A0I();
        c0654Hz.A0Z(2);
        long j13 = j12 + by.A02;
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        for (int scale = 0; scale < iA0I; scale++) {
            jArr[scale] = (scale * jA0F) / iA0I;
            jArr2[scale] = Math.max(j12, j13);
            switch (iA0I2) {
                case 1:
                    iA0E = c0654Hz.A0E();
                    break;
                case 2:
                    iA0E = c0654Hz.A0I();
                    break;
                case 3:
                    iA0E = c0654Hz.A0G();
                    break;
                case 4:
                    iA0E = c0654Hz.A0H();
                    break;
                default:
                    return null;
            }
            j12 += iA0E * numFrames2;
        }
        if (j10 != -1 && j10 != j12) {
            Log.w(A01(27, 10, 87), A01(2, 25, 74) + j10 + A01(0, 2, 106) + j12);
        }
        return new EC(jArr, jArr2, jA0F);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j10) {
        int iA0B = IF.A0B(this.A02, j10, true, true);
        C2 c22 = new C2(this.A02[iA0B], this.A01[iA0B]);
        if (c22.A01 < j10) {
            int tableIndex = this.A02.length;
            if (iA0B != tableIndex - 1) {
                int tableIndex2 = iA0B + 1;
                long j11 = this.A02[tableIndex2];
                int tableIndex3 = iA0B + 1;
                C2 nextSeekPoint = new C2(j11, this.A01[tableIndex3]);
                return new C0(c22, nextSeekPoint);
            }
        }
        return new C0(c22);
    }

    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j10) {
        return this.A02[IF.A0B(this.A01, j10, true, true)];
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
