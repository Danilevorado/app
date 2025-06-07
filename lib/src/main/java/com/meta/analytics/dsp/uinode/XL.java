package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XL implements InterfaceC0511Bs, C1 {
    public static byte[] A0J;
    public static String[] A0K = {"NMENm2VVY4CjFU7qkzTmTxviYk7AnS7Z", "JBVFfjWytxpjUnZZ6lInsU7tzfFzOPaX", "YaevPinMBRqhVFzNm59vwI8bFO4cI8AD", "52TqclTutshaaFkrwJ4nyJTeA2xWvRpu", "JGseDZtum4mqdbq3nSxMUnsGXrSMUYmk", "xuKwDkc3QqvJvTm3i1k9vAbPWWVSjov2", "2GdyUNwnHd6eSNq3THJOdF5Wjs3u7UdX", "VVA8bJ0ju0kVaqoWpNH4VPWsYewebzZE"};
    public static final InterfaceC0514Bv A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0513Bu A09;
    public C0654Hz A0A;
    public boolean A0B;
    public CY[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0654Hz A0F;
    public final C0654Hz A0G;
    public final C0654Hz A0H;
    public final ArrayDeque<XT> A0I;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{107, 94, 69, 71, 10, 89, 67, 80, 79, 10, 70, 79, 89, 89, 10, 94, 66, 75, 68, 10, 66, 79, 75, 78, 79, 88, 10, 70, 79, 68, 77, 94, 66, 10, 2, 95, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 3, 4, 104, 109, 57, 57};
    }

    static {
        A07();
        A0L = new XM();
        A0M = IF.A08(A04(48, 4, 57));
    }

    public XL() {
        this(0);
    }

    public XL(int i10) {
        this.A0E = i10;
        this.A0F = new C0654Hz(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0654Hz(AbstractC0650Hv.A03);
        this.A0G = new C0654Hz(4);
        this.A06 = -1;
    }

    private int A00(long j10) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i10 = 1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i12 = 0;
        while (true) {
            CY[] cyArr = this.A0C;
            if (i12 >= cyArr.length) {
                if (j12 == Long.MAX_VALUE || trackIndex == 0) {
                    return i11;
                }
                long preferredSkipAmount = 10485760 + j12;
                if (j11 < preferredSkipAmount) {
                    return i11;
                }
                return minAccumulatedBytesTrackIndex;
            }
            CY cy = cyArr[i12];
            int i13 = cy.A00;
            if (i13 != cy.A03.A01) {
                long j13 = cy.A03.A06[i13];
                String[] strArr = A0K;
                if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                A0K[7] = "SNUxNBsUQVazn7VwiZNUPsjETt3vlrb9";
                long j14 = this.A0D[i12][i13];
                long j15 = j13 - j10;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j15 < sampleAccumulatedBytes)) {
                    i10 = i14;
                    sampleAccumulatedBytes = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j12) {
                    j12 = j14;
                    trackIndex = i14;
                    minAccumulatedBytesTrackIndex = i12;
                }
            }
            i12++;
        }
    }

    private int A01(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        int i10;
        long jA7i = interfaceC0512Bt.A7i();
        if (this.A06 == -1) {
            int iA00 = A00(jA7i);
            this.A06 = iA00;
            if (iA00 == -1) {
                return -1;
            }
        }
        CY cy = this.A0C[this.A06];
        C4 trackOutput = cy.A01;
        int i11 = cy.A00;
        long j10 = cy.A03.A06[i11];
        int i12 = cy.A03.A05[i11];
        long j11 = (j10 - jA7i) + this.A04;
        if (j11 < 0 || j11 >= 262144) {
            c0516Bz.A00 = j10;
            return 1;
        }
        if (cy.A02.A02 == 1) {
            j11 += 8;
            i12 -= 8;
        }
        interfaceC0512Bt.AGP((int) j11);
        int sampleSize = cy.A02.A01;
        String[] strArr = A0K;
        if (strArr[5].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "Kr0RNkXRcq3MKFcdyeDViEL730qvS1Or";
        strArr2[4] = "dsHpYadjIesMKkl8nKWo5Xy2zI1EHMvq";
        if (sampleSize != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int nalUnitLengthFieldLength = cy.A02.A01;
            int i13 = 4 - cy.A02.A01;
            while (this.A04 < i12) {
                int i14 = this.A05;
                if (i14 == 0) {
                    interfaceC0512Bt.readFully(this.A0G.A00, i13, nalUnitLengthFieldLength);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AFR(this.A0H, 4);
                    this.A04 += 4;
                    i12 += i13;
                } else {
                    int iAFQ = trackOutput.AFQ(interfaceC0512Bt, i14, false);
                    this.A04 += iAFQ;
                    this.A05 -= iAFQ;
                }
            }
            i10 = 0;
        } else {
            while (true) {
                int i15 = this.A04;
                if (i15 >= i12) {
                    break;
                }
                int iAFQ2 = trackOutput.AFQ(interfaceC0512Bt, i12 - i15, false);
                this.A04 += iAFQ2;
                this.A05 -= iAFQ2;
            }
            i10 = 0;
        }
        long[] jArr = cy.A03.A07;
        String[] strArr3 = A0K;
        if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
            A0K[6] = "rOKgrdqhHdXOkXubOIefZGVtdh7cvyNY";
            trackOutput.AFS(jArr[i11], cy.A03.A04[i11], i12, 0, null);
            cy.A00 += 0;
            this.A06 = -1;
            this.A04 = i10;
            this.A05 = i10;
            return i10;
        }
        A0K[6] = "wHchi0wLq1ErSeSpKTFcZRDvkUCQV0RS";
        trackOutput.AFS(jArr[i11], cy.A03.A04[i11], i12, 0, null);
        cy.A00++;
        this.A06 = -1;
        this.A04 = i10;
        this.A05 = i10;
        return i10;
    }

    public static int A02(C0523Ch c0523Ch, long j10) {
        int iA00 = c0523Ch.A00(j10);
        if (iA00 == -1) {
            return c0523Ch.A01(j10);
        }
        return iA00;
    }

    public static long A03(C0523Ch c0523Ch, long j10, long j11) {
        int iA02 = A02(c0523Ch, j10);
        if (iA02 == -1) {
            return j11;
        }
        long jMin = Math.min(c0523Ch.A06[iA02], j11);
        if (A0K[6].charAt(20) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[5] = "p3vbyKglgBhvg6ga7RihuDYjPakbSwaT";
        strArr[3] = "aiiDKqFmbgCXZZv8uVJN0mXFbRvDRlE6";
        return jMin;
    }

    private ArrayList<C0523Ch> A05(XT xt, C0515Bw c0515Bw, boolean z10) throws C04629v {
        C0520Ce c0520CeA0C;
        ArrayList<C0523Ch> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < xt.A01.size(); i10++) {
            XT xt2 = xt.A01.get(i10);
            int i11 = ((CJ) xt2).A00;
            if (i11 == CJ.A1M && (c0520CeA0C = CO.A0C(xt2, xt.A07(CJ.A0o), -9223372036854775807L, null, z10, this.A0B)) != null) {
                C0523Ch c0523ChA0E = CO.A0E(c0520CeA0C, xt2.A06(CJ.A0e).A06(CJ.A0i).A06(CJ.A17), c0515Bw);
                if (c0523ChA0E.A01 != 0) {
                    arrayList.add(c0523ChA0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j10) throws C04629v {
        while (true) {
            boolean zIsEmpty = this.A0I.isEmpty();
            if (A0K[7].charAt(14) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "xKK31fned0mjTVppOAxzoNj9viNrlryO";
            strArr[1] = "3HkC7zoZl6jjTlZPcBHC3lXiUTtQlSXh";
            if (zIsEmpty || this.A0I.peek().A00 != j10) {
                break;
            }
            XT xtPop = this.A0I.pop();
            if (((CJ) xtPop).A00 == CJ.A0k) {
                A0A(xtPop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                XT containerAtom = this.A0I.peek();
                containerAtom.A08(xtPop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j10) {
        for (CY cy : this.A0C) {
            C0523Ch c0523Ch = cy.A03;
            int iA00 = c0523Ch.A00(j10);
            if (iA00 == -1) {
                iA00 = c0523Ch.A01(j10);
            }
            cy.A00 = iA00;
            if (A0K[6].charAt(20) == 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[5] = "MNnvCsSYuz9FkO9KQczdYnABN7zTLwyu";
            strArr[3] = "oflUn1lXrJVPIzwz3GYNJmaWxDOTuoWv";
        }
    }

    private void A0A(XT xt) throws C04629v {
        ArrayList<C0523Ch> arrayListA05;
        int trackCount = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadataA0F = null;
        C0515Bw c0515Bw = new C0515Bw();
        XS xsA07 = xt.A07(CJ.A1Q);
        if (xsA07 != null && (metadataA0F = CO.A0F(xsA07, this.A0B)) != null) {
            c0515Bw.A05(metadataA0F);
        }
        try {
            arrayListA05 = A05(xt, c0515Bw, (this.A0E & 1) != 0);
        } catch (XP unused) {
            c0515Bw = new C0515Bw();
            arrayListA05 = A05(xt, c0515Bw, true);
        }
        int size = arrayListA05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0523Ch c0523Ch = arrayListA05.get(i10);
            C0520Ce c0520Ce = c0523Ch.A03;
            CY cy = new CY(c0520Ce, c0523Ch, this.A09.AGi(i10, c0520Ce.A03));
            Format formatA0F = c0520Ce.A07.A0F(c0523Ch.A00 + 30);
            if (c0520Ce.A03 == 1) {
                if (c0515Bw.A03()) {
                    formatA0F = formatA0F.A0G(c0515Bw.A00, c0515Bw.A01);
                }
                if (metadataA0F != null) {
                    formatA0F = formatA0F.A0J(metadataA0F);
                }
            }
            cy.A01.A5n(formatA0F);
            jMax = Math.max(jMax, c0520Ce.A04 != -9223372036854775807L ? c0520Ce.A04 : c0523Ch.A02);
            if (c0520Ce.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(cy);
        }
        this.A02 = trackCount;
        this.A08 = jMax;
        CY[] cyArr = (CY[]) arrayList.toArray(new CY[arrayList.size()]);
        this.A0C = cyArr;
        this.A0D = A0G(cyArr);
        this.A09.A5Y();
        this.A09.AFi(this);
    }

    public static boolean A0B(int i10) {
        return i10 == CJ.A0k || i10 == CJ.A1M || i10 == CJ.A0e || i10 == CJ.A0i || i10 == CJ.A17 || i10 == CJ.A0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(int r4) {
        /*
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0d
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0o
            if (r4 == r0) goto L7a
            int r3 = com.meta.analytics.dsp.uinode.CJ.A0W
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            java.lang.String r1 = "Lbfp0NvNFR61AEm901fhAiQEZdUAojSN"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1B
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1E
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1C
            if (r4 == r0) goto L7a
            int r3 = com.meta.analytics.dsp.uinode.CJ.A0D
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7e
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            java.lang.String r1 = "AcWpjtb96ZMDu8ZbPmw7y3S9ldwHNTMG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "liNDCAzQcSMqwn5YpITrjlM20opaDBZf"
            r0 = 4
            r2[r0] = r1
            if (r4 == r3) goto L7a
        L56:
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0P
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1A
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1D
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1F
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A18
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0C
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1K
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A0V
            if (r4 == r0) goto L7a
            int r0 = com.meta.analytics.dsp.uinode.CJ.A1Q
            if (r4 != r0) goto L7c
        L7a:
            r0 = 1
        L7b:
            return r0
        L7c:
            r0 = 0
            goto L7b
        L7e:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XL.A0K
            java.lang.String r1 = "Et4fiiNPrE1ktHaAFcacRxoSMiMckR7G"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L7a
            goto L56
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XL.A0C(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D(com.meta.analytics.dsp.uinode.InterfaceC0512Bt r12) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XL.A0D(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    private boolean A0E(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        long j10 = this.A07 - this.A00;
        long atomEndPosition = interfaceC0512Bt.A7i() + j10;
        boolean z10 = false;
        C0654Hz c0654Hz = this.A0A;
        if (c0654Hz != null) {
            interfaceC0512Bt.readFully(c0654Hz.A00, this.A00, (int) j10);
            if (this.A01 == CJ.A0V) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new XS(this.A01, this.A0A));
            }
        } else if (j10 < 262144) {
            interfaceC0512Bt.AGP((int) j10);
        } else {
            long atomPayloadSize = interfaceC0512Bt.A7i();
            c0516Bz.A00 = atomPayloadSize + j10;
            z10 = true;
        }
        A08(atomEndPosition);
        return z10 && this.A03 != 2;
    }

    public static boolean A0F(C0654Hz c0654Hz) {
        int iA08;
        int majorBrand;
        c0654Hz.A0Y(8);
        int iA082 = c0654Hz.A08();
        int majorBrand2 = A0M;
        if (iA082 == majorBrand2) {
            return true;
        }
        c0654Hz.A0Z(4);
        do {
            int iA04 = c0654Hz.A04();
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[1];
            int iCharAt = str.charAt(11);
            int majorBrand3 = str2.charAt(11);
            if (iCharAt != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "HZNBHqeXKlwJLRyY4R1ZazClo3jLxgS8";
            strArr2[3] = "ULnGw1bPzwMM6OF7GcjqoSbIBNnkFp5Y";
            if (iA04 > 0) {
                iA08 = c0654Hz.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (iA08 != majorBrand);
        return true;
    }

    public static long[][] A0G(CY[] cyArr) {
        long[][] jArr = new long[cyArr.length][];
        int[] iArr = new int[cyArr.length];
        long[] jArr2 = new long[cyArr.length];
        boolean[] zArr = new boolean[cyArr.length];
        for (int i10 = 0; i10 < cyArr.length; i10++) {
            jArr[i10] = new long[cyArr[i10].A03.A01];
            jArr2[i10] = cyArr[i10].A03.A07[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (true) {
            int length = cyArr.length;
            String[] strArr = A0K;
            if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "yJ2jD62HfH2jQTY3DSfm8DixkPqWTM6R";
            strArr2[3] = "ERCQlGdy7dAXpXma9fK0CLCiAFSx2az3";
            if (i11 < length) {
                long j11 = Long.MAX_VALUE;
                int minTimeTrackIndex = -1;
                for (int i12 = 0; i12 < cyArr.length; i12++) {
                    if (!zArr[i12] && jArr2[i12] <= j11) {
                        minTimeTrackIndex = i12;
                        j11 = jArr2[i12];
                    }
                }
                int i13 = iArr[minTimeTrackIndex];
                jArr[minTimeTrackIndex][i13] = j10;
                j10 += cyArr[minTimeTrackIndex].A03.A05[i13];
                int i14 = i13 + 1;
                iArr[minTimeTrackIndex] = i14;
                if (i14 < jArr[minTimeTrackIndex].length) {
                    jArr2[minTimeTrackIndex] = cyArr[minTimeTrackIndex].A03.A07[i14];
                } else {
                    zArr[minTimeTrackIndex] = true;
                    i11++;
                }
            } else {
                return jArr;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A08;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j10) {
        long j11;
        long jA03;
        int iA01;
        CY[] cyArr = this.A0C;
        if (cyArr.length == 0) {
            return new C0(C2.A03);
        }
        long j12 = -9223372036854775807L;
        long jA032 = -1;
        int i10 = this.A02;
        if (i10 != -1) {
            C0523Ch c0523Ch = cyArr[i10].A03;
            int iA02 = A02(c0523Ch, j10);
            if (iA02 == -1) {
                return new C0(C2.A03);
            }
            j11 = c0523Ch.A07[iA02];
            jA03 = c0523Ch.A06[iA02];
            if (j11 < j10 && iA02 < c0523Ch.A01 - 1 && (iA01 = c0523Ch.A01(j10)) != -1 && iA01 != iA02) {
                j12 = c0523Ch.A07[iA01];
                jA032 = c0523Ch.A06[iA01];
            }
        } else {
            j11 = j10;
            jA03 = Long.MAX_VALUE;
        }
        int secondSampleIndex = 0;
        while (true) {
            CY[] cyArr2 = this.A0C;
            if (secondSampleIndex >= cyArr2.length) {
                break;
            }
            if (secondSampleIndex != this.A02) {
                C0523Ch c0523Ch2 = cyArr2[secondSampleIndex].A03;
                jA03 = A03(c0523Ch2, j11, jA03);
                if (j12 != -9223372036854775807L) {
                    jA032 = A03(c0523Ch2, j12, jA032);
                }
            }
            secondSampleIndex++;
        }
        C2 c22 = new C2(j11, jA03);
        if (j12 == -9223372036854775807L) {
            return new C0(c22);
        }
        return new C0(c22, new C2(j12, jA032));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void A8o(InterfaceC0513Bu interfaceC0513Bu) {
        this.A09 = interfaceC0513Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final int AEH(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(interfaceC0512Bt)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0E(interfaceC0512Bt, c0516Bz)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return A01(interfaceC0512Bt, c0516Bz);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void AFh(long j10, long j11) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j10 == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j11);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final boolean AGR(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        return AbstractC0519Cc.A04(interfaceC0512Bt);
    }
}
