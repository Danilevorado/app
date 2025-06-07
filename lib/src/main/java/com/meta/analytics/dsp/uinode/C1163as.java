package com.meta.analytics.dsp.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1163as implements C6U {
    public final C02501c A00;
    public final InterfaceC02641q A01;
    public final C03786c A02;
    public final C1073Yn A03;
    public final boolean A04;

    public C1163as(C1073Yn c1073Yn, InterfaceC02641q interfaceC02641q, C03786c c03786c, C02501c c02501c, boolean z10) {
        this.A03 = c1073Yn;
        this.A01 = interfaceC02641q;
        this.A02 = c03786c;
        this.A00 = c02501c;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C02651r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == EnumC02511d.A05) {
            A00();
            return;
        }
        String strA0E = this.A00.A0E();
        if (z10) {
            C03786c c03786c = this.A02;
            String markupUrlResult = this.A00.A0E();
            strA0E = c03786c.A0R(markupUrlResult);
        }
        this.A00.A0H(strA0E);
        this.A01.ACa();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}
