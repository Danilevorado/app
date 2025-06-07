package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class mx implements gy {
    mx() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectA;
        nk0 nk0Var = (nk0) obj;
        du duVarS = nk0Var.s();
        if (duVarS == null || (jSONObjectA = duVarS.a()) == null) {
            nk0Var.a("nativeAdViewSignalsReady", new JSONObject());
        } else {
            nk0Var.a("nativeAdViewSignalsReady", jSONObjectA);
        }
    }
}
