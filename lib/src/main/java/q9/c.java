package q9;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class c {
    private static String a(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("Missing code in richMedia url: " + str);
        }
        if (str2.contains(".")) {
            str2 = str2.substring(0, str2.lastIndexOf("."));
        }
        return "r-" + str2;
    }

    static Map b(Map map) {
        if (map == null) {
            return Collections.emptyMap();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                map2.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map2;
    }

    private static Map c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject("{}");
        if (jSONObject.has("tags")) {
            jSONObject2 = jSONObject.getJSONObject("tags");
        }
        return k9.b.l(jSONObject2);
    }

    static b d(String str) throws JSONException, p8.a {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("hash");
            boolean zOptBoolean = jSONObject.optBoolean("required", false);
            int iOptInt = jSONObject.optInt("priority", 0);
            long j10 = jSONObject.getLong("ts");
            String string = jSONObject.getString("url");
            String strOptString2 = jSONObject.optString("gdpr");
            return new b(a(string, Uri.parse(string).getLastPathSegment()), string, strOptString, j10, a.TOP, c(jSONObject), zOptBoolean, iOptInt, null, strOptString2);
        } catch (Exception e5) {
            throw new p8.a("Can't parse richMedia", e5);
        }
    }
}
