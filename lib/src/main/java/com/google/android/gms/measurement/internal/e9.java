package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e9 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ o9 f19887m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ n9 f19888n;

    e9(n9 n9Var, o9 o9Var) {
        this.f19888n = n9Var;
        this.f19887m = o9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n9.k0(this.f19888n, this.f19887m);
        this.f19888n.v();
    }
}
