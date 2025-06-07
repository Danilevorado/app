package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class yc1 extends mu {

    /* renamed from: m, reason: collision with root package name */
    private final pd1 f17963m;

    /* renamed from: n, reason: collision with root package name */
    private l4.a f17964n;

    public yc1(pd1 pd1Var) {
        this.f17963m = pd1Var;
    }

    private static float L5(l4.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) l4.b.L0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final void R(l4.a aVar) {
        this.f17964n = aVar;
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final void Y4(xv xvVar) {
        if (((Boolean) k3.w.c().b(ir.U5)).booleanValue() && (this.f17963m.U() instanceof kl0)) {
            ((kl0) this.f17963m.U()).R5(xvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final float c() {
        if (!((Boolean) k3.w.c().b(ir.T5)).booleanValue()) {
            return 0.0f;
        }
        if (this.f17963m.M() != 0.0f) {
            return this.f17963m.M();
        }
        if (this.f17963m.U() != null) {
            try {
                return this.f17963m.U().c();
            } catch (RemoteException e5) {
                ze0.e("Remote exception getting video controller aspect ratio.", e5);
                return 0.0f;
            }
        }
        l4.a aVar = this.f17964n;
        if (aVar != null) {
            return L5(aVar);
        }
        qu quVarX = this.f17963m.X();
        if (quVarX == null) {
            return 0.0f;
        }
        float f5 = (quVarX.f() == -1 || quVarX.d() == -1) ? 0.0f : quVarX.f() / quVarX.d();
        return f5 == 0.0f ? L5(quVarX.e()) : f5;
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final float e() {
        if (((Boolean) k3.w.c().b(ir.U5)).booleanValue() && this.f17963m.U() != null) {
            return this.f17963m.U().e();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final k3.m2 g() {
        if (((Boolean) k3.w.c().b(ir.U5)).booleanValue()) {
            return this.f17963m.U();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final float h() {
        if (((Boolean) k3.w.c().b(ir.U5)).booleanValue() && this.f17963m.U() != null) {
            return this.f17963m.U().h();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final l4.a i() {
        l4.a aVar = this.f17964n;
        if (aVar != null) {
            return aVar;
        }
        qu quVarX = this.f17963m.X();
        if (quVarX == null) {
            return null;
        }
        return quVarX.e();
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final boolean k() {
        if (((Boolean) k3.w.c().b(ir.U5)).booleanValue()) {
            return this.f17963m.E();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nu
    public final boolean l() {
        return ((Boolean) k3.w.c().b(ir.U5)).booleanValue() && this.f17963m.U() != null;
    }
}
