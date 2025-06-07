package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c42 implements cz1 {

    /* renamed from: a, reason: collision with root package name */
    private final h52 f6775a;

    public c42(h52 h52Var) {
        this.f6775a = h52Var;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final dz1 a(String str, JSONObject jSONObject) {
        l50 l50VarA = this.f6775a.a(str);
        if (l50VarA == null) {
            return null;
        }
        return new dz1(l50VarA, new y02(), str);
    }
}
