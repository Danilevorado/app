package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class h2 {

    /* renamed from: a, reason: collision with root package name */
    private g2 f22052a;

    /* renamed from: b, reason: collision with root package name */
    private g2 f22053b;

    public h2(g2 g2Var, g2 g2Var2) {
        this.f22052a = g2Var;
        this.f22053b = g2Var2;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f22052a.g());
            jSONObject.put("to", this.f22053b.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
