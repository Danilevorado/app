package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kh0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11046d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11047e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11048f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11049g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11050h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11051i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11052j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11053k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11054l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11055m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11056n;

    /* renamed from: o, reason: collision with root package name */
    public final long f11057o;

    public kh0(String str) throws JSONException {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f11043a = a(jSONObject, "aggressive_media_codec_release", ir.I);
        this.f11044b = b(jSONObject, "byte_buffer_precache_limit", ir.f10000l);
        this.f11045c = b(jSONObject, "exo_cache_buffer_size", ir.f10120w);
        this.f11046d = b(jSONObject, "exo_connect_timeout_millis", ir.f9956h);
        zq zqVar = ir.f9945g;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        } else {
            string = (String) k3.w.c().b(zqVar);
        }
        this.f11047e = string;
        this.f11048f = b(jSONObject, "exo_read_timeout_millis", ir.f9967i);
        this.f11049g = b(jSONObject, "load_check_interval_bytes", ir.f9978j);
        this.f11050h = b(jSONObject, "player_precache_limit", ir.f9989k);
        this.f11051i = b(jSONObject, "socket_receive_buffer_size", ir.f10011m);
        this.f11052j = a(jSONObject, "use_cache_data_source", ir.T3);
        b(jSONObject, "min_retry_count", ir.f10022n);
        this.f11053k = a(jSONObject, "treat_load_exception_as_non_fatal", ir.f10054q);
        this.f11054l = a(jSONObject, "enable_multiple_video_playback", ir.J1);
        this.f11055m = a(jSONObject, "use_range_http_data_source", ir.L1);
        this.f11056n = c(jSONObject, "range_http_data_source_high_water_mark", ir.M1);
        this.f11057o = c(jSONObject, "range_http_data_source_low_water_mark", ir.N1);
    }

    private static final boolean a(JSONObject jSONObject, String str, zq zqVar) {
        boolean zBooleanValue = ((Boolean) k3.w.c().b(zqVar)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, zq zqVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) k3.w.c().b(zqVar)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, zq zqVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) k3.w.c().b(zqVar)).longValue();
    }
}
