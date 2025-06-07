package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class n8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ n9 f20208m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Runnable f20209n;

    n8(o8 o8Var, n9 n9Var, Runnable runnable) {
        this.f20208m = n9Var;
        this.f20209n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20208m.c();
        this.f20208m.l0(this.f20209n);
        this.f20208m.C();
    }
}
