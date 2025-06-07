package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class h1 {

    /* renamed from: a, reason: collision with root package name */
    private String f22049a;

    /* renamed from: b, reason: collision with root package name */
    private float f22050b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22051c;

    h1(JSONObject jSONObject) {
        this.f22049a = jSONObject.getString("name");
        this.f22050b = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.f22051c = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    public String a() {
        return this.f22049a;
    }

    public float b() {
        return this.f22050b;
    }

    public boolean c() {
        return this.f22051c;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.f22049a + "', weight=" + this.f22050b + ", unique=" + this.f22051c + '}';
    }
}
