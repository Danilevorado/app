package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class d6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f19862m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f19863n;

    d6(v6 v6Var, long j10) {
        this.f19863n = v6Var;
        this.f19862m = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19863n.y(this.f19862m, true);
        this.f19863n.f20269a.L().S(new AtomicReference());
    }
}
