package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class ji4 implements fh4, n, ml4, rl4, vi4 {
    private static final Map X;
    private static final k9 Y;
    private r2 A;
    private boolean D;
    private boolean E;
    private boolean F;
    private ii4 G;
    private o0 H;
    private boolean J;
    private boolean L;
    private boolean M;
    private int N;
    private boolean O;
    private long P;
    private boolean R;
    private int S;
    private boolean T;
    private boolean U;
    private final ll4 V;
    private final hl4 W;

    /* renamed from: m, reason: collision with root package name */
    private final Uri f10502m;

    /* renamed from: n, reason: collision with root package name */
    private final t53 f10503n;

    /* renamed from: o, reason: collision with root package name */
    private final le4 f10504o;

    /* renamed from: p, reason: collision with root package name */
    private final qh4 f10505p;

    /* renamed from: q, reason: collision with root package name */
    private final fe4 f10506q;

    /* renamed from: r, reason: collision with root package name */
    private final fi4 f10507r;

    /* renamed from: s, reason: collision with root package name */
    private final long f10508s;

    /* renamed from: u, reason: collision with root package name */
    private final yh4 f10510u;

    /* renamed from: z, reason: collision with root package name */
    private eh4 f10515z;

    /* renamed from: t, reason: collision with root package name */
    private final ul4 f10509t = new ul4("ProgressiveMediaPeriod");

    /* renamed from: v, reason: collision with root package name */
    private final jw1 f10511v = new jw1(hu1.f9421a);

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f10512w = new Runnable() { // from class: com.google.android.gms.internal.ads.zh4
        @Override // java.lang.Runnable
        public final void run() {
            this.f18597m.F();
        }
    };

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f10513x = new Runnable() { // from class: com.google.android.gms.internal.ads.bi4
        @Override // java.lang.Runnable
        public final void run() {
            this.f6499m.u();
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private final Handler f10514y = sv2.A(null);
    private hi4[] C = new hi4[0];
    private wi4[] B = new wi4[0];
    private long Q = -9223372036854775807L;
    private long I = -9223372036854775807L;
    private int K = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        X = Collections.unmodifiableMap(map);
        i7 i7Var = new i7();
        i7Var.h("icy");
        i7Var.s("application/x-icy");
        Y = i7Var.y();
    }

    public ji4(Uri uri, t53 t53Var, yh4 yh4Var, le4 le4Var, fe4 fe4Var, ll4 ll4Var, qh4 qh4Var, fi4 fi4Var, hl4 hl4Var, String str, int i10) {
        this.f10502m = uri;
        this.f10503n = t53Var;
        this.f10504o = le4Var;
        this.f10506q = fe4Var;
        this.V = ll4Var;
        this.f10505p = qh4Var;
        this.f10507r = fi4Var;
        this.W = hl4Var;
        this.f10508s = i10;
        this.f10510u = yh4Var;
    }

    private final int B() {
        int iU = 0;
        for (wi4 wi4Var : this.B) {
            iU += wi4Var.u();
        }
        return iU;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long C(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.wi4[] r3 = r5.B
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.ii4 r4 = r5.G
            java.util.Objects.requireNonNull(r4)
            boolean[] r4 = r4.f9768c
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.w()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ji4.C(boolean):long");
    }

    private final s0 D(hi4 hi4Var) {
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (hi4Var.equals(this.C[i10])) {
                return this.B[i10];
            }
        }
        wi4 wi4Var = new wi4(this.W, this.f10504o, this.f10506q);
        wi4Var.G(this);
        int i11 = length + 1;
        hi4[] hi4VarArr = (hi4[]) Arrays.copyOf(this.C, i11);
        hi4VarArr[length] = hi4Var;
        int i12 = sv2.f15560a;
        this.C = hi4VarArr;
        wi4[] wi4VarArr = (wi4[]) Arrays.copyOf(this.B, i11);
        wi4VarArr[length] = wi4Var;
        this.B = wi4VarArr;
        return wi4Var;
    }

    private final void E() {
        gt1.f(this.E);
        Objects.requireNonNull(this.G);
        Objects.requireNonNull(this.H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        int i10;
        if (this.U || this.E || !this.D || this.H == null) {
            return;
        }
        for (wi4 wi4Var : this.B) {
            if (wi4Var.x() == null) {
                return;
            }
        }
        this.f10511v.c();
        int length = this.B.length;
        j31[] j31VarArr = new j31[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            k9 k9VarX = this.B[i11].x();
            Objects.requireNonNull(k9VarX);
            String str = k9VarX.f10898l;
            boolean zF = ng0.f(str);
            boolean z10 = zF || ng0.g(str);
            zArr[i11] = z10;
            this.F = z10 | this.F;
            r2 r2Var = this.A;
            if (r2Var != null) {
                if (zF || this.C[i11].f9149b) {
                    ld0 ld0Var = k9VarX.f10896j;
                    ld0 ld0Var2 = ld0Var == null ? new ld0(-9223372036854775807L, r2Var) : ld0Var.c(r2Var);
                    i7 i7VarB = k9VarX.b();
                    i7VarB.m(ld0Var2);
                    k9VarX = i7VarB.y();
                }
                if (zF && k9VarX.f10892f == -1 && k9VarX.f10893g == -1 && (i10 = r2Var.f14578m) != -1) {
                    i7 i7VarB2 = k9VarX.b();
                    i7VarB2.d0(i10);
                    k9VarX = i7VarB2.y();
                }
            }
            j31VarArr[i11] = new j31(Integer.toString(i11), k9VarX.c(this.f10504o.a(k9VarX)));
        }
        this.G = new ii4(new fj4(j31VarArr), zArr);
        this.E = true;
        eh4 eh4Var = this.f10515z;
        Objects.requireNonNull(eh4Var);
        eh4Var.i(this);
    }

    private final void G(int i10) {
        E();
        ii4 ii4Var = this.G;
        boolean[] zArr = ii4Var.f9769d;
        if (zArr[i10]) {
            return;
        }
        k9 k9VarB = ii4Var.f9766a.b(i10).b(0);
        this.f10505p.d(ng0.b(k9VarB.f10898l), k9VarB, 0, null, this.P);
        zArr[i10] = true;
    }

    private final void H(int i10) {
        E();
        boolean[] zArr = this.G.f9767b;
        if (this.R && zArr[i10] && !this.B[i10].J(false)) {
            this.Q = 0L;
            this.R = false;
            this.M = true;
            this.P = 0L;
            this.S = 0;
            for (wi4 wi4Var : this.B) {
                wi4Var.E(false);
            }
            eh4 eh4Var = this.f10515z;
            Objects.requireNonNull(eh4Var);
            eh4Var.l(this);
        }
    }

    private final void I() {
        ei4 ei4Var = new ei4(this, this.f10502m, this.f10503n, this.f10510u, this, this.f10511v);
        if (this.E) {
            gt1.f(J());
            long j10 = this.I;
            if (j10 != -9223372036854775807L && this.Q > j10) {
                this.T = true;
                this.Q = -9223372036854775807L;
                return;
            }
            o0 o0Var = this.H;
            Objects.requireNonNull(o0Var);
            ei4.f(ei4Var, o0Var.h(this.Q).f11886a.f13491b, this.Q);
            for (wi4 wi4Var : this.B) {
                wi4Var.F(this.Q);
            }
            this.Q = -9223372036854775807L;
        }
        this.S = B();
        long jA = this.f10509t.a(ei4Var, this, ll4.a(this.K));
        ib3 ib3Var = ei4Var.f7820k;
        this.f10505p.l(new xg4(ei4Var.f7810a, ib3Var, ib3Var.f9669a, Collections.emptyMap(), jA, 0L, 0L), 1, -1, null, 0, null, ei4Var.f7819j, this.I);
    }

    private final boolean J() {
        return this.Q != -9223372036854775807L;
    }

    private final boolean K() {
        return this.M || J();
    }

    static /* bridge */ /* synthetic */ long O(ji4 ji4Var, boolean z10) {
        return ji4Var.C(true);
    }

    static /* bridge */ /* synthetic */ void t(final ji4 ji4Var) {
        ji4Var.f10514y.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ci4
            @Override // java.lang.Runnable
            public final void run() {
                this.f6935m.v();
            }
        });
    }

    final boolean A(int i10) {
        return !K() && this.B[i10].J(this.T);
    }

    final int L(int i10, t74 t74Var, w44 w44Var, int i11) {
        if (K()) {
            return -3;
        }
        G(i10);
        int iV = this.B[i10].v(t74Var, w44Var, i11, this.T);
        if (iV == -3) {
            H(i10);
        }
        return iV;
    }

    final int M(int i10, long j10) {
        if (K()) {
            return 0;
        }
        G(i10);
        wi4 wi4Var = this.B[i10];
        int iT = wi4Var.t(j10, this.T);
        wi4Var.H(iT);
        if (iT != 0) {
            return iT;
        }
        H(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.n
    public final void Q() {
        this.D = true;
        this.f10514y.post(this.f10512w);
    }

    @Override // com.google.android.gms.internal.ads.n
    public final void R(final o0 o0Var) {
        this.f10514y.post(new Runnable() { // from class: com.google.android.gms.internal.ads.di4
            @Override // java.lang.Runnable
            public final void run() {
                this.f7332m.w(o0Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.n
    public final s0 S(int i10, int i11) {
        return D(new hi4(i10, false));
    }

    final s0 U() {
        return D(new hi4(0, true));
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final void a(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long b() {
        long jC;
        E();
        if (this.T || this.N == 0) {
            return Long.MIN_VALUE;
        }
        if (J()) {
            return this.Q;
        }
        if (this.F) {
            int length = this.B.length;
            jC = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                ii4 ii4Var = this.G;
                if (ii4Var.f9767b[i10] && ii4Var.f9768c[i10] && !this.B[i10].I()) {
                    jC = Math.min(jC, this.B[i10].w());
                }
            }
        } else {
            jC = Long.MAX_VALUE;
        }
        if (jC == Long.MAX_VALUE) {
            jC = C(false);
        }
        return jC == Long.MIN_VALUE ? this.P : jC;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean c(long j10) {
        if (this.T || this.f10509t.k() || this.R) {
            return false;
        }
        if (this.E && this.N == 0) {
            return false;
        }
        boolean zE = this.f10511v.e();
        if (this.f10509t.l()) {
            return zE;
        }
        I();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long d() {
        return b();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void e(eh4 eh4Var, long j10) {
        this.f10515z = eh4Var;
        this.f10511v.e();
        I();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long f() {
        if (!this.M) {
            return -9223372036854775807L;
        }
        if (!this.T && B() <= this.S) {
            return -9223372036854775807L;
        }
        this.M = false;
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final fj4 g() {
        E();
        return this.G.f9766a;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long h(long j10) {
        E();
        boolean[] zArr = this.G.f9767b;
        if (true != this.H.g()) {
            j10 = 0;
        }
        this.M = false;
        this.P = j10;
        if (J()) {
            this.Q = j10;
            return j10;
        }
        if (this.K != 7) {
            int length = this.B.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.B[i10].K(j10, false) || (!zArr[i10] && this.F)) {
                }
            }
            return j10;
        }
        this.R = false;
        this.Q = j10;
        this.T = false;
        ul4 ul4Var = this.f10509t;
        if (ul4Var.l()) {
            for (wi4 wi4Var : this.B) {
                wi4Var.z();
            }
            this.f10509t.g();
        } else {
            ul4Var.h();
            for (wi4 wi4Var2 : this.B) {
                wi4Var2.E(false);
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.ml4
    public final /* bridge */ /* synthetic */ ol4 i(ql4 ql4Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        ol4 ol4VarB;
        o0 o0Var;
        ei4 ei4Var = (ei4) ql4Var;
        zx3 zx3Var = ei4Var.f7812c;
        xg4 xg4Var = new xg4(ei4Var.f7810a, ei4Var.f7820k, zx3Var.h(), zx3Var.i(), j10, j11, zx3Var.g());
        long unused = ei4Var.f7819j;
        int i11 = sv2.f15560a;
        if ((iOException instanceof oh0) || (iOException instanceof FileNotFoundException) || (iOException instanceof vo3) || (iOException instanceof tl4)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof t63) && ((t63) cause).f15703m == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        if (jMin == -9223372036854775807L) {
            ol4VarB = ul4.f16383g;
        } else {
            int iB = B();
            boolean z10 = iB > this.S;
            if (this.O || !((o0Var = this.H) == null || o0Var.c() == -9223372036854775807L)) {
                this.S = iB;
            } else {
                boolean z11 = this.E;
                if (!z11 || K()) {
                    this.M = z11;
                    this.P = 0L;
                    this.S = 0;
                    for (wi4 wi4Var : this.B) {
                        wi4Var.E(false);
                    }
                    ei4.f(ei4Var, 0L, 0L);
                } else {
                    this.R = true;
                    ol4VarB = ul4.f16382f;
                }
            }
            ol4VarB = ul4.b(z10, jMin);
        }
        ol4 ol4Var = ol4VarB;
        boolean z12 = !ol4Var.c();
        this.f10505p.j(xg4Var, 1, -1, null, 0, null, ei4Var.f7819j, this.I, iOException, z12);
        if (z12) {
            long unused2 = ei4Var.f7810a;
        }
        return ol4Var;
    }

    @Override // com.google.android.gms.internal.ads.vi4
    public final void j(k9 k9Var) {
        this.f10514y.post(this.f10512w);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void k() throws IOException {
        x();
        if (this.T && !this.E) {
            throw oh0.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ml4
    public final /* bridge */ /* synthetic */ void l(ql4 ql4Var, long j10, long j11, boolean z10) {
        ei4 ei4Var = (ei4) ql4Var;
        zx3 zx3Var = ei4Var.f7812c;
        xg4 xg4Var = new xg4(ei4Var.f7810a, ei4Var.f7820k, zx3Var.h(), zx3Var.i(), j10, j11, zx3Var.g());
        long unused = ei4Var.f7810a;
        this.f10505p.f(xg4Var, 1, -1, null, 0, null, ei4Var.f7819j, this.I);
        if (z10) {
            return;
        }
        for (wi4 wi4Var : this.B) {
            wi4Var.E(false);
        }
        if (this.N > 0) {
            eh4 eh4Var = this.f10515z;
            Objects.requireNonNull(eh4Var);
            eh4Var.l(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void m(long j10, boolean z10) {
        E();
        if (J()) {
            return;
        }
        boolean[] zArr = this.G.f9768c;
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.B[i10].y(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long n(long j10, x84 x84Var) {
        E();
        if (!this.H.g()) {
            return 0L;
        }
        m0 m0VarH = this.H.h(j10);
        long j11 = m0VarH.f11886a.f13490a;
        long j12 = m0VarH.f11887b.f13490a;
        long j13 = x84Var.f17479a;
        if (j13 == 0) {
            if (x84Var.f17480b == 0) {
                return j10;
            }
            j13 = 0;
        }
        int i10 = sv2.f15560a;
        long j14 = j10 - j13;
        long j15 = x84Var.f17480b;
        long j16 = j10 + j15;
        long j17 = j10 ^ j16;
        long j18 = j15 ^ j16;
        if (((j13 ^ j10) & (j10 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        if ((j17 & j18) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = j14 <= j11 && j11 <= j16;
        boolean z11 = j14 <= j12 && j12 <= j16;
        if (z10 && z11) {
            if (Math.abs(j11 - j10) > Math.abs(j12 - j10)) {
                return j12;
            }
        } else if (!z10) {
            return z11 ? j12 : j14;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean o() {
        return this.f10509t.l() && this.f10511v.d();
    }

    @Override // com.google.android.gms.internal.ads.ml4
    public final /* bridge */ /* synthetic */ void p(ql4 ql4Var, long j10, long j11) {
        o0 o0Var;
        if (this.I == -9223372036854775807L && (o0Var = this.H) != null) {
            boolean zG = o0Var.g();
            long jC = C(true);
            long j12 = jC == Long.MIN_VALUE ? 0L : jC + 10000;
            this.I = j12;
            this.f10507r.d(j12, zG, this.J);
        }
        ei4 ei4Var = (ei4) ql4Var;
        zx3 zx3Var = ei4Var.f7812c;
        xg4 xg4Var = new xg4(ei4Var.f7810a, ei4Var.f7820k, zx3Var.h(), zx3Var.i(), j10, j11, zx3Var.g());
        long unused = ei4Var.f7810a;
        this.f10505p.h(xg4Var, 1, -1, null, 0, null, ei4Var.f7819j, this.I);
        this.T = true;
        eh4 eh4Var = this.f10515z;
        Objects.requireNonNull(eh4Var);
        eh4Var.l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.google.android.gms.internal.ads.fh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(com.google.android.gms.internal.ads.rk4[] r8, boolean[] r9, com.google.android.gms.internal.ads.xi4[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ji4.q(com.google.android.gms.internal.ads.rk4[], boolean[], com.google.android.gms.internal.ads.xi4[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.rl4
    public final void s() {
        for (wi4 wi4Var : this.B) {
            wi4Var.D();
        }
        this.f10510u.c();
    }

    final /* synthetic */ void u() {
        if (this.U) {
            return;
        }
        eh4 eh4Var = this.f10515z;
        Objects.requireNonNull(eh4Var);
        eh4Var.l(this);
    }

    final /* synthetic */ void v() {
        this.O = true;
    }

    final /* synthetic */ void w(o0 o0Var) {
        this.H = this.A == null ? o0Var : new n0(-9223372036854775807L, 0L);
        this.I = o0Var.c();
        boolean z10 = false;
        if (!this.O && o0Var.c() == -9223372036854775807L) {
            z10 = true;
        }
        this.J = z10;
        this.K = true == z10 ? 7 : 1;
        this.f10507r.d(this.I, o0Var.g(), this.J);
        if (this.E) {
            return;
        }
        F();
    }

    final void x() throws IOException {
        this.f10509t.i(ll4.a(this.K));
    }

    final void y(int i10) {
        this.B[i10].B();
        x();
    }

    public final void z() {
        if (this.E) {
            for (wi4 wi4Var : this.B) {
                wi4Var.C();
            }
        }
        this.f10509t.j(this);
        this.f10514y.removeCallbacksAndMessages(null);
        this.f10515z = null;
        this.U = true;
    }
}
