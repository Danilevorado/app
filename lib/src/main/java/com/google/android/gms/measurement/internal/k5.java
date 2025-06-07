package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class k5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ q9 f20123m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ z9 f20124n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ o5 f20125o;

    k5(o5 o5Var, q9 q9Var, z9 z9Var) {
        this.f20125o = o5Var;
        this.f20123m = q9Var;
        this.f20124n = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20125o.f20244m.c();
        if (this.f20123m.f() == null) {
            this.f20125o.f20244m.s(this.f20123m, this.f20124n);
        } else {
            this.f20125o.f20244m.A(this.f20123m, this.f20124n);
        }
    }
}
