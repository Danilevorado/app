package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class h13 extends u13 {

    /* renamed from: m, reason: collision with root package name */
    private final n13 f8955m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ i13 f8956n;

    h13(i13 i13Var, n13 n13Var) {
        this.f8956n = i13Var;
        this.f8955m = n13Var;
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void t2(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        l13 l13VarC = m13.c();
        l13VarC.b(i10);
        if (string != null) {
            l13VarC.a(string);
        }
        this.f8955m.a(l13VarC.c());
        if (i10 == 8157) {
            this.f8956n.c();
        }
    }
}
