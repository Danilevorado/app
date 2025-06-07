package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ pg0 f9128m;

    hg0(pg0 pg0Var) {
        this.f9128m = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0 pg0Var = this.f9128m;
        if (pg0Var.B != null) {
            pg0Var.B.a();
        }
    }
}
