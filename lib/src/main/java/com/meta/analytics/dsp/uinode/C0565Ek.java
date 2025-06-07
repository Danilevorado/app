package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0565Ek {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC0511Bs A00;
    public final InterfaceC0513Bu A01;
    public final InterfaceC0511Bs[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, 18, 24, 15, 7, -61, 21, 8, 4, 7, -61, 23, 11, 8, -61, 22, 23, 21, 8, 4, 16, -47, -17, 16, 15, 6, -63, 16, 7, -63, 21, 9, 6, -63, 2, 23, 2, 10, 13, 2, 3, 13, 6, -63, 6, 25, 21, 19, 2, 4, 21, 16, 19, 20, -63, -55};
    }

    static {
        A01();
    }

    public C0565Ek(InterfaceC0511Bs[] interfaceC0511BsArr, InterfaceC0513Bu interfaceC0513Bu) {
        this.A02 = interfaceC0511BsArr;
        this.A01 = interfaceC0513Bu;
    }

    public final InterfaceC0511Bs A02(InterfaceC0512Bt interfaceC0512Bt, Uri uri) throws InterruptedException, IOException {
        InterfaceC0511Bs interfaceC0511Bs = this.A00;
        if (interfaceC0511Bs != null) {
            return interfaceC0511Bs;
        }
        InterfaceC0511Bs[] interfaceC0511BsArr = this.A02;
        int length = interfaceC0511BsArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            InterfaceC0511Bs interfaceC0511Bs2 = interfaceC0511BsArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0512Bt.AFM();
                throw th;
            }
            if (interfaceC0511Bs2.AGR(interfaceC0512Bt)) {
                this.A00 = interfaceC0511Bs2;
                interfaceC0512Bt.AFM();
                break;
            }
            continue;
            interfaceC0512Bt.AFM();
            i10++;
        }
        InterfaceC0511Bs interfaceC0511Bs3 = this.A00;
        if (interfaceC0511Bs3 != null) {
            interfaceC0511Bs3.A8o(this.A01);
            return this.A00;
        }
        throw new WM(A00(24, 34, 114) + IF.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
