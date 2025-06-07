package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1035Xb extends C6 {
    public static byte[] A05;
    public static String[] A06 = {"S6oix22WW3XrOL6PgcbxfAkEtHdPkPhf", "4OWz7hl1Zq8qyI8tM", "clV1g7mDIxTidmwZ1CuuG8s1lTi1VXAM", "4pPGx9", "ltKNubnfMHDxlo41G", "61sVTIAUswj0oFXzD6", "V6Pb0wOPN8cWCdQmqK9dHxyDUr6EkDd0", "qXRSabgl4tCI0bSRqPqCbhaUnodlSpfB"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C0654Hz A03;
    public final C0654Hz A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{71, 120, 117, 116, 126, 49, 119, 126, 99, 124, 112, 101, 49, Byte.MAX_VALUE, 126, 101, 49, 98, 100, 97, 97, 126, 99, 101, 116, 117, 43, 49, 39, 56, 53, 52, 62, 126, 48, 39, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.C6
    public final void A0B(C0654Hz c0654Hz, long j10) throws C04629v {
        int iA0E = c0654Hz.A0E();
        long jA09 = j10 + (c0654Hz.A09() * 1000);
        if (iA0E == 0 && !this.A02) {
            C0654Hz c0654Hz2 = new C0654Hz(new byte[c0654Hz.A04()]);
            c0654Hz.A0c(c0654Hz2.A00, 0, c0654Hz.A04());
            IH ihA00 = IH.A00(c0654Hz2);
            this.A01 = ihA00.A02;
            super.A00.A5n(Format.A03(null, A00(28, 9, 110), null, -1, -1, ihA00.A03, ihA00.A01, -1.0f, ihA00.A04, -1, ihA00.A00, null));
            this.A02 = true;
            return;
        }
        if (iA0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = 4 - this.A01;
            int i11 = 0;
            while (c0654Hz.A04() > 0) {
                c0654Hz.A0c(this.A03.A00, i10, this.A01);
                this.A03.A0Y(0);
                int iA0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AFR(this.A04, 4);
                super.A00.AFR(c0654Hz, iA0H);
                i11 = i11 + 4 + iA0H;
            }
            super.A00.AFS(jA09, this.A00 != 1 ? 0 : 1, i11, 0, null);
        }
    }

    static {
        A01();
    }

    public C1035Xb(C4 c42) {
        super(c42);
        this.A04 = new C0654Hz(AbstractC0650Hv.A03);
        this.A03 = new C0654Hz(4);
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final boolean A0C(C0654Hz c0654Hz) throws C1036Xc {
        int frameType = c0654Hz.A0E();
        int header = frameType >> 4;
        int i10 = header & 15;
        int i11 = frameType & 15;
        if (i11 == 7) {
            this.A00 = i10;
            if (A06[2].charAt(25) == 118) {
                throw new RuntimeException();
            }
            A06[5] = "9goNtADcrLhK1amHV7";
            return i10 != 5;
        }
        throw new C1036Xc(A00(0, 28, 46) + i11);
    }
}
