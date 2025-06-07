package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w9 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20550m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20551n;

    w9(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f20551n = appMeasurementDynamiteService;
        this.f20550m = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20551n.f19734m.N().D(this.f20550m, this.f20551n.f19734m.l());
    }
}
