package m9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class a extends b9.d {
    a() {
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        jSONObject.put("language", Locale.getDefault().getLanguage());
    }

    @Override // b9.d
    public String g() {
        return "getInApps";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    @Override // b9.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public List i(JSONObject jSONObject) throws JSONException {
        List listEmptyList = Collections.emptyList();
        if (jSONObject.has("inApps")) {
            JSONArray jSONArray = jSONObject.getJSONArray("inApps");
            listEmptyList = new ArrayList(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                listEmptyList.add(new q9.b(jSONArray.getJSONObject(i10)));
            }
        }
        return listEmptyList;
    }
}
