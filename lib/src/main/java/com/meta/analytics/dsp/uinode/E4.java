package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class E4 implements XV {
    public static byte[] A05;
    public static String[] A06 = {"ilqNaxLa84KwPxLclQkuXaDAjXKjVBay", "YYRGnxFlW9XodSzMr5d0AgWnEUGN8SAb", "TFjL0s25LaCBEteV0vZTEC31LOIwZtzx", "GUmZTVO9tTTKl3Mpcsedxo5lbewk1Lj3", "rxyeYW6RMQKKTnfalukPqNZ2KBfsB6S5", "mDRU4t7MoPNm7z5QI5KjgmazMAxk28NE", "eki8tF0EBXj6l5GM9f5RfEnwS82fHKRK", "1REkWmsZMDj0bgzORsQu3VEtsLn99tZ6"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static E4 A01(long j10, long j11, By by, C0654Hz c0654Hz) {
        int iA0H;
        int i10 = by.A04;
        int i11 = by.A03;
        int iA08 = c0654Hz.A08();
        if ((iA08 & 1) != 1 || (iA0H = c0654Hz.A0H()) == 0) {
            return null;
        }
        long jA0F = IF.A0F(iA0H, i10 * 1000000, i11);
        if ((iA08 & 6) != 6) {
            return new E4(j11, by.A02, jA0F);
        }
        long jA0H = c0654Hz.A0H();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c0654Hz.A0E();
        }
        if (j10 != -1 && j10 != j11 + jA0H) {
            Log.w(A02(27, 10, 25), A02(2, 25, 119) + j10 + A02(0, 2, 77) + (j11 + jA0H));
        }
        return new E4(j11, by.A02, jA0F, jA0H, jArr);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-24, -36, 62, 47, 52, 45, 6, 74, 71, 90, 71, 6, 89, 79, 96, 75, 6, 83, 79, 89, 83, 71, 90, 73, 78, 32, 6, -32, -15, -10, -17, -37, -19, -19, -13, -19, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j10) {
        long j11 = j10 - this.A02;
        if (!A9I()) {
            return 0L;
        }
        int i10 = this.A00;
        String[] strArr = A06;
        if (strArr[5].charAt(8) == strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "W8nk4dNFk5UYs2ixe7nvUw2jVo0XpVlf";
        strArr2[2] = "94Ku6bJ3HPlMD7WZMvisRyq3A9jYmrd2";
        if (j11 <= i10) {
            return 0L;
        }
        double d10 = (j11 * 256.0d) / this.A01;
        int iA0B = IF.A0B(this.A04, (long) d10, true, true);
        long jA00 = A00(iA0B);
        long j12 = this.A04[iA0B];
        long jA002 = A00(iA0B + 1);
        return Math.round((jA002 - jA00) * (j12 == (iA0B == 99 ? 256L : this.A04[iA0B + 1]) ? 0.0d : (d10 - j12) / (r9 - j12))) + jA00;
    }

    static {
        A03();
    }

    public E4(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public E4(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A02 = j10;
        this.A00 = i10;
        this.A03 = j11;
        this.A01 = j12;
        this.A04 = jArr;
    }

    private long A00(int i10) {
        return (this.A03 * i10) / 100;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j10) {
        double scaledPosition;
        if (!A9I()) {
            return new C0(new C2(0L, this.A02 + this.A00));
        }
        long jA0E = IF.A0E(j10, 0L, this.A03);
        double d10 = (jA0E * 100.0d) / this.A03;
        if (d10 <= 0.0d) {
            scaledPosition = 0.0d;
        } else if (d10 >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i10 = (int) d10;
            double prevScaledPosition = this.A04[i10];
            double d11 = i10 == 99 ? 256.0d : r5[i10 + 1];
            double d12 = i10;
            String[] strArr = A06;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "OMtgh7AGIO6dejZGwnLWpymQ4IFINQQk";
            strArr2[2] = "IsjlGA9bpSadN6h09kE1zH4HNrdroVjr";
            scaledPosition = ((d11 - prevScaledPosition) * (d10 - d12)) + prevScaledPosition;
        }
        long jRound = Math.round((scaledPosition / 256.0d) * this.A01);
        long positionOffset = this.A00;
        return new C0(new C2(jA0E, this.A02 + IF.A0E(jRound, positionOffset, this.A01 - 1)));
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return this.A04 != null;
    }
}
