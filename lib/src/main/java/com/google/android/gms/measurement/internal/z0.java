package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f20597m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ a2 f20598n;

    z0(a2 a2Var, long j10) {
        this.f20598n = a2Var;
        this.f20597m = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20598n.o(this.f20597m);
    }
}
