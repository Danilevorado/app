package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cg2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    final String f6911a;

    /* renamed from: b, reason: collision with root package name */
    final int f6912b;

    public cg2(String str, int i10) {
        this.f6911a = str;
        this.f6912b = i10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f6911a) || this.f6912b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectF = m3.w0.f(jSONObject, "pii");
            jSONObjectF.put("pvid", this.f6911a);
            jSONObjectF.put("pvid_s", this.f6912b);
        } catch (JSONException e5) {
            m3.n1.l("Failed putting gms core app set ID info.", e5);
        }
    }
}
