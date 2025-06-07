package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class j7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20091m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v f20092n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20093o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20094p;

    j7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, v vVar, String str) {
        this.f20094p = appMeasurementDynamiteService;
        this.f20091m = i1Var;
        this.f20092n = vVar;
        this.f20093o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20094p.f19734m.L().n(this.f20091m, this.f20092n, this.f20093o);
    }
}
