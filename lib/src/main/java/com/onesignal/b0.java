package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21705a;

    public b0() {
        this.f21705a = new JSONObject();
    }

    public b0(JSONObject jSONObject) {
        this.f21705a = jSONObject;
    }

    public boolean a(String str) {
        return this.f21705a.has(str);
    }

    public boolean b(String str) {
        return this.f21705a.optBoolean(str);
    }

    public boolean c(String str, boolean z10) {
        return this.f21705a.optBoolean(str, z10);
    }

    public int d(String str, int i10) {
        return this.f21705a.optInt(str, i10);
    }

    public JSONObject e(String str) {
        return this.f21705a.optJSONObject(str);
    }

    public String f(String str) {
        return this.f21705a.optString(str);
    }

    public String g(String str, String str2) {
        return this.f21705a.optString(str, str2);
    }

    public String toString() {
        return "ImmutableJSONObject{jsonObject=" + this.f21705a + '}';
    }
}
