package com.onesignal;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class k2 implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    private d2 f22094m = new d2("changed", false);

    /* renamed from: n, reason: collision with root package name */
    private String f22095n;

    /* renamed from: o, reason: collision with root package name */
    private String f22096o;

    k2(boolean z10) {
        String strE;
        if (z10) {
            String str = n3.f22119a;
            this.f22095n = n3.f(str, "PREFS_OS_SMS_ID_LAST", null);
            strE = n3.f(str, "PREFS_OS_SMS_NUMBER_LAST", null);
        } else {
            this.f22095n = e3.r0();
            strE = s3.f().E();
        }
        this.f22096o = strE;
    }

    public d2 a() {
        return this.f22094m;
    }

    public String b() {
        return this.f22096o;
    }

    public String c() {
        return this.f22095n;
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean d() {
        return (this.f22095n == null || this.f22096o == null) ? false : true;
    }

    void f() {
        String str = n3.f22119a;
        n3.m(str, "PREFS_OS_SMS_ID_LAST", this.f22095n);
        n3.m(str, "PREFS_OS_SMS_NUMBER_LAST", this.f22096o);
    }

    void g(String str) {
        boolean z10 = true;
        String str2 = this.f22095n;
        if (str != null ? str.equals(str2) : str2 == null) {
            z10 = false;
        }
        this.f22095n = str;
        if (z10) {
            this.f22094m.c(this);
        }
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f22095n;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("smsUserId", obj);
            Object obj2 = this.f22096o;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("smsNumber", obj2);
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
