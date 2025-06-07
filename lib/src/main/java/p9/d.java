package p9;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends b9.d {
    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("channels");
        jSONArray.put("events");
        jSONArray.put("public_key");
        jSONObject.put("features", jSONArray);
    }

    @Override // b9.d
    public String g() {
        return "getConfig";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    @Override // b9.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a i(JSONObject jSONObject) throws JSONException {
        String string;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 1;
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("channels");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("events");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    arrayList.add(new la.a(jSONArrayOptJSONArray.getJSONObject(i11)));
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                    String strOptString = jSONArrayOptJSONArray2.optString(i12);
                    if (!strOptString.isEmpty()) {
                        arrayList2.add(new c(strOptString));
                    }
                }
            }
            string = jSONObjectOptJSONObject.getString("public_key");
            try {
                i10 = jSONObjectOptJSONObject.getInt("logger");
            } catch (JSONException unused) {
            }
        } else {
            string = "";
        }
        return new a(arrayList, arrayList2, string, i10);
    }
}
