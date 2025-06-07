package j7;

import com.onesignal.e2;
import com.onesignal.h3;
import com.onesignal.r1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e extends d {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24554a;

        static {
            int[] iArr = new int[h7.c.values().length];
            iArr[h7.c.DIRECT.ordinal()] = 1;
            iArr[h7.c.INDIRECT.ordinal()] = 2;
            iArr[h7.c.UNATTRIBUTED.ordinal()] = 3;
            f24554a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r1 r1Var, j7.a aVar, j jVar) {
        super(r1Var, aVar, jVar);
        rb.h.e(r1Var, "logger");
        rb.h.e(aVar, "outcomeEventsCache");
        rb.h.e(jVar, "outcomeEventsService");
    }

    private final void l(String str, int i10, e2 e2Var, h3 h3Var) throws JSONException {
        try {
            JSONObject jSONObjectPut = e2Var.c().put("app_id", str).put("device_type", i10).put("direct", true);
            j jVarK = k();
            rb.h.d(jSONObjectPut, "jsonObject");
            jVarK.a(jSONObjectPut, h3Var);
        } catch (JSONException e5) {
            j().d("Generating direct outcome:JSON Failed.", e5);
        }
    }

    private final void m(String str, int i10, e2 e2Var, h3 h3Var) throws JSONException {
        try {
            JSONObject jSONObjectPut = e2Var.c().put("app_id", str).put("device_type", i10).put("direct", false);
            j jVarK = k();
            rb.h.d(jSONObjectPut, "jsonObject");
            jVarK.a(jSONObjectPut, h3Var);
        } catch (JSONException e5) {
            j().d("Generating indirect outcome:JSON Failed.", e5);
        }
    }

    private final void n(String str, int i10, e2 e2Var, h3 h3Var) throws JSONException {
        try {
            JSONObject jSONObjectPut = e2Var.c().put("app_id", str).put("device_type", i10);
            j jVarK = k();
            rb.h.d(jSONObjectPut, "jsonObject");
            jVarK.a(jSONObjectPut, h3Var);
        } catch (JSONException e5) {
            j().d("Generating unattributed outcome:JSON Failed.", e5);
        }
    }

    @Override // k7.c
    public void i(String str, int i10, k7.b bVar, h3 h3Var) throws JSONException {
        rb.h.e(str, "appId");
        rb.h.e(bVar, "eventParams");
        rb.h.e(h3Var, "responseHandler");
        e2 e2VarA = e2.a(bVar);
        h7.c cVarB = e2VarA.b();
        int i11 = cVarB == null ? -1 : a.f24554a[cVarB.ordinal()];
        if (i11 == 1) {
            rb.h.d(e2VarA, "event");
            l(str, i10, e2VarA, h3Var);
        } else if (i11 == 2) {
            rb.h.d(e2VarA, "event");
            m(str, i10, e2VarA, h3Var);
        } else {
            if (i11 != 3) {
                return;
            }
            rb.h.d(e2VarA, "event");
            n(str, i10, e2VarA, h3Var);
        }
    }
}
