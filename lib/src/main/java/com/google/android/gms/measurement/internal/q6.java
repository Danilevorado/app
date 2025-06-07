package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ld;

/* loaded from: classes.dex */
final class q6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ x4.b f20301m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f20302n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f20303o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f20304p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ boolean f20305q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ x4.b f20306r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ v6 f20307s;

    q6(v6 v6Var, x4.b bVar, long j10, int i10, long j11, boolean z10, x4.b bVar2) {
        this.f20307s = v6Var;
        this.f20301m = bVar;
        this.f20302n = j10;
        this.f20303o = i10;
        this.f20304p = j11;
        this.f20305q = z10;
        this.f20306r = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20307s.J(this.f20301m);
        this.f20307s.y(this.f20302n, false);
        v6.c0(this.f20307s, this.f20301m, this.f20303o, this.f20304p, true, this.f20305q);
        ld.c();
        if (this.f20307s.f20269a.y().A(null, i3.B0)) {
            v6.b0(this.f20307s, this.f20301m, this.f20306r);
        }
    }
}
