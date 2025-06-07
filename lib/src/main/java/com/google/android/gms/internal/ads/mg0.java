package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ pg0 f12092m;

    mg0(pg0 pg0Var) {
        this.f12092m = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0 pg0Var = this.f12092m;
        if (pg0Var.B != null) {
            if (!pg0Var.C) {
                pg0Var.B.h();
                this.f12092m.C = true;
            }
            this.f12092m.B.c();
        }
    }
}
