package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class w0 implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    private d2 f22490m = new d2("changed", false);

    /* renamed from: n, reason: collision with root package name */
    private String f22491n;

    /* renamed from: o, reason: collision with root package name */
    private String f22492o;

    w0(boolean z10) {
        String strE;
        if (z10) {
            String str = n3.f22119a;
            this.f22491n = n3.f(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", null);
            strE = n3.f(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", null);
        } else {
            this.f22491n = e3.c0();
            strE = s3.b().E();
        }
        this.f22492o = strE;
    }

    public String a() {
        return this.f22492o;
    }

    public String b() {
        return this.f22491n;
    }

    public d2 c() {
        return this.f22490m;
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean d() {
        return (this.f22491n == null || this.f22492o == null) ? false : true;
    }

    void f() {
        String str = n3.f22119a;
        n3.m(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.f22491n);
        n3.m(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.f22492o);
    }

    void g(String str) {
        boolean z10 = true;
        String str2 = this.f22491n;
        if (str != null ? str.equals(str2) : str2 == null) {
            z10 = false;
        }
        this.f22491n = str;
        if (z10) {
            this.f22490m.c(this);
        }
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f22491n;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("emailUserId", obj);
            Object obj2 = this.f22492o;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("emailAddress", obj2);
            jSONObject.put("isSubscribed", d());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return i().toString();
    }
}
