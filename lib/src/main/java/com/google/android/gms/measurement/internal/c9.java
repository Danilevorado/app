package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class c9 extends b9 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f19829c;

    c9(n9 n9Var) {
        super(n9Var);
        this.f19803b.p();
    }

    protected final void g() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.f19829c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f19803b.k();
        this.f19829c = true;
    }

    final boolean i() {
        return this.f19829c;
    }

    protected abstract boolean j();
}
