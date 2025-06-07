package k7;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private e f24859a;

    /* renamed from: b, reason: collision with root package name */
    private e f24860b;

    public d(e eVar, e eVar2) {
        this.f24859a = eVar;
        this.f24860b = eVar2;
    }

    public final e a() {
        return this.f24859a;
    }

    public final e b() {
        return this.f24860b;
    }

    public final d c(e eVar) {
        d(eVar);
        return this;
    }

    public final void d(e eVar) {
        this.f24859a = eVar;
    }

    public final d e(e eVar) {
        f(eVar);
        return this;
    }

    public final void f(e eVar) {
        this.f24860b = eVar;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        e eVar = this.f24859a;
        if (eVar != null) {
            jSONObject.put("direct", eVar.e());
        }
        e eVar2 = this.f24860b;
        if (eVar2 != null) {
            jSONObject.put("indirect", eVar2.e());
        }
        return jSONObject;
    }

    public String toString() {
        return "OSOutcomeSource{directBody=" + this.f24859a + ", indirectBody=" + this.f24860b + '}';
    }
}
