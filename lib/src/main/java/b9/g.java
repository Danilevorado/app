package b9;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g extends d {

    /* renamed from: a, reason: collision with root package name */
    private String f4571a;

    /* renamed from: b, reason: collision with root package name */
    private String f4572b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f4573c;

    g(String str, String str2, JSONObject jSONObject) {
        this.f4571a = str;
        this.f4572b = str2;
        this.f4573c = jSONObject;
    }

    @Override // b9.d
    public JSONObject b() {
        return this.f4573c;
    }

    @Override // b9.d
    public String g() {
        return this.f4572b;
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    public String k() {
        return this.f4571a;
    }
}
