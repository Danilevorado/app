package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a, reason: collision with root package name */
    private OSSubscriptionState f22261a;

    /* renamed from: b, reason: collision with root package name */
    private OSSubscriptionState f22262b;

    public q2(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.f22261a = oSSubscriptionState;
        this.f22262b = oSSubscriptionState2;
    }

    public OSSubscriptionState a() {
        return this.f22261a;
    }

    public OSSubscriptionState b() {
        return this.f22262b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f22261a.r());
            jSONObject.put("to", this.f22262b.r());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}
