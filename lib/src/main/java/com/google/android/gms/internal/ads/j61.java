package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j61 implements i41 {

    /* renamed from: m, reason: collision with root package name */
    private int f10322m = ((Integer) k3.w.c().b(ir.f9905c1)).intValue();

    public final synchronized int a() {
        return this.f10322m;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final synchronized void d0(un2 un2Var) {
        if (((Boolean) k3.w.c().b(ir.f9916d1)).booleanValue()) {
            try {
                this.f10322m = un2Var.f16413b.f15924b.f11675c;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
    }
}
