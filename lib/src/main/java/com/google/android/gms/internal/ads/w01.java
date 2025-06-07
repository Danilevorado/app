package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class w01 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final u01 f16924a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16925b;

    public w01(u01 u01Var, q44 q44Var) {
        this.f16924a = u01Var;
        this.f16925b = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = this.f16924a.a(((qm0) this.f16925b).a());
        k44.b(contextA);
        return contextA;
    }
}
