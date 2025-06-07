package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f19880m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o5 f19881n;

    e5(o5 o5Var, z9 z9Var) {
        this.f19881n = o5Var;
        this.f19880m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19881n.f20244m.c();
        this.f19881n.f20244m.t(this.f19880m);
    }
}
