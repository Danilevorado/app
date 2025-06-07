package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j30 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10270a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10271b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10272c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10273d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10274e;

    /* renamed from: f, reason: collision with root package name */
    public final List f10275f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10276g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10277h;

    public j30(JSONObject jSONObject) throws JSONException {
        if (ze0.j(2)) {
            m3.n1.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                i30 i30Var = new i30(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(i30Var.f9514v);
                arrayList.add(i30Var);
                if (i10 < 0) {
                    Iterator it = i30Var.f9495c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i10 = i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f10270a = Collections.unmodifiableList(arrayList);
        this.f10276g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.f10271b = null;
            this.f10272c = null;
            this.f10273d = null;
            this.f10274e = null;
            this.f10275f = null;
            this.f10277h = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        j3.t.i();
        this.f10271b = k30.a(jSONObjectOptJSONObject, "click_urls");
        j3.t.i();
        this.f10272c = k30.a(jSONObjectOptJSONObject, "imp_urls");
        j3.t.i();
        this.f10273d = k30.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        j3.t.i();
        this.f10274e = k30.a(jSONObjectOptJSONObject, "nofill_urls");
        j3.t.i();
        this.f10275f = k30.a(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong("refresh", -1L);
        na0 na0VarF = na0.f(jSONObjectOptJSONObject.optJSONArray("rewards"));
        this.f10277h = na0VarF != null ? na0VarF.f12555m : null;
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
