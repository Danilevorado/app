package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nn2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12719b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f12720c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f12721d;

    nn2(JsonReader jsonReader) {
        JSONObject jSONObjectH = m3.w0.h(jsonReader);
        this.f12721d = jSONObjectH;
        this.f12718a = jSONObjectH.optString("ad_html", null);
        this.f12719b = jSONObjectH.optString("ad_base_url", null);
        this.f12720c = jSONObjectH.optJSONObject("ad_json");
    }
}
