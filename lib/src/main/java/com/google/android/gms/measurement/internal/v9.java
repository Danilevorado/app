package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v9 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20498m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20499n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20500o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20501p;

    v9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2) {
        this.f20501p = appMeasurementDynamiteService;
        this.f20498m = i1Var;
        this.f20499n = str;
        this.f20500o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20501p.f19734m.L().T(this.f20498m, this.f20499n, this.f20500o);
    }
}
