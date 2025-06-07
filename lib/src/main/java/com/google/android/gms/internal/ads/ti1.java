package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ti1 extends di1 implements f91 {

    /* renamed from: r, reason: collision with root package name */
    private f91 f15861r;

    protected final synchronized void d(k3.a aVar, xw xwVar, l3.t tVar, zw zwVar, l3.e0 e0Var, f91 f91Var) {
        super.a(aVar, xwVar, tVar, zwVar, e0Var);
        this.f15861r = f91Var;
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final synchronized void r() {
        f91 f91Var = this.f15861r;
        if (f91Var != null) {
            f91Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final synchronized void t() {
        f91 f91Var = this.f15861r;
        if (f91Var != null) {
            f91Var.t();
        }
    }
}
