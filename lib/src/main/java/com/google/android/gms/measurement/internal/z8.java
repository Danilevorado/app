package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class z8 extends o {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a9 f20611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z8(a9 a9Var, r5 r5Var) {
        super(r5Var);
        this.f20611e = a9Var;
    }

    @Override // com.google.android.gms.measurement.internal.o
    public final void c() {
        this.f20611e.k();
        this.f20611e.f20269a.b().t().a("Starting upload from DelayedRunnable");
        this.f20611e.f19803b.C();
    }
}
