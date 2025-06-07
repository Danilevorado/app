package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n90 {

    /* renamed from: a, reason: collision with root package name */
    private final List f12534a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12535b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12536c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12537d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12538e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12539f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12540g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12541h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12542i;

    /* renamed from: j, reason: collision with root package name */
    private final int f12543j;

    /* renamed from: k, reason: collision with root package name */
    private final JSONObject f12544k;

    /* renamed from: l, reason: collision with root package name */
    private final String f12545l;

    /* renamed from: m, reason: collision with root package name */
    private final String f12546m;

    public n90(JSONObject jSONObject) {
        this.f12542i = jSONObject.optString("url");
        this.f12535b = jSONObject.optString("base_uri");
        this.f12536c = jSONObject.optString("post_parameters");
        this.f12538e = j(jSONObject.optString("drt_include"));
        this.f12539f = j(jSONObject.optString("cookies_include", "true"));
        this.f12540g = jSONObject.optString("request_id");
        this.f12537d = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f12534a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f12543j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f12541h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f12544k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f12545l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f12546m = jSONObject.optString("pool_key");
    }

    private static boolean j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    public final int a() {
        return this.f12543j;
    }

    public final String b() {
        return this.f12535b;
    }

    public final String c() {
        return this.f12546m;
    }

    public final String d() {
        return this.f12536c;
    }

    public final String e() {
        return this.f12542i;
    }

    public final List f() {
        return this.f12534a;
    }

    public final JSONObject g() {
        return this.f12544k;
    }

    public final boolean h() {
        return this.f12539f;
    }

    public final boolean i() {
        return this.f12538e;
    }
}
