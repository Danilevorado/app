package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class j0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f5756m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ m0 f5757n;

    j0(m0 m0Var, int i10) {
        this.f5757n = m0Var;
        this.f5756m = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5757n.i(this.f5756m);
    }
}
