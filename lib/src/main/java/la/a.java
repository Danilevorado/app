package la;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f25152a;

    /* renamed from: b, reason: collision with root package name */
    private String f25153b;

    /* renamed from: c, reason: collision with root package name */
    private int f25154c;

    public a(JSONObject jSONObject) {
        this.f25152a = jSONObject.optString("code");
        this.f25153b = jSONObject.optString("name");
        this.f25154c = jSONObject.optInt("position", Integer.MAX_VALUE);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.f25152a);
            jSONObject.put("name", this.f25153b);
            jSONObject.put("position", this.f25154c);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
