package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y8 implements InterfaceC0645Hq {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public Y5 A00;
    public InterfaceC0645Hq A01;
    public final C9Z A02;
    public final C0989Ve A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, Byte.MAX_VALUE, -47, -60, -51, -61, -60, -47, -60, -47, Byte.MAX_VALUE, -52, -60, -61, -56, -64, Byte.MAX_VALUE, -62, -53, -50, -62, -54, -46, Byte.MAX_VALUE, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public Y8(C9Z c9z, InterfaceC0632Hd interfaceC0632Hd) {
        this.A02 = c9z;
        this.A03 = new C0989Ve(interfaceC0632Hd);
    }

    private void A01() {
        this.A03.A02(this.A01.A7k());
        C04649x c04649xA7h = this.A01.A7h();
        if (!c04649xA7h.equals(this.A03.A7h())) {
            this.A03.AGA(c04649xA7h);
            this.A02.ACb(c04649xA7h);
        }
    }

    private boolean A03() {
        Y5 y52 = this.A00;
        if (y52 != null && !y52.A91()) {
            boolean zA9C = this.A00.A9C();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (zA9C || !this.A00.A8a()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long jA7k = this.A01.A7k();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return jA7k;
        }
        return this.A03.A7k();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j10) {
        this.A03.A02(j10);
    }

    public final void A08(Y5 y52) {
        if (y52 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(Y5 y52) throws C04449c {
        InterfaceC0645Hq interfaceC0645HqA7N = y52.A7N();
        if (interfaceC0645HqA7N != null) {
            InterfaceC0645Hq interfaceC0645Hq = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (interfaceC0645HqA7N != interfaceC0645Hq) {
                if (interfaceC0645Hq == null) {
                    this.A01 = interfaceC0645HqA7N;
                    this.A00 = y52;
                    InterfaceC0645Hq rendererMediaClock = this.A03;
                    interfaceC0645HqA7N.AGA(rendererMediaClock.A7h());
                    A01();
                    return;
                }
                throw C04449c.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0645Hq
    public final C04649x A7h() {
        InterfaceC0645Hq interfaceC0645Hq = this.A01;
        if (interfaceC0645Hq != null) {
            return interfaceC0645Hq.A7h();
        }
        return this.A03.A7h();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0645Hq
    public final long A7k() {
        if (A03()) {
            return this.A01.A7k();
        }
        return this.A03.A7k();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0645Hq
    public final C04649x AGA(C04649x c04649x) {
        InterfaceC0645Hq interfaceC0645Hq = this.A01;
        if (interfaceC0645Hq != null) {
            c04649x = interfaceC0645Hq.AGA(c04649x);
        }
        this.A03.AGA(c04649x);
        this.A02.ACb(c04649x);
        return c04649x;
    }
}
