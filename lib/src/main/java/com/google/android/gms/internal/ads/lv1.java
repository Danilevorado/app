package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class lv1 implements g20 {
    lv1() {
    }

    @Override // com.google.android.gms.internal.ads.g20
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) throws JSONException {
        mv1 mv1Var = (mv1) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) k3.w.c().b(ir.E8)).booleanValue()) {
            jSONObject2.put("ad_request_url", mv1Var.f12262c.e());
            jSONObject2.put("ad_request_post_body", mv1Var.f12262c.d());
        }
        jSONObject2.put("base_url", mv1Var.f12262c.b());
        jSONObject2.put("signals", mv1Var.f12261b);
        jSONObject3.put("body", mv1Var.f12260a.f6273c);
        jSONObject3.put("headers", k3.t.b().k(mv1Var.f12260a.f6272b));
        jSONObject3.put("response_code", mv1Var.f12260a.f6271a);
        jSONObject3.put("latency", mv1Var.f12260a.f6274d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", mv1Var.f12262c.g());
        return jSONObject;
    }
}
