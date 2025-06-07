package d3;

import k3.w2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f22811a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22812b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22813c;

    /* renamed from: d, reason: collision with root package name */
    private final a f22814d;

    public a(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public a(int i10, String str, String str2, a aVar) {
        this.f22811a = i10;
        this.f22812b = str;
        this.f22813c = str2;
        this.f22814d = aVar;
    }

    public int a() {
        return this.f22811a;
    }

    public String b() {
        return this.f22813c;
    }

    public String c() {
        return this.f22812b;
    }

    public final w2 d() {
        w2 w2Var;
        if (this.f22814d == null) {
            w2Var = null;
        } else {
            a aVar = this.f22814d;
            w2Var = new w2(aVar.f22811a, aVar.f22812b, aVar.f22813c, null, null);
        }
        return new w2(this.f22811a, this.f22812b, this.f22813c, w2Var, null);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f22811a);
        jSONObject.put("Message", this.f22812b);
        jSONObject.put("Domain", this.f22813c);
        a aVar = this.f22814d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
