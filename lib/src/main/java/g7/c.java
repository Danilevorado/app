package g7;

import com.onesignal.n2;
import com.onesignal.o3;
import org.json.JSONArray;
import rb.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final n2 f23876a;

    public c(n2 n2Var) {
        h.e(n2Var, "preferences");
        this.f23876a = n2Var;
    }

    public final void a(h7.c cVar) {
        h.e(cVar, "influenceType");
        n2 n2Var = this.f23876a;
        n2Var.b(n2Var.h(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", cVar.toString());
    }

    public final void b(h7.c cVar) {
        h.e(cVar, "influenceType");
        n2 n2Var = this.f23876a;
        n2Var.b(n2Var.h(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", cVar.toString());
    }

    public final void c(String str) {
        n2 n2Var = this.f23876a;
        n2Var.b(n2Var.h(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    public final String d() {
        n2 n2Var = this.f23876a;
        return n2Var.g(n2Var.h(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    public final h7.c e() {
        String string = h7.c.UNATTRIBUTED.toString();
        n2 n2Var = this.f23876a;
        return h7.c.f24092m.a(n2Var.g(n2Var.h(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", string));
    }

    public final int f() {
        n2 n2Var = this.f23876a;
        return n2Var.e(n2Var.h(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int g() {
        n2 n2Var = this.f23876a;
        return n2Var.e(n2Var.h(), "PREFS_OS_IAM_LIMIT", 10);
    }

    public final JSONArray h() {
        n2 n2Var = this.f23876a;
        String strG = n2Var.g(n2Var.h(), "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        JSONArray jSONArray = strG == null ? null : new JSONArray(strG);
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final JSONArray i() {
        n2 n2Var = this.f23876a;
        String strG = n2Var.g(n2Var.h(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        JSONArray jSONArray = strG == null ? null : new JSONArray(strG);
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final h7.c j() {
        n2 n2Var = this.f23876a;
        return h7.c.f24092m.a(n2Var.g(n2Var.h(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", h7.c.UNATTRIBUTED.toString()));
    }

    public final int k() {
        n2 n2Var = this.f23876a;
        return n2Var.e(n2Var.h(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int l() {
        n2 n2Var = this.f23876a;
        return n2Var.e(n2Var.h(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final boolean m() {
        n2 n2Var = this.f23876a;
        return n2Var.f(n2Var.h(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean n() {
        n2 n2Var = this.f23876a;
        return n2Var.f(n2Var.h(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean o() {
        n2 n2Var = this.f23876a;
        return n2Var.f(n2Var.h(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void p(JSONArray jSONArray) {
        h.e(jSONArray, "iams");
        n2 n2Var = this.f23876a;
        n2Var.b(n2Var.h(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    public final void q(o3.e eVar) {
        h.e(eVar, "influenceParams");
        n2 n2Var = this.f23876a;
        n2Var.c(n2Var.h(), "PREFS_OS_DIRECT_ENABLED", eVar.e());
        n2 n2Var2 = this.f23876a;
        n2Var2.c(n2Var2.h(), "PREFS_OS_INDIRECT_ENABLED", eVar.f());
        n2 n2Var3 = this.f23876a;
        n2Var3.c(n2Var3.h(), "PREFS_OS_UNATTRIBUTED_ENABLED", eVar.g());
        n2 n2Var4 = this.f23876a;
        n2Var4.a(n2Var4.h(), "PREFS_OS_NOTIFICATION_LIMIT", eVar.d());
        n2 n2Var5 = this.f23876a;
        n2Var5.a(n2Var5.h(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", eVar.c());
        n2 n2Var6 = this.f23876a;
        n2Var6.a(n2Var6.h(), "PREFS_OS_IAM_LIMIT", eVar.a());
        n2 n2Var7 = this.f23876a;
        n2Var7.a(n2Var7.h(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", eVar.b());
    }

    public final void r(JSONArray jSONArray) {
        h.e(jSONArray, "notifications");
        n2 n2Var = this.f23876a;
        n2Var.b(n2Var.h(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
