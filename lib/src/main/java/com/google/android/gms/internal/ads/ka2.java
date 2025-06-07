package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ka2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f10936a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f10937b;

    public ka2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f10936a = jSONObject;
        this.f10937b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f10936a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f10937b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
