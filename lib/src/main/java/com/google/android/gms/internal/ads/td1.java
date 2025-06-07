package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class td1 extends ud1 {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f15782b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15783c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15784d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15785e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15786f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15787g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f15788h;

    public td1(hn2 hn2Var, JSONObject jSONObject) {
        super(hn2Var);
        this.f15782b = m3.w0.g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f15783c = m3.w0.k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f15784d = m3.w0.k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f15785e = m3.w0.k(false, jSONObject, "enable_omid");
        this.f15787g = m3.w0.b("", jSONObject, "watermark_overlay_png_base64");
        this.f15786f = jSONObject.optJSONObject("overlay") != null;
        this.f15788h = ((Boolean) k3.w.c().b(ir.K4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final go2 a() {
        JSONObject jSONObject = this.f15788h;
        return jSONObject != null ? new go2(jSONObject) : this.f16293a.W;
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final String b() {
        return this.f15787g;
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final JSONObject c() {
        JSONObject jSONObject = this.f15782b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f16293a.A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final boolean d() {
        return this.f15785e;
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final boolean e() {
        return this.f15783c;
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final boolean f() {
        return this.f15784d;
    }

    @Override // com.google.android.gms.internal.ads.ud1
    public final boolean g() {
        return this.f15786f;
    }
}
