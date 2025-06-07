package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class z20 implements ty {

    /* renamed from: a, reason: collision with root package name */
    private final tf0 f18374a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a30 f18375b;

    public z20(a30 a30Var, tf0 tf0Var) {
        this.f18375b = a30Var;
        this.f18374a = tf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void a(JSONObject jSONObject) {
        try {
            this.f18374a.e(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e5) {
            this.f18374a.f(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void o(String str) {
        try {
            if (str == null) {
                this.f18374a.f(new c20());
            } else {
                this.f18374a.f(new c20(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
