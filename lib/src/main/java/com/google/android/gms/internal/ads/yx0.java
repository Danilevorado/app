package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class yx0 implements l3.t {

    /* renamed from: m, reason: collision with root package name */
    private final t21 f18304m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f18305n = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f18306o = new AtomicBoolean(false);

    public yx0(t21 t21Var) {
        this.f18304m = t21Var;
    }

    private final void d() {
        if (this.f18306o.get()) {
            return;
        }
        this.f18306o.set(true);
        this.f18304m.a();
    }

    @Override // l3.t
    public final void C(int i10) {
        this.f18305n.set(true);
        d();
    }

    @Override // l3.t
    public final void L0() {
    }

    public final boolean a() {
        return this.f18305n.get();
    }

    @Override // l3.t
    public final void b() {
        this.f18304m.d();
    }

    @Override // l3.t
    public final void c() {
    }

    @Override // l3.t
    public final void w0() {
    }

    @Override // l3.t
    public final void x4() {
        d();
    }
}
