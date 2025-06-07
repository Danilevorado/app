package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class q8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f20311m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ x8 f20312n;

    q8(x8 x8Var, long j10) {
        this.f20312n = x8Var;
        this.f20311m = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8.o(this.f20312n, this.f20311m);
    }
}
