package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f14624a;

    /* renamed from: d, reason: collision with root package name */
    public e6 f14627d;

    /* renamed from: e, reason: collision with root package name */
    public n5 f14628e;

    /* renamed from: f, reason: collision with root package name */
    public int f14629f;

    /* renamed from: g, reason: collision with root package name */
    public int f14630g;

    /* renamed from: h, reason: collision with root package name */
    public int f14631h;

    /* renamed from: i, reason: collision with root package name */
    public int f14632i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14635l;

    /* renamed from: b, reason: collision with root package name */
    public final d6 f14625b = new d6();

    /* renamed from: c, reason: collision with root package name */
    public final jm2 f14626c = new jm2();

    /* renamed from: j, reason: collision with root package name */
    private final jm2 f14633j = new jm2(1);

    /* renamed from: k, reason: collision with root package name */
    private final jm2 f14634k = new jm2();

    public r5(s0 s0Var, e6 e6Var, n5 n5Var) {
        this.f14624a = s0Var;
        this.f14627d = e6Var;
        this.f14628e = n5Var;
        h(e6Var, n5Var);
    }

    public final int a() {
        int i10 = !this.f14635l ? this.f14627d.f7649g[this.f14629f] : this.f14625b.f7196j[this.f14629f] ? 1 : 0;
        return f() != null ? i10 | 1073741824 : i10;
    }

    public final int b() {
        return !this.f14635l ? this.f14627d.f7646d[this.f14629f] : this.f14625b.f7194h[this.f14629f];
    }

    public final int c(int i10, int i11) {
        jm2 jm2Var;
        c6 c6VarF = f();
        if (c6VarF == null) {
            return 0;
        }
        int i12 = c6VarF.f6785d;
        if (i12 != 0) {
            jm2Var = this.f14625b.f7200n;
        } else {
            byte[] bArr = c6VarF.f6786e;
            int i13 = sv2.f15560a;
            jm2 jm2Var2 = this.f14634k;
            int length = bArr.length;
            jm2Var2.d(bArr, length);
            jm2Var = this.f14634k;
            i12 = length;
        }
        boolean zB = this.f14625b.b(this.f14629f);
        boolean z10 = zB || i11 != 0;
        jm2 jm2Var3 = this.f14633j;
        jm2Var3.h()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        jm2Var3.f(0);
        this.f14624a.d(this.f14633j, 1, 1);
        this.f14624a.d(jm2Var, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        if (!zB) {
            this.f14626c.c(8);
            jm2 jm2Var4 = this.f14626c;
            byte[] bArrH = jm2Var4.h();
            bArrH[0] = 0;
            bArrH[1] = 1;
            bArrH[2] = 0;
            bArrH[3] = (byte) i11;
            bArrH[4] = (byte) ((i10 >> 24) & 255);
            bArrH[5] = (byte) ((i10 >> 16) & 255);
            bArrH[6] = (byte) ((i10 >> 8) & 255);
            bArrH[7] = (byte) (i10 & 255);
            this.f14624a.d(jm2Var4, 8, 1);
            return i12 + 9;
        }
        jm2 jm2Var5 = this.f14625b.f7200n;
        int iW = jm2Var5.w();
        jm2Var5.g(-2);
        int i14 = (iW * 6) + 2;
        if (i11 != 0) {
            this.f14626c.c(i14);
            byte[] bArrH2 = this.f14626c.h();
            jm2Var5.b(bArrH2, 0, i14);
            int i15 = (((bArrH2[2] & 255) << 8) | (bArrH2[3] & 255)) + i11;
            bArrH2[2] = (byte) ((i15 >> 8) & 255);
            bArrH2[3] = (byte) (i15 & 255);
            jm2Var5 = this.f14626c;
        }
        this.f14624a.d(jm2Var5, i14, 1);
        return i12 + 1 + i14;
    }

    public final long d() {
        return !this.f14635l ? this.f14627d.f7645c[this.f14629f] : this.f14625b.f7192f[this.f14631h];
    }

    public final long e() {
        if (!this.f14635l) {
            return this.f14627d.f7648f[this.f14629f];
        }
        d6 d6Var = this.f14625b;
        return d6Var.f7195i[this.f14629f];
    }

    public final c6 f() {
        if (!this.f14635l) {
            return null;
        }
        d6 d6Var = this.f14625b;
        n5 n5Var = d6Var.f7187a;
        int i10 = sv2.f15560a;
        int i11 = n5Var.f12423a;
        c6 c6VarA = d6Var.f7199m;
        if (c6VarA == null) {
            c6VarA = this.f14627d.f7643a.a(i11);
        }
        if (c6VarA == null || !c6VarA.f6782a) {
            return null;
        }
        return c6VarA;
    }

    public final void h(e6 e6Var, n5 n5Var) {
        this.f14627d = e6Var;
        this.f14628e = n5Var;
        this.f14624a.b(e6Var.f7643a.f6351f);
        i();
    }

    public final void i() {
        d6 d6Var = this.f14625b;
        d6Var.f7190d = 0;
        d6Var.f7202p = 0L;
        d6Var.f7203q = false;
        d6Var.f7197k = false;
        d6Var.f7201o = false;
        d6Var.f7199m = null;
        this.f14629f = 0;
        this.f14631h = 0;
        this.f14630g = 0;
        this.f14632i = 0;
        this.f14635l = false;
    }

    public final boolean k() {
        this.f14629f++;
        if (!this.f14635l) {
            return false;
        }
        int i10 = this.f14630g + 1;
        this.f14630g = i10;
        int[] iArr = this.f14625b.f7193g;
        int i11 = this.f14631h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f14631h = i11 + 1;
        this.f14630g = 0;
        return false;
    }
}
