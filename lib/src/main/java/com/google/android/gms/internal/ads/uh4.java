package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class uh4 implements xi4 {

    /* renamed from: a, reason: collision with root package name */
    private final xi4 f16339a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16340b;

    public uh4(xi4 xi4Var, long j10) {
        this.f16339a = xi4Var;
        this.f16340b = j10;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final int a(long j10) {
        return this.f16339a.a(j10 - this.f16340b);
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final int b(t74 t74Var, w44 w44Var, int i10) {
        int iB = this.f16339a.b(t74Var, w44Var, i10);
        if (iB != -4) {
            return iB;
        }
        w44Var.f16977e = Math.max(0L, w44Var.f16977e + this.f16340b);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final boolean c() {
        return this.f16339a.c();
    }

    public final xi4 d() {
        return this.f16339a;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final void f() {
        this.f16339a.f();
    }
}
