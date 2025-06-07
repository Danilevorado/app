package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fu1 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f8437a;

    /* renamed from: b, reason: collision with root package name */
    private final au1 f8438b;

    /* renamed from: c, reason: collision with root package name */
    private final ls2 f8439c;

    fu1(bb3 bb3Var, au1 au1Var, ls2 ls2Var) {
        this.f8437a = bb3Var;
        this.f8438b = au1Var;
        this.f8439c = ls2Var;
    }

    public final ab3 a(final k90 k90Var) {
        cs2 cs2VarB = this.f8439c.b(fs2.GMS_SIGNALS, qa3.l(qa3.h(null), new w23() { // from class: com.google.android.gms.internal.ads.cu1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                k90 k90Var2 = k90Var;
                return new o80(k90Var2.f10915o, k90Var2.f10916p, k90Var2.f10918r, y33.c(k90Var2.f10913m.getString("ms")), -1, k90Var2.f10920t, k90Var2.f10917q, k90Var2.f10923w, k90Var2.f10924x);
            }
        }, this.f8437a));
        final au1 au1Var = this.f8438b;
        return qa3.l(cs2VarB.f(new w93() { // from class: com.google.android.gms.internal.ads.du1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return au1Var.b((o80) obj);
            }
        }).a(), new w23() { // from class: com.google.android.gms.internal.ads.eu1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = k90Var.f10913m;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectJ = k3.t.b().j(bundle);
                    try {
                        k3.t.b().m(jSONObject, jSONObjectJ);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectJ;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.f8437a);
    }
}
