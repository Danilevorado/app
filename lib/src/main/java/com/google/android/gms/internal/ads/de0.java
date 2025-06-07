package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class de0 {

    /* renamed from: d, reason: collision with root package name */
    private String f7270d;

    /* renamed from: e, reason: collision with root package name */
    private String f7271e;

    /* renamed from: f, reason: collision with root package name */
    private long f7272f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f7273g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7274h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7276j;

    /* renamed from: a, reason: collision with root package name */
    private final List f7267a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f7268b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f7269c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List f7275i = new ArrayList();

    public de0(String str, long j10) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f7274h = false;
        this.f7276j = false;
        this.f7271e = str;
        this.f7272f = j10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7273g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f7274h = false;
                ze0.g("App settings could not be fetched successfully.");
                return;
            }
            this.f7274h = true;
            this.f7270d = this.f7273g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f7273g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f7268b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f7269c.put(strOptString2, new j30(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f7273g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                    this.f7267a.add(jSONArrayOptJSONArray3.optString(i11));
                }
            }
            if (((Boolean) k3.w.c().b(ir.B6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f7273g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    this.f7275i.add(jSONArrayOptJSONArray.get(i12).toString());
                }
            }
            if (!((Boolean) k3.w.c().b(ir.W5)).booleanValue() || (jSONObjectOptJSONObject = this.f7273g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f7276j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e5) {
            ze0.h("Exception occurred while processing app setting json", e5);
            j3.t.q().u(e5, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f7272f;
    }

    public final String b() {
        return this.f7270d;
    }

    public final String c() {
        return this.f7271e;
    }

    public final List d() {
        return this.f7275i;
    }

    public final Map e() {
        return this.f7269c;
    }

    public final JSONObject f() {
        return this.f7273g;
    }

    public final void g(long j10) {
        this.f7272f = j10;
    }

    public final boolean h() {
        return this.f7276j;
    }

    public final boolean i() {
        return this.f7274h;
    }
}
