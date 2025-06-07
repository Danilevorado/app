package w9;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0207a f28011a;

    /* renamed from: b, reason: collision with root package name */
    private String f28012b;

    /* renamed from: c, reason: collision with root package name */
    private String f28013c;

    /* renamed from: d, reason: collision with root package name */
    private String f28014d;

    /* renamed from: e, reason: collision with root package name */
    private String f28015e;

    /* renamed from: f, reason: collision with root package name */
    private Class f28016f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f28017g;

    /* renamed from: w9.a$a, reason: collision with other inner class name */
    public enum EnumC0207a {
        ACTIVITY,
        SERVICE,
        BROADCAST
    }

    public a(JSONObject jSONObject) throws JSONException {
        try {
            this.f28011a = EnumC0207a.valueOf(jSONObject.getString("type"));
            this.f28013c = jSONObject.getString("title");
            this.f28014d = jSONObject.optString("icon");
            this.f28012b = jSONObject.optString("action");
            this.f28015e = jSONObject.optString("url");
            String strOptString = jSONObject.optString("class");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    this.f28016f = Class.forName(strOptString);
                } catch (ClassNotFoundException e5) {
                    k9.h.o(e5);
                }
            }
            try {
                this.f28017g = jSONObject.getJSONObject("extras");
            } catch (JSONException unused) {
            }
        } catch (Exception e10) {
            throw new JSONException(e10.getMessage());
        }
    }

    public Class a() {
        return this.f28016f;
    }

    public JSONObject b() {
        return this.f28017g;
    }

    public String c() {
        return this.f28014d;
    }

    public String d() {
        return this.f28012b;
    }

    public String e() {
        return this.f28013c;
    }

    public EnumC0207a f() {
        return this.f28011a;
    }

    public String g() {
        return this.f28015e;
    }
}
