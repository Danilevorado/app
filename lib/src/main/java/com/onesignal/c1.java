package com.onesignal;

import com.onesignal.q4;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    private String f21776a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21777b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21778c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21779d;

    /* renamed from: e, reason: collision with root package name */
    private q4.m f21780e;

    /* renamed from: f, reason: collision with root package name */
    private Double f21781f;

    /* renamed from: g, reason: collision with root package name */
    private int f21782g;

    public c1(JSONObject jSONObject) {
        rb.h.e(jSONObject, "jsonObject");
        this.f21777b = true;
        this.f21778c = true;
        this.f21776a = jSONObject.optString("html");
        this.f21781f = Double.valueOf(jSONObject.optDouble("display_duration"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("styles");
        this.f21777b = !(jSONObjectOptJSONObject == null ? false : jSONObjectOptJSONObject.optBoolean("remove_height_margin", false));
        this.f21778c = !(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("remove_width_margin", false) : false);
        this.f21779d = !this.f21777b;
    }

    public final String a() {
        return this.f21776a;
    }

    public final Double b() {
        return this.f21781f;
    }

    public final q4.m c() {
        return this.f21780e;
    }

    public final int d() {
        return this.f21782g;
    }

    public final boolean e() {
        return this.f21777b;
    }

    public final boolean f() {
        return this.f21778c;
    }

    public final boolean g() {
        return this.f21779d;
    }

    public final void h(String str) {
        this.f21776a = str;
    }

    public final void i(q4.m mVar) {
        this.f21780e = mVar;
    }

    public final void j(int i10) {
        this.f21782g = i10;
    }
}
