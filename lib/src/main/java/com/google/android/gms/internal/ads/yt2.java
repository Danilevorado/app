package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class yt2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ au2 f18271a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ot2 f18272b;

    yt2(au2 au2Var, ot2 ot2Var) {
        this.f18271a = au2Var;
        this.f18272b = ot2Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        au2 au2Var = this.f18271a;
        ot2 ot2Var = this.f18272b;
        ot2Var.D0(th);
        ot2Var.B0(false);
        au2Var.a(ot2Var);
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void b(Object obj) {
    }
}
