package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class w1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f19380q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u2 f19381r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w1(u2 u2Var, String str) {
        super(u2Var, true);
        this.f19381r = u2Var;
        this.f19380q = str;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19381r.f19340i)).endAdUnitExposure(this.f19380q, this.f19044n);
    }
}
