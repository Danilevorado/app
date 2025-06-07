package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b8 implements y8 {

    /* renamed from: a, reason: collision with root package name */
    private final k7 f6370a;

    /* renamed from: b, reason: collision with root package name */
    private final il2 f6371b = new il2(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f6372c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f6373d;

    /* renamed from: e, reason: collision with root package name */
    private rt2 f6374e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6375f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6376g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6377h;

    /* renamed from: i, reason: collision with root package name */
    private int f6378i;

    /* renamed from: j, reason: collision with root package name */
    private int f6379j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6380k;

    public b8(k7 k7Var) {
        this.f6370a = k7Var;
    }

    private final void c(int i10) {
        this.f6372c = i10;
        this.f6373d = 0;
    }

    private final boolean e(jm2 jm2Var, byte[] bArr, int i10) {
        int iMin = Math.min(jm2Var.i(), i10 - this.f6373d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            jm2Var.g(iMin);
        } else {
            jm2Var.b(bArr, this.f6373d, iMin);
        }
        int i11 = this.f6373d + iMin;
        this.f6373d = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.y8
    public final void a(jm2 jm2Var, int i10) {
        int i11;
        long jB;
        int i12;
        gt1.b(this.f6374e);
        int i13 = -1;
        int i14 = 2;
        int i15 = 1;
        if ((i10 & 1) != 0) {
            int i16 = this.f6372c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.f6379j;
                    if (i17 != -1) {
                        ad2.e("PesReader", "Unexpected start indicator: expected " + i17 + " more bytes");
                    }
                    this.f6370a.d();
                } else {
                    ad2.e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            c(1);
        }
        int i18 = i10;
        while (jm2Var.i() > 0) {
            int i19 = this.f6372c;
            if (i19 != 0) {
                if (i19 != i15) {
                    if (i19 != i14) {
                        int i20 = jm2Var.i();
                        int i21 = this.f6379j;
                        int i22 = i21 != i13 ? i20 - i21 : 0;
                        if (i22 > 0) {
                            i20 -= i22;
                            jm2Var.e(jm2Var.k() + i20);
                        }
                        this.f6370a.a(jm2Var);
                        int i23 = this.f6379j;
                        if (i23 != i13) {
                            int i24 = i23 - i20;
                            this.f6379j = i24;
                            if (i24 == 0) {
                                this.f6370a.d();
                                c(i15);
                            }
                        }
                    } else {
                        if (e(jm2Var, this.f6371b.f9786a, Math.min(10, this.f6378i)) && e(jm2Var, null, this.f6378i)) {
                            this.f6371b.j(0);
                            if (this.f6375f) {
                                this.f6371b.l(4);
                                long jD = this.f6371b.d(3);
                                this.f6371b.l(i15);
                                int iD = this.f6371b.d(15) << 15;
                                this.f6371b.l(i15);
                                long jD2 = this.f6371b.d(15);
                                this.f6371b.l(i15);
                                if (this.f6377h || !this.f6376g) {
                                    i12 = iD;
                                } else {
                                    this.f6371b.l(4);
                                    this.f6371b.l(i15);
                                    int iD2 = this.f6371b.d(15) << 15;
                                    this.f6371b.l(i15);
                                    long jD3 = this.f6371b.d(15);
                                    this.f6371b.l(i15);
                                    i12 = iD;
                                    this.f6374e.b((this.f6371b.d(3) << 30) | iD2 | jD3);
                                    this.f6377h = true;
                                }
                                jB = this.f6374e.b((jD << 30) | i12 | jD2);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i18 |= true != this.f6380k ? 0 : 4;
                            this.f6370a.e(jB, i18);
                            c(3);
                            i13 = -1;
                            i14 = 2;
                            i15 = 1;
                        }
                    }
                    i11 = i14;
                } else if (e(jm2Var, this.f6371b.f9786a, 9)) {
                    int i25 = 0;
                    this.f6371b.j(0);
                    int iD3 = this.f6371b.d(24);
                    i15 = 1;
                    if (iD3 != 1) {
                        ad2.e("PesReader", "Unexpected start code prefix: " + iD3);
                        i13 = -1;
                        this.f6379j = -1;
                        i11 = 2;
                    } else {
                        this.f6371b.l(8);
                        int iD4 = this.f6371b.d(16);
                        this.f6371b.l(5);
                        this.f6380k = this.f6371b.n();
                        i11 = 2;
                        this.f6371b.l(2);
                        this.f6375f = this.f6371b.n();
                        this.f6376g = this.f6371b.n();
                        this.f6371b.l(6);
                        int iD5 = this.f6371b.d(8);
                        this.f6378i = iD5;
                        if (iD4 == 0) {
                            this.f6379j = -1;
                            i13 = -1;
                        } else {
                            int i26 = (iD4 - 3) - iD5;
                            this.f6379j = i26;
                            if (i26 < 0) {
                                ad2.e("PesReader", "Found negative packet payload size: " + i26);
                                i13 = -1;
                                this.f6379j = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i25 = 2;
                    }
                    c(i25);
                } else {
                    i13 = -1;
                    i15 = 1;
                    i11 = 2;
                }
            } else {
                i11 = i14;
                jm2Var.g(jm2Var.i());
            }
            i14 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.y8
    public final void b(rt2 rt2Var, n nVar, x8 x8Var) {
        this.f6374e = rt2Var;
        this.f6370a.b(nVar, x8Var);
    }

    @Override // com.google.android.gms.internal.ads.y8
    public final void d() {
        this.f6372c = 0;
        this.f6373d = 0;
        this.f6377h = false;
        this.f6370a.c();
    }
}
