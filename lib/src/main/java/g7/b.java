package g7;

import com.onesignal.r1;
import com.onesignal.w2;
import hb.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rb.h;

/* loaded from: classes.dex */
public final class b extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, r1 r1Var, w2 w2Var) {
        super(cVar, r1Var, w2Var);
        h.e(cVar, "dataRepository");
        h.e(r1Var, "logger");
        h.e(w2Var, "timeProvider");
    }

    @Override // g7.a
    public void a(JSONObject jSONObject, h7.a aVar) {
        h.e(jSONObject, "jsonObject");
        h.e(aVar, "influence");
    }

    @Override // g7.a
    public void b() {
        h7.c cVarK = k();
        if (cVarK == null) {
            cVarK = h7.c.UNATTRIBUTED;
        }
        c cVarF = f();
        if (cVarK == h7.c.DIRECT) {
            cVarK = h7.c.INDIRECT;
        }
        cVarF.a(cVarK);
    }

    @Override // g7.a
    public int c() {
        return f().g();
    }

    @Override // g7.a
    public h7.b d() {
        return h7.b.IAM;
    }

    @Override // g7.a
    public String h() {
        return "iam_id";
    }

    @Override // g7.a
    public int i() {
        return f().f();
    }

    @Override // g7.a
    public JSONArray l() {
        return f().h();
    }

    @Override // g7.a
    public JSONArray m(String str) {
        try {
            JSONArray jSONArrayL = l();
            try {
                JSONArray jSONArray = new JSONArray();
                int i10 = 0;
                int length = jSONArrayL.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        if (!h.a(str, jSONArrayL.getJSONObject(i10).getString(h()))) {
                            jSONArray.put(jSONArrayL.getJSONObject(i10));
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return jSONArray;
            } catch (JSONException e5) {
                o().d("Generating tracker lastChannelObjectReceived get JSONObject ", e5);
                return jSONArrayL;
            }
        } catch (JSONException e10) {
            o().d("Generating IAM tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    @Override // g7.a
    public void p() {
        h7.c cVarE = f().e();
        if (cVarE.l()) {
            x(n());
        }
        q qVar = q.f24177a;
        y(cVarE);
        o().f(h.j("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // g7.a
    public void u(JSONArray jSONArray) {
        h.e(jSONArray, "channelObjects");
        f().p(jSONArray);
    }
}
