package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sw0 implements a31, nj {

    /* renamed from: m, reason: collision with root package name */
    private final hn2 f15576m;

    /* renamed from: n, reason: collision with root package name */
    private final d21 f15577n;

    /* renamed from: o, reason: collision with root package name */
    private final k31 f15578o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f15579p = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f15580q = new AtomicBoolean();

    public sw0(hn2 hn2Var, d21 d21Var, k31 k31Var) {
        this.f15576m = hn2Var;
        this.f15577n = d21Var;
        this.f15578o = k31Var;
    }

    private final void a() {
        if (this.f15579p.compareAndSet(false, true)) {
            this.f15577n.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        if (this.f15576m.f9246f == 1 && mjVar.f12152j) {
            a();
        }
        if (mjVar.f12152j && this.f15580q.compareAndSet(false, true)) {
            this.f15578o.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final synchronized void m() {
        if (this.f15576m.f9246f != 1) {
            a();
        }
    }
}
