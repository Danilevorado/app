package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wi4 implements s0 {
    private boolean A;
    private boolean B;
    private me4 C;

    /* renamed from: a, reason: collision with root package name */
    private final qi4 f17148a;

    /* renamed from: d, reason: collision with root package name */
    private final le4 f17151d;

    /* renamed from: e, reason: collision with root package name */
    private final fe4 f17152e;

    /* renamed from: f, reason: collision with root package name */
    private vi4 f17153f;

    /* renamed from: g, reason: collision with root package name */
    private k9 f17154g;

    /* renamed from: o, reason: collision with root package name */
    private int f17162o;

    /* renamed from: p, reason: collision with root package name */
    private int f17163p;

    /* renamed from: q, reason: collision with root package name */
    private int f17164q;

    /* renamed from: r, reason: collision with root package name */
    private int f17165r;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17169v;

    /* renamed from: y, reason: collision with root package name */
    private k9 f17172y;

    /* renamed from: z, reason: collision with root package name */
    private k9 f17173z;

    /* renamed from: b, reason: collision with root package name */
    private final si4 f17149b = new si4();

    /* renamed from: h, reason: collision with root package name */
    private int f17155h = AdError.NETWORK_ERROR_CODE;

    /* renamed from: i, reason: collision with root package name */
    private long[] f17156i = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: j, reason: collision with root package name */
    private long[] f17157j = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: m, reason: collision with root package name */
    private long[] f17160m = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: l, reason: collision with root package name */
    private int[] f17159l = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: k, reason: collision with root package name */
    private int[] f17158k = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: n, reason: collision with root package name */
    private r0[] f17161n = new r0[AdError.NETWORK_ERROR_CODE];

    /* renamed from: c, reason: collision with root package name */
    private final dj4 f17150c = new dj4(new lx1() { // from class: com.google.android.gms.internal.ads.ri4
    });

    /* renamed from: s, reason: collision with root package name */
    private long f17166s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    private long f17167t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f17168u = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17171x = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17170w = true;

    protected wi4(hl4 hl4Var, le4 le4Var, fe4 fe4Var) {
        this.f17151d = le4Var;
        this.f17152e = fe4Var;
        this.f17148a = new qi4(hl4Var);
    }

    static /* synthetic */ void A(ui4 ui4Var) {
        ke4 ke4Var = ui4Var.f16363b;
        int i10 = je4.f10466a;
    }

    private final int L(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f17160m[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f17159l[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f17155h) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int g(int i10) {
        int i11 = this.f17164q + i10;
        int i12 = this.f17155h;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int h(t74 t74Var, w44 w44Var, boolean z10, boolean z11, si4 si4Var) {
        w44Var.f16976d = false;
        if (!p()) {
            if (!z11 && !this.f17169v) {
                k9 k9Var = this.f17173z;
                if (k9Var == null || (!z10 && k9Var == this.f17154g)) {
                    return -3;
                }
                m(k9Var, t74Var);
                return -5;
            }
            w44Var.c(4);
            return -4;
        }
        k9 k9Var2 = ((ui4) this.f17150c.a(this.f17163p + this.f17165r)).f16362a;
        if (!z10 && k9Var2 == this.f17154g) {
            int iG = g(this.f17165r);
            if (!q(iG)) {
                w44Var.f16976d = true;
                return -3;
            }
            w44Var.c(this.f17159l[iG]);
            long j10 = this.f17160m[iG];
            w44Var.f16977e = j10;
            if (j10 < this.f17166s) {
                w44Var.a(Integer.MIN_VALUE);
            }
            si4Var.f15282a = this.f17158k[iG];
            si4Var.f15283b = this.f17157j[iG];
            si4Var.f15284c = this.f17161n[iG];
            return -4;
        }
        m(k9Var2, t74Var);
        return -5;
    }

    private final synchronized long i(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f17162o;
        if (i11 != 0) {
            long[] jArr = this.f17160m;
            int i12 = this.f17164q;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f17165r) != i11) {
                    i11 = i10 + 1;
                }
                int iL = L(i12, i11, j10, false);
                if (iL == -1) {
                    return -1L;
                }
                return k(iL);
            }
        }
        return -1L;
    }

    private final synchronized long j() {
        int i10 = this.f17162o;
        if (i10 == 0) {
            return -1L;
        }
        return k(i10);
    }

    private final long k(int i10) {
        long j10 = this.f17167t;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iG = g(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.f17160m[iG]);
                if ((this.f17159l[iG] & 1) != 0) {
                    break;
                }
                iG--;
                if (iG == -1) {
                    iG = this.f17155h - 1;
                }
            }
        }
        this.f17167t = Math.max(j10, jMax);
        this.f17162o -= i10;
        int i12 = this.f17163p + i10;
        this.f17163p = i12;
        int i13 = this.f17164q + i10;
        this.f17164q = i13;
        int i14 = this.f17155h;
        if (i13 >= i14) {
            this.f17164q = i13 - i14;
        }
        int i15 = this.f17165r - i10;
        this.f17165r = i15;
        if (i15 < 0) {
            this.f17165r = 0;
        }
        this.f17150c.e(i12);
        if (this.f17162o != 0) {
            return this.f17157j[this.f17164q];
        }
        int i16 = this.f17164q;
        if (i16 == 0) {
            i16 = this.f17155h;
        }
        return this.f17157j[i16 - 1] + this.f17158k[r12];
    }

    private final synchronized void l(long j10, int i10, long j11, int i11, r0 r0Var) {
        int i12 = this.f17162o;
        if (i12 > 0) {
            int iG = g(i12 - 1);
            gt1.d(this.f17157j[iG] + ((long) this.f17158k[iG]) <= j11);
        }
        this.f17169v = (536870912 & i10) != 0;
        this.f17168u = Math.max(this.f17168u, j10);
        int iG2 = g(this.f17162o);
        this.f17160m[iG2] = j10;
        this.f17157j[iG2] = j11;
        this.f17158k[iG2] = i11;
        this.f17159l[iG2] = i10;
        this.f17161n[iG2] = r0Var;
        this.f17156i[iG2] = 0;
        if (this.f17150c.f() || !((ui4) this.f17150c.b()).f16362a.equals(this.f17173z)) {
            ke4 ke4Var = ke4.f11008a;
            dj4 dj4Var = this.f17150c;
            int i13 = this.f17163p + this.f17162o;
            k9 k9Var = this.f17173z;
            Objects.requireNonNull(k9Var);
            dj4Var.c(i13, new ui4(k9Var, ke4Var, null));
        }
        int i14 = this.f17162o + 1;
        this.f17162o = i14;
        int i15 = this.f17155h;
        if (i14 == i15) {
            int i16 = i15 + AdError.NETWORK_ERROR_CODE;
            long[] jArr = new long[i16];
            long[] jArr2 = new long[i16];
            long[] jArr3 = new long[i16];
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            r0[] r0VarArr = new r0[i16];
            int i17 = this.f17164q;
            int i18 = i15 - i17;
            System.arraycopy(this.f17157j, i17, jArr2, 0, i18);
            System.arraycopy(this.f17160m, this.f17164q, jArr3, 0, i18);
            System.arraycopy(this.f17159l, this.f17164q, iArr, 0, i18);
            System.arraycopy(this.f17158k, this.f17164q, iArr2, 0, i18);
            System.arraycopy(this.f17161n, this.f17164q, r0VarArr, 0, i18);
            System.arraycopy(this.f17156i, this.f17164q, jArr, 0, i18);
            int i19 = this.f17164q;
            System.arraycopy(this.f17157j, 0, jArr2, i18, i19);
            System.arraycopy(this.f17160m, 0, jArr3, i18, i19);
            System.arraycopy(this.f17159l, 0, iArr, i18, i19);
            System.arraycopy(this.f17158k, 0, iArr2, i18, i19);
            System.arraycopy(this.f17161n, 0, r0VarArr, i18, i19);
            System.arraycopy(this.f17156i, 0, jArr, i18, i19);
            this.f17157j = jArr2;
            this.f17160m = jArr3;
            this.f17159l = iArr;
            this.f17158k = iArr2;
            this.f17161n = r0VarArr;
            this.f17156i = jArr;
            this.f17164q = 0;
            this.f17155h = i16;
        }
    }

    private final void m(k9 k9Var, t74 t74Var) {
        k9 k9Var2 = this.f17154g;
        boolean z10 = k9Var2 == null;
        c0 c0Var = z10 ? null : k9Var2.f10901o;
        this.f17154g = k9Var;
        c0 c0Var2 = k9Var.f10901o;
        t74Var.f15720a = k9Var.c(this.f17151d.a(k9Var));
        t74Var.f15721b = this.C;
        if (z10 || !sv2.b(c0Var, c0Var2)) {
            me4 me4Var = k9Var.f10901o != null ? new me4(new de4(new oe4(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.C = me4Var;
            t74Var.f15721b = me4Var;
        }
    }

    private final void n() {
        if (this.C != null) {
            this.C = null;
            this.f17154g = null;
        }
    }

    private final synchronized void o() {
        this.f17165r = 0;
        this.f17148a.g();
    }

    private final boolean p() {
        return this.f17165r != this.f17162o;
    }

    private final boolean q(int i10) {
        if (this.C != null) {
            return (this.f17159l[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean r(k9 k9Var) {
        this.f17171x = false;
        if (sv2.b(k9Var, this.f17173z)) {
            return false;
        }
        if (!this.f17150c.f() && ((ui4) this.f17150c.b()).f16362a.equals(k9Var)) {
            k9Var = ((ui4) this.f17150c.b()).f16362a;
        }
        this.f17173z = k9Var;
        k9 k9Var2 = this.f17173z;
        this.A = ng0.e(k9Var2.f10898l, k9Var2.f10895i);
        this.B = false;
        return true;
    }

    public final void B() throws de4 {
        me4 me4Var = this.C;
        if (me4Var != null) {
            throw me4Var.a();
        }
    }

    public final void C() {
        z();
        n();
    }

    public final void D() {
        E(true);
        n();
    }

    public final void E(boolean z10) {
        this.f17148a.f();
        this.f17162o = 0;
        this.f17163p = 0;
        this.f17164q = 0;
        this.f17165r = 0;
        this.f17170w = true;
        this.f17166s = Long.MIN_VALUE;
        this.f17167t = Long.MIN_VALUE;
        this.f17168u = Long.MIN_VALUE;
        this.f17169v = false;
        this.f17150c.d();
        if (z10) {
            this.f17172y = null;
            this.f17173z = null;
            this.f17171x = true;
        }
    }

    public final void F(long j10) {
        this.f17166s = j10;
    }

    public final void G(vi4 vi4Var) {
        this.f17153f = vi4Var;
    }

    public final synchronized void H(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.f17165r + i10 <= this.f17162o) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gt1.d(z10);
        this.f17165r += i10;
    }

    public final synchronized boolean I() {
        return this.f17169v;
    }

    public final synchronized boolean J(boolean z10) {
        boolean z11 = true;
        if (p()) {
            if (((ui4) this.f17150c.a(this.f17163p + this.f17165r)).f16362a != this.f17154g) {
                return true;
            }
            return q(g(this.f17165r));
        }
        if (!z10 && !this.f17169v) {
            k9 k9Var = this.f17173z;
            if (k9Var == null) {
                z11 = false;
            } else if (k9Var == this.f17154g) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean K(long j10, boolean z10) {
        o();
        int i10 = this.f17165r;
        int iG = g(i10);
        if (!p() || j10 < this.f17160m[iG] || (j10 > this.f17168u && !z10)) {
            return false;
        }
        int iL = L(iG, this.f17162o - i10, j10, true);
        if (iL == -1) {
            return false;
        }
        this.f17166s = j10;
        this.f17165r += iL;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final /* synthetic */ void a(jm2 jm2Var, int i10) {
        q0.b(this, jm2Var, i10);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void b(k9 k9Var) {
        this.f17172y = k9Var;
        boolean zR = r(k9Var);
        vi4 vi4Var = this.f17153f;
        if (vi4Var == null || !zR) {
            return;
        }
        vi4Var.j(k9Var);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int c(bh4 bh4Var, int i10, boolean z10, int i11) {
        return this.f17148a.a(bh4Var, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void d(jm2 jm2Var, int i10, int i11) {
        this.f17148a.h(jm2Var, i10);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void e(long j10, int i10, int i11, int i12, r0 r0Var) {
        if (this.f17170w) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f17170w = false;
            }
        }
        if (this.A) {
            if (j10 < this.f17166s) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.B) {
                    ad2.e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f17173z)));
                    this.B = true;
                }
                i10 |= 1;
            }
        }
        l(j10, i10, (this.f17148a.b() - i11) - i12, i11, r0Var);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final /* synthetic */ int f(bh4 bh4Var, int i10, boolean z10) {
        return q0.a(this, bh4Var, i10, z10);
    }

    public final int s() {
        return this.f17163p + this.f17165r;
    }

    public final synchronized int t(long j10, boolean z10) {
        int i10 = this.f17165r;
        int iG = g(i10);
        if (p() && j10 >= this.f17160m[iG]) {
            if (j10 > this.f17168u && z10) {
                return this.f17162o - i10;
            }
            int iL = L(iG, this.f17162o - i10, j10, true);
            if (iL == -1) {
                return 0;
            }
            return iL;
        }
        return 0;
    }

    public final int u() {
        return this.f17163p + this.f17162o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(com.google.android.gms.internal.ads.t74 r9, com.google.android.gms.internal.ads.w44 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.si4 r7 = r8.f17149b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.g()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.qi4 r9 = r8.f17148a
            com.google.android.gms.internal.ads.si4 r11 = r8.f17149b
            r9.d(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.qi4 r9 = r8.f17148a
            com.google.android.gms.internal.ads.si4 r11 = r8.f17149b
            r9.e(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.f17165r
            int r9 = r9 + r1
            r8.f17165r = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wi4.v(com.google.android.gms.internal.ads.t74, com.google.android.gms.internal.ads.w44, int, boolean):int");
    }

    public final synchronized long w() {
        return this.f17168u;
    }

    public final synchronized k9 x() {
        if (this.f17171x) {
            return null;
        }
        return this.f17173z;
    }

    public final void y(long j10, boolean z10, boolean z11) {
        this.f17148a.c(i(j10, false, z11));
    }

    public final void z() {
        this.f17148a.c(j());
    }
}
