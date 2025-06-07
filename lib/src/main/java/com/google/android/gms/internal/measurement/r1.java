package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class r1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f19235q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f19236r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ b1 f19237s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ u2 f19238t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r1(u2 u2Var, String str, String str2, b1 b1Var) {
        super(u2Var, true);
        this.f19238t = u2Var;
        this.f19235q = str;
        this.f19236r = str2;
        this.f19237s = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19238t.f19340i)).getConditionalUserProperties(this.f19235q, this.f19236r, this.f19237s);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f19237s.h0(null);
    }
}
