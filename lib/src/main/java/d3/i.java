package d3;

import k3.l4;
import k3.w2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final l4 f22859a;

    /* renamed from: b, reason: collision with root package name */
    private final a f22860b;

    private i(l4 l4Var) {
        this.f22859a = l4Var;
        w2 w2Var = l4Var.f24693o;
        this.f22860b = w2Var == null ? null : w2Var.f();
    }

    public static i e(l4 l4Var) {
        if (l4Var != null) {
            return new i(l4Var);
        }
        return null;
    }

    public String a() {
        return this.f22859a.f24696r;
    }

    public String b() {
        return this.f22859a.f24698t;
    }

    public String c() {
        return this.f22859a.f24697s;
    }

    public String d() {
        return this.f22859a.f24695q;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f22859a.f24691m);
        jSONObject.put("Latency", this.f22859a.f24692n);
        String strD = d();
        if (strD == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strD);
        }
        String strA = a();
        if (strA == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strA);
        }
        String strC = c();
        if (strC == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strC);
        }
        String strB = b();
        if (strB == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strB);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f22859a.f24694p.keySet()) {
            jSONObject2.put(str, this.f22859a.f24694p.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f22860b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
