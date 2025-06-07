package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DC {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{12, 24, 26, 17, 26, 13, 30, 11, 26, 49, 26, 8, 54, 27, 87, 86, 95, 18, 10, 12, 11, 95, 29, 26, 95, 28, 30, 19, 19, 26, 27, 95, 29, 26, 25, 16, 13, 26, 95, 13, 26, 11, 13, 22, 26, 9, 22, 17, 24, 95, 22, 27, 12, 81};
    }

    public DC(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public DC(int i10, int i11, int i12) {
        this.A04 = i10 != Integer.MIN_VALUE ? i10 + A00(0, 1, 31) : A00(0, 0, 77);
        this.A02 = i11;
        this.A03 = i12;
        this.A00 = Integer.MIN_VALUE;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 67));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        int i10 = this.A00;
        this.A00 = i10 == Integer.MIN_VALUE ? this.A02 : i10 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
