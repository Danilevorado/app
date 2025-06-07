package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class r7 extends o {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h8 f20343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r7(h8 h8Var, r5 r5Var) {
        super(r5Var);
        this.f20343e = h8Var;
    }

    @Override // com.google.android.gms.measurement.internal.o
    public final void c() {
        h8 h8Var = this.f20343e;
        h8Var.f();
        if (h8Var.y()) {
            h8Var.f20269a.b().t().a("Inactivity, disconnecting from the service");
            h8Var.Q();
        }
    }
}
