package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class h2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f18969q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ b1 f18970r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u2 f18971s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h2(u2 u2Var, String str, b1 b1Var) {
        super(u2Var, true);
        this.f18971s = u2Var;
        this.f18969q = str;
        this.f18970r = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f18971s.f19340i)).getMaxUserProperties(this.f18969q, this.f18970r);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f18970r.h0(null);
    }
}
