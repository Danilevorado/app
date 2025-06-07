package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f5213a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f5214b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5215c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5216a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5217b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5218c;

        private a(JSONObject jSONObject) {
            this.f5216a = jSONObject.optString("productId");
            this.f5217b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f5218c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public String a() {
            return this.f5216a;
        }

        public String b() {
            return this.f5218c;
        }

        public String c() {
            return this.f5217b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5216a.equals(aVar.a()) && this.f5217b.equals(aVar.c()) && Objects.equals(this.f5218c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f5216a, this.f5217b, this.f5218c);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f5216a, this.f5217b, this.f5218c);
        }
    }

    g(String str) {
        this.f5213a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f5214b = jSONObject;
        this.f5215c = a(jSONObject.optJSONArray("products"));
    }

    private static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }
}
