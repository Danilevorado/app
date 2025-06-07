package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class x7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17425a;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f17426b;

    /* renamed from: c, reason: collision with root package name */
    private final il2 f17427c;

    /* renamed from: d, reason: collision with root package name */
    private s0 f17428d;

    /* renamed from: e, reason: collision with root package name */
    private String f17429e;

    /* renamed from: f, reason: collision with root package name */
    private k9 f17430f;

    /* renamed from: g, reason: collision with root package name */
    private int f17431g;

    /* renamed from: h, reason: collision with root package name */
    private int f17432h;

    /* renamed from: i, reason: collision with root package name */
    private int f17433i;

    /* renamed from: j, reason: collision with root package name */
    private int f17434j;

    /* renamed from: k, reason: collision with root package name */
    private long f17435k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17436l;

    /* renamed from: m, reason: collision with root package name */
    private int f17437m;

    /* renamed from: n, reason: collision with root package name */
    private int f17438n;

    /* renamed from: o, reason: collision with root package name */
    private int f17439o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17440p;

    /* renamed from: q, reason: collision with root package name */
    private long f17441q;

    /* renamed from: r, reason: collision with root package name */
    private int f17442r;

    /* renamed from: s, reason: collision with root package name */
    private long f17443s;

    /* renamed from: t, reason: collision with root package name */
    private int f17444t;

    /* renamed from: u, reason: collision with root package name */
    private String f17445u;

    public x7(String str) {
        this.f17425a = str;
        jm2 jm2Var = new jm2(1024);
        this.f17426b = jm2Var;
        byte[] bArrH = jm2Var.h();
        this.f17427c = new il2(bArrH, bArrH.length);
        this.f17435k = -9223372036854775807L;
    }

    private final int f(il2 il2Var) throws oh0 {
        int iA = il2Var.a();
        in4 in4VarB = jn4.b(il2Var, true);
        this.f17445u = in4VarB.f9816c;
        this.f17442r = in4VarB.f9814a;
        this.f17444t = in4VarB.f9815b;
        return iA - il2Var.a();
    }

    private static long g(il2 il2Var) {
        return il2Var.d((il2Var.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(jm2 jm2Var) throws oh0 {
        int i10;
        int i11;
        int iD;
        boolean zN;
        gt1.b(this.f17428d);
        while (jm2Var.i() > 0) {
            int i12 = this.f17431g;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iS = jm2Var.s();
                    if ((iS & 224) == 224) {
                        this.f17434j = iS;
                        this.f17431g = 2;
                    } else if (iS != 86) {
                        this.f17431g = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(jm2Var.i(), this.f17433i - this.f17432h);
                    jm2Var.b(this.f17427c.f9786a, this.f17432h, iMin);
                    int i13 = this.f17432h + iMin;
                    this.f17432h = i13;
                    if (i13 == this.f17433i) {
                        this.f17427c.j(0);
                        il2 il2Var = this.f17427c;
                        if (il2Var.n()) {
                            if (this.f17436l) {
                            }
                            this.f17431g = 0;
                        } else {
                            this.f17436l = true;
                            int iD2 = il2Var.d(1);
                            if (iD2 == 1) {
                                iD = il2Var.d(1);
                                i11 = 1;
                            } else {
                                i11 = iD2;
                                iD = 0;
                            }
                            this.f17437m = iD;
                            if (iD != 0) {
                                throw oh0.a(null, null);
                            }
                            if (i11 == 1) {
                                g(il2Var);
                                i11 = 1;
                            }
                            if (!il2Var.n()) {
                                throw oh0.a(null, null);
                            }
                            this.f17438n = il2Var.d(6);
                            int iD3 = il2Var.d(4);
                            int iD4 = il2Var.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw oh0.a(null, null);
                            }
                            if (i11 == 0) {
                                int iC = il2Var.c();
                                int iF = f(il2Var);
                                il2Var.j(iC);
                                byte[] bArr = new byte[(iF + 7) / 8];
                                il2Var.g(bArr, 0, iF);
                                i7 i7Var = new i7();
                                i7Var.h(this.f17429e);
                                i7Var.s("audio/mp4a-latm");
                                i7Var.f0(this.f17445u);
                                i7Var.e0(this.f17444t);
                                i7Var.t(this.f17442r);
                                i7Var.i(Collections.singletonList(bArr));
                                i7Var.k(this.f17425a);
                                k9 k9VarY = i7Var.y();
                                if (!k9VarY.equals(this.f17430f)) {
                                    this.f17430f = k9VarY;
                                    this.f17443s = 1024000000 / k9VarY.f10912z;
                                    this.f17428d.b(k9VarY);
                                }
                            } else {
                                il2Var.l(((int) g(il2Var)) - f(il2Var));
                            }
                            int iD5 = il2Var.d(3);
                            this.f17439o = iD5;
                            if (iD5 == 0) {
                                il2Var.l(8);
                            } else if (iD5 == 1) {
                                il2Var.l(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                il2Var.l(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new IllegalStateException();
                                }
                                il2Var.l(1);
                            }
                            boolean zN2 = il2Var.n();
                            this.f17440p = zN2;
                            this.f17441q = 0L;
                            if (zN2) {
                                if (i11 != 1) {
                                    do {
                                        zN = il2Var.n();
                                        this.f17441q = (this.f17441q << 8) + il2Var.d(8);
                                    } while (zN);
                                } else {
                                    this.f17441q = g(il2Var);
                                }
                            }
                            if (il2Var.n()) {
                                il2Var.l(8);
                            }
                        }
                        if (this.f17437m != 0) {
                            throw oh0.a(null, null);
                        }
                        if (this.f17438n != 0) {
                            throw oh0.a(null, null);
                        }
                        if (this.f17439o != 0) {
                            throw oh0.a(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iD6 = il2Var.d(8);
                            i10 = i14 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iC2 = il2Var.c();
                        if ((iC2 & 7) == 0) {
                            this.f17426b.f(iC2 >> 3);
                        } else {
                            il2Var.g(this.f17426b.h(), 0, i10 * 8);
                            this.f17426b.f(0);
                        }
                        this.f17428d.a(this.f17426b, i10);
                        long j10 = this.f17435k;
                        if (j10 != -9223372036854775807L) {
                            this.f17428d.e(j10, 1, i10, 0, null);
                            this.f17435k += this.f17443s;
                        }
                        if (this.f17440p) {
                            il2Var.l((int) this.f17441q);
                        }
                        this.f17431g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iS2 = ((this.f17434j & (-225)) << 8) | jm2Var.s();
                    this.f17433i = iS2;
                    jm2 jm2Var2 = this.f17426b;
                    if (iS2 > jm2Var2.h().length) {
                        jm2Var2.c(iS2);
                        il2 il2Var2 = this.f17427c;
                        byte[] bArrH = this.f17426b.h();
                        il2Var2.i(bArrH, bArrH.length);
                    }
                    this.f17432h = 0;
                    this.f17431g = 3;
                }
            } else if (jm2Var.s() == 86) {
                this.f17431g = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f17428d = nVar.S(x8Var.a(), 1);
        this.f17429e = x8Var.b();
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f17431g = 0;
        this.f17435k = -9223372036854775807L;
        this.f17436l = false;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17435k = j10;
        }
    }
}
