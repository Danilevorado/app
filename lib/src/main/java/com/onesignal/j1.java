package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f22087a = new j1();

    private j1() {
    }

    public static final String a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        rb.h.e(jSONObject, "payload");
        try {
            JSONObject jSONObjectB = j0.b(jSONObject);
            rb.h.d(jSONObjectB, "{\n            Notificati…Object(payload)\n        }");
            if (jSONObjectB.has("a") && (jSONObjectOptJSONObject = jSONObjectB.optJSONObject("a")) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final boolean b(Activity activity, JSONObject jSONObject) throws JSONException {
        rb.h.e(activity, "activity");
        rb.h.e(jSONObject, "jsonData");
        String strA = a(jSONObject);
        if (strA == null) {
            return false;
        }
        e3.j1(activity, new JSONArray().put(jSONObject));
        e3.g0().J(strA);
        return true;
    }

    public static final boolean c(Context context, Bundle bundle) throws JSONException {
        JSONObject jSONObjectA = j0.a(bundle);
        rb.h.d(jSONObjectA, "bundleAsJSONObject(bundle)");
        j1 j1Var = f22087a;
        String strA = a(jSONObjectA);
        if (strA == null) {
            return false;
        }
        if (e3.S0()) {
            e3.g0().J(strA);
            return true;
        }
        if (!j1Var.d()) {
            return true;
        }
        u.m(new x1(context, jSONObjectA));
        return true;
    }

    private final boolean d() {
        return true;
    }
}
