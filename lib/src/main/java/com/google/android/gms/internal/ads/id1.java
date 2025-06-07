package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class id1 implements nj {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f9691m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ kd1 f9692n;

    id1(kd1 kd1Var, String str) {
        this.f9692n = kd1Var;
        this.f9691m = str;
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        if (!((Boolean) k3.w.c().b(ir.C1)).booleanValue()) {
            if (mjVar.f12152j) {
                this.f9692n.D.put(this.f9691m, Boolean.TRUE);
                kd1 kd1Var = this.f9692n;
                kd1Var.h(kd1Var.f10976t.e(), this.f9692n.f10976t.l(), this.f9692n.f10976t.n(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (mjVar.f12152j) {
                kd1 kd1Var2 = this.f9692n;
                if (kd1Var2.f10976t == null) {
                    return;
                }
                kd1Var2.D.put(this.f9691m, Boolean.TRUE);
                kd1 kd1Var3 = this.f9692n;
                kd1Var3.h(kd1Var3.f10976t.e(), this.f9692n.f10976t.l(), this.f9692n.f10976t.n(), true);
            }
        }
    }
}
