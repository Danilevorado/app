package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class qg2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f14309a;

    qg2(Context context) {
        this.f14309a = u90.c(context);
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.h(new je2() { // from class: com.google.android.gms.internal.ads.pg2
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) throws JSONException {
                this.f13887a.c((JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void c(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.f14309a);
        } catch (JSONException unused) {
            m3.n1.k("Failed putting version constants.");
        }
    }
}
