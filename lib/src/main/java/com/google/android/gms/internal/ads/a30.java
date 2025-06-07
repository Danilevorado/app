package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a30 implements w93 {

    /* renamed from: a, reason: collision with root package name */
    private final f20 f5932a;

    /* renamed from: b, reason: collision with root package name */
    private final g20 f5933b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5934c = "google.afma.activeView.handleUpdate";

    /* renamed from: d, reason: collision with root package name */
    private final ab3 f5935d;

    a30(ab3 ab3Var, String str, g20 g20Var, f20 f20Var) {
        this.f5935d = ab3Var;
        this.f5933b = g20Var;
        this.f5932a = f20Var;
    }

    @Override // com.google.android.gms.internal.ads.w93
    public final ab3 a(Object obj) {
        return b(obj);
    }

    public final ab3 b(final Object obj) {
        return qa3.m(this.f5935d, new w93() { // from class: com.google.android.gms.internal.ads.y20
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj2) {
                return this.f17865a.c(obj, (a20) obj2);
            }
        }, of0.f13191f);
    }

    final /* synthetic */ ab3 c(Object obj, a20 a20Var) throws JSONException {
        tf0 tf0Var = new tf0();
        j3.t.r();
        String string = UUID.randomUUID().toString();
        fy.f8490o.c(string, new z20(this, tf0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        a20Var.s0(this.f5934c, jSONObject);
        return tf0Var;
    }
}
