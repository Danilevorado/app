package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class XN implements InterfaceC0511Bs {
    public static byte[] A0X;
    public static String[] A0Y = {"XdJWu", "FUlE3E4RGCFuY0n1jkLa4sDNStY", "LTfWg4MeBgD", "ea2mTe", "5aN4xnjUR54", "JRDUjTwIRED0cdRjG5ryaKaac6vLzQ8c", "s80pf3iUB", "VFz"};
    public static final InterfaceC0514Bv A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC0513Bu A0C;
    public CV A0D;
    public C0654Hz A0E;
    public boolean A0F;
    public boolean A0G;
    public C4[] A0H;
    public C4[] A0I;
    public final int A0J;
    public final SparseArray<CV> A0K;
    public final DrmInitData A0L;
    public final C4 A0M;
    public final C0520Ce A0N;
    public final C0654Hz A0O;
    public final C0654Hz A0P;
    public final C0654Hz A0Q;
    public final C0654Hz A0R;
    public final IB A0S;
    public final ArrayDeque<XT> A0T;
    public final ArrayDeque<CU> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00(CV cv, int i10, long j10, int i11, C0654Hz c0654Hz, int i12) {
        int iA0H;
        int i13 = i12;
        long j11 = j10;
        c0654Hz.A0Y(8);
        int iA00 = CJ.A00(c0654Hz.A08());
        C0520Ce c0520Ce = cv.A05;
        C0522Cg c0522Cg = cv.A07;
        CP cp = c0522Cg.A07;
        c0522Cg.A0E[i10] = c0654Hz.A0H();
        c0522Cg.A0G[i10] = c0522Cg.A05;
        if ((iA00 & 1) != 0) {
            long[] jArr = c0522Cg.A0G;
            jArr[i10] = jArr[i10] + c0654Hz.A08();
        }
        boolean z10 = (iA00 & 4) != 0;
        int iA0H2 = cp.A01;
        if (z10) {
            iA0H2 = c0654Hz.A0H();
        }
        boolean z11 = (iA00 & 256) != 0;
        boolean z12 = (iA00 & 512) != 0;
        boolean z13 = (iA00 & 1024) != 0;
        boolean z14 = (iA00 & 2048) != 0;
        long jA0F = 0;
        if (c0520Ce.A08 != null && c0520Ce.A08.length == 1 && c0520Ce.A08[0] == 0) {
            jA0F = IF.A0F(c0520Ce.A09[0], 1000L, c0520Ce.A06);
        }
        int[] iArr = c0522Cg.A0D;
        int[] iArr2 = c0522Cg.A0C;
        long[] jArr2 = c0522Cg.A0F;
        boolean[] zArr = c0522Cg.A0I;
        boolean z15 = c0520Ce.A03 == 2 && (i11 & 1) != 0;
        int i14 = i13 + c0522Cg.A0E[i10];
        long j12 = c0520Ce.A06;
        if (i10 > 0) {
            j11 = c0522Cg.A06;
        }
        while (i13 < i14) {
            int iA0H3 = z11 ? c0654Hz.A0H() : cp.A00;
            if (z12) {
                iA0H = c0654Hz.A0H();
            } else {
                iA0H = cp.A03;
                if (A0Y[5].charAt(2) == 'C') {
                    throw new RuntimeException();
                }
                A0Y[6] = "dkwnFPd0";
            }
            int iA08 = (i13 == 0 && z10) ? iA0H2 : z13 ? c0654Hz.A08() : cp.A01;
            if (z14) {
                iArr2[i13] = (int) ((c0654Hz.A08() * 1000) / j12);
            } else {
                iArr2[i13] = 0;
            }
            jArr2[i13] = IF.A0F(j11, 1000L, j12) - jA0F;
            iArr[i13] = iA0H;
            zArr[i13] = ((iA08 >> 16) & 1) == 0 && (!z15 || i13 == 0);
            j11 += iA0H3;
            i13++;
        }
        c0522Cg.A06 = j11;
        return i14;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, C1048Xo> A04(C0654Hz c0654Hz, long j10) throws C04629v {
        long jA0N;
        long jA0N2;
        c0654Hz.A0Y(8);
        int iA01 = CJ.A01(c0654Hz.A08());
        c0654Hz.A0Z(4);
        long jA0M = c0654Hz.A0M();
        if (iA01 == 0) {
            jA0N = c0654Hz.A0M();
            jA0N2 = j10 + c0654Hz.A0M();
        } else {
            jA0N = c0654Hz.A0N();
            jA0N2 = j10 + c0654Hz.A0N();
        }
        long jA0F = IF.A0F(jA0N, 1000000L, jA0M);
        c0654Hz.A0Z(2);
        int iA0I = c0654Hz.A0I();
        int[] iArr = new int[iA0I];
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        long[] jArr3 = new long[iA0I];
        long jA0F2 = jA0F;
        for (int i10 = 0; i10 < iA0I; i10++) {
            int iA08 = c0654Hz.A08();
            if ((Integer.MIN_VALUE & iA08) != 0) {
                throw new C04629v(A0A(581, 28, 126));
            }
            long jA0M2 = c0654Hz.A0M();
            iArr[i10] = Integer.MAX_VALUE & iA08;
            jArr[i10] = jA0N2;
            jArr3[i10] = jA0F2;
            jA0N += jA0M2;
            jA0F2 = IF.A0F(jA0N, 1000000L, jA0M);
            jArr2[i10] = jA0F2 - jArr3[i10];
            c0654Hz.A0Z(4);
            jA0N2 += iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0F), new C1048Xo(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static CV A09(C0654Hz c0654Hz, SparseArray<CV> sparseArray) {
        c0654Hz.A0Y(8);
        int iA00 = CJ.A00(c0654Hz.A08());
        CV cvA08 = A08(sparseArray, c0654Hz.A08());
        if (cvA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0N = c0654Hz.A0N();
            cvA08.A07.A05 = jA0N;
            cvA08.A07.A04 = jA0N;
        }
        CP cp = cvA08.A04;
        cvA08.A07.A07 = new CP((iA00 & 2) != 0 ? c0654Hz.A0H() - 1 : cp.A02, (iA00 & 8) != 0 ? c0654Hz.A0H() : cp.A00, (iA00 & 16) != 0 ? c0654Hz.A0H() : cp.A03, (iA00 & 32) != 0 ? c0654Hz.A0H() : cp.A01);
        return cvA08;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{117, 121, 84, 97, 122, 120, 53, 102, 124, 111, 112, 53, 121, 112, 102, 102, 53, 97, 125, 116, 123, 53, 125, 112, 116, 113, 112, 103, 53, 121, 112, 123, 114, 97, 125, 53, 61, 96, 123, 102, 96, 101, 101, 122, 103, 97, 112, 113, 60, 59, 114, 89, 67, 69, 78, 23, 84, 88, 66, 89, 67, 23, 94, 89, 23, 68, 85, 80, 71, 23, 22, 10, 23, 6, 23, 31, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, 30, 25, 119, 92, 70, 64, 75, 18, 81, 93, 71, 92, 70, 18, 91, 92, 18, 65, 85, 66, 86, 18, 19, 15, 18, 3, 18, 26, 71, 92, 65, 71, 66, 66, 93, 64, 70, 87, 86, 27, 28, 57, 13, 30, 24, 18, 26, 17, 11, 26, 27, 50, 15, 75, 58, 7, 11, 13, 30, 28, 11, 16, 13, 0, 46, 39, 38, 59, 32, 39, 46, 105, 39, 44, 46, 40, 61, 32, 63, 44, 105, 38, 47, 47, 58, 44, 61, 105, 61, 38, 105, 58, 40, 36, 57, 37, 44, 105, 45, 40, 61, 40, 103, 51, 26, 30, 25, 95, 30, 11, 16, 18, 95, 27, 26, 25, 22, 17, 26, 12, 95, 26, 7, 11, 26, 17, 27, 26, 27, 95, 30, 11, 16, 18, 95, 12, 22, 5, 26, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 86, 81, 30, 55, 51, 52, 114, 51, 38, 61, 63, 114, 37, 59, 38, 58, 114, 62, 55, 60, 53, 38, 58, 114, 108, 114, 96, 99, 102, 101, 102, 106, 97, 100, 102, 101, 114, 122, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 123, 124, 63, 22, 29, 20, 7, 27, 83, 30, 26, 0, 30, 18, 7, 16, 27, 73, 83, 15, 38, 38, 51, 37, 52, 96, 52, 47, 96, 37, 46, 35, 50, 57, 48, 52, 41, 47, 46, 96, 36, 33, 52, 33, 96, 55, 33, 51, 96, 46, 37, 39, 33, 52, 41, 54, 37, 110, 16, 57, 57, 44, 58, 43, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 58, 49, 59, Byte.MAX_VALUE, 48, 57, Byte.MAX_VALUE, 50, 59, 62, 43, Byte.MAX_VALUE, 40, 62, 44, Byte.MAX_VALUE, 49, 58, 56, 62, 43, 54, 41, 58, 113, 106, 83, 64, 87, 87, 76, 65, 76, 75, 66, 5, 113, 87, 68, 70, 78, 96, 75, 70, 87, 92, 85, 81, 76, 74, 75, 103, 74, 93, 5, 85, 68, 87, 68, 72, 64, 81, 64, 87, 86, 5, 76, 86, 5, 80, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, 11, 14, 54, 52, 45, 45, 56, 57, 125, 45, 46, 46, 53, 125, 60, 41, 50, 48, 125, 117, 59, 60, 52, 49, 56, 57, 125, 41, 50, 125, 56, 37, 41, 47, 60, 62, 41, 125, 40, 40, 52, 57, 116, 54, 14, 12, 21, 21, 12, 11, 2, 69, 4, 17, 10, 8, 69, 18, 12, 17, 13, 69, 9, 0, 11, 2, 17, 13, 69, 91, 69, 87, 84, 81, 82, 81, 93, 86, 83, 81, 82, 69, 77, 16, 11, 22, 16, 21, 21, 10, 23, 17, 0, 1, 76, 75, 62, 5, 14, 19, 27, 14, 8, 31, 14, 15, 75, 6, 4, 4, 29, 75, 9, 4, 19, 69, 13, 54, 61, 32, 40, 61, 59, 44, 61, 60, 120, 43, 57, 49, 55, 120, 61, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 98, 120, 76, 119, 113, 120, 119, 125, 117, 124, 125, 57, 112, 119, 125, 112, 107, 124, 122, 109, 57, 107, 124, Byte.MAX_VALUE, 124, 107, 124, 119, 122, 124, 58, 13, 30, 5, 13, 14, 0, 9, 76, 0, 9, 2, 11, 24, 4, 76, 8, 9, 31, 15, 30, 5, 28, 24, 5, 3, 2, 76, 5, 2, 76, 31, 11, 28, 8, 76, 10, 3, 25, 2, 8, 76, 68, 25, 2, 31, 25, 28, 28, 3, 30, 24, 9, 8, 69, 31, 14, 14, 18, 23, 29, 31, 10, 23, 17, 16, 81, 6, 83, 27, 19, 13, 25, 3, 21, 25, 23, 23, 8, 5, 4, 14, 78, 9, 4, 23, 2, 6, 25, 20, 21, 31, 95, 29, 0, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0K(XT xt) throws C04629v {
        AbstractC0629Ha.A06(this.A0N == null, A0A(532, 20, 12));
        DrmInitData drmInitDataA05 = this.A0L;
        if (drmInitDataA05 == null) {
            drmInitDataA05 = A05(xt.A02);
        }
        XT xtA06 = xt.A06(CJ.A0n);
        SparseArray<CP> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = xtA06.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            XS xs = xtA06.A02.get(i10);
            if (((CJ) xs).A00 == CJ.A1N) {
                Pair<Integer, CP> pairA03 = A03(xs.A00);
                sparseArray.put(((Integer) pairA03.first).intValue(), (CP) pairA03.second);
            } else if (((CJ) xs).A00 == CJ.A0g) {
                jA01 = A01(xs.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = xt.A01.size();
        for (int i11 = 0; i11 < size2; i11++) {
            XT xt2 = xt.A01.get(i11);
            if (((CJ) xt2).A00 == CJ.A1M) {
                C0520Ce c0520CeA0C = CO.A0C(xt2, xt.A07(CJ.A0o), jA01, drmInitDataA05, (this.A0J & 16) != 0, false);
                if (c0520CeA0C != null) {
                    sparseArray2.put(c0520CeA0C.A00, c0520CeA0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            AbstractC0629Ha.A04(this.A0K.size() == size3);
            for (int i12 = 0; i12 < size3; i12++) {
                C0520Ce c0520Ce = (C0520Ce) sparseArray2.valueAt(i12);
                this.A0K.get(c0520Ce.A00).A07(c0520Ce, A06(sparseArray, c0520Ce.A00));
            }
            return;
        }
        for (int i13 = 0; i13 < size3; i13++) {
            C0520Ce c0520Ce2 = (C0520Ce) sparseArray2.valueAt(i13);
            CV cv = new CV(this.A0C.AGi(i13, c0520Ce2.A03));
            cv.A07(c0520Ce2, A06(sparseArray, c0520Ce2.A00));
            this.A0K.put(c0520Ce2.A00, cv);
            this.A08 = Math.max(this.A08, c0520Ce2.A04);
        }
        A0C();
        this.A0C.A5Y();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0M(XT xt, SparseArray<CV> sparseArray, int i10, byte[] bArr) throws C04629v {
        CV cvA09 = A09(xt.A07(CJ.A1J).A00, sparseArray);
        if (cvA09 == null) {
            return;
        }
        C0522Cg c0522Cg = cvA09.A07;
        long jA02 = c0522Cg.A06;
        cvA09.A04();
        if (xt.A07(CJ.A1I) != null && (i10 & 2) == 0) {
            jA02 = A02(xt.A07(CJ.A1I).A00);
        }
        A0N(xt, cvA09, jA02, i10);
        C0521Cf c0521CfA00 = cvA09.A05.A00(c0522Cg.A07.A02);
        XS xsA07 = xt.A07(CJ.A0v);
        if (xsA07 != null) {
            A0P(c0521CfA00, xsA07.A00, c0522Cg);
        }
        XS xsA072 = xt.A07(CJ.A0u);
        if (xsA072 != null) {
            A0S(xsA072.A00, c0522Cg);
        }
        XS xsA073 = xt.A07(CJ.A11);
        if (xsA073 != null) {
            A0T(xsA073.A00, c0522Cg);
        }
        XS xsA074 = xt.A07(CJ.A0y);
        XS xsA075 = xt.A07(CJ.A12);
        if (xsA074 != null && xsA075 != null) {
            A0V(xsA074.A00, xsA075.A00, c0521CfA00 != null ? c0521CfA00.A02 : null, c0522Cg);
        }
        int size = xt.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            XS xs = xt.A02.get(i11);
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "89j";
            XS xs2 = xs;
            if (((CJ) xs2).A00 == CJ.A1R) {
                A0U(xs2.A00, c0522Cg, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0P(C0521Cf c0521Cf, C0654Hz c0654Hz, C0522Cg c0522Cg) throws C04629v {
        int i10 = c0521Cf.A00;
        c0654Hz.A0Y(8);
        if ((CJ.A00(c0654Hz.A08()) & 1) == 1) {
            c0654Hz.A0Z(8);
        }
        int iA0E = c0654Hz.A0E();
        int iA0H = c0654Hz.A0H();
        if (iA0H != c0522Cg.A00) {
            throw new C04629v(A0A(290, 17, 20) + iA0H + A0A(0, 2, 62) + c0522Cg.A00);
        }
        int i11 = 0;
        if (iA0E == 0) {
            boolean[] zArr = c0522Cg.A0H;
            for (int i12 = 0; i12 < iA0H; i12++) {
                int iA0E2 = c0654Hz.A0E();
                i11 += iA0E2;
                zArr[i12] = iA0E2 > i10;
            }
        } else {
            i11 = 0 + (iA0E * iA0H);
            Arrays.fill(c0522Cg.A0H, 0, iA0H, iA0E > i10);
        }
        c0522Cg.A02(i11);
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[2] = "tC3WLCXP6DZ";
        strArr[4] = "0Zxl8CEli3D";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0V(C0654Hz c0654Hz, C0654Hz c0654Hz2, String str, C0522Cg c0522Cg) throws C04629v {
        c0654Hz.A0Y(8);
        int iA08 = c0654Hz.A08();
        int iA082 = c0654Hz.A08();
        int i10 = A0a;
        if (iA082 != i10) {
            return;
        }
        if (CJ.A01(iA08) == 1) {
            c0654Hz.A0Z(4);
        }
        if (c0654Hz.A08() != 1) {
            throw new C04629v(A0A(50, 39, 80));
        }
        c0654Hz2.A0Y(8);
        int iA083 = c0654Hz2.A08();
        if (c0654Hz2.A08() != i10) {
            return;
        }
        int iA01 = CJ.A01(iA083);
        if (iA01 == 1) {
            if (c0654Hz2.A0M() == 0) {
                throw new C04629v(A0A(609, 55, 11));
            }
        } else if (iA01 >= 2) {
            c0654Hz2.A0Z(4);
        }
        if (c0654Hz2.A0M() != 1) {
            throw new C04629v(A0A(89, 39, 85));
        }
        c0654Hz2.A0Z(1);
        int iA0E = c0654Hz2.A0E();
        int i11 = (iA0E & 240) >> 4;
        int i12 = iA0E & 15;
        boolean z10 = c0654Hz2.A0E() == 1;
        if (z10) {
            int iA0E2 = c0654Hz2.A0E();
            byte[] bArr = new byte[16];
            c0654Hz2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z10 && iA0E2 == 0) {
                int iA0E3 = c0654Hz2.A0E();
                bArr2 = new byte[iA0E3];
                c0654Hz2.A0c(bArr2, 0, iA0E3);
            }
            c0522Cg.A0A = true;
            c0522Cg.A08 = new C0521Cf(z10, str, iA0E2, bArr, i11, i12, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new XO();
        A0a = IF.A08(A0A(682, 4, 23));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 25), Long.MAX_VALUE);
    }

    public XN() {
        this(0);
    }

    public XN(int i10) {
        this(i10, null);
    }

    public XN(int i10, IB ib2) {
        this(i10, ib2, null, null);
    }

    public XN(int i10, IB ib2, C0520Ce c0520Ce, DrmInitData drmInitData) {
        this(i10, ib2, c0520Ce, drmInitData, Collections.emptyList());
    }

    public XN(int i10, IB ib2, C0520Ce c0520Ce, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i10, ib2, c0520Ce, drmInitData, closedCaptionFormats, null);
    }

    public XN(int i10, IB ib2, C0520Ce c0520Ce, DrmInitData drmInitData, List<Format> closedCaptionFormats, C4 c42) {
        this.A0J = (c0520Ce != null ? 8 : 0) | i10;
        this.A0S = ib2;
        this.A0N = c0520Ce;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = c42;
        this.A0O = new C0654Hz(16);
        this.A0R = new C0654Hz(AbstractC0650Hv.A03);
        this.A0Q = new C0654Hz(5);
        this.A0P = new C0654Hz();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(C0654Hz c0654Hz) {
        c0654Hz.A0Y(8);
        int fullAtom = c0654Hz.A08();
        return CJ.A01(fullAtom) == 0 ? c0654Hz.A0M() : c0654Hz.A0N();
    }

    public static long A02(C0654Hz c0654Hz) {
        c0654Hz.A0Y(8);
        int fullAtom = c0654Hz.A08();
        int version = CJ.A01(fullAtom);
        return version == 1 ? c0654Hz.A0N() : c0654Hz.A0M();
    }

    public static Pair<Integer, CP> A03(C0654Hz c0654Hz) {
        c0654Hz.A0Y(12);
        int defaultSampleDescriptionIndex = c0654Hz.A08();
        int trackId = c0654Hz.A0H();
        int defaultSampleFlags = c0654Hz.A0H();
        int defaultSampleSize = c0654Hz.A0H();
        int defaultSampleDuration = c0654Hz.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new CP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<XS> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            XS xs = list.get(i10);
            int leafChildrenSize = ((CJ) xs).A00;
            if (leafChildrenSize == CJ.A0s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = xs.A00.A00;
                UUID uuidA02 = AbstractC0518Cb.A02(bArr);
                int leafChildrenSize2 = A0Y[3].length();
                if (leafChildrenSize2 != 6) {
                    throw new RuntimeException();
                }
                A0Y[7] = "tzO";
                if (uuidA02 == null) {
                    Log.w(A0A(128, 22, 24), A0A(437, 42, 58));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(696, 9, 23), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private CP A06(SparseArray<CP> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (CP) AbstractC0629Ha.A01(sparseArray.get(i10));
    }

    public static CV A07(SparseArray<CV> sparseArray) {
        CV cv = null;
        long trunOffset = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            CV cvValueAt = sparseArray.valueAt(i10);
            int i11 = cvValueAt.A02;
            if (A0Y[1].length() == 5) {
                throw new RuntimeException();
            }
            A0Y[0] = "VXm0n";
            if (i11 != cvValueAt.A07.A02) {
                long nextTrackRunOffset = cvValueAt.A07.A0G[cvValueAt.A02];
                if (nextTrackRunOffset < trunOffset) {
                    cv = cvValueAt;
                    trunOffset = nextTrackRunOffset;
                }
            }
        }
        return cv;
    }

    public static CV A08(SparseArray<CV> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0068 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0I
            if (r0 != 0) goto L42
            r0 = 2
            com.facebook.ads.redexgen.X.C4[] r5 = new com.meta.analytics.dsp.uinode.C4[r0]
            r6.A0I = r5
            r4 = 0
            com.facebook.ads.redexgen.X.C4 r1 = r6.A0M
            if (r1 == 0) goto L13
            int r0 = r4 + 1
            r5[r4] = r1
            r4 = r0
        L13:
            int r0 = r6.A0J
            r3 = 4
            r0 = r0 & r3
            if (r0 == 0) goto L2a
            int r2 = r4 + 1
            com.facebook.ads.redexgen.X.Bu r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.CV> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C4 r0 = r1.AGi(r0, r3)
            r5[r4] = r0
            r4 = r2
        L2a:
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0I
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            com.facebook.ads.redexgen.X.C4[] r4 = (com.meta.analytics.dsp.uinode.C4[]) r4
            r6.A0I = r4
            int r3 = r4.length
            r2 = 0
        L36:
            if (r2 >= r3) goto L42
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.meta.analytics.dsp.uinode.XN.A0b
            r1.A5n(r0)
            int r2 = r2 + 1
            goto L36
        L42:
            com.facebook.ads.redexgen.X.C4[] r3 = r6.A0H
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.XN.A0Y
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XN.A0Y
            java.lang.String r1 = "8HQd7O"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L8c
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C4[] r0 = new com.meta.analytics.dsp.uinode.C4[r0]
            r6.A0H = r0
            r3 = 0
        L65:
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L8c
            com.facebook.ads.redexgen.X.Bu r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.CV> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.C4 r1 = r2.AGi(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1.A5n(r0)
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0H
            r0[r3] = r1
            int r3 = r3 + 1
            goto L65
        L8c:
            return
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XN.A0C():void");
    }

    private void A0E(long j10) {
        while (!this.A0U.isEmpty()) {
            CU cuRemoveFirst = this.A0U.removeFirst();
            this.A03 -= cuRemoveFirst.A00;
            long jA06 = j10 + cuRemoveFirst.A01;
            IB ib2 = this.A0S;
            if (ib2 != null) {
                jA06 = ib2.A06(jA06);
            }
            C4[] c4Arr = this.A0I;
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "ltl";
            for (C4 c42 : c4Arr) {
                c42.AFS(jA06, 1, cuRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws C04629v {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j10) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        int i10 = ((int) this.A07) - this.A00;
        C0654Hz c0654Hz = this.A0E;
        if (c0654Hz != null) {
            interfaceC0512Bt.readFully(c0654Hz.A00, 8, i10);
            int atomPayloadSize = this.A01;
            A0O(new XS(atomPayloadSize, this.A0E), interfaceC0512Bt.A7i());
        } else {
            interfaceC0512Bt.AGP(i10);
        }
        A0F(interfaceC0512Bt.A7i());
        String[] strArr = A0Y;
        String str = strArr[2];
        String str2 = strArr[4];
        int atomPayloadSize2 = str.length();
        if (atomPayloadSize2 != str2.length()) {
            throw new RuntimeException();
        }
        A0Y[1] = "jmSEpbOdW733bHBoDHkBty1cmj";
    }

    private void A0H(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        CV cvValueAt = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            CV nextTrackBundle = this.A0K.valueAt(i10);
            C0522Cg c0522Cg = nextTrackBundle.A07;
            if (c0522Cg.A0B && c0522Cg.A04 < j10) {
                j10 = c0522Cg.A04;
                cvValueAt = this.A0K.valueAt(i10);
            }
        }
        if (cvValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA7i = (int) (j10 - interfaceC0512Bt.A7i());
        if (iA7i >= 0) {
            interfaceC0512Bt.AGP(iA7i);
            cvValueAt.A07.A04(interfaceC0512Bt);
            return;
        }
        throw new C04629v(A0A(307, 39, 39));
    }

    private void A0I(XT xt) throws C04629v {
        if (((CJ) xt).A00 == CJ.A0k) {
            A0K(xt);
            return;
        }
        int i10 = ((CJ) xt).A00;
        int i11 = CJ.A0j;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[6] = "QeKmRdkmErMZReeQj8";
        if (i10 == i11) {
            A0J(xt);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        XT xtPeek = this.A0T.peek();
        if (A0Y[6].length() != 17) {
            A0Y[1] = "g8UpS1NyodMZ5eBXtPatKQwsoR";
            xtPeek.A08(xt);
        } else {
            A0Y[5] = "mkv5is6F5Mu6y6USr0b4mkDGodGLaqlp";
            xtPeek.A08(xt);
        }
    }

    private void A0J(XT xt) throws C04629v {
        DrmInitData drmInitDataA05;
        A0L(xt, this.A0K, this.A0J, this.A0W);
        if (this.A0L != null) {
            drmInitDataA05 = null;
        } else {
            List<XS> list = xt.A02;
            int trackCount = A0Y[3].length();
            if (trackCount != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[2] = "YTpzURZBrt0";
            strArr[4] = "jDJUPBNch9x";
            drmInitDataA05 = A05(list);
        }
        if (drmInitDataA05 != null) {
            int i10 = this.A0K.size();
            for (int trackCount2 = 0; trackCount2 < i10; trackCount2++) {
                this.A0K.valueAt(trackCount2).A06(drmInitDataA05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0K.valueAt(i11).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(XT xt, SparseArray<CV> sparseArray, int i10, byte[] bArr) throws C04629v {
        int size = xt.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            XT child = xt.A01.get(i11);
            int i12 = ((CJ) child).A00;
            int moofContainerChildrenSize = CJ.A1L;
            if (i12 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i10, bArr);
            }
        }
    }

    public static void A0N(XT xt, CV cv, long j10, int totalSampleCount) {
        int i10 = 0;
        int i11 = 0;
        List<XS> list = xt.A02;
        int size = list.size();
        for (int trunSampleCount = 0; trunSampleCount < size; trunSampleCount++) {
            XS xs = list.get(trunSampleCount);
            if (((CJ) xs).A00 == CJ.A1O) {
                C0654Hz trunData = xs.A00;
                trunData.A0Y(12);
                int iA0H = trunData.A0H();
                if (iA0H > 0) {
                    i11 += iA0H;
                    i10++;
                }
            }
        }
        cv.A02 = 0;
        cv.A00 = 0;
        cv.A01 = 0;
        cv.A07.A03(i10, i11);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            XS xs2 = list.get(i14);
            int trunIndex = ((CJ) xs2).A00;
            if (trunIndex == CJ.A1O) {
                i13 = A00(cv, i12, j10, totalSampleCount, xs2.A00, i13);
                i12++;
            }
        }
    }

    private void A0O(XS xs, long j10) throws C04629v {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(xs);
            return;
        }
        if (((CJ) xs).A00 == CJ.A13) {
            Pair<Long, C1048Xo> pairA04 = A04(xs.A00, j10);
            this.A0B = ((Long) pairA04.first).longValue();
            this.A0C.AFi((C1) pairA04.second);
            this.A0F = true;
            return;
        }
        if (((CJ) xs).A00 != CJ.A0Q) {
            return;
        }
        A0Q(xs.A00);
    }

    private void A0Q(C0654Hz c0654Hz) {
        C4[] c4Arr = this.A0I;
        if (c4Arr == null || c4Arr.length == 0) {
            return;
        }
        c0654Hz.A0Y(12);
        int sampleSize = c0654Hz.A04();
        c0654Hz.A0Q();
        c0654Hz.A0Q();
        long jA0M = c0654Hz.A0M();
        long timescale = c0654Hz.A0M();
        long jA0F = IF.A0F(timescale, 1000000L, jA0M);
        for (C4 c42 : this.A0I) {
            c0654Hz.A0Y(12);
            c42.AFR(c0654Hz, sampleSize);
        }
        long j10 = this.A0B;
        if (j10 != -9223372036854775807L) {
            long jA06 = j10 + jA0F;
            IB ib2 = this.A0S;
            if (ib2 != null) {
                jA06 = ib2.A06(jA06);
            }
            for (C4 c43 : this.A0I) {
                c43.AFS(jA06, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new CU(jA0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(C0654Hz c0654Hz, int i10, C0522Cg c0522Cg) throws C04629v {
        c0654Hz.A0Y(i10 + 8);
        int fullAtom = c0654Hz.A08();
        int flags = CJ.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c0654Hz.A0H();
            int fullAtom4 = c0522Cg.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c0522Cg.A0H, 0, sampleCount, z10);
                int fullAtom5 = c0654Hz.A04();
                c0522Cg.A02(fullAtom5);
                c0522Cg.A05(c0654Hz);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(290, 17, 20)).append(sampleCount).append(A0A(0, 2, 62));
            int fullAtom6 = c0522Cg.A00;
            throw new C04629v(sbAppend.append(fullAtom6).toString());
        }
        throw new C04629v(A0A(381, 56, 66));
    }

    public static void A0S(C0654Hz c0654Hz, C0522Cg c0522Cg) throws C04629v {
        c0654Hz.A0Y(8);
        int flags = c0654Hz.A08();
        int fullAtom = CJ.A00(flags) & 1;
        if (fullAtom == 1) {
            c0654Hz.A0Z(8);
        }
        int iA0H = c0654Hz.A0H();
        if (iA0H == 1) {
            int entryCount = CJ.A01(flags);
            c0522Cg.A04 += entryCount == 0 ? c0654Hz.A0M() : c0654Hz.A0N();
            return;
        }
        throw new C04629v(A0A(552, 29, 63) + iA0H);
    }

    public static void A0T(C0654Hz c0654Hz, C0522Cg c0522Cg) throws C04629v {
        A0R(c0654Hz, 0, c0522Cg);
    }

    public static void A0U(C0654Hz c0654Hz, C0522Cg c0522Cg, byte[] bArr) throws C04629v {
        c0654Hz.A0Y(8);
        c0654Hz.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0654Hz, 16, c0522Cg);
    }

    public static boolean A0W(int i10) {
        return i10 == CJ.A0k || i10 == CJ.A1M || i10 == CJ.A0e || i10 == CJ.A0i || i10 == CJ.A17 || i10 == CJ.A0j || i10 == CJ.A1L || i10 == CJ.A0n || i10 == CJ.A0O;
    }

    public static boolean A0X(int i10) {
        if (i10 != CJ.A0W && i10 != CJ.A0d && i10 != CJ.A0o && i10 != CJ.A13 && i10 != CJ.A1B) {
            int i11 = CJ.A1I;
            if (A0Y[6].length() != 17) {
                A0Y[0] = "0bfDB";
                if (i10 != i11 && i10 != CJ.A1J && i10 != CJ.A1K && i10 != CJ.A1N && i10 != CJ.A1O && i10 != CJ.A0s && i10 != CJ.A0v) {
                    int i12 = CJ.A0u;
                    if (A0Y[1].length() != 5) {
                        A0Y[5] = "GM1eDi9JpLsxcWxFcWWsCjSZthCJdr4f";
                        if (i10 != i12 && i10 != CJ.A11 && i10 != CJ.A1R && i10 != CJ.A0y && i10 != CJ.A12 && i10 != CJ.A0P) {
                            int i13 = CJ.A0g;
                            if (A0Y[3].length() == 6) {
                                A0Y[7] = "Eu3";
                                if (i10 != i13 && i10 != CJ.A0Q) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        r0 = r11.A7i() - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r10.A01 != com.meta.analytics.dsp.uinode.CJ.A0j) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r9 = r10.A0K.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r8 >= r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r2 = r10.A0K.valueAt(r8).A07;
        r2.A03 = r0;
        r2.A04 = r0;
        r2.A05 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (com.meta.analytics.dsp.uinode.XN.A0Y[3].length() == 6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r7 = com.meta.analytics.dsp.uinode.XN.A0Y;
        r7[2] = "tKeeSnEBB5V";
        r7[4] = "1ppH9MP2kpM";
        r8 = r8 + 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        com.meta.analytics.dsp.uinode.XN.A0Y[0] = "GrBVN";
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        if (r10.A01 != com.meta.analytics.dsp.uinode.CJ.A0c) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        r10.A0D = null;
        r10.A09 = r10.A07 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        if (r10.A0F != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        r10.A0C.AFi(new com.meta.analytics.dsp.uinode.C1043Xj(r10.A08, r0));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0147, code lost:
    
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0151, code lost:
    
        if (A0W(r10.A01) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        r5 = (r11.A7i() + r10.A07) - 8;
        r10.A0T.push(new com.meta.analytics.dsp.uinode.XT(r10.A01, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0170, code lost:
    
        if (r10.A07 != r10.A00) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
    
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0176, code lost:
    
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C04629v(A0A(2, 48, 114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
    
        if (A0X(r10.A01) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0194, code lost:
    
        r3 = r10.A00;
        r2 = com.meta.analytics.dsp.uinode.XN.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a6, code lost:
    
        if (r2[2].length() == r2[4].length()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b2, code lost:
    
        if (r10.A07 > 2147483647L) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b4, code lost:
    
        r10.A0E = null;
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b9, code lost:
    
        com.meta.analytics.dsp.uinode.XN.A0Y[7] = "6Yw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c0, code lost:
    
        if (r3 != 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c2, code lost:
    
        r2 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c6, code lost:
    
        if (r2 > 2147483647L) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c8, code lost:
    
        r10.A0E = new com.meta.analytics.dsp.uinode.C0654Hz((int) r2);
        java.lang.System.arraycopy(r10.A0O.A00, 0, r10.A0E.A00, 0, 8);
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01dd, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C04629v(A0A(241, 49, 53));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fd, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C04629v(A0A(190, 51, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C04629v(A0A(479, 53, 2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Y(com.meta.analytics.dsp.uinode.InterfaceC0512Bt r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XN.A0Y(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107 A[PHI: r0 r1 r4 r5 r6
  0x0107: PHI (r0v80 com.facebook.ads.redexgen.X.IB) = (r0v9 com.facebook.ads.redexgen.X.IB), (r0v84 com.facebook.ads.redexgen.X.IB) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r1v6 long) = (r1v4 long), (r1v10 long) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r4v3 int) = (r4v1 int), (r4v4 int) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r5v2 com.facebook.ads.redexgen.X.C4) = (r5v0 com.facebook.ads.redexgen.X.C4), (r5v3 com.facebook.ads.redexgen.X.C4) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r6v2 com.facebook.ads.redexgen.X.Ce) = (r6v0 com.facebook.ads.redexgen.X.Ce), (r6v3 com.facebook.ads.redexgen.X.Ce) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.meta.analytics.dsp.uinode.InterfaceC0512Bt r19) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XN.A0Z(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void A8o(InterfaceC0513Bu interfaceC0513Bu) {
        this.A0C = interfaceC0513Bu;
        C0520Ce c0520Ce = this.A0N;
        if (c0520Ce != null) {
            CV cv = new CV(interfaceC0513Bu.AGi(0, c0520Ce.A03));
            cv.A07(this.A0N, new CP(0, 0, 0, 0));
            this.A0K.put(0, cv);
            A0C();
            this.A0C.A5Y();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final int AEH(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.A02;
            if (A0Y[6].length() != 17) {
                A0Y[6] = "Adcvl3OLLWBEEjCvRjB7l1tHvWvuGk";
                switch (i10) {
                    case 0:
                        if (!A0Y(interfaceC0512Bt)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0G(interfaceC0512Bt);
                        break;
                    case 2:
                        A0H(interfaceC0512Bt);
                        break;
                    default:
                        if (!A0Z(interfaceC0512Bt)) {
                            break;
                        } else {
                            return 0;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void AFh(long j10, long j11) {
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0K.valueAt(i10).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j11;
        this.A0T.clear();
        A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final boolean AGR(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        return AbstractC0519Cc.A03(interfaceC0512Bt);
    }
}
