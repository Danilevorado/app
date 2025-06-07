package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    private final String f5123a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5124b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f5125c;

    public Purchase(String str, String str2) {
        this.f5123a = str;
        this.f5124b = str2;
        this.f5125c = new JSONObject(str);
    }

    public String a() {
        return this.f5123a;
    }

    public int b() {
        return this.f5125c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String c() {
        JSONObject jSONObject = this.f5125c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String d() {
        return this.f5124b;
    }

    public boolean e() {
        return this.f5125c.optBoolean("acknowledged", true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f5123a, purchase.a()) && TextUtils.equals(this.f5124b, purchase.d());
    }

    public int hashCode() {
        return this.f5123a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5123a));
    }
}
