package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
final class a84 {

    /* renamed from: a, reason: collision with root package name */
    private final ey0 f5991a = new ey0();

    /* renamed from: b, reason: collision with root package name */
    private final g01 f5992b = new g01();

    /* renamed from: c, reason: collision with root package name */
    private final i94 f5993c;

    /* renamed from: d, reason: collision with root package name */
    private final r32 f5994d;

    /* renamed from: e, reason: collision with root package name */
    private long f5995e;

    /* renamed from: f, reason: collision with root package name */
    private int f5996f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5997g;

    /* renamed from: h, reason: collision with root package name */
    private x74 f5998h;

    /* renamed from: i, reason: collision with root package name */
    private x74 f5999i;

    /* renamed from: j, reason: collision with root package name */
    private x74 f6000j;

    /* renamed from: k, reason: collision with root package name */
    private int f6001k;

    /* renamed from: l, reason: collision with root package name */
    private Object f6002l;

    /* renamed from: m, reason: collision with root package name */
    private long f6003m;

    public a84(i94 i94Var, r32 r32Var) {
        this.f5993c = i94Var;
        this.f5994d = r32Var;
    }

    private static hh4 A(h11 h11Var, Object obj, long j10, long j11, g01 g01Var, ey0 ey0Var) {
        h11Var.n(obj, ey0Var);
        h11Var.e(ey0Var.f8041c, g01Var, 0L);
        h11Var.a(obj);
        if (ey0Var.f8042d == 0) {
            ey0Var.b();
        }
        h11Var.n(obj, ey0Var);
        int iD = ey0Var.d(j10);
        return iD == -1 ? new hh4(obj, j11, ey0Var.c(j10)) : new hh4(obj, iD, ey0Var.e(iD), j11);
    }

    private final void B() {
        final z53 z53Var = new z53();
        for (x74 x74VarG = this.f5998h; x74VarG != null; x74VarG = x74VarG.g()) {
            z53Var.g(x74VarG.f17457f.f17921a);
        }
        x74 x74Var = this.f5999i;
        final hh4 hh4Var = x74Var == null ? null : x74Var.f17457f.f17921a;
        this.f5994d.H(new Runnable() { // from class: com.google.android.gms.internal.ads.z74
            @Override // java.lang.Runnable
            public final void run() {
                this.f18469m.m(z53Var, hh4Var);
            }
        });
    }

    private final boolean C(h11 h11Var, hh4 hh4Var, boolean z10) {
        int iA = h11Var.a(hh4Var.f10401a);
        return !h11Var.e(h11Var.d(iA, this.f5991a, false).f8041c, this.f5992b, 0L).f8536g && h11Var.i(iA, this.f5991a, this.f5992b, this.f5996f, this.f5997g) == -1 && z10;
    }

    private final boolean a(h11 h11Var, hh4 hh4Var) {
        if (c(hh4Var)) {
            return h11Var.e(h11Var.n(hh4Var.f10401a, this.f5991a).f8041c, this.f5992b, 0L).f8543n == h11Var.a(hh4Var.f10401a);
        }
        return false;
    }

    private final boolean b(h11 h11Var) {
        x74 x74VarG = this.f5998h;
        if (x74VarG == null) {
            return true;
        }
        int iA = h11Var.a(x74VarG.f17453b);
        while (true) {
            iA = h11Var.i(iA, this.f5991a, this.f5992b, this.f5996f, this.f5997g);
            while (x74VarG.g() != null && !x74VarG.f17457f.f17927g) {
                x74VarG = x74VarG.g();
            }
            x74 x74VarG2 = x74VarG.g();
            if (iA == -1 || x74VarG2 == null || h11Var.a(x74VarG2.f17453b) != iA) {
                break;
            }
            x74VarG = x74VarG2;
        }
        boolean zP = p(x74VarG);
        x74VarG.f17457f = j(h11Var, x74VarG.f17457f);
        return !zP;
    }

    private static final boolean c(hh4 hh4Var) {
        return !hh4Var.b() && hh4Var.f10405e == -1;
    }

    private final long v(h11 h11Var, Object obj, int i10) {
        h11Var.n(obj, this.f5991a);
        this.f5991a.h(i10);
        this.f5991a.j(i10);
        return 0L;
    }

    private final y74 w(h11 h11Var, x74 x74Var, long j10) {
        long j11;
        y74 y74Var = x74Var.f17457f;
        long jE = (x74Var.e() + y74Var.f17925e) - j10;
        if (!y74Var.f17927g) {
            hh4 hh4Var = y74Var.f17921a;
            h11Var.n(hh4Var.f10401a, this.f5991a);
            if (!hh4Var.b()) {
                int iE = this.f5991a.e(hh4Var.f10405e);
                this.f5991a.l(hh4Var.f10405e);
                if (iE != this.f5991a.a(hh4Var.f10405e)) {
                    return y(h11Var, hh4Var.f10401a, hh4Var.f10405e, iE, y74Var.f17925e, hh4Var.f10404d);
                }
                v(h11Var, hh4Var.f10401a, hh4Var.f10405e);
                return z(h11Var, hh4Var.f10401a, 0L, y74Var.f17925e, hh4Var.f10404d);
            }
            int i10 = hh4Var.f10402b;
            if (this.f5991a.a(i10) == -1) {
                return null;
            }
            int iF = this.f5991a.f(i10, hh4Var.f10403c);
            if (iF < 0) {
                return y(h11Var, hh4Var.f10401a, i10, iF, y74Var.f17923c, hh4Var.f10404d);
            }
            long jLongValue = y74Var.f17923c;
            if (jLongValue == -9223372036854775807L) {
                g01 g01Var = this.f5992b;
                ey0 ey0Var = this.f5991a;
                Pair pairM = h11Var.m(g01Var, ey0Var, ey0Var.f8041c, -9223372036854775807L, Math.max(0L, jE));
                if (pairM == null) {
                    return null;
                }
                jLongValue = ((Long) pairM.second).longValue();
            }
            v(h11Var, hh4Var.f10401a, hh4Var.f10402b);
            return z(h11Var, hh4Var.f10401a, Math.max(0L, jLongValue), y74Var.f17923c, hh4Var.f10404d);
        }
        long j12 = 0;
        int i11 = h11Var.i(h11Var.a(y74Var.f17921a.f10401a), this.f5991a, this.f5992b, this.f5996f, this.f5997g);
        if (i11 == -1) {
            return null;
        }
        int i12 = h11Var.d(i11, this.f5991a, true).f8041c;
        Object obj = this.f5991a.f8040b;
        Objects.requireNonNull(obj);
        long j13 = y74Var.f17921a.f10404d;
        if (h11Var.e(i12, this.f5992b, 0L).f8542m == i11) {
            Pair pairM2 = h11Var.m(this.f5992b, this.f5991a, i12, -9223372036854775807L, Math.max(0L, jE));
            if (pairM2 == null) {
                return null;
            }
            obj = pairM2.first;
            long jLongValue2 = ((Long) pairM2.second).longValue();
            x74 x74VarG = x74Var.g();
            if (x74VarG == null || !x74VarG.f17453b.equals(obj)) {
                j13 = this.f5995e;
                this.f5995e = 1 + j13;
            } else {
                j13 = x74VarG.f17457f.f17921a.f10404d;
            }
            j11 = jLongValue2;
            j12 = -9223372036854775807L;
        } else {
            j11 = 0;
        }
        hh4 hh4VarA = A(h11Var, obj, j11, j13, this.f5992b, this.f5991a);
        if (j12 != -9223372036854775807L && y74Var.f17923c != -9223372036854775807L) {
            h11Var.n(y74Var.f17921a.f10401a, this.f5991a).b();
        }
        return x(h11Var, hh4VarA, j12, j11);
    }

    private final y74 x(h11 h11Var, hh4 hh4Var, long j10, long j11) {
        h11Var.n(hh4Var.f10401a, this.f5991a);
        boolean zB = hh4Var.b();
        Object obj = hh4Var.f10401a;
        return zB ? y(h11Var, obj, hh4Var.f10402b, hh4Var.f10403c, j10, hh4Var.f10404d) : z(h11Var, obj, j11, j10, hh4Var.f10404d);
    }

    private final y74 y(h11 h11Var, Object obj, int i10, int i11, long j10, long j11) {
        hh4 hh4Var = new hh4(obj, i10, i11, j11);
        long jG = h11Var.n(hh4Var.f10401a, this.f5991a).g(hh4Var.f10402b, hh4Var.f10403c);
        if (i11 == this.f5991a.e(i10)) {
            this.f5991a.i();
        }
        this.f5991a.l(hh4Var.f10402b);
        return new y74(hh4Var, (jG == -9223372036854775807L || jG > 0) ? 0L : Math.max(0L, (-1) + jG), j10, -9223372036854775807L, jG, false, false, false, false);
    }

    private final y74 z(h11 h11Var, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        h11Var.n(obj, this.f5991a);
        int iC = this.f5991a.c(jMax);
        ey0 ey0Var = this.f5991a;
        if (iC == -1) {
            ey0Var.b();
        } else {
            ey0Var.l(iC);
        }
        hh4 hh4Var = new hh4(obj, j12, iC);
        boolean zC = c(hh4Var);
        boolean zA = a(h11Var, hh4Var);
        boolean zC2 = C(h11Var, hh4Var, zC);
        if (iC != -1) {
            this.f5991a.l(iC);
        }
        if (iC != -1) {
            this.f5991a.h(iC);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j15 = j13;
            j14 = j15;
        } else {
            j14 = this.f5991a.f8042d;
            j15 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && jMax >= j14) {
            jMax = Math.max(0L, j14 - 1);
        }
        return new y74(hh4Var, jMax, j11, j15, j14, false, zC, zA, zC2);
    }

    public final x74 d() {
        x74 x74Var = this.f5998h;
        if (x74Var == null) {
            return null;
        }
        if (x74Var == this.f5999i) {
            this.f5999i = x74Var.g();
        }
        x74Var.n();
        int i10 = this.f6001k - 1;
        this.f6001k = i10;
        if (i10 == 0) {
            this.f6000j = null;
            x74 x74Var2 = this.f5998h;
            this.f6002l = x74Var2.f17453b;
            this.f6003m = x74Var2.f17457f.f17921a.f10404d;
        }
        this.f5998h = this.f5998h.g();
        B();
        return this.f5998h;
    }

    public final x74 e() {
        x74 x74Var = this.f5999i;
        boolean z10 = false;
        if (x74Var != null && x74Var.g() != null) {
            z10 = true;
        }
        gt1.f(z10);
        this.f5999i = this.f5999i.g();
        B();
        return this.f5999i;
    }

    public final x74 f() {
        return this.f6000j;
    }

    public final x74 g() {
        return this.f5998h;
    }

    public final x74 h() {
        return this.f5999i;
    }

    public final y74 i(long j10, n84 n84Var) {
        x74 x74Var = this.f6000j;
        return x74Var == null ? x(n84Var.f12513a, n84Var.f12514b, n84Var.f12515c, n84Var.f12530r) : w(n84Var.f12513a, x74Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.y74 j(com.google.android.gms.internal.ads.h11 r19, com.google.android.gms.internal.ads.y74 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.hh4 r3 = r2.f17921a
            boolean r12 = c(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.C(r1, r3, r12)
            com.google.android.gms.internal.ads.hh4 r4 = r2.f17921a
            java.lang.Object r4 = r4.f10401a
            com.google.android.gms.internal.ads.ey0 r5 = r0.f5991a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.f10405e
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.ey0 r9 = r0.f5991a
            r9.h(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.b()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.ey0 r1 = r0.f5991a
            int r5 = r3.f10402b
            int r6 = r3.f10403c
            long r5 = r1.g(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.ey0 r1 = r0.f5991a
            long r5 = r1.f8042d
            goto L48
        L57:
            boolean r1 = r3.b()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.ey0 r1 = r0.f5991a
            int r4 = r3.f10402b
            r1.l(r4)
            goto L6e
        L65:
            int r1 = r3.f10405e
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.ey0 r4 = r0.f5991a
            r4.l(r1)
        L6e:
            com.google.android.gms.internal.ads.y74 r15 = new com.google.android.gms.internal.ads.y74
            long r4 = r2.f17922b
            long r1 = r2.f17923c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a84.j(com.google.android.gms.internal.ads.h11, com.google.android.gms.internal.ads.y74):com.google.android.gms.internal.ads.y74");
    }

    public final hh4 k(h11 h11Var, Object obj, long j10) {
        long j11;
        int iA;
        int i10 = h11Var.n(obj, this.f5991a).f8041c;
        Object obj2 = this.f6002l;
        if (obj2 == null || (iA = h11Var.a(obj2)) == -1 || h11Var.d(iA, this.f5991a, false).f8041c != i10) {
            x74 x74VarG = this.f5998h;
            while (true) {
                if (x74VarG == null) {
                    x74VarG = this.f5998h;
                    while (x74VarG != null) {
                        int iA2 = h11Var.a(x74VarG.f17453b);
                        if (iA2 == -1 || h11Var.d(iA2, this.f5991a, false).f8041c != i10) {
                            x74VarG = x74VarG.g();
                        }
                    }
                    j11 = this.f5995e;
                    this.f5995e = 1 + j11;
                    if (this.f5998h == null) {
                        this.f6002l = obj;
                        this.f6003m = j11;
                    }
                } else {
                    if (x74VarG.f17453b.equals(obj)) {
                        break;
                    }
                    x74VarG = x74VarG.g();
                }
            }
            j11 = x74VarG.f17457f.f17921a.f10404d;
        } else {
            j11 = this.f6003m;
        }
        long j12 = j11;
        h11Var.n(obj, this.f5991a);
        h11Var.e(this.f5991a.f8041c, this.f5992b, 0L);
        int iA3 = h11Var.a(obj);
        Object obj3 = obj;
        while (true) {
            g01 g01Var = this.f5992b;
            if (iA3 < g01Var.f8542m) {
                return A(h11Var, obj3, j10, j12, g01Var, this.f5991a);
            }
            h11Var.d(iA3, this.f5991a, true);
            this.f5991a.b();
            ey0 ey0Var = this.f5991a;
            if (ey0Var.d(ey0Var.f8042d) != -1) {
                obj3 = this.f5991a.f8040b;
                Objects.requireNonNull(obj3);
            }
            iA3--;
        }
    }

    public final void l() {
        if (this.f6001k == 0) {
            return;
        }
        x74 x74VarG = this.f5998h;
        gt1.b(x74VarG);
        this.f6002l = x74VarG.f17453b;
        this.f6003m = x74VarG.f17457f.f17921a.f10404d;
        while (x74VarG != null) {
            x74VarG.n();
            x74VarG = x74VarG.g();
        }
        this.f5998h = null;
        this.f6000j = null;
        this.f5999i = null;
        this.f6001k = 0;
        B();
    }

    final /* synthetic */ void m(z53 z53Var, hh4 hh4Var) {
        this.f5993c.y(z53Var.j(), hh4Var);
    }

    public final void n(long j10) {
        x74 x74Var = this.f6000j;
        if (x74Var != null) {
            x74Var.m(j10);
        }
    }

    public final boolean o(fh4 fh4Var) {
        x74 x74Var = this.f6000j;
        return x74Var != null && x74Var.f17452a == fh4Var;
    }

    public final boolean p(x74 x74Var) {
        boolean z10 = false;
        gt1.f(x74Var != null);
        if (x74Var.equals(this.f6000j)) {
            return false;
        }
        this.f6000j = x74Var;
        while (x74Var.g() != null) {
            x74Var = x74Var.g();
            if (x74Var == this.f5999i) {
                this.f5999i = this.f5998h;
                z10 = true;
            }
            x74Var.n();
            this.f6001k--;
        }
        this.f6000j.o(null);
        B();
        return z10;
    }

    public final boolean q() {
        x74 x74Var = this.f6000j;
        if (x74Var == null) {
            return true;
        }
        if (x74Var.f17457f.f17929i || !x74Var.r() || this.f6000j.f17457f.f17925e == -9223372036854775807L) {
            return false;
        }
        return this.f6001k < 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(com.google.android.gms.internal.ads.h11 r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.x74 r2 = r0.f5998h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L97
            com.google.android.gms.internal.ads.y74 r5 = r2.f17457f
            r6 = 0
            if (r3 != 0) goto L16
            com.google.android.gms.internal.ads.y74 r3 = r0.j(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.android.gms.internal.ads.y74 r9 = r0.w(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.p(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.f17922b
            long r12 = r9.f17922b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L8f
            com.google.android.gms.internal.ads.hh4 r10 = r5.f17921a
            com.google.android.gms.internal.ads.hh4 r11 = r9.f17921a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8f
            r3 = r9
        L39:
            long r9 = r5.f17923c
            com.google.android.gms.internal.ads.y74 r9 = r3.a(r9)
            r2.f17457f = r9
            long r9 = r5.f17925e
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            long r13 = r3.f17925e
            if (r5 == 0) goto L86
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L86
        L53:
            r2.q()
            long r7 = r3.f17925e
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L62:
            long r9 = r2.e()
            long r7 = r7 + r9
        L67:
            com.google.android.gms.internal.ads.x74 r1 = r0.f5999i
            if (r2 != r1) goto L7b
            com.google.android.gms.internal.ads.y74 r1 = r2.f17457f
            boolean r1 = r1.f17926f
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L79
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7b
        L79:
            r1 = r4
            goto L7c
        L7b:
            r1 = r6
        L7c:
            boolean r2 = r0.p(r2)
            if (r2 != 0) goto L85
            if (r1 != 0) goto L85
            return r4
        L85:
            return r6
        L86:
            com.google.android.gms.internal.ads.x74 r3 = r2.g()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8f:
            boolean r1 = r0.p(r3)
            if (r1 != 0) goto L96
            return r4
        L96:
            return r6
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a84.r(com.google.android.gms.internal.ads.h11, long, long):boolean");
    }

    public final boolean s(h11 h11Var, int i10) {
        this.f5996f = i10;
        return b(h11Var);
    }

    public final boolean t(h11 h11Var, boolean z10) {
        this.f5997g = z10;
        return b(h11Var);
    }

    public final x74 u(u84[] u84VarArr, xk4 xk4Var, hl4 hl4Var, m84 m84Var, y74 y74Var, yk4 yk4Var) {
        x74 x74Var = this.f6000j;
        x74 x74Var2 = new x74(u84VarArr, x74Var == null ? 1000000000000L : (x74Var.e() + x74Var.f17457f.f17925e) - y74Var.f17922b, xk4Var, hl4Var, m84Var, y74Var, yk4Var);
        x74 x74Var3 = this.f6000j;
        if (x74Var3 != null) {
            x74Var3.o(x74Var2);
        } else {
            this.f5998h = x74Var2;
            this.f5999i = x74Var2;
        }
        this.f6002l = null;
        this.f6000j = x74Var2;
        this.f6001k++;
        B();
        return x74Var2;
    }
}
