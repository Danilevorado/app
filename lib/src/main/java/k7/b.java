package k7;

import org.json.JSONException;
import org.json.JSONObject;
import rb.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f24855a;

    /* renamed from: b, reason: collision with root package name */
    private final d f24856b;

    /* renamed from: c, reason: collision with root package name */
    private float f24857c;

    /* renamed from: d, reason: collision with root package name */
    private long f24858d;

    public b(String str, d dVar, float f5, long j10) {
        h.e(str, "outcomeId");
        this.f24855a = str;
        this.f24856b = dVar;
        this.f24857c = f5;
        this.f24858d = j10;
    }

    public final String a() {
        return this.f24855a;
    }

    public final d b() {
        return this.f24856b;
    }

    public final long c() {
        return this.f24858d;
    }

    public final float d() {
        return this.f24857c;
    }

    public final boolean e() {
        d dVar = this.f24856b;
        return dVar == null || (dVar.a() == null && this.f24856b.b() == null);
    }

    public final void f(long j10) {
        this.f24858d = j10;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.f24855a);
        d dVar = this.f24856b;
        if (dVar != null) {
            jSONObjectPut.put("sources", dVar.g());
        }
        float f5 = this.f24857c;
        if (f5 > 0.0f) {
            jSONObjectPut.put("weight", Float.valueOf(f5));
        }
        long j10 = this.f24858d;
        if (j10 > 0) {
            jSONObjectPut.put("timestamp", j10);
        }
        h.d(jSONObjectPut, "json");
        return jSONObjectPut;
    }

    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f24855a + "', outcomeSource=" + this.f24856b + ", weight=" + this.f24857c + ", timestamp=" + this.f24858d + '}';
    }
}
