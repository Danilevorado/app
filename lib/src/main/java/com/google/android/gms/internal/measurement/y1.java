package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class y1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ b1 f19411q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u2 f19412r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y1(u2 u2Var, b1 b1Var) {
        super(u2Var, true);
        this.f19412r = u2Var;
        this.f19411q = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19412r.f19340i)).getGmpAppId(this.f19411q);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f19411q.h0(null);
    }
}
