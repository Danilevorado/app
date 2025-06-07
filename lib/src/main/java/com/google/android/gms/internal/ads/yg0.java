package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class yg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f18031m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ zg0 f18032n;

    yg0(zg0 zg0Var, boolean z10) {
        this.f18032n = zg0Var;
        this.f18031m = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18032n.s("windowVisibilityChanged", "isVisible", String.valueOf(this.f18031m));
    }
}
