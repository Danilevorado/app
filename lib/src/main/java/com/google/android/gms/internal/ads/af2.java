package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import h3.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class af2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0142a f6064a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6065b;

    /* renamed from: c, reason: collision with root package name */
    private final c03 f6066c;

    public af2(a.C0142a c0142a, String str, c03 c03Var) {
        this.f6064a = c0142a;
        this.f6065b = str;
        this.f6066c = c03Var;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectF = m3.w0.f((JSONObject) obj, "pii");
            a.C0142a c0142a = this.f6064a;
            if (c0142a == null || TextUtils.isEmpty(c0142a.a())) {
                String str = this.f6065b;
                if (str != null) {
                    jSONObjectF.put("pdid", str);
                    jSONObjectF.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectF.put("rdid", this.f6064a.a());
            jSONObjectF.put("is_lat", this.f6064a.b());
            jSONObjectF.put("idtype", "adid");
            c03 c03Var = this.f6066c;
            if (c03Var.c()) {
                jSONObjectF.put("paidv1_id_android_3p", c03Var.b());
                jSONObjectF.put("paidv1_creation_time_android_3p", this.f6066c.a());
            }
        } catch (JSONException e5) {
            m3.n1.l("Failed putting Ad ID.", e5);
        }
    }
}
