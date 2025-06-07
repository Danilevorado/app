package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4 f18955a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18956b;

    public g0(r4 r4Var, String str) {
        this.f18955a = r4Var;
        this.f18956b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final r4 a(q qVar) {
        r4 r4VarA = this.f18955a.a();
        r4VarA.e(this.f18956b, qVar);
        return r4VarA;
    }
}
