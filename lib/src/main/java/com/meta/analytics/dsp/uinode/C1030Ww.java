package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1030Ww implements DD {
    public static byte[] A0C;
    public static String[] A0D = {"wYbCHe4PqE0rUTWdo8mFq0UBpfkRDoC", "CuNoFwrXbx7Fup1Bnz4crpheboHEAq61", "i4a35YUA6bJnEiUQjLdSeulU0LA5VC2", "DQj4nZO33GsRRuNygGqDxWwIbU", "NTzjfKAdqL5R4ni", "Zn", "9Rh66LtnIoGSEkHARJ7O", "nCQ56kMXgmV4b9DPw80w9mtudgrGO1uA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public IB A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC0537Cy A0A;
    public final C0653Hy A0B = new C0653Hy(new byte[10]);
    public int A03 = 0;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0D;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[6] = "tGST5WGrXasfnynKry2Y";
            strArr2[4] = "X7BCEDGkhqj2a0M";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A02() {
        A0C = new byte[]{-37, 40, 42, 45, 32, -37, 29, 52, 47, 32, 46, -44, -23, -9, -42, -23, -27, -24, -23, -10, -14, 11, 2, 21, 13, 2, 0, 17, 2, 1, -67, 16, 17, -2, 15, 17, -67, 0, 12, 1, 2, -67, 13, 15, 2, 3, 6, 21, -41, -67, 40, 65, 56, 75, 67, 56, 54, 71, 56, 55, -13, 70, 71, 52, 69, 71, -13, 60, 65, 55, 60, 54, 52, 71, 66, 69, -13, 69, 56, 52, 55, 60, 65, 58, -13, 56, 75, 71, 56, 65, 55, 56, 55, -13, 59, 56, 52, 55, 56, 69, -2, 23, 14, 33, 25, 14, 12, 29, 14, 13, -55, 28, 29, 10, 27, 29, -55, 18, 23, 13, 18, 12, 10, 29, 24, 27, -29, -55, 14, 33, 25, 14, 12, 29, 14, 13, -55};
    }

    static {
        A02();
    }

    public C1030Ww(InterfaceC0537Cy interfaceC0537Cy) {
        this.A0A = interfaceC0537Cy;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A08(4);
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long jA04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j10 = jA04 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A05.A07((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A07(j10);
        }
    }

    private void A03(int i10) {
        this.A03 = i10;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int iA04 = this.A0B.A04(24);
        if (iA04 != 1) {
            Log.w(A00(11, 9, 27), A00(20, 30, 52) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int iA042 = this.A0B.A04(16);
        this.A0B.A08(5);
        this.A06 = this.A0B.A0F();
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int packetLength = this.A0B.A04(8);
        this.A01 = packetLength;
        if (iA042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix = iA042 + 6;
            this.A02 = (startCodePrefix - 9) - packetLength;
        }
        return true;
    }

    private boolean A05(C0654Hz c0654Hz, byte[] bArr, int i10) {
        int iMin = Math.min(c0654Hz.A04(), i10 - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0654Hz.A0Z(iMin);
        } else {
            int bytesToRead = this.A00;
            c0654Hz.A0c(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + iMin;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    @Override // com.meta.analytics.dsp.uinode.DD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4S(com.meta.analytics.dsp.uinode.C0654Hz r8, boolean r9) throws com.meta.analytics.dsp.uinode.C04629v {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1030Ww.A4S(com.facebook.ads.redexgen.X.Hz, boolean):void");
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void A8q(IB ib2, InterfaceC0513Bu interfaceC0513Bu, DC dc2) {
        this.A05 = ib2;
        this.A0A.A4p(interfaceC0513Bu, dc2);
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void AFg() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AFg();
    }
}
