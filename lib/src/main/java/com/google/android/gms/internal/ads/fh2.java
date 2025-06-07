package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fh2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f8288a;

    public fh2(Bundle bundle) {
        this.f8288a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f8288a != null) {
            try {
                m3.w0.f(m3.w0.f(jSONObject, "device"), "play_store").put("parental_controls", k3.t.b().j(this.f8288a));
            } catch (JSONException unused) {
                m3.n1.k("Failed putting parental controls bundle.");
            }
        }
    }
}
