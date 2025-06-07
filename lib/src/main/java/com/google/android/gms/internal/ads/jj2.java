package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jj2 implements g72 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kj2 f10539a;

    jj2(kj2 kj2Var) {
        this.f10539a = kj2Var;
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final void a() {
        synchronized (this.f10539a) {
            this.f10539a.f11093v = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tu0 tu0Var = (tu0) obj;
        synchronized (this.f10539a) {
            tu0 tu0Var2 = this.f10539a.f11093v;
            if (tu0Var2 != null) {
                tu0Var2.a();
            }
            kj2 kj2Var = this.f10539a;
            kj2Var.f11093v = tu0Var;
            tu0Var.i(kj2Var);
            kj2 kj2Var2 = this.f10539a;
            kj2Var2.f11089r.o(new uu0(tu0Var, kj2Var2, kj2Var2.f11089r));
            tu0Var.b();
        }
    }
}
