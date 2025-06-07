package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wh2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17134a;

    public wh2(String str) {
        this.f17134a = str;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f17134a)) {
                return;
            }
            m3.w0.f(jSONObject, "pii").put("adsid", this.f17134a);
        } catch (JSONException e5) {
            ze0.h("Failed putting trustless token.", e5);
        }
    }
}
