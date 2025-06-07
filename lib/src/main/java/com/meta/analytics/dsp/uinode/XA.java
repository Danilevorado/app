package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XA implements InterfaceC0511Bs {
    public static byte[] A04;
    public static String[] A05 = {"89ZAS4gKAvfsCOhGFLRndaPlzH5Jylu0", "WDj0w8iYShPhw5JkNLQVjMzFidij1YMB", "SZD8V9ebG6DMCxkEToUDQHseHkwYH45y", "flB69VC8Ebs69L5nDVZVAs6kLxLMfW9p", "Dc9Giep11FBAOEJK", "fiVRhSZcsaoyqUlEeIiHO4czNXpaN55t", "HHz5E2PDkz6p7na9zQig", "GASwop9kiLfFsL9tAHZWlbr16muWtU3x"};
    public static final InterfaceC0514Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X9 A02;
    public final C0654Hz A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-8, -13, -30};
        if (A05[3].charAt(6) != 'C') {
            throw new RuntimeException();
        }
        A05[6] = "Dcf";
    }

    static {
        A01();
        A06 = new XB();
        A07 = IF.A08(A00(0, 3, 105));
    }

    public XA() {
        this(0L);
    }

    public XA(long j10) {
        this.A01 = j10;
        this.A02 = new X9();
        this.A03 = new C0654Hz(2786);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void A8o(InterfaceC0513Bu interfaceC0513Bu) {
        this.A02.A4p(interfaceC0513Bu, new DC(0, 1));
        interfaceC0513Bu.A5Y();
        interfaceC0513Bu.AFi(new C1043Xj(-9223372036854775807L));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final int AEH(InterfaceC0512Bt interfaceC0512Bt, C0516Bz c0516Bz) throws InterruptedException, IOException {
        int i10 = interfaceC0512Bt.read(this.A03.A00, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i10);
        if (!this.A00) {
            this.A02.ADt(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4R(this.A03);
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final void AFh(long j10, long j11) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0511Bs
    public final boolean AGR(InterfaceC0512Bt interfaceC0512Bt) throws InterruptedException, IOException {
        C0654Hz c0654Hz = new C0654Hz(10);
        int startPosition = 0;
        while (true) {
            interfaceC0512Bt.ADv(c0654Hz.A00, 0, 10);
            c0654Hz.A0Y(0);
            if (c0654Hz.A0G() != A07) {
                break;
            }
            c0654Hz.A0Z(3);
            int iA0D = c0654Hz.A0D();
            startPosition += iA0D + 10;
            interfaceC0512Bt.A3W(iA0D);
        }
        interfaceC0512Bt.AFM();
        interfaceC0512Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int i10 = 0;
        while (true) {
            interfaceC0512Bt.ADv(c0654Hz.A00, 0, 5);
            c0654Hz.A0Y(0);
            int headerPosition = c0654Hz.A0I();
            if (headerPosition != 2935) {
                i10 = 0;
                interfaceC0512Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0512Bt.A3W(syncBytes);
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int headerPosition3 = AQ.A05(c0654Hz.A00);
                if (headerPosition3 == -1) {
                    return false;
                }
                interfaceC0512Bt.A3W(headerPosition3 - 5);
            }
        }
    }
}
