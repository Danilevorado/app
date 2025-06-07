package m9;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25384a;

    /* renamed from: b, reason: collision with root package name */
    private String f25385b;

    /* renamed from: c, reason: collision with root package name */
    private String f25386c;

    /* renamed from: d, reason: collision with root package name */
    private String f25387d;

    /* renamed from: e, reason: collision with root package name */
    private int f25388e;

    public l(String str, String str2, String str3, String str4, int i10) {
        this.f25384a = str;
        this.f25385b = str2;
        this.f25386c = str3;
        this.f25387d = str4;
        this.f25388e = i10;
    }

    private void k(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        k("rich_media_code", this.f25384a, jSONObject);
        k("inapp_code", this.f25385b, jSONObject);
        k("message_hash", this.f25386c, jSONObject);
        k("action_attributes", this.f25387d, jSONObject);
        jSONObject.put("action_type", this.f25388e);
    }

    @Override // b9.d
    public String g() {
        return "richMediaAction";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }
}
