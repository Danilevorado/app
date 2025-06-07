package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class m6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20177m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20178n;

    m6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f20178n = appMeasurementDynamiteService;
        this.f20177m = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20178n.f19734m.L().R(this.f20177m);
    }
}
