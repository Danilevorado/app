package b8;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private String f4549a;

    /* renamed from: b, reason: collision with root package name */
    private long f4550b;

    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        hVar.f4549a = jSONObject.optString("code");
        hVar.f4550b = jSONObject.optLong("updated");
        return hVar;
    }

    public static h b(q9.b bVar) {
        h hVar = new h();
        hVar.f4549a = bVar.l();
        hVar.f4550b = bVar.r();
        return hVar;
    }

    public String c() {
        return this.f4549a;
    }

    public long d() {
        return this.f4550b;
    }
}
