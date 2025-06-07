package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class b8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ x4.f f19801m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g8 f19802n;

    b8(g8 g8Var, x4.f fVar) {
        this.f19802n = g8Var;
        this.f19801m = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f19802n) {
            this.f19802n.f19948m = false;
            if (!this.f19802n.f19950o.y()) {
                this.f19802n.f19950o.f20269a.b().t().a("Connected to service");
                this.f19802n.f19950o.v(this.f19801m);
            }
        }
    }
}
