package com.android.billingclient.api;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5185a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5186b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5187c;

    /* synthetic */ c0(JSONObject jSONObject, k1.y yVar) {
        this.f5185a = jSONObject.optString("productId");
        this.f5186b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f5187c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f5185a.equals(c0Var.f5185a) && this.f5186b.equals(c0Var.f5186b) && Objects.equals(this.f5187c, c0Var.f5187c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5185a, this.f5186b, this.f5187c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f5185a, this.f5186b, this.f5187c);
    }
}
