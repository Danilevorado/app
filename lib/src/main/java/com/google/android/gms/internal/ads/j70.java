package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j70 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10336b;

    public j70(boolean z10, String str) {
        this.f10335a = z10;
        this.f10336b = str;
    }

    public static j70 a(JSONObject jSONObject) {
        return new j70(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
