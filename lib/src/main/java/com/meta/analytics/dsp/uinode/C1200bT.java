package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1200bT extends KT {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C02440w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C1200bT(C02440w c02440w, String str) {
        this.A00 = c02440w;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() throws InterruptedException {
        String strA00 = A00(0, 17, 116);
        try {
            this.A00.A06.await();
            if (this.A00.A0J(this.A01)) {
                ((C1T) this.A00.A02.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                this.A00.A02.A07(this.A01);
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e5) {
            this.A00.A03.A07().A9a(strA00, C8A.A1B, new C8B(e5));
        } catch (JSONException e10) {
            this.A00.A0M();
            this.A00.A03.A07().A9a(strA00, C8A.A1A, new C8B(e10));
        }
    }
}
