package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ pg0 f10472m;

    jg0(pg0 pg0Var) {
        this.f10472m = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0 pg0Var = this.f10472m;
        if (pg0Var.B != null) {
            pg0Var.B.g();
        }
    }
}
