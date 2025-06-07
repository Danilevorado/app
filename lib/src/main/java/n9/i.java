package n9;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class i extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25628a;

    /* renamed from: b, reason: collision with root package name */
    private String f25629b;

    public i(String str, String str2) {
        this.f25628a = str;
        this.f25629b = str2;
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        String str = this.f25628a;
        if (str != null) {
            jSONObject.put("hash", str);
        }
        String str2 = this.f25629b;
        if (str2 != null) {
            jSONObject.put("metaData", str2);
        }
    }

    @Override // b9.d
    public String g() {
        return "messageDeliveryEvent";
    }

    @Override // b9.d
    public boolean j() {
        return true;
    }
}
