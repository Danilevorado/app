package m9;

import a9.p;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class k extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25383a;

    k(String str) {
        this.f25383a = str;
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        jSONObject.put("userId", this.f25383a);
    }

    @Override // b9.d
    public String g() {
        return "registerUser";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    @Override // b9.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map i(JSONObject jSONObject) {
        a9.i.e(new p());
        return (Map) super.i(jSONObject);
    }
}
