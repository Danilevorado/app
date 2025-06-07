package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1020Wm implements InterfaceC0511Bs {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final InterfaceC0514Bv A07;
    public int A00;
    public int A01;
    public InterfaceC0513Bu A02;
    public C4 A03;
    public C1019Wl A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 79, 82, 0, 85, 78, 82, 69, 67, 79, 71, 78, 73, 90, 69, 68, 0, 87, 65, 86, 0, 72, 69, 65, 68, 69, 82, 14, 52, 72, 55, 60, 66, 2, 69, 52, 74};
    }

    static {
        A01();
        A07 = new C1021Wn();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void A8o(InterfaceC0513Bu interfaceC0513Bu) {
        this.A02 = interfaceC0513Bu;
        this.A03 = interfaceC0513Bu.AGi(0, 1);
        this.A04 = null;
        interfaceC0513Bu.A5Y();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final int AEH(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        if (this.A04 == null) {
            C1019Wl c1019WlA00 = DF.A00(interfaceC0512Bt);
            this.A04 = c1019WlA00;
            if (c1019WlA00 != null) {
                this.A03.A5n(Format.A06(null, A00(39, 9, 113), null, c1019WlA00.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C04629v(A00(0, 39, 126));
            }
        }
        C1019Wl c1019Wl = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!c1019Wl.A07()) {
            DF.A03(interfaceC0512Bt, this.A04);
            this.A02.AFi(this.A04);
        }
        int iAFQ = this.A03.AFQ(interfaceC0512Bt, 32768 - this.A01, true);
        if (iAFQ != -1) {
            this.A01 += iAFQ;
        }
        int i10 = this.A01 / this.A00;
        if (i10 > 0) {
            long jA05 = this.A04.A05(interfaceC0512Bt.A7i() - this.A01);
            int i11 = this.A00 * i10;
            int i12 = this.A01 - i11;
            this.A01 = i12;
            this.A03.AFS(jA05, 1, i11, i12, null);
        }
        return iAFQ == -1 ? -1 : 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void AFh(long j10, long j11) {
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final boolean AGR(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        return DF.A00(interfaceC0512Bt) != null;
    }
}
