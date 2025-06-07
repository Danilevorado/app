package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class o0 {
    private static JSONObject a(Intent intent) throws JSONException {
        if (!w1.e(intent)) {
            return null;
        }
        JSONObject jSONObjectA = j0.a(intent.getExtras());
        d(jSONObjectA);
        return jSONObjectA;
    }

    static void b(Activity activity, Intent intent) {
        JSONObject jSONObjectA;
        e3.Q0(activity.getApplicationContext());
        if (intent == null || (jSONObjectA = a(intent)) == null) {
            return;
        }
        c(activity, jSONObjectA);
    }

    private static void c(Activity activity, JSONObject jSONObject) {
        if (j1.b(activity, jSONObject)) {
            return;
        }
        e3.J0(activity, new JSONArray().put(jSONObject), w1.b(jSONObject));
    }

    private static void d(JSONObject jSONObject) throws JSONException {
        try {
            String str = (String) j0.b(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }
}
