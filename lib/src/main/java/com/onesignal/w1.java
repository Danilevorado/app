package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.e3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class w1 {
    private static String a(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", null);
            if (string != null) {
                return c(string);
            }
            e3.a(e3.z.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    static String b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return c(jSONObject.optString("custom", null));
    }

    private static String c(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            e3.a(e3.z.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
        if (jSONObject.has("i")) {
            return jSONObject.optString("i", null);
        }
        e3.a(e3.z.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
        return null;
    }

    static boolean d(Bundle bundle) {
        return a(bundle) != null;
    }

    static boolean e(Intent intent) {
        if (intent == null) {
            return false;
        }
        return d(intent.getExtras());
    }
}
