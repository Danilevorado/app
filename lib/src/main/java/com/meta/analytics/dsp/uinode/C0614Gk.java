package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Gk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0614Gk {
    public static String[] A04 = {"1e59kXQlLqMkYu", "73uDxCsdQKWLV7ukq8JJdZs18UKd6swo", "mCuMZDHsEtXcrT2f0", "82", "pR5c7vVXcuaoTTpQp", "OeCOW4uYvzA4LVqnaAabDbQ1U", "2mUnq0j6yY0W6wQrn1U3Lg5rNBUJPBqf", "6oWLaazoE5vpCSBDL9uHOzoNvgEAVE9"};
    public final int A00;
    public final C0611Gh A01;
    public final Object A02;
    public final AB[] A03;

    public C0614Gk(AB[] abArr, InterfaceC0610Gg[] interfaceC0610GgArr, Object obj) {
        this.A03 = abArr;
        this.A01 = new C0611Gh(interfaceC0610GgArr);
        this.A02 = obj;
        this.A00 = abArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C0614Gk c0614Gk) {
        if (c0614Gk == null || c0614Gk.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i10 = 0; i10 < this.A01.A01; i10++) {
            if (!A02(c0614Gk, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C0614Gk c0614Gk, int i10) {
        if (c0614Gk == null) {
            return false;
        }
        AB[] abArr = this.A03;
        String[] strArr = A04;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "XY11p18RHVDFci";
        strArr2[3] = "x2";
        return IF.A0g(abArr[i10], c0614Gk.A03[i10]) && IF.A0g(this.A01.A00(i10), c0614Gk.A01.A00(i10));
    }
}
