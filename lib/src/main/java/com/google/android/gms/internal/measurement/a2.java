package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class a2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ b1 f18824q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u2 f18825r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a2(u2 u2Var, b1 b1Var) {
        super(u2Var, true);
        this.f18825r = u2Var;
        this.f18824q = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f18825r.f19340i)).generateEventId(this.f18824q);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f18824q.h0(null);
    }
}
