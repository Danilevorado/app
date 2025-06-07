package com.meta.analytics.dsp.uinode;

import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class TC implements PG {
    public final /* synthetic */ C1073Yn A00;
    public final /* synthetic */ String A01;

    public TC(C1073Yn c1073Yn, String str) {
        this.A00 = c1073Yn;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.PG
    public final void A8d(String str) throws JSONException {
        PP.A05(this.A00, str, this.A01);
    }
}
