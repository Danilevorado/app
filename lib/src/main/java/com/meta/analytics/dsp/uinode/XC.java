package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XC extends AbstractC0530Co {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public C0532Cq A01;
    public C0534Cs A02;
    public C0535Cu A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final C0532Cq A02(C0654Hz c0654Hz) throws IOException {
        if (this.A03 == null) {
            this.A03 = AbstractC0536Cv.A04(c0654Hz);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = AbstractC0536Cv.A03(c0654Hz);
            return null;
        }
        byte[] bArr = new byte[c0654Hz.A07()];
        System.arraycopy(c0654Hz.A00, 0, bArr, 0, c0654Hz.A07());
        return new C0532Cq(this.A03, this.A02, bArr, AbstractC0536Cv.A0C(c0654Hz, this.A03.A05), AbstractC0536Cv.A00(r4.length - 1));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, C0532Cq c0532Cq) {
        if (!c0532Cq.A04[A00(b10, c0532Cq.A00, 1)].A03) {
            int modeNumber = c0532Cq.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0532Cq.A02.A04;
        return modeNumber2;
    }

    public static void A05(C0654Hz c0654Hz, long j10) {
        c0654Hz.A0X(c0654Hz.A07() + 4);
        c0654Hz.A00[c0654Hz.A07() - 4] = (byte) (j10 & 255);
        c0654Hz.A00[c0654Hz.A07() - 3] = (byte) ((j10 >>> 8) & 255);
        c0654Hz.A00[c0654Hz.A07() - 2] = (byte) ((j10 >>> 16) & 255);
        c0654Hz.A00[c0654Hz.A07() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C0654Hz c0654Hz) {
        try {
            return AbstractC0536Cv.A0A(1, c0654Hz, true);
        } catch (C04629v unused) {
            return false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final long A07(C0654Hz c0654Hz) {
        int i10 = 0;
        if ((c0654Hz.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0654Hz.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + iA01) / 4;
        }
        A05(c0654Hz, i10);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = iA01;
        return i10;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final void A08(long j10) {
        super.A08(j10);
        this.A04 = j10 != 0;
        C0535Cu c0535Cu = this.A03;
        this.A00 = c0535Cu != null ? c0535Cu.A03 : 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final boolean A0A(C0654Hz c0654Hz, long j10, C0529Cn c0529Cn) throws InterruptedException, IOException {
        if (this.A01 == null) {
            C0532Cq c0532CqA02 = A02(c0654Hz);
            this.A01 = c0532CqA02;
            if (c0532CqA02 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c0529Cn.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
