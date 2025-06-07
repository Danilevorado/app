package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class j9 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ x9 f20100m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20101n;

    j9(AppMeasurementDynamiteService appMeasurementDynamiteService, x9 x9Var) {
        this.f20101n = appMeasurementDynamiteService;
        this.f20100m = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20101n.f19734m.I().H(this.f20100m);
    }
}
