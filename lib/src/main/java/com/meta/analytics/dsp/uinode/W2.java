package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0616Gm {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C0615Gl[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0615Gl[] A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, 24, 5, 13, 24, 30, 9, 24, 25, 93, 28, 17, 17, 18, 30, 28, 9, 20, 18, 19, 71, 93};
    }

    public W2(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public W2(boolean z10, int i10, int i11) {
        AbstractC0629Ha.A03(i10 > 0);
        AbstractC0629Ha.A03(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new C0615Gl[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new C0615Gl(this.A06, i12 * i10);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0615Gl[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AGj();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0616Gm
    public final synchronized C0615Gl A3X() {
        C0615Gl c0615Gl;
        this.A00++;
        int i10 = this.A01;
        if (i10 > 0) {
            C0615Gl[] c0615GlArr = this.A03;
            int i11 = i10 - 1;
            this.A01 = i11;
            c0615Gl = c0615GlArr[i11];
            c0615GlArr[i11] = null;
        } else {
            c0615Gl = new C0615Gl(new byte[this.A04], 0);
        }
        return c0615Gl;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0616Gm
    public final int A7D() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0616Gm
    public final synchronized void AEW(C0615Gl c0615Gl) {
        C0615Gl[] c0615GlArr = this.A07;
        c0615GlArr[0] = c0615Gl;
        AEX(c0615GlArr);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0616Gm
    public final synchronized void AEX(C0615Gl[] c0615GlArr) {
        int i10 = this.A01;
        int length = c0615GlArr.length + i10;
        C0615Gl[] c0615GlArr2 = this.A03;
        if (length >= c0615GlArr2.length) {
            this.A03 = (C0615Gl[]) Arrays.copyOf(c0615GlArr2, Math.max(c0615GlArr2.length * 2, i10 + c0615GlArr.length));
        }
        for (C0615Gl c0615Gl : c0615GlArr) {
            if (c0615Gl.A01 == this.A06 || c0615Gl.A01.length == this.A04) {
                C0615Gl[] c0615GlArr3 = this.A03;
                int i11 = this.A01;
                this.A01 = i11 + 1;
                c0615GlArr3[i11] = c0615Gl;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(c0615Gl.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + c0615Gl.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= c0615GlArr.length;
        notifyAll();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0616Gm
    public final synchronized void AGj() {
        int iA04 = IF.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, iA04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i10 = targetAvailableCount - 1;
            while (lowIndex <= i10) {
                C0615Gl highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0615Gl lowAllocation = this.A03[i10];
                    if (lowAllocation.A01 != this.A06) {
                        i10--;
                    } else {
                        C0615Gl[] c0615GlArr = this.A03;
                        c0615GlArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i10 - 1;
                        c0615GlArr[i10] = highAllocation;
                        i10 = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
