package n9;

import org.json.JSONObject;

/* loaded from: classes2.dex */
class f extends b9.d {
    f() {
    }

    @Override // b9.d
    public String g() {
        return "getTags";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    @Override // b9.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public sa.b i(JSONObject jSONObject) {
        return sa.a.b(jSONObject.getJSONObject("result"));
    }
}
