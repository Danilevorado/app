package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class gi4 implements xi4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8755a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ji4 f8756b;

    public gi4(ji4 ji4Var, int i10) {
        this.f8756b = ji4Var;
        this.f8755a = i10;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final int a(long j10) {
        return this.f8756b.M(this.f8755a, j10);
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final int b(t74 t74Var, w44 w44Var, int i10) {
        return this.f8756b.L(this.f8755a, t74Var, w44Var, i10);
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final boolean c() {
        return this.f8756b.A(this.f8755a);
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final void f() {
        this.f8756b.y(this.f8755a);
    }
}
