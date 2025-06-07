package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ig0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f9724m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f9725n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ pg0 f9726o;

    ig0(pg0 pg0Var, String str, String str2) {
        this.f9726o = pg0Var;
        this.f9724m = str;
        this.f9725n = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0 pg0Var = this.f9726o;
        if (pg0Var.B != null) {
            pg0Var.B.v(this.f9724m, this.f9725n);
        }
    }
}
