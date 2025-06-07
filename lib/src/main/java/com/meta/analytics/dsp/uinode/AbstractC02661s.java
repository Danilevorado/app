package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02661s {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            bArrCopyOfRange[i13] = b10;
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1073Yn c1073Yn, AbstractC1176b5 abstractC1176b5, boolean z10, InterfaceC02641q interfaceC02641q) {
        if (!C0662Ih.A1k(c1073Yn)) {
            C03786c c03786c = new C03786c(c1073Yn);
            C02501c c02501cA06 = abstractC1176b5.A0x().A0D().A06();
            c03786c.A0d(new JA(abstractC1176b5.A12(), c1073Yn.A09()));
            if (c02501cA06 == null) {
                interfaceC02641q.ACZ(AdError.CACHE_ERROR);
                return;
            }
            if (c02501cA06.A0J()) {
                interfaceC02641q.ACa();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6Y c6y = new C6Y(c02501cA06.A0E(), abstractC1176b5.A0S(), abstractC1176b5.A0P());
            c6y.A04 = true;
            if (C0662Ih.A1Z(c1073Yn)) {
                c6y.A03 = A00(0, 5, 22);
            }
            switch (C02631p.A00[c02501cA06.A09().ordinal()]) {
                case 1:
                case 2:
                    c03786c.A0X(c6y);
                    break;
            }
            c03786c.A0b(new C03766a(abstractC1176b5.A10().A01(), -1, -1, abstractC1176b5.A0S(), abstractC1176b5.A0P()));
            c03786c.A0b(new C03766a(c02501cA06.A0D(), -1, -1, abstractC1176b5.A0S(), abstractC1176b5.A0P()));
            c03786c.A0W(new C1163as(c1073Yn, interfaceC02641q, c03786c, c02501cA06, z10), new C6V(abstractC1176b5.A0S(), abstractC1176b5.A0P()));
            return;
        }
        interfaceC02641q.ACa();
    }
}
