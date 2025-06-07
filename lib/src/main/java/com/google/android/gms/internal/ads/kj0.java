package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kj0 implements v74 {

    /* renamed from: a, reason: collision with root package name */
    private final hl4 f11077a = new hl4(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f11078b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f11079c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f11080d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f11081e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f11082f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11083g;

    kj0() {
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final long a() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void b() {
        j(false);
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void c(t84[] t84VarArr, fj4 fj4Var, rk4[] rk4VarArr) {
        int i10 = 0;
        this.f11082f = 0;
        while (true) {
            int length = t84VarArr.length;
            if (i10 >= 2) {
                this.f11077a.f(this.f11082f);
                return;
            } else {
                if (rk4VarArr[i10] != null) {
                    this.f11082f += t84VarArr[i10].b() != 1 ? 131072000 : 13107200;
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void d() {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void f() {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final boolean g(long j10, float f5, boolean z10, long j11) {
        long j12 = z10 ? this.f11081e : this.f11080d;
        return j12 <= 0 || j10 >= j12;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final boolean h(long j10, long j11, float f5) {
        boolean z10 = true;
        char c10 = j11 > this.f11079c ? (char) 0 : j11 < this.f11078b ? (char) 2 : (char) 1;
        int iA = this.f11077a.a();
        int i10 = this.f11082f;
        if (c10 != 2 && (c10 != 1 || !this.f11083g || iA >= i10)) {
            z10 = false;
        }
        this.f11083g = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final hl4 i() {
        return this.f11077a;
    }

    final void j(boolean z10) {
        this.f11082f = 0;
        this.f11083g = false;
        if (z10) {
            this.f11077a.e();
        }
    }

    public final synchronized void k(int i10) {
        this.f11080d = i10 * 1000;
    }

    public final synchronized void l(int i10) {
        this.f11081e = i10 * 1000;
    }

    public final synchronized void m(int i10) {
        this.f11079c = i10 * 1000;
    }

    public final synchronized void n(int i10) {
        this.f11078b = i10 * 1000;
    }
}
