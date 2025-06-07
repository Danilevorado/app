package n9;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class s extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f25660a;

    public s(JSONObject jSONObject) {
        this.f25660a = jSONObject;
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = this.f25660a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = this.f25660a.optString(next);
            if (strOptString != null && strOptString.startsWith("#pwinc#")) {
                this.f25660a.put(next, sa.a.c(next, Integer.valueOf(Integer.parseInt(strOptString.substring(7))).intValue()));
            }
            JSONObject jSONObject2 = this.f25660a;
            jSONObject2.put(next, jSONObject2.opt(next));
        }
        jSONObject.put("tags", this.f25660a);
    }

    @Override // b9.d
    public String g() {
        return "setTags";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }
}
