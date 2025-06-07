package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0834Pe {
    public String A02;
    public String A03;
    public final C1N A04;
    public final C02481a A05;
    public final C1073Yn A06;
    public C1P A01 = C1P.A01(null);
    public int A00 = AdError.NETWORK_ERROR_CODE;

    public C0834Pe(C1073Yn c1073Yn, C1N c1n, C02481a c02481a) {
        this.A06 = c1073Yn;
        this.A04 = c1n;
        this.A05 = c02481a;
    }

    public final C0834Pe A07(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C0834Pe A08(C1P c1p) {
        this.A01 = c1p;
        return this;
    }

    public final C0834Pe A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C0834Pe A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0836Pg A0B() {
        return new C0836Pg(this, null);
    }
}
