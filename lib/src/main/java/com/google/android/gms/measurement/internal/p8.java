package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class p8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f20274m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ x8 f20275n;

    p8(x8 x8Var, long j10) {
        this.f20275n = x8Var;
        this.f20274m = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8.p(this.f20275n, this.f20274m);
    }
}
