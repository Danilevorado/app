package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class d8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ x4.f f19865m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g8 f19866n;

    d8(g8 g8Var, x4.f fVar) {
        this.f19866n = g8Var;
        this.f19865m = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f19866n) {
            this.f19866n.f19948m = false;
            if (!this.f19866n.f19950o.y()) {
                this.f19866n.f19950o.f20269a.b().o().a("Connected to remote service");
                this.f19866n.f19950o.v(this.f19865m);
            }
        }
    }
}
