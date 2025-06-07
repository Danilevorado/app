package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    private String f22063a;

    /* renamed from: b, reason: collision with root package name */
    private String f22064b;

    public i1(JSONObject jSONObject) {
        rb.h.e(jSONObject, "jsonObject");
        this.f22063a = jSONObject.optString("pageId", null);
        this.f22064b = jSONObject.optString("pageIndex", null);
    }

    public final String a() {
        return this.f22063a;
    }
}
