package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zu2 {

    /* renamed from: a, reason: collision with root package name */
    private final gv2 f18767a;

    /* renamed from: b, reason: collision with root package name */
    private final gv2 f18768b;

    /* renamed from: c, reason: collision with root package name */
    private final dv2 f18769c;

    /* renamed from: d, reason: collision with root package name */
    private final fv2 f18770d;

    private zu2(dv2 dv2Var, fv2 fv2Var, gv2 gv2Var, gv2 gv2Var2, boolean z10) {
        this.f18769c = dv2Var;
        this.f18770d = fv2Var;
        this.f18767a = gv2Var;
        if (gv2Var2 == null) {
            this.f18768b = gv2.NONE;
        } else {
            this.f18768b = gv2Var2;
        }
    }

    public static zu2 a(dv2 dv2Var, fv2 fv2Var, gv2 gv2Var, gv2 gv2Var2, boolean z10) {
        fw2.b(fv2Var, "ImpressionType is null");
        fw2.b(gv2Var, "Impression owner is null");
        if (gv2Var == gv2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (dv2Var == dv2.DEFINED_BY_JAVASCRIPT && gv2Var == gv2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (fv2Var == fv2.DEFINED_BY_JAVASCRIPT && gv2Var == gv2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zu2(dv2Var, fv2Var, gv2Var, gv2Var2, true);
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        dw2.e(jSONObject, "impressionOwner", this.f18767a);
        dw2.e(jSONObject, "mediaEventsOwner", this.f18768b);
        dw2.e(jSONObject, "creativeType", this.f18769c);
        dw2.e(jSONObject, "impressionType", this.f18770d);
        dw2.e(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
