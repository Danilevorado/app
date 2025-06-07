package d3;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: e, reason: collision with root package name */
    private final u f22862e;

    public l(int i10, String str, String str2, a aVar, u uVar) {
        super(i10, str, str2, aVar);
        this.f22862e = uVar;
    }

    @Override // d3.a
    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectE = super.e();
        u uVarF = f();
        jSONObjectE.put("Response Info", uVarF == null ? "null" : uVarF.g());
        return jSONObjectE;
    }

    public u f() {
        return this.f22862e;
    }

    @Override // d3.a
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
