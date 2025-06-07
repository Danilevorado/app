package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ln0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11671a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11672b;

    public ln0(q44 q44Var, q44 q44Var2) {
        this.f11671a = q44Var;
        this.f11672b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v90 b() {
        Context contextA = ((qm0) this.f11671a).a();
        cu2 cu2Var = (cu2) this.f11672b.b();
        n20 n20VarB = j3.t.h().b(contextA, ff0.f(), cu2Var);
        h20 h20Var = k20.f10786b;
        n20VarB.a("google.afma.request.getAdDictionary", h20Var, h20Var);
        return new u90(contextA, j3.t.h().b(contextA, ff0.f(), cu2Var).a("google.afma.sdkConstants.getSdkConstants", h20Var, h20Var));
    }
}
