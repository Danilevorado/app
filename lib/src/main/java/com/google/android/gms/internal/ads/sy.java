package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class sy implements ty {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ tf0 f15591a;

    sy(uy uyVar, tf0 tf0Var) {
        this.f15591a = tf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void a(JSONObject jSONObject) {
        this.f15591a.e(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void o(String str) {
        this.f15591a.f(new c20(str));
    }
}
