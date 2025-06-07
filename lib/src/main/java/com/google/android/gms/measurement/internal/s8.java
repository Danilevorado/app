package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class s8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final long f20398m;

    /* renamed from: n, reason: collision with root package name */
    final long f20399n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ t8 f20400o;

    s8(t8 t8Var, long j10, long j11) {
        this.f20400o = t8Var;
        this.f20398m = j10;
        this.f20399n = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20400o.f20426b.f20269a.B().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.r8
            @Override // java.lang.Runnable
            public final void run() {
                s8 s8Var = this.f20344m;
                t8 t8Var = s8Var.f20400o;
                long j10 = s8Var.f20398m;
                long j11 = s8Var.f20399n;
                t8Var.f20426b.f();
                t8Var.f20426b.f20269a.b().o().a("Application going to the background");
                t8Var.f20426b.f20269a.F().f19934q.a(true);
                Bundle bundle = new Bundle();
                if (!t8Var.f20426b.f20269a.y().D()) {
                    t8Var.f20426b.f20573e.b(j11);
                    t8Var.f20426b.f20573e.d(false, false, j11);
                }
                t8Var.f20426b.f20269a.I().t("auto", "_ab", j10, bundle);
            }
        });
    }
}
