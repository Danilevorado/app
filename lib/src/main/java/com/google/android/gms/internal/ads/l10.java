package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class l10 implements gy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u00 f11292a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m3.d1 f11293b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z10 f11294c;

    l10(z10 z10Var, bg bgVar, u00 u00Var, m3.d1 d1Var) {
        this.f11294c = z10Var;
        this.f11292a = u00Var;
        this.f11293b = d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.gy, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        synchronized (this.f11294c.f18355a) {
            ze0.f("JS Engine is requesting an update");
            if (this.f11294c.f18363i == 0) {
                ze0.f("Starting reload.");
                this.f11294c.f18363i = 2;
                this.f11294c.d(null);
            }
            this.f11292a.C("/requestReload", this.f11293b.a());
        }
    }
}
