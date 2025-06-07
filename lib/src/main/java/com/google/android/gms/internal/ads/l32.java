package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l32 implements cz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11313a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final qk1 f11314b;

    public l32(qk1 qk1Var) {
        this.f11314b = qk1Var;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final dz1 a(String str, JSONObject jSONObject) {
        dz1 dz1Var;
        synchronized (this) {
            dz1Var = (dz1) this.f11313a.get(str);
            if (dz1Var == null) {
                dz1Var = new dz1(this.f11314b.c(str, jSONObject), new z02(), str);
                this.f11313a.put(str, dz1Var);
            }
        }
        return dz1Var;
    }
}
