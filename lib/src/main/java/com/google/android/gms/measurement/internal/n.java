package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ r5 f20188m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o f20189n;

    n(o oVar, r5 r5Var) {
        this.f20189n = oVar;
        this.f20188m = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20188m.x();
        if (c.a()) {
            this.f20188m.B().y(this);
            return;
        }
        boolean zE = this.f20189n.e();
        this.f20189n.f20239c = 0L;
        if (zE) {
            this.f20189n.c();
        }
    }
}
