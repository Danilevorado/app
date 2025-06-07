package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class z1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ b1 f19422q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u2 f19423r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z1(u2 u2Var, b1 b1Var) {
        super(u2Var, true);
        this.f19423r = u2Var;
        this.f19422q = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19423r.f19340i)).getCachedAppInstanceId(this.f19422q);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f19422q.h0(null);
    }
}
