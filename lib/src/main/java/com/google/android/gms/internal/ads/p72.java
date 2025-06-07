package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class p72 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13617a;

    p72(Context context) {
        this.f13617a = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        q72 q72Var;
        if (((Boolean) k3.w.c().b(ir.A2)).booleanValue()) {
            q72Var = new q72(androidx.core.content.a.a(this.f13617a, "com.google.android.gms.permission.AD_ID") == 0);
        } else {
            q72Var = null;
        }
        return qa3.h(q72Var);
    }
}
