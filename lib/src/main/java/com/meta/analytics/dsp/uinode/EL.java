package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC0621Gr A00;
    public final InterfaceC0623Gt A01;
    public final InterfaceC0623Gt A02;
    public final HK A03;
    public final I3 A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, Byte.MIN_VALUE, 124, -113, Byte.MIN_VALUE, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public EL(HK hk, InterfaceC0623Gt interfaceC0623Gt) {
        this(hk, interfaceC0623Gt, null, null, null);
    }

    public EL(HK hk, InterfaceC0623Gt interfaceC0623Gt, InterfaceC0623Gt interfaceC0623Gt2, InterfaceC0621Gr interfaceC0621Gr, I3 i32) {
        AbstractC0629Ha.A01(interfaceC0623Gt);
        this.A03 = hk;
        this.A02 = interfaceC0623Gt;
        this.A01 = interfaceC0623Gt2;
        this.A00 = interfaceC0621Gr;
        this.A04 = i32;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C0995Vk A03(boolean z10) {
        InterfaceC0624Gu c1007Vw;
        InterfaceC0623Gt interfaceC0623Gt = this.A01;
        if (interfaceC0623Gt != null) {
            c1007Vw = interfaceC0623Gt.A4X();
        } else {
            c1007Vw = new C1007Vw();
        }
        if (z10) {
            return new C0995Vk(this.A03, C1008Vx.A02, c1007Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C0996Vl c0996Vl = new C0996Vl(this.A03, 2097152L);
        InterfaceC0624Gu interfaceC0624GuA4X = this.A02.A4X();
        I3 i32 = this.A04;
        if (i32 != null) {
            interfaceC0624GuA4X = new C1000Vp(interfaceC0624GuA4X, i32, -1000);
        }
        InterfaceC0624Gu upstream = c1007Vw;
        return new C0995Vk(this.A03, interfaceC0624GuA4X, upstream, c0996Vl, 1, null);
    }

    public final I3 A04() {
        I3 i32 = this.A04;
        return i32 != null ? i32 : new I3();
    }
}
