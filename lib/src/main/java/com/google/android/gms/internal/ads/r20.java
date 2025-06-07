package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r20 implements d20 {

    /* renamed from: a, reason: collision with root package name */
    private final f20 f14584a;

    /* renamed from: b, reason: collision with root package name */
    private final g20 f14585b;

    /* renamed from: c, reason: collision with root package name */
    private final z10 f14586c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14587d;

    r20(z10 z10Var, String str, g20 g20Var, f20 f20Var) {
        this.f14586c = z10Var;
        this.f14587d = str;
        this.f14585b = g20Var;
        this.f14584a = f20Var;
    }

    static /* bridge */ /* synthetic */ void d(r20 r20Var, t10 t10Var, a20 a20Var, Object obj, tf0 tf0Var) throws JSONException {
        try {
            j3.t.r();
            String string = UUID.randomUUID().toString();
            fy.f8490o.c(string, new q20(r20Var, t10Var, tf0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", r20Var.f14585b.b(obj));
            a20Var.s0(r20Var.f14587d, jSONObject);
        } catch (Exception e5) {
            try {
                tf0Var.f(e5);
                ze0.e("Unable to invokeJavascript", e5);
            } finally {
                t10Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w93
    public final ab3 a(Object obj) {
        return b(obj);
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final ab3 b(Object obj) {
        tf0 tf0Var = new tf0();
        t10 t10VarB = this.f14586c.b(null);
        t10VarB.e(new o20(this, t10VarB, obj, tf0Var), new p20(this, tf0Var, t10VarB));
        return tf0Var;
    }
}
