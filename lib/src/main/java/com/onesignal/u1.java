package com.onesignal;

import android.content.Context;
import com.onesignal.e3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final x1 f22467a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22468b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22469c;

    u1(Context context, s1 s1Var, JSONObject jSONObject, boolean z10, boolean z11, Long l10) {
        this.f22468b = z10;
        this.f22469c = z11;
        this.f22467a = a(context, s1Var, jSONObject, l10);
    }

    u1(x1 x1Var, boolean z10, boolean z11) {
        this.f22468b = z10;
        this.f22469c = z11;
        this.f22467a = x1Var;
    }

    private x1 a(Context context, s1 s1Var, JSONObject jSONObject, Long l10) {
        x1 x1Var = new x1(context);
        x1Var.q(jSONObject);
        x1Var.z(l10);
        x1Var.y(this.f22468b);
        x1Var.r(s1Var);
        return x1Var;
    }

    private void e(s1 s1Var) throws JSONException {
        this.f22467a.r(s1Var);
        if (this.f22468b) {
            j0.e(this.f22467a);
            return;
        }
        this.f22467a.p(false);
        j0.n(this.f22467a, true, false);
        e3.K0(this.f22467a);
    }

    static void h(Context context) throws IllegalAccessException, InstantiationException {
        String strF = OSUtils.f(context, "com.onesignal.NotificationServiceExtension");
        if (strF == null) {
            e3.i1(e3.z.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        e3.i1(e3.z.VERBOSE, "Found class: " + strF + ", attempting to call constructor");
        try {
            Class.forName(strF).newInstance();
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }

    public x1 b() {
        return this.f22467a;
    }

    public c2 c() {
        return new c2(this, this.f22467a.f());
    }

    public boolean d() {
        if (e3.p0().l()) {
            return this.f22467a.f().j() + ((long) this.f22467a.f().n()) > e3.B0().b() / 1000;
        }
        return true;
    }

    void f(s1 s1Var, s1 s1Var2) {
        if (s1Var2 == null) {
            e(s1Var);
            return;
        }
        boolean zI = OSUtils.I(s1Var2.f());
        boolean zD = d();
        if (zI && zD) {
            this.f22467a.r(s1Var2);
            j0.k(this, this.f22469c);
        } else {
            e(s1Var);
        }
        if (this.f22468b) {
            OSUtils.V(100);
        }
    }

    public void g(boolean z10) {
        this.f22469c = z10;
    }

    public String toString() {
        return "OSNotificationController{notificationJob=" + this.f22467a + ", isRestoring=" + this.f22468b + ", isBackgroundLogic=" + this.f22469c + '}';
    }
}
