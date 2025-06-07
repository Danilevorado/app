package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1100Zp implements InterfaceC03374m {
    public static byte[] A04;
    public static String[] A05 = {"yYJ6SOT3uDFyj2TBTti7WWfRsn28EaA0", "ibfMp1J9gSZsYrxVf4NvaZx8D9JO1QBg", "rjgnGVcZwB7yGoiyculy9B4zYqmoHpCR", "", "BFeMqfRovMahqpkErO60kJAdny9RRdno", "ZwvbtEc0kmFFJCTTqnK3GQ6ySyfI7Whf", "3RaP0tr92GxZHPCEm9", "lHI5DV8"};
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-87, -66, -42, -52, -46, -47, 125, -51, -52, -48, -58, -47, -58, -52, -53, -48, 125, -54, -46, -48, -47, 125, -65, -62, 125, -53, -52, -53, -118, -53, -62, -60, -66, -47, -58, -45, -62, -60, -35, -20, -39, -32, -108, -40, -35, -25, -24, -43, -30, -41, -39, -108, -31, -23, -25, -24, -108, -42, -39, -108, -30, -29, -30, -95, -30, -39, -37, -43, -24, -35, -22, -39};
    }

    static {
        A01();
    }

    public final void A02() {
        int[] iArr = this.A03;
        if (iArr != null) {
            if (A05[7].length() != 7) {
                throw new RuntimeException();
            }
            A05[7] = "V5jR13F";
            Arrays.fill(iArr, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
    }

    public final void A04(C0556Eb c0556Eb, boolean z10) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC03394o abstractC03394o = c0556Eb.A06;
        if (c0556Eb.A04 != null && abstractC03394o != null && abstractC03394o.A1U()) {
            if (z10) {
                boolean zA0B = c0556Eb.A00.A0B();
                String[] strArr = A05;
                if (strArr[0].charAt(30) != strArr[5].charAt(30)) {
                    A05[7] = "b5aEeD0";
                    if (!zA0B) {
                        abstractC03394o.A1r(c0556Eb.A04.A0E(), this);
                    }
                }
                throw new RuntimeException();
            }
            if (!c0556Eb.A1p()) {
                abstractC03394o.A1q(this.A01, this.A02, c0556Eb.A0s, this);
            }
            int i10 = this.A00;
            int i11 = abstractC03394o.A00;
            String[] strArr2 = A05;
            if (strArr2[3].length() != strArr2[6].length()) {
                A05[7] = "TjVTm35";
                if (i10 > i11) {
                    abstractC03394o.A00 = this.A00;
                    abstractC03394o.A08 = z10;
                    c0556Eb.A0r.A0O();
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    public final boolean A05(int i10) {
        if (this.A03 != null) {
            int i11 = this.A00 * 2;
            for (int i12 = 0; i12 < i11; i12 += 2) {
                int count = this.A03[i12];
                if (count == i10) {
                    String[] strArr = A05;
                    String str = strArr[0];
                    String str2 = strArr[5];
                    int i13 = str.charAt(30);
                    int count2 = str2.charAt(30);
                    if (i13 == count2) {
                        throw new RuntimeException();
                    }
                    A05[2] = "SVfMGWcG5IEJEA83X9P3956xbutBXkdM";
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03374m
    public final void A3S(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.A00 * 2;
                int[] iArr = this.A03;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.A03 = iArr2;
                    Arrays.fill(iArr2, -1);
                } else {
                    int storagePosition = iArr.length;
                    if (i12 >= storagePosition) {
                        int[] iArr3 = this.A03;
                        int storagePosition2 = i12 * 2;
                        int[] iArr4 = new int[storagePosition2];
                        this.A03 = iArr4;
                        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                    }
                }
                int[] iArr5 = this.A03;
                iArr5[i12] = i10;
                int storagePosition3 = i12 + 1;
                iArr5[storagePosition3] = i11;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 33));
        }
        throw new IllegalArgumentException(A00(0, 37, 10));
    }
}
