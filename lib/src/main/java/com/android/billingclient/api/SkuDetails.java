package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f5129a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f5130b;

    public SkuDetails(String str) {
        this.f5129a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5130b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f5130b.optString("productId");
    }

    public String b() {
        return this.f5130b.optString("type");
    }

    public int c() {
        return this.f5130b.optInt("offer_type");
    }

    public String d() {
        return this.f5130b.optString("offer_id");
    }

    public String e() {
        String strOptString = this.f5130b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f5130b.optString("offer_id_token") : strOptString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f5129a, ((SkuDetails) obj).f5129a);
        }
        return false;
    }

    public final String f() {
        return this.f5130b.optString("packageName");
    }

    public String g() {
        return this.f5130b.optString("serializedDocid");
    }

    final String h() {
        return this.f5130b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f5129a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f5129a));
    }
}
