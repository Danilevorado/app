package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ns0 implements gs0 {

    /* renamed from: a, reason: collision with root package name */
    private final xp1 f12840a;

    ns0(xp1 xp1Var) {
        this.f12840a = xp1Var;
    }

    @Override // com.google.android.gms.internal.ads.gs0
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) k3.w.c().b(ir.B8)).booleanValue()) {
                this.f12840a.l(jSONObject);
            }
        }
    }
}
