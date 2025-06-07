package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class rp1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14871a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14872b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14873c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14874d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14875e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14876f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14877g;

    public rp1(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.f14871a = str;
        this.f14872b = str2;
        this.f14873c = str3;
        this.f14874d = i10;
        this.f14875e = str4;
        this.f14876f = i11;
        this.f14877g = z10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f14871a);
        jSONObject.put("version", this.f14873c);
        if (((Boolean) k3.w.c().b(ir.F8)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f14872b);
        }
        jSONObject.put("status", this.f14874d);
        jSONObject.put("description", this.f14875e);
        jSONObject.put("initializationLatencyMillis", this.f14876f);
        if (((Boolean) k3.w.c().b(ir.G8)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f14877g);
        }
        return jSONObject;
    }
}
