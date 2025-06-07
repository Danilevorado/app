package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q12 implements cz1 {

    /* renamed from: a, reason: collision with root package name */
    private final qk1 f14117a;

    public q12(qk1 qk1Var) {
        this.f14117a = qk1Var;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final dz1 a(String str, JSONObject jSONObject) {
        return new dz1(this.f14117a.c(str, jSONObject), new y02(), str);
    }
}
