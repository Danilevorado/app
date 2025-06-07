package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X1 implements InterfaceC0537Cy {
    public static byte[] A0E;
    public static String[] A0F = {"FmtBUqGmzQvxm47AtoGl5GE", "5iXLyJPyDLcaPMUjk1v5bxBpoPhfo", "hif1Xiw3z0OLVixA8K1yUZiszA96", "VzETX2BwbL5Y", "rXQDE7FzOjIY2cTlxG1EbFIaNFkq3NBz", "hyxBaGmEw9nsGl9VO3HFyZpkQthqrgGl", "hfnp76HvDzKR", "cXQxcUyRSwddwq1B1B5vUbLw26Cn"};
    public long A00;
    public long A01;
    public C4 A02;
    public D2 A03;
    public String A04;
    public boolean A05;
    public final D7 A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final D4 A08 = new D4(7, 128);
    public final D4 A06 = new D4(8, 128);
    public final D4 A07 = new D4(6, 128);
    public final C0654Hz A0A = new C0654Hz();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    static {
        A01();
    }

    public X1(D7 d72, boolean z10, boolean z11) {
        this.A09 = d72;
        this.A0B = z10;
        this.A0C = z11;
    }

    private void A02(long j10, int i10, int i11, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    C0649Hu spsData = AbstractC0650Hv.A06(this.A08.A01, 3, this.A08.A00);
                    C0648Ht c0648HtA05 = AbstractC0650Hv.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A5n(Format.A03(this.A04, A00(0, 9, 18), null, -1, -1, spsData.A06, spsData.A02, -1.0f, arrayList, -1, spsData.A00, null));
                    this.A05 = true;
                    this.A03.A05(spsData);
                    this.A03.A04(c0648HtA05);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(AbstractC0650Hv.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else if (this.A06.A03()) {
                this.A03.A04(AbstractC0650Hv.A05(this.A06.A01, 3, this.A06.A00));
                this.A06.A00();
            }
        }
        if (this.A07.A04(i11)) {
            D4 d42 = this.A07;
            String[] strArr = A0F;
            if (strArr[4].charAt(26) == strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "MYiVFEqyRoVR8PpaQvBVtWO0d80axIUe";
            strArr2[5] = "WESehlM6UD3i8IXgr5ZdByrcv93bSxFf";
            int unescapedLength = AbstractC0650Hv.A02(d42.A01, this.A07.A00);
            this.A0A.A0b(this.A07.A01, unescapedLength);
            this.A0A.A0Y(4);
            this.A09.A02(j11, this.A0A);
        }
        this.A03.A02(j10, i10);
    }

    private void A03(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i10);
            this.A06.A01(i10);
        }
        this.A07.A01(i10);
        this.A03.A03(j10, i10, j11);
    }

    private void A04(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A03.A06(bArr, i10, i11);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void A4R(C0654Hz c0654Hz) {
        int offset;
        int iA06 = c0654Hz.A06();
        int iA07 = c0654Hz.A07();
        byte[] bArr = c0654Hz.A00;
        long j10 = this.A01;
        int offset2 = c0654Hz.A04();
        this.A01 = j10 + offset2;
        C4 c42 = this.A02;
        int offset3 = c0654Hz.A04();
        c42.AFR(c0654Hz, offset3);
        while (true) {
            int iA04 = AbstractC0650Hv.A04(bArr, iA06, iA07, this.A0D);
            if (iA04 == iA07) {
                A04(bArr, iA06, iA07);
                return;
            }
            int lengthToNalUnit = AbstractC0650Hv.A01(bArr, iA04);
            int i10 = iA04 - iA06;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[3] = "lQl99M6qnQlq";
            strArr2[6] = "jJKIbaSVKHql";
            if (i10 > 0) {
                A04(bArr, iA06, iA04);
            }
            int i11 = iA07 - iA04;
            long j11 = this.A01 - i11;
            if (i10 < 0) {
                offset = -i10;
                String[] strArr3 = A0F;
                if (strArr3[7].length() != strArr3[2].length()) {
                    String[] strArr4 = A0F;
                    strArr4[7] = "CFaupTF247UissJwn80OFqAOj9Vx";
                    strArr4[2] = "5OzpI30ijAeJlsq8Y1OyIdlDADpj";
                } else {
                    String[] strArr5 = A0F;
                    strArr5[1] = "eqTKDwhJaRXE4qM7uaf5ert1lQX8N";
                    strArr5[0] = "XXULpdZ36j09HmRAAM7fCX7";
                }
            } else {
                offset = 0;
            }
            A02(j11, i11, offset, this.A00);
            A03(j11, lengthToNalUnit, this.A00);
            iA06 = iA04 + 3;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void A4p(InterfaceC0513Bu interfaceC0513Bu, DC dc2) {
        dc2.A05();
        this.A04 = dc2.A04();
        C4 c4AGi = interfaceC0513Bu.AGi(dc2.A03(), 2);
        this.A02 = c4AGi;
        this.A03 = new D2(c4AGi, this.A0B, this.A0C);
        this.A09.A03(interfaceC0513Bu, dc2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void ADt(long j10, boolean z10) {
        this.A00 = j10;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void AFg() {
        AbstractC0650Hv.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
