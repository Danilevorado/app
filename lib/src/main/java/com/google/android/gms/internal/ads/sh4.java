package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class sh4 implements rk4 {

    /* renamed from: a, reason: collision with root package name */
    private final rk4 f15258a;

    /* renamed from: b, reason: collision with root package name */
    private final j31 f15259b;

    public sh4(rk4 rk4Var, j31 j31Var) {
        this.f15258a = rk4Var;
        this.f15259b = j31Var;
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final int K(int i10) {
        return this.f15258a.K(i10);
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final int a(int i10) {
        return this.f15258a.a(0);
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final j31 c() {
        return this.f15259b;
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final int d() {
        return this.f15258a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh4)) {
            return false;
        }
        sh4 sh4Var = (sh4) obj;
        return this.f15258a.equals(sh4Var.f15258a) && this.f15259b.equals(sh4Var.f15259b);
    }

    public final int hashCode() {
        return ((this.f15259b.hashCode() + 527) * 31) + this.f15258a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final k9 j(int i10) {
        return this.f15258a.j(i10);
    }
}
