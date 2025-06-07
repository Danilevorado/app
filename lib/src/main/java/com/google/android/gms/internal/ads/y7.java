package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f17904a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f17905b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17906c;

    /* renamed from: d, reason: collision with root package name */
    private s0 f17907d;

    /* renamed from: e, reason: collision with root package name */
    private String f17908e;

    /* renamed from: f, reason: collision with root package name */
    private int f17909f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f17910g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17911h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17912i;

    /* renamed from: j, reason: collision with root package name */
    private long f17913j;

    /* renamed from: k, reason: collision with root package name */
    private int f17914k;

    /* renamed from: l, reason: collision with root package name */
    private long f17915l;

    public y7(String str) {
        jm2 jm2Var = new jm2(4);
        this.f17904a = jm2Var;
        jm2Var.h()[0] = -1;
        this.f17905b = new e0();
        this.f17915l = -9223372036854775807L;
        this.f17906c = str;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(jm2 jm2Var) {
        gt1.b(this.f17907d);
        while (jm2Var.i() > 0) {
            int i10 = this.f17909f;
            if (i10 == 0) {
                byte[] bArrH = jm2Var.h();
                int iL = jm2Var.l();
                for (int iK = jm2Var.k(); iK < iL; iK++) {
                    byte b10 = bArrH[iK];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f17912i && (b10 & 224) == 224;
                    this.f17912i = z10;
                    if (z11) {
                        jm2Var.f(iK + 1);
                        this.f17912i = false;
                        this.f17904a.h()[1] = bArrH[iK];
                        this.f17910g = 2;
                        this.f17909f = 1;
                        break;
                        break;
                    }
                }
                jm2Var.f(iL);
            } else if (i10 != 1) {
                int iMin = Math.min(jm2Var.i(), this.f17914k - this.f17910g);
                this.f17907d.a(jm2Var, iMin);
                int i11 = this.f17910g + iMin;
                this.f17910g = i11;
                int i12 = this.f17914k;
                if (i11 >= i12) {
                    long j10 = this.f17915l;
                    if (j10 != -9223372036854775807L) {
                        this.f17907d.e(j10, 1, i12, 0, null);
                        this.f17915l += this.f17913j;
                    }
                    this.f17910g = 0;
                    this.f17909f = 0;
                }
            } else {
                int iMin2 = Math.min(jm2Var.i(), 4 - this.f17910g);
                jm2Var.b(this.f17904a.h(), this.f17910g, iMin2);
                int i13 = this.f17910g + iMin2;
                this.f17910g = i13;
                if (i13 >= 4) {
                    this.f17904a.f(0);
                    if (!this.f17905b.a(this.f17904a.m())) {
                        this.f17910g = 0;
                        this.f17909f = 1;
                        break;
                    }
                    this.f17914k = this.f17905b.f7573c;
                    if (!this.f17911h) {
                        this.f17913j = (r0.f7577g * 1000000) / r0.f7574d;
                        i7 i7Var = new i7();
                        i7Var.h(this.f17908e);
                        i7Var.s(this.f17905b.f7572b);
                        i7Var.l(4096);
                        i7Var.e0(this.f17905b.f7575e);
                        i7Var.t(this.f17905b.f7574d);
                        i7Var.k(this.f17906c);
                        this.f17907d.b(i7Var.y());
                        this.f17911h = true;
                    }
                    this.f17904a.f(0);
                    this.f17907d.a(this.f17904a, 4);
                    this.f17909f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f17908e = x8Var.b();
        this.f17907d = nVar.S(x8Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f17909f = 0;
        this.f17910g = 0;
        this.f17912i = false;
        this.f17915l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17915l = j10;
        }
    }
}
