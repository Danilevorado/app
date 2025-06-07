package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f20601m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ a4 f20602n;

    z3(a4 a4Var, boolean z10) {
        this.f20602n = a4Var;
        this.f20601m = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20602n.f19746a.m(this.f20601m);
    }
}
