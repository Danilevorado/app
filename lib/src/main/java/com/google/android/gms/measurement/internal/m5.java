package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class m5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20175m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o5 f20176n;

    m5(o5 o5Var, z9 z9Var) {
        this.f20176n = o5Var;
        this.f20175m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20176n.f20244m.c();
        this.f20176n.f20244m.o(this.f20175m);
    }
}
