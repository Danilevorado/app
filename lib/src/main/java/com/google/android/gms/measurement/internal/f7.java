package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class f7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ a7 f19903m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f19904n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ h7 f19905o;

    f7(h7 h7Var, a7 a7Var, long j10) {
        this.f19905o = h7Var;
        this.f19903m = a7Var;
        this.f19904n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19905o.o(this.f19903m, false, this.f19904n);
        h7 h7Var = this.f19905o;
        h7Var.f19978e = null;
        h7Var.f20269a.L().s(null);
    }
}
