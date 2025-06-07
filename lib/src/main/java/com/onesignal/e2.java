package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    private h7.c f21869a;

    /* renamed from: b, reason: collision with root package name */
    private JSONArray f21870b;

    /* renamed from: c, reason: collision with root package name */
    private String f21871c;

    /* renamed from: d, reason: collision with root package name */
    private long f21872d;

    /* renamed from: e, reason: collision with root package name */
    private Float f21873e;

    public e2(h7.c cVar, JSONArray jSONArray, String str, long j10, float f5) {
        this.f21869a = cVar;
        this.f21870b = jSONArray;
        this.f21871c = str;
        this.f21872d = j10;
        this.f21873e = Float.valueOf(f5);
    }

    public static e2 a(k7.b bVar) {
        JSONArray jSONArrayB;
        k7.e eVarB;
        h7.c cVar = h7.c.UNATTRIBUTED;
        if (bVar.b() != null) {
            k7.d dVarB = bVar.b();
            if (dVarB.a() == null || dVarB.a().b() == null || dVarB.a().b().length() <= 0) {
                if (dVarB.b() != null && dVarB.b().b() != null && dVarB.b().b().length() > 0) {
                    cVar = h7.c.INDIRECT;
                    eVarB = dVarB.b();
                }
                jSONArrayB = null;
            } else {
                cVar = h7.c.DIRECT;
                eVarB = dVarB.a();
            }
            jSONArrayB = eVarB.b();
        } else {
            jSONArrayB = null;
        }
        return new e2(cVar, jSONArrayB, bVar.a(), bVar.c(), bVar.d());
    }

    public h7.c b() {
        return this.f21869a;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f21870b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f21870b);
        }
        jSONObject.put("id", this.f21871c);
        if (this.f21873e.floatValue() > 0.0f) {
            jSONObject.put("weight", this.f21873e);
        }
        long j10 = this.f21872d;
        if (j10 > 0) {
            jSONObject.put("timestamp", j10);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f21869a.equals(e2Var.f21869a) && this.f21870b.equals(e2Var.f21870b) && this.f21871c.equals(e2Var.f21871c) && this.f21872d == e2Var.f21872d && this.f21873e.equals(e2Var.f21873e);
    }

    public int hashCode() {
        int iHashCode = 1;
        Object[] objArr = {this.f21869a, this.f21870b, this.f21871c, Long.valueOf(this.f21872d), this.f21873e};
        for (int i10 = 0; i10 < 5; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    public String toString() {
        return "OutcomeEvent{session=" + this.f21869a + ", notificationIds=" + this.f21870b + ", name='" + this.f21871c + "', timestamp=" + this.f21872d + ", weight=" + this.f21873e + '}';
    }
}
