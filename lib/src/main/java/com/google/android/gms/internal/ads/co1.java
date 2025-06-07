package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class co1 {

    /* renamed from: a, reason: collision with root package name */
    private Long f7000a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7001b;

    /* renamed from: c, reason: collision with root package name */
    private String f7002c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f7003d;

    /* renamed from: e, reason: collision with root package name */
    private String f7004e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f7005f;

    /* synthetic */ co1(String str, ao1 ao1Var) {
        this.f7001b = str;
    }

    static /* bridge */ /* synthetic */ String a(co1 co1Var) throws JSONException {
        String str = (String) k3.w.c().b(ir.V8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", co1Var.f7000a);
            jSONObject.put("eventCategory", co1Var.f7001b);
            jSONObject.putOpt("event", co1Var.f7002c);
            jSONObject.putOpt("errorCode", co1Var.f7003d);
            jSONObject.putOpt("rewardType", co1Var.f7004e);
            jSONObject.putOpt("rewardAmount", co1Var.f7005f);
        } catch (JSONException unused) {
            ze0.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
