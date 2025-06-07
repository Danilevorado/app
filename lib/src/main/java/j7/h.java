package j7;

import com.onesignal.f3;
import com.onesignal.h3;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f3 f3Var) {
        super(f3Var);
        rb.h.e(f3Var, "client");
    }

    @Override // j7.j
    public void a(JSONObject jSONObject, h3 h3Var) {
        rb.h.e(jSONObject, "jsonObject");
        rb.h.e(h3Var, "responseHandler");
        b().a("outcomes/measure_sources", jSONObject, h3Var);
    }
}
