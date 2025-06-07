package j7;

import com.onesignal.h3;
import com.onesignal.r1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r1 r1Var, a aVar, j jVar) {
        super(r1Var, aVar, jVar);
        rb.h.e(r1Var, "logger");
        rb.h.e(aVar, "outcomeEventsCache");
        rb.h.e(jVar, "outcomeEventsService");
    }

    @Override // k7.c
    public void i(String str, int i10, k7.b bVar, h3 h3Var) throws JSONException {
        rb.h.e(str, "appId");
        rb.h.e(bVar, "event");
        rb.h.e(h3Var, "responseHandler");
        try {
            JSONObject jSONObjectPut = bVar.g().put("app_id", str).put("device_type", i10);
            j jVarK = k();
            rb.h.d(jSONObjectPut, "jsonObject");
            jVarK.a(jSONObjectPut, h3Var);
        } catch (JSONException e5) {
            j().d("Generating indirect outcome:JSON Failed.", e5);
        }
    }
}
