package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gd4 {

    /* renamed from: a, reason: collision with root package name */
    private final zl1[] f8686a;

    /* renamed from: b, reason: collision with root package name */
    private final yd4 f8687b;

    /* renamed from: c, reason: collision with root package name */
    private final cp1 f8688c;

    public gd4(zl1... zl1VarArr) {
        yd4 yd4Var = new yd4();
        cp1 cp1Var = new cp1();
        zl1[] zl1VarArr2 = {yd4Var, cp1Var};
        this.f8686a = zl1VarArr2;
        System.arraycopy(zl1VarArr, 0, zl1VarArr2, 0, 0);
        this.f8687b = yd4Var;
        this.f8688c = cp1Var;
    }

    public final long a(long j10) {
        return this.f8688c.i(j10);
    }

    public final long b() {
        return this.f8687b.o();
    }

    public final sl0 c(sl0 sl0Var) {
        this.f8688c.k(sl0Var.f15313a);
        this.f8688c.j(sl0Var.f15314b);
        return sl0Var;
    }

    public final boolean d(boolean z10) {
        this.f8687b.p(z10);
        return z10;
    }

    public final zl1[] e() {
        return this.f8686a;
    }
}
