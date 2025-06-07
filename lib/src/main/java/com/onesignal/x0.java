package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private w0 f22502a;

    /* renamed from: b, reason: collision with root package name */
    private w0 f22503b;

    public x0(w0 w0Var, w0 w0Var2) {
        this.f22502a = w0Var;
        this.f22503b = w0Var2;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f22502a.i());
            jSONObject.put("to", this.f22503b.i());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
