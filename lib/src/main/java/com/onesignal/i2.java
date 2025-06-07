package com.onesignal;

import com.onesignal.e3;
import com.onesignal.p3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class i2 {
    i2() {
    }

    void a(String str, String str2, Integer num, String str3, p3.g gVar) throws JSONException, InterruptedException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("player_id", str2);
            if (num != null) {
                jSONObjectPut.put("device_type", num);
            }
            p3.l("notifications/" + str3 + "/report_received", jSONObjectPut, gVar);
        } catch (JSONException e5) {
            e3.b(e3.z.ERROR, "Generating direct receive receipt:JSON Failed.", e5);
        }
    }
}
