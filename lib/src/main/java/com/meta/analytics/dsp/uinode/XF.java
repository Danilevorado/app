package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC0511Bs {
    public static byte[] A03;
    public static final InterfaceC0514Bv A04;
    public InterfaceC0513Bu A00;
    public AbstractC0530Co A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new XG();
    }

    public static C0654Hz A00(C0654Hz c0654Hz) {
        c0654Hz.A0Y(0);
        return c0654Hz;
    }

    private boolean A03(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        C0526Ck c0526Ck = new C0526Ck();
        if (!c0526Ck.A03(interfaceC0512Bt, true) || (c0526Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0526Ck.A00, 8);
        C0654Hz c0654Hz = new C0654Hz(length);
        interfaceC0512Bt.ADv(c0654Hz.A00, 0, length);
        if (XH.A04(A00(c0654Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c0654Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c0654Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void A8o(InterfaceC0513Bu interfaceC0513Bu) {
        this.A00 = interfaceC0513Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final int AEH(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        if (this.A01 == null) {
            if (A03(interfaceC0512Bt)) {
                interfaceC0512Bt.AFM();
            } else {
                throw new C04629v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 c4AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, c4AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0512Bt, c0516Bz);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void AFh(long j10, long j11) {
        AbstractC0530Co abstractC0530Co = this.A01;
        if (abstractC0530Co != null) {
            abstractC0530Co.A05(j10, j11);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final boolean AGR(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        try {
            return A03(interfaceC0512Bt);
        } catch (C04629v unused) {
            return false;
        }
    }
}
