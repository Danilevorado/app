package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ag0 {

    /* renamed from: a, reason: collision with root package name */
    private final tf0 f6075a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f6076b;

    public ag0() {
        tf0 tf0Var = new tf0();
        this.f6075a = tf0Var;
        this.f6076b = new AtomicInteger(0);
        qa3.q(tf0Var, new yf0(this), of0.f13191f);
    }

    public final int a() {
        return this.f6076b.get();
    }

    public final void c() {
        this.f6075a.f(new Exception());
    }

    public final void d(Object obj) {
        this.f6075a.e(obj);
    }

    public final void e(xf0 xf0Var, vf0 vf0Var) {
        qa3.q(this.f6075a, new zf0(this, xf0Var, vf0Var), of0.f13191f);
    }
}
