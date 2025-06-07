package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class j2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f19021q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f19022r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Object f19023s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f19024t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ u2 f19025u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j2(u2 u2Var, String str, String str2, Object obj, boolean z10) {
        super(u2Var, true);
        this.f19025u = u2Var;
        this.f19021q = str;
        this.f19022r = str2;
        this.f19023s = obj;
        this.f19024t = z10;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19025u.f19340i)).setUserProperty(this.f19021q, this.f19022r, l4.b.p1(this.f19023s), this.f19024t, this.f19043m);
    }
}
