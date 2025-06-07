package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    private k2 f22099a;

    /* renamed from: b, reason: collision with root package name */
    private k2 f22100b;

    public l2(k2 k2Var, k2 k2Var2) {
        this.f22099a = k2Var;
        this.f22100b = k2Var2;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f22099a.i());
            jSONObject.put("to", this.f22100b.i());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
