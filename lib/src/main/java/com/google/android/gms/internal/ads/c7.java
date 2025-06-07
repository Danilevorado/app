package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final il2 f6795a;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f6796b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6797c;

    /* renamed from: d, reason: collision with root package name */
    private String f6798d;

    /* renamed from: e, reason: collision with root package name */
    private s0 f6799e;

    /* renamed from: f, reason: collision with root package name */
    private int f6800f;

    /* renamed from: g, reason: collision with root package name */
    private int f6801g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6802h;

    /* renamed from: i, reason: collision with root package name */
    private long f6803i;

    /* renamed from: j, reason: collision with root package name */
    private k9 f6804j;

    /* renamed from: k, reason: collision with root package name */
    private int f6805k;

    /* renamed from: l, reason: collision with root package name */
    private long f6806l;

    public c7(String str) {
        il2 il2Var = new il2(new byte[16], 16);
        this.f6795a = il2Var;
        this.f6796b = new jm2(il2Var.f9786a);
        this.f6800f = 0;
        this.f6801g = 0;
        this.f6802h = false;
        this.f6806l = -9223372036854775807L;
        this.f6797c = str;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(jm2 jm2Var) {
        gt1.b(this.f6799e);
        while (jm2Var.i() > 0) {
            int i10 = this.f6800f;
            if (i10 == 0) {
                while (jm2Var.i() > 0) {
                    if (this.f6802h) {
                        int iS = jm2Var.s();
                        this.f6802h = iS == 172;
                        if (iS != 64) {
                            if (iS == 65) {
                                iS = 65;
                            }
                        }
                        this.f6800f = 1;
                        jm2 jm2Var2 = this.f6796b;
                        jm2Var2.h()[0] = -84;
                        jm2Var2.h()[1] = iS == 65 ? (byte) 65 : (byte) 64;
                        this.f6801g = 2;
                    } else {
                        this.f6802h = jm2Var.s() == 172;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(jm2Var.i(), this.f6805k - this.f6801g);
                this.f6799e.a(jm2Var, iMin);
                int i11 = this.f6801g + iMin;
                this.f6801g = i11;
                int i12 = this.f6805k;
                if (i11 == i12) {
                    long j10 = this.f6806l;
                    if (j10 != -9223372036854775807L) {
                        this.f6799e.e(j10, 1, i12, 0, null);
                        this.f6806l += this.f6803i;
                    }
                    this.f6800f = 0;
                }
            } else {
                byte[] bArrH = this.f6796b.h();
                int iMin2 = Math.min(jm2Var.i(), 16 - this.f6801g);
                jm2Var.b(bArrH, this.f6801g, iMin2);
                int i13 = this.f6801g + iMin2;
                this.f6801g = i13;
                if (i13 == 16) {
                    this.f6795a.j(0);
                    on4 on4VarA = pn4.a(this.f6795a);
                    k9 k9Var = this.f6804j;
                    if (k9Var == null || k9Var.f10911y != 2 || on4VarA.f13342a != k9Var.f10912z || !"audio/ac4".equals(k9Var.f10898l)) {
                        i7 i7Var = new i7();
                        i7Var.h(this.f6798d);
                        i7Var.s("audio/ac4");
                        i7Var.e0(2);
                        i7Var.t(on4VarA.f13342a);
                        i7Var.k(this.f6797c);
                        k9 k9VarY = i7Var.y();
                        this.f6804j = k9VarY;
                        this.f6799e.b(k9VarY);
                    }
                    this.f6805k = on4VarA.f13343b;
                    this.f6803i = (on4VarA.f13344c * 1000000) / this.f6804j.f10912z;
                    this.f6796b.f(0);
                    this.f6799e.a(this.f6796b, 16);
                    this.f6800f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f6798d = x8Var.b();
        this.f6799e = nVar.S(x8Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f6800f = 0;
        this.f6801g = 0;
        this.f6802h = false;
        this.f6806l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f6806l = j10;
        }
    }
}
