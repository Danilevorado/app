package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f22207a;

    /* renamed from: b, reason: collision with root package name */
    private JSONArray f22208b;

    p1(JSONObject jSONObject) {
        this.f22207a = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f22208b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : null;
    }

    public JSONObject a() {
        return this.f22207a;
    }

    public JSONArray b() {
        return this.f22208b;
    }

    public String toString() {
        return "OSInAppMessageTag{adds=" + this.f22207a + ", removes=" + this.f22208b + '}';
    }
}
