package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ld;

/* loaded from: classes.dex */
final class r6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ x4.b f20337m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f20338n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ long f20339o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f20340p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ x4.b f20341q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ v6 f20342r;

    r6(v6 v6Var, x4.b bVar, int i10, long j10, boolean z10, x4.b bVar2) {
        this.f20342r = v6Var;
        this.f20337m = bVar;
        this.f20338n = i10;
        this.f20339o = j10;
        this.f20340p = z10;
        this.f20341q = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20342r.J(this.f20337m);
        v6.c0(this.f20342r, this.f20337m, this.f20338n, this.f20339o, false, this.f20340p);
        ld.c();
        if (this.f20342r.f20269a.y().A(null, i3.B0)) {
            v6.b0(this.f20342r, this.f20337m, this.f20341q);
        }
    }
}
