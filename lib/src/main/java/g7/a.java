package g7;

import com.onesignal.r1;
import com.onesignal.w2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rb.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private c f23870a;

    /* renamed from: b, reason: collision with root package name */
    private r1 f23871b;

    /* renamed from: c, reason: collision with root package name */
    private w2 f23872c;

    /* renamed from: d, reason: collision with root package name */
    private h7.c f23873d;

    /* renamed from: e, reason: collision with root package name */
    private JSONArray f23874e;

    /* renamed from: f, reason: collision with root package name */
    private String f23875f;

    public a(c cVar, r1 r1Var, w2 w2Var) {
        h.e(cVar, "dataRepository");
        h.e(r1Var, "logger");
        h.e(w2Var, "timeProvider");
        this.f23870a = cVar;
        this.f23871b = r1Var;
        this.f23872c = w2Var;
    }

    private final boolean q() {
        return this.f23870a.m();
    }

    private final boolean r() {
        return this.f23870a.n();
    }

    private final boolean s() {
        return this.f23870a.o();
    }

    public abstract void a(JSONObject jSONObject, h7.a aVar);

    public abstract void b();

    public abstract int c();

    public abstract h7.b d();

    public final h7.a e() {
        h7.c cVar;
        h7.b bVarD = d();
        h7.c cVar2 = h7.c.DISABLED;
        h7.a aVar = new h7.a(bVarD, cVar2, null);
        if (this.f23873d == null) {
            p();
        }
        h7.c cVar3 = this.f23873d;
        if (cVar3 != null) {
            cVar2 = cVar3;
        }
        if (cVar2.g()) {
            if (q()) {
                aVar.e(new JSONArray().put(g()));
                cVar = h7.c.DIRECT;
                aVar.f(cVar);
            }
        } else if (cVar2.l()) {
            if (r()) {
                aVar.e(j());
                cVar = h7.c.INDIRECT;
                aVar.f(cVar);
            }
        } else if (s()) {
            cVar = h7.c.UNATTRIBUTED;
            aVar.f(cVar);
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h.a(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23873d == aVar.f23873d && h.a(aVar.h(), h());
    }

    protected final c f() {
        return this.f23870a;
    }

    public final String g() {
        return this.f23875f;
    }

    public abstract String h();

    public int hashCode() {
        h7.c cVar = this.f23873d;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + h().hashCode();
    }

    public abstract int i();

    public final JSONArray j() {
        return this.f23874e;
    }

    public final h7.c k() {
        return this.f23873d;
    }

    public abstract JSONArray l();

    public abstract JSONArray m(String str);

    public final JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArrayL = l();
            this.f23871b.f(h.j("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ", jSONArrayL));
            long jI = i() * 60 * 1000;
            long jB = this.f23872c.b();
            int i10 = 0;
            int length = jSONArrayL.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject = jSONArrayL.getJSONObject(i10);
                    if (jB - jSONObject.getLong("time") <= jI) {
                        jSONArray.put(jSONObject.getString(h()));
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        } catch (JSONException e5) {
            this.f23871b.d("Generating tracker getLastReceivedIds JSONObject ", e5);
        }
        return jSONArray;
    }

    public final r1 o() {
        return this.f23871b;
    }

    public abstract void p();

    public final void t() {
        this.f23875f = null;
        JSONArray jSONArrayN = n();
        this.f23874e = jSONArrayN;
        this.f23873d = (jSONArrayN == null ? 0 : jSONArrayN.length()) > 0 ? h7.c.INDIRECT : h7.c.UNATTRIBUTED;
        b();
        this.f23871b.f("OneSignal OSChannelTracker resetAndInitInfluence: " + h() + " finish with influenceType: " + this.f23873d);
    }

    public String toString() {
        return "OSChannelTracker{tag=" + h() + ", influenceType=" + this.f23873d + ", indirectIds=" + this.f23874e + ", directId=" + ((Object) this.f23875f) + '}';
    }

    public abstract void u(JSONArray jSONArray);

    public final void v(String str) {
        this.f23871b.f("OneSignal OSChannelTracker for: " + h() + " saveLastId: " + ((Object) str));
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            JSONArray jSONArrayM = m(str);
            this.f23871b.f("OneSignal OSChannelTracker for: " + h() + " saveLastId with lastChannelObjectsReceived: " + jSONArrayM);
            try {
                jSONArrayM.put(new JSONObject().put(h(), str).put("time", this.f23872c.b()));
                if (jSONArrayM.length() > c()) {
                    int length = jSONArrayM.length() - c();
                    JSONArray jSONArray = new JSONArray();
                    int length2 = jSONArrayM.length();
                    if (length < length2) {
                        while (true) {
                            int i10 = length + 1;
                            try {
                                jSONArray.put(jSONArrayM.get(length));
                            } catch (JSONException e5) {
                                this.f23871b.d("Generating tracker lastChannelObjectsReceived get JSONObject ", e5);
                            }
                            if (i10 >= length2) {
                                break;
                            } else {
                                length = i10;
                            }
                        }
                    }
                    jSONArrayM = jSONArray;
                }
                this.f23871b.f("OneSignal OSChannelTracker for: " + h() + " with channelObjectToSave: " + jSONArrayM);
                u(jSONArrayM);
            } catch (JSONException e10) {
                this.f23871b.d("Generating tracker newInfluenceId JSONObject ", e10);
            }
        }
    }

    public final void w(String str) {
        this.f23875f = str;
    }

    public final void x(JSONArray jSONArray) {
        this.f23874e = jSONArray;
    }

    public final void y(h7.c cVar) {
        this.f23873d = cVar;
    }
}
