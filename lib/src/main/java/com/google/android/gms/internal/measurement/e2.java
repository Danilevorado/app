package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class e2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f18909q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Object f18910r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u2 f18911s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e2(u2 u2Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(u2Var, false);
        this.f18911s = u2Var;
        this.f18909q = str;
        this.f18910r = obj;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f18911s.f19340i)).logHealthData(5, this.f18909q, l4.b.p1(this.f18910r), l4.b.p1(null), l4.b.p1(null));
    }
}
