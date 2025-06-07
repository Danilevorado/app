package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class d2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f18894q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f18895r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ boolean f18896s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ b1 f18897t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ u2 f18898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d2(u2 u2Var, String str, String str2, boolean z10, b1 b1Var) {
        super(u2Var, true);
        this.f18898u = u2Var;
        this.f18894q = str;
        this.f18895r = str2;
        this.f18896s = z10;
        this.f18897t = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f18898u.f19340i)).getUserProperties(this.f18894q, this.f18895r, this.f18896s, this.f18897t);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f18897t.h0(null);
    }
}
