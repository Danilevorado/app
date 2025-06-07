package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ng2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f12614a;

    public ng2(JSONObject jSONObject) {
        this.f12614a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("cache_state", this.f12614a);
        } catch (JSONException unused) {
            m3.n1.k("Unable to get cache_state");
        }
    }
}
