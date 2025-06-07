package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private JSONArray f22525a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f22526b;

    public y1(JSONArray jSONArray, JSONObject jSONObject) {
        this.f22525a = jSONArray;
        this.f22526b = jSONObject;
    }

    public final JSONArray a() {
        return this.f22525a;
    }

    public final JSONObject b() {
        return this.f22526b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return rb.h.a(this.f22525a, y1Var.f22525a) && rb.h.a(this.f22526b, y1Var.f22526b);
    }

    public int hashCode() {
        JSONArray jSONArray = this.f22525a;
        int iHashCode = (jSONArray == null ? 0 : jSONArray.hashCode()) * 31;
        JSONObject jSONObject = this.f22526b;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f22525a + ", jsonData=" + this.f22526b + ')';
    }
}
