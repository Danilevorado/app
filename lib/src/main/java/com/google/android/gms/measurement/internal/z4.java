package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z4 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ d f20603m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o5 f20604n;

    z4(o5 o5Var, d dVar) {
        this.f20604n = o5Var;
        this.f20603m = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20604n.f20244m.c();
        if (this.f20603m.f19840o.f() == null) {
            this.f20604n.f20244m.q(this.f20603m);
        } else {
            this.f20604n.f20244m.w(this.f20603m);
        }
    }
}
