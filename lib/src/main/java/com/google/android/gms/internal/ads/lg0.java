package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class lg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ pg0 f11569m;

    lg0(pg0 pg0Var) {
        this.f11569m = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0 pg0Var = this.f11569m;
        if (pg0Var.B != null) {
            pg0Var.B.f();
            this.f11569m.B.i();
        }
    }
}
