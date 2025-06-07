package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class k0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ l0 f5761m;

    k0(l0 l0Var) {
        this.f5761m = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var = this.f5761m.f5764a;
        m0Var.f5767n.f(m0Var.f5767n.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
