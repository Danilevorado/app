package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gu0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f8883a;

    public gu0(q44 q44Var) {
        this.f8883a = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            return new JSONObject(((ux0) this.f8883a).a().A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
