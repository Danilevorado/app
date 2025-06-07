package com.onesignal;

import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OSSubscriptionState implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    private d2 f21652m = new d2("changed", false);

    /* renamed from: n, reason: collision with root package name */
    private String f21653n;

    /* renamed from: o, reason: collision with root package name */
    private String f21654o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21655p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21656q;

    OSSubscriptionState(boolean z10, boolean z11) {
        if (!z10) {
            this.f21656q = !s3.j();
            this.f21653n = e3.E0();
            this.f21654o = s3.e();
            this.f21655p = z11;
            return;
        }
        String str = n3.f22119a;
        this.f21656q = n3.b(str, "ONESIGNAL_SUBSCRIPTION_LAST", true);
        this.f21653n = n3.f(str, "ONESIGNAL_PLAYER_ID_LAST", null);
        this.f21654o = n3.f(str, "ONESIGNAL_PUSH_TOKEN_LAST", null);
        this.f21655p = n3.b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
    }

    private void j(boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zG = g();
        this.f21655p = z10;
        if (zG != g()) {
            this.f21652m.c(this);
        }
    }

    boolean a(OSSubscriptionState oSSubscriptionState) {
        if (this.f21656q == oSSubscriptionState.f21656q) {
            String str = this.f21653n;
            if (str == null) {
                str = "";
            }
            String str2 = oSSubscriptionState.f21653n;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                String str3 = this.f21654o;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = oSSubscriptionState.f21654o;
                if (str3.equals(str4 != null ? str4 : "") && this.f21655p == oSSubscriptionState.f21655p) {
                    return false;
                }
            }
        }
        return true;
    }

    public d2 b() {
        return this.f21652m;
    }

    public String c() {
        return this.f21654o;
    }

    void changed(g2 g2Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        j(g2Var.a());
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String d() {
        return this.f21653n;
    }

    public boolean f() {
        return this.f21656q;
    }

    public boolean g() {
        return (this.f21653n == null || this.f21654o == null || this.f21656q || !this.f21655p) ? false : true;
    }

    void i() {
        String str = n3.f22119a;
        n3.j(str, "ONESIGNAL_SUBSCRIPTION_LAST", this.f21656q);
        n3.m(str, "ONESIGNAL_PLAYER_ID_LAST", this.f21653n);
        n3.m(str, "ONESIGNAL_PUSH_TOKEN_LAST", this.f21654o);
        n3.j(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.f21655p);
    }

    void k(String str) {
        if (str == null) {
            return;
        }
        boolean z10 = !str.equals(this.f21654o);
        this.f21654o = str;
        if (z10) {
            this.f21652m.c(this);
        }
    }

    void m(String str) {
        boolean z10 = true;
        String str2 = this.f21653n;
        if (str != null ? str.equals(str2) : str2 == null) {
            z10 = false;
        }
        this.f21653n = str;
        if (z10) {
            this.f21652m.c(this);
        }
    }

    public JSONObject r() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f21653n;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("userId", obj);
            Object obj2 = this.f21654o;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("pushToken", obj2);
            jSONObject.put("isPushDisabled", f());
            jSONObject.put("isSubscribed", g());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return r().toString();
    }
}
