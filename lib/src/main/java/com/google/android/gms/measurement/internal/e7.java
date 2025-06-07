package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f19884m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h7 f19885n;

    e7(h7 h7Var, long j10) {
        this.f19885n = h7Var;
        this.f19884m = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19885n.f20269a.w().l(this.f19884m);
        this.f19885n.f19978e = null;
    }
}
