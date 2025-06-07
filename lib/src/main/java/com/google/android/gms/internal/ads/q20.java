package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class q20 implements ty {

    /* renamed from: a, reason: collision with root package name */
    private final t10 f14118a;

    /* renamed from: b, reason: collision with root package name */
    private final tf0 f14119b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r20 f14120c;

    public q20(r20 r20Var, t10 t10Var, tf0 tf0Var) {
        this.f14120c = r20Var;
        this.f14118a = t10Var;
        this.f14119b = tf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void a(JSONObject jSONObject) {
        try {
            try {
                this.f14119b.e(this.f14120c.f14584a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e5) {
                this.f14119b.f(e5);
            }
        } finally {
            this.f14118a.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void o(String str) {
        try {
            if (str == null) {
                this.f14119b.f(new c20());
            } else {
                this.f14119b.f(new c20(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f14118a.g();
            throw th;
        }
        this.f14118a.g();
    }
}
