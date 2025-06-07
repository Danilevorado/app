package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class j8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20095m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20096n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20097o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f20098p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f20099q;

    j8(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.i1 i1Var, String str, String str2, boolean z10) {
        this.f20099q = appMeasurementDynamiteService;
        this.f20095m = i1Var;
        this.f20096n = str;
        this.f20097o = str2;
        this.f20098p = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20099q.f19734m.L().V(this.f20095m, this.f20096n, this.f20097o, this.f20098p);
    }
}
