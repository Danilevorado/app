package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    private final String f5126a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5127b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f5128c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f5126a = str;
        this.f5127b = str2;
        this.f5128c = new JSONObject(str);
    }

    public String a() {
        return this.f5126a;
    }

    public String b() {
        JSONObject jSONObject = this.f5128c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String c() {
        return this.f5127b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f5126a, purchaseHistoryRecord.a()) && TextUtils.equals(this.f5127b, purchaseHistoryRecord.c());
    }

    public int hashCode() {
        return this.f5126a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f5126a));
    }
}
