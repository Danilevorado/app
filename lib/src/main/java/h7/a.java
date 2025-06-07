package h7;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rb.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private c f24084a;

    /* renamed from: b, reason: collision with root package name */
    private b f24085b;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f24086c;

    public a(b bVar, c cVar, JSONArray jSONArray) {
        h.e(bVar, "influenceChannel");
        h.e(cVar, "influenceType");
        this.f24085b = bVar;
        this.f24084a = cVar;
        this.f24086c = jSONArray;
    }

    public a(String str) throws JSONException {
        h.e(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        this.f24085b = b.f24087n.a(string);
        this.f24084a = c.f24092m.a(string2);
        h.d(string3, "ids");
        this.f24086c = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final a a() {
        return new a(this.f24085b, this.f24084a, this.f24086c);
    }

    public final JSONArray b() {
        return this.f24086c;
    }

    public final b c() {
        return this.f24085b;
    }

    public final c d() {
        return this.f24084a;
    }

    public final void e(JSONArray jSONArray) {
        this.f24086c = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h.a(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24085b == aVar.f24085b && this.f24084a == aVar.f24084a;
    }

    public final void f(c cVar) {
        h.e(cVar, "<set-?>");
        this.f24084a = cVar;
    }

    public final String g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("influence_channel", this.f24085b.toString()).put("influence_type", this.f24084a.toString());
        JSONArray jSONArray = this.f24086c;
        String string = jSONObjectPut.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        h.d(string, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return string;
    }

    public int hashCode() {
        return (this.f24085b.hashCode() * 31) + this.f24084a.hashCode();
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.f24085b + ", influenceType=" + this.f24084a + ", ids=" + this.f24086c + '}';
    }
}
