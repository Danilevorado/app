package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class kg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f11023m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f11024n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ pg0 f11025o;

    kg0(pg0 pg0Var, int i10, int i11) {
        this.f11025o = pg0Var;
        this.f11023m = i10;
        this.f11024n = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0 pg0Var = this.f11025o;
        if (pg0Var.B != null) {
            pg0Var.B.A0(this.f11023m, this.f11024n);
        }
    }
}
