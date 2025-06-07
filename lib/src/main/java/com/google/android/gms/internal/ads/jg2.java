package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jg2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10475a;

    public jg2(String str) {
        this.f10475a = str;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectF = m3.w0.f((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.f10475a)) {
                return;
            }
            jSONObjectF.put("attok", this.f10475a);
        } catch (JSONException e5) {
            m3.n1.l("Failed putting attestation token.", e5);
        }
    }
}
