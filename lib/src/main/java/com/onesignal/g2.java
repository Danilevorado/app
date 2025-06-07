package com.onesignal;

import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g2 implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    private d2 f22031m = new d2("changed", false);

    /* renamed from: n, reason: collision with root package name */
    private boolean f22032n;

    g2(boolean z10) {
        if (z10) {
            this.f22032n = n3.b(n3.f22119a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            d();
        }
    }

    private void f(boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z11 = this.f22032n != z10;
        this.f22032n = z10;
        if (z11) {
            this.f22031m.c(this);
        }
    }

    public boolean a() {
        return this.f22032n;
    }

    public d2 b() {
        return this.f22031m;
    }

    void c() {
        n3.j(n3.f22119a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.f22032n);
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    void d() {
        f(OSUtils.a(e3.f21882e));
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f22032n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return g().toString();
    }
}
