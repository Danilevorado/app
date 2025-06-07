package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class qr1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f14455a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14456b;

    public qr1(q44 q44Var, q44 q44Var2) {
        this.f14455a = q44Var;
        this.f14456b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            return k4.c.a((Context) this.f14455a.b()).f(((lr1) this.f14456b).b().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
