package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class h5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ v f19971m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ z9 f19972n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ o5 f19973o;

    h5(o5 o5Var, v vVar, z9 z9Var) {
        this.f19973o = o5Var;
        this.f19971m = vVar;
        this.f19972n = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19973o.w3(this.f19973o.L0(this.f19971m, this.f19972n), this.f19972n);
    }
}
