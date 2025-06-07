package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fw1 {

    /* renamed from: a, reason: collision with root package name */
    private final v90 f8468a;

    fw1(v90 v90Var) {
        this.f8468a = v90Var;
    }

    public static void a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
        if (jSONObjectOptJSONObject == null) {
            m3.n1.k("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
    }

    public final void b() {
        rf0.a(this.f8468a.a(), "persistFlags");
    }
}
