package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class v4 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ u5 f20473m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ w4 f20474n;

    v4(w4 w4Var, u5 u5Var) {
        this.f20474n = w4Var;
        this.f20473m = u5Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws ClassNotFoundException {
        w4.c(this.f20474n, this.f20473m);
        this.f20474n.k(this.f20473m.f20446g);
    }
}
