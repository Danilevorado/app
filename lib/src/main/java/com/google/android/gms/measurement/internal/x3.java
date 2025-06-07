package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class x3 extends b3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f20556b;

    x3(w4 w4Var) {
        super(w4Var);
        this.f20269a.g();
    }

    protected final void g() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.f20556b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (l()) {
            return;
        }
        this.f20269a.e();
        this.f20556b = true;
    }

    public final void i() {
        if (this.f20556b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f20269a.e();
        this.f20556b = true;
    }

    protected void j() {
    }

    final boolean k() {
        return this.f20556b;
    }

    protected abstract boolean l();
}
