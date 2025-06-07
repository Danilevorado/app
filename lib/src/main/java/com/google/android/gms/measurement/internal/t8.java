package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class t8 {

    /* renamed from: a, reason: collision with root package name */
    private s8 f20425a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x8 f20426b;

    t8(x8 x8Var) {
        this.f20426b = x8Var;
    }

    final void a(long j10) {
        this.f20425a = new s8(this, this.f20426b.f20269a.d().a(), j10);
        this.f20426b.f20571c.postDelayed(this.f20425a, 2000L);
    }

    final void b() {
        this.f20426b.f();
        s8 s8Var = this.f20425a;
        if (s8Var != null) {
            this.f20426b.f20571c.removeCallbacks(s8Var);
        }
        this.f20426b.f20269a.F().f19934q.a(false);
    }
}
