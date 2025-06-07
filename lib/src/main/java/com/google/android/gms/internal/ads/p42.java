package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p42 implements j3.f {

    /* renamed from: a, reason: collision with root package name */
    private final j11 f13579a;

    /* renamed from: b, reason: collision with root package name */
    private final d21 f13580b;

    /* renamed from: c, reason: collision with root package name */
    private final h91 f13581c;

    /* renamed from: d, reason: collision with root package name */
    private final z81 f13582d;

    /* renamed from: e, reason: collision with root package name */
    private final ut0 f13583e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f13584f = new AtomicBoolean(false);

    p42(j11 j11Var, d21 d21Var, h91 h91Var, z81 z81Var, ut0 ut0Var) {
        this.f13579a = j11Var;
        this.f13580b = d21Var;
        this.f13581c = h91Var;
        this.f13582d = z81Var;
        this.f13583e = ut0Var;
    }

    @Override // j3.f
    public final synchronized void a(View view) {
        if (this.f13584f.compareAndSet(false, true)) {
            this.f13583e.l();
            this.f13582d.r0(view);
        }
    }

    @Override // j3.f
    public final void b() {
        if (this.f13584f.get()) {
            this.f13579a.O();
        }
    }

    @Override // j3.f
    public final void d() {
        if (this.f13584f.get()) {
            this.f13580b.a();
            this.f13581c.a();
        }
    }
}
