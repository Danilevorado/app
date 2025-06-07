package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class e9 implements d9 {

    /* renamed from: a, reason: collision with root package name */
    private final n f7682a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f7683b;

    /* renamed from: c, reason: collision with root package name */
    private final g9 f7684c;

    /* renamed from: d, reason: collision with root package name */
    private final k9 f7685d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7686e;

    /* renamed from: f, reason: collision with root package name */
    private long f7687f;

    /* renamed from: g, reason: collision with root package name */
    private int f7688g;

    /* renamed from: h, reason: collision with root package name */
    private long f7689h;

    public e9(n nVar, s0 s0Var, g9 g9Var, String str, int i10) throws oh0 {
        this.f7682a = nVar;
        this.f7683b = s0Var;
        this.f7684c = g9Var;
        int i11 = g9Var.f8645b * g9Var.f8648e;
        int i12 = g9Var.f8647d;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw oh0.a("Expected block size: " + i13 + "; got: " + i12, null);
        }
        int i14 = g9Var.f8646c * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.f7686e = iMax;
        i7 i7Var = new i7();
        i7Var.s(str);
        i7Var.d0(i15);
        i7Var.o(i15);
        i7Var.l(iMax);
        i7Var.e0(g9Var.f8645b);
        i7Var.t(g9Var.f8646c);
        i7Var.n(i10);
        this.f7685d = i7Var.y();
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final void a(long j10) {
        this.f7687f = j10;
        this.f7688g = 0;
        this.f7689h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final void b(int i10, long j10) {
        this.f7682a.R(new j9(this.f7684c, 1, i10, j10));
        this.f7683b.b(this.f7685d);
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final boolean c(l lVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f7688g) < (i11 = this.f7686e)) {
            int iA = q0.a(this.f7683b, lVar, (int) Math.min(i11 - i10, j11), true);
            if (iA == -1) {
                j11 = 0;
            } else {
                this.f7688g += iA;
                j11 -= iA;
            }
        }
        int i12 = this.f7684c.f8647d;
        int i13 = this.f7688g / i12;
        if (i13 > 0) {
            long jX = this.f7687f + sv2.x(this.f7689h, 1000000L, r1.f8646c);
            int i14 = i13 * i12;
            int i15 = this.f7688g - i14;
            this.f7683b.e(jX, 1, i14, i15, null);
            this.f7689h += i13;
            this.f7688g = i15;
        }
        return j11 <= 0;
    }
}
