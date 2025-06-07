package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0499Bg extends C1099Zo {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0500Bh A03;
    public int[] A04;
    public final C1073Yn A05;
    public final C0838Pi A06;
    public final C0839Pj A07;

    public C0499Bg(C1073Yn c1073Yn, C0839Pj c0839Pj, C0838Pi c0838Pi) {
        super(c1073Yn);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1073Yn;
        this.A07 = c0839Pj;
        this.A06 = c0838Pi;
        this.A01 = -1;
        this.A03 = new C0500Bh(this, c1073Yn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03394o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1J(com.meta.analytics.dsp.uinode.C03464w r17, com.meta.analytics.dsp.uinode.AnonymousClass53 r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0499Bg.A1J(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53, int, int):void");
    }

    @Override // com.meta.analytics.dsp.uinode.C1099Zo, com.meta.analytics.dsp.uinode.AbstractC03394o
    public final void A1p(int i10) {
        A2B(i10, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.C1099Zo, com.meta.analytics.dsp.uinode.AbstractC03394o
    public final void A1x(C0556Eb c0556Eb, AnonymousClass53 anonymousClass53, int i10) {
        this.A03.A0A(i10);
        A1L(this.A03);
    }

    public final void A2G(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0d;
        }
        this.A00 = (float) (50.0d / d10);
        this.A03 = new C0500Bh(this, this.A05);
    }

    public final void A2H(int i10) {
        this.A01 = i10;
    }

    public final void A2I(int i10) {
        this.A02 = i10;
    }
}
