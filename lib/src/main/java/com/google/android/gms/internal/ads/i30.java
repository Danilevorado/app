package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i30 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9494b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9495c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9496d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9497e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9498f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9499g;

    /* renamed from: h, reason: collision with root package name */
    public final List f9500h;

    /* renamed from: i, reason: collision with root package name */
    public final List f9501i;

    /* renamed from: j, reason: collision with root package name */
    public final List f9502j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9503k;

    /* renamed from: l, reason: collision with root package name */
    public final List f9504l;

    /* renamed from: m, reason: collision with root package name */
    public final List f9505m;

    /* renamed from: n, reason: collision with root package name */
    public final List f9506n;

    /* renamed from: o, reason: collision with root package name */
    public final String f9507o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9508p;

    /* renamed from: q, reason: collision with root package name */
    public final String f9509q;

    /* renamed from: r, reason: collision with root package name */
    public final String f9510r;

    /* renamed from: s, reason: collision with root package name */
    public final String f9511s;

    /* renamed from: t, reason: collision with root package name */
    public final List f9512t;

    /* renamed from: u, reason: collision with root package name */
    public final String f9513u;

    /* renamed from: v, reason: collision with root package name */
    public final String f9514v;

    public i30(JSONObject jSONObject) throws JSONException {
        List listA;
        this.f9494b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f9495c = Collections.unmodifiableList(arrayList);
        this.f9496d = jSONObject.optString("allocation_id", null);
        j3.t.i();
        this.f9498f = k30.a(jSONObject, "clickurl");
        j3.t.i();
        this.f9499g = k30.a(jSONObject, "imp_urls");
        j3.t.i();
        this.f9500h = k30.a(jSONObject, "downloaded_imp_urls");
        j3.t.i();
        this.f9502j = k30.a(jSONObject, "fill_urls");
        j3.t.i();
        this.f9504l = k30.a(jSONObject, "video_start_urls");
        j3.t.i();
        this.f9506n = k30.a(jSONObject, "video_complete_urls");
        j3.t.i();
        this.f9505m = k30.a(jSONObject, "video_reward_urls");
        this.f9507o = jSONObject.optString("transaction_id");
        this.f9508p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            j3.t.i();
            listA = k30.a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listA = null;
        }
        this.f9501i = listA;
        this.f9493a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f9503k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f9497e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.f9509q = jSONObject.optString("html_template", null);
        this.f9510r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.f9511s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        j3.t.i();
        this.f9512t = k30.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f9513u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.f9514v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
