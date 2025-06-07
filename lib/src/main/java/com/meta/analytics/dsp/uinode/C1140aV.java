package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1140aV extends AbstractC02380q {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C1138aT A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, 29, 17, 16, 10, 12, 17, 18, 18, 27, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public C1140aV(C1138aT c1138aT) {
        this.A00 = c1138aT;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A04 = false;
            this.A00.A07.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A04 = false;
        if (this.A00.A03 != null && C0662Ih.A1j(this.A00.A06)) {
            this.A00.A03.A0P(new C1141aW(this));
            this.A00.A03.A0K();
            this.A00.A03 = null;
        }
        this.A00.A07.onInterstitialDismissed(this.A00.A08.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A05() {
        this.A00.A07.onInterstitialDisplayed(this.A00.A08.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A06() {
        this.A00.A07.onRewardedAdServerFailed();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A07() {
        this.A00.A07.onRewardedAdServerSucceeded();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A08() {
        this.A00.A07.onRewardedAdCompleted();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A0C() {
        this.A00.A06.A0E().A2j();
        this.A00.A07.onAdClicked(this.A00.A08.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A0E(View view) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(com.meta.analytics.dsp.uinode.InterfaceC02370p r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1140aV.A0F(com.facebook.ads.redexgen.X.0p):void");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02380q
    public final void A0G(C0679Jb c0679Jb) {
        this.A00.A06.A0E().A2m(C0731Lf.A01(this.A00.A00), c0679Jb.A03().getErrorCode(), c0679Jb.A04());
        this.A00.A07.onError(this.A00.A08.A01(), L1.A00(c0679Jb));
    }
}
