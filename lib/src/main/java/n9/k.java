package n9;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class k extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25630a;

    /* renamed from: b, reason: collision with root package name */
    private String f25631b;

    public k(String str, String str2) {
        this.f25630a = str;
        this.f25631b = str2;
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        String str = this.f25630a;
        if (str != null) {
            jSONObject.put("hash", str);
        }
        String str2 = this.f25631b;
        if (str2 != null) {
            jSONObject.put("metaData", str2);
        }
    }

    @Override // b9.d
    public String g() {
        return "pushStat";
    }

    @Override // b9.d
    public boolean j() {
        return true;
    }
}
