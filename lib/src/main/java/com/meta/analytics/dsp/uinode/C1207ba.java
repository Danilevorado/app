package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1207ba implements InterfaceC02330k {
    public final /* synthetic */ C1073Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1207ba(JSONObject jSONObject, C1073Yn c1073Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c1073Yn;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02330k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02330k
    public final Collection<String> A6n() {
        return AbstractC02340l.A03(this.A00, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02330k
    public final EnumC02320j A7E() {
        return AbstractC02340l.A00(this.A02);
    }
}
