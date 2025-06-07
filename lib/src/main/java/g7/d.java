package g7;

import com.onesignal.r1;
import com.onesignal.w2;
import hb.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rb.h;

/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, r1 r1Var, w2 w2Var) {
        super(cVar, r1Var, w2Var);
        h.e(cVar, "dataRepository");
        h.e(r1Var, "logger");
        h.e(w2Var, "timeProvider");
    }

    @Override // g7.a
    public void a(JSONObject jSONObject, h7.a aVar) throws JSONException {
        h.e(jSONObject, "jsonObject");
        h.e(aVar, "influence");
        if (aVar.d().d()) {
            try {
                jSONObject.put("direct", aVar.d().g());
                jSONObject.put("notification_ids", aVar.b());
            } catch (JSONException e5) {
                o().d("Generating notification tracker addSessionData JSONObject ", e5);
            }
        }
    }

    @Override // g7.a
    public void b() {
        c cVarF = f();
        h7.c cVarK = k();
        if (cVarK == null) {
            cVarK = h7.c.UNATTRIBUTED;
        }
        cVarF.b(cVarK);
        f().c(g());
    }

    @Override // g7.a
    public int c() {
        return f().l();
    }

    @Override // g7.a
    public h7.b d() {
        return h7.b.NOTIFICATION;
    }

    @Override // g7.a
    public String h() {
        return "notification_id";
    }

    @Override // g7.a
    public int i() {
        return f().k();
    }

    @Override // g7.a
    public JSONArray l() {
        return f().i();
    }

    @Override // g7.a
    public JSONArray m(String str) {
        try {
            return l();
        } catch (JSONException e5) {
            o().d("Generating Notification tracker getLastChannelObjects JSONObject ", e5);
            return new JSONArray();
        }
    }

    @Override // g7.a
    public void p() {
        h7.c cVarJ = f().j();
        if (cVarJ.l()) {
            x(n());
        } else if (cVarJ.g()) {
            w(f().d());
        }
        q qVar = q.f24177a;
        y(cVarJ);
        o().f(h.j("OneSignal NotificationTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // g7.a
    public void u(JSONArray jSONArray) {
        h.e(jSONArray, "channelObjects");
        f().r(jSONArray);
    }
}
