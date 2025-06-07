package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ug2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16329a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16330b;

    public ug2(String str, String str2) {
        this.f16329a = str;
        this.f16330b = str2;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectF = m3.w0.f((JSONObject) obj, "pii");
            jSONObjectF.put("doritos", this.f16329a);
            jSONObjectF.put("doritos_v2", this.f16330b);
        } catch (JSONException unused) {
            m3.n1.k("Failed putting doritos string.");
        }
    }
}
