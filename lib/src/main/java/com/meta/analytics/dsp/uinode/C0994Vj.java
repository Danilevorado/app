package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0994Vj implements InterfaceC0623Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC0621Gr A01;
    public final InterfaceC0623Gt A02;
    public final InterfaceC0623Gt A03;
    public final HK A04;
    public final HM A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C0994Vj(HK hk, InterfaceC0623Gt interfaceC0623Gt, InterfaceC0623Gt interfaceC0623Gt2, InterfaceC0621Gr interfaceC0621Gr, int i10, HM hm) {
        this.A04 = hk;
        this.A03 = interfaceC0623Gt;
        this.A02 = interfaceC0623Gt2;
        this.A01 = interfaceC0621Gr;
        this.A00 = i10;
        this.A05 = hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0623Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0995Vk A4X() {
        HK hk = this.A04;
        InterfaceC0624Gu interfaceC0624GuA4X = this.A03.A4X();
        InterfaceC0624Gu interfaceC0624GuA4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C0995Vk(hk, interfaceC0624GuA4X, interfaceC0624GuA4X2, null, this.A00, null);
    }
}
