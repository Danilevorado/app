package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class go2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f8833a;

    public go2(JSONObject jSONObject) {
        this.f8833a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int iOptInt = this.f8833a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
