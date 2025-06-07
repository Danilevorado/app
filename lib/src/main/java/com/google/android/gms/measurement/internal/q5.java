package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class q5 extends p5 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f20300b;

    q5(w4 w4Var) {
        super(w4Var);
        this.f20269a.g();
    }

    protected void g() {
    }

    protected abstract boolean h();

    protected final void i() {
        if (!l()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f20300b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        this.f20269a.e();
        this.f20300b = true;
    }

    public final void k() {
        if (this.f20300b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        g();
        this.f20269a.e();
        this.f20300b = true;
    }

    final boolean l() {
        return this.f20300b;
    }
}
