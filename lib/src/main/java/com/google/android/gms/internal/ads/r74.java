package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class r74 implements Handler.Callback, eh4, wk4, l84, l54, o84 {
    private final ArrayList A;
    private final hu1 B;
    private final a84 C;
    private final m84 D;
    private final long E;
    private x84 F;
    private n84 G;
    private p74 H;
    private boolean I;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private q74 T;
    private long U;
    private int V;
    private boolean W;
    private o54 X;
    private final w64 Z;

    /* renamed from: a0, reason: collision with root package name */
    private final j54 f14662a0;

    /* renamed from: m, reason: collision with root package name */
    private final t84[] f14663m;

    /* renamed from: n, reason: collision with root package name */
    private final Set f14664n;

    /* renamed from: o, reason: collision with root package name */
    private final u84[] f14665o;

    /* renamed from: p, reason: collision with root package name */
    private final xk4 f14666p;

    /* renamed from: q, reason: collision with root package name */
    private final yk4 f14667q;

    /* renamed from: r, reason: collision with root package name */
    private final v74 f14668r;

    /* renamed from: s, reason: collision with root package name */
    private final gl4 f14669s;

    /* renamed from: t, reason: collision with root package name */
    private final r32 f14670t;

    /* renamed from: u, reason: collision with root package name */
    private final HandlerThread f14671u;

    /* renamed from: v, reason: collision with root package name */
    private final Looper f14672v;

    /* renamed from: w, reason: collision with root package name */
    private final g01 f14673w;

    /* renamed from: x, reason: collision with root package name */
    private final ey0 f14674x;

    /* renamed from: y, reason: collision with root package name */
    private final long f14675y;

    /* renamed from: z, reason: collision with root package name */
    private final m54 f14676z;
    private int N = 0;
    private boolean O = false;
    private boolean J = false;
    private long Y = -9223372036854775807L;

    public r74(t84[] t84VarArr, xk4 xk4Var, yk4 yk4Var, v74 v74Var, gl4 gl4Var, int i10, boolean z10, i94 i94Var, x84 x84Var, j54 j54Var, long j10, boolean z11, Looper looper, hu1 hu1Var, w64 w64Var, xb4 xb4Var, Looper looper2) {
        this.Z = w64Var;
        this.f14663m = t84VarArr;
        this.f14666p = xk4Var;
        this.f14667q = yk4Var;
        this.f14668r = v74Var;
        this.f14669s = gl4Var;
        this.F = x84Var;
        this.f14662a0 = j54Var;
        this.E = j10;
        this.B = hu1Var;
        this.f14675y = v74Var.a();
        v74Var.e();
        n84 n84VarG = n84.g(yk4Var);
        this.G = n84VarG;
        this.H = new p74(n84VarG);
        int length = t84VarArr.length;
        this.f14665o = new u84[2];
        for (int i11 = 0; i11 < 2; i11++) {
            t84VarArr[i11].q(i11, xb4Var);
            this.f14665o[i11] = t84VarArr[i11].j();
        }
        this.f14676z = new m54(this, hu1Var);
        this.A = new ArrayList();
        this.f14664n = Collections.newSetFromMap(new IdentityHashMap());
        this.f14673w = new g01();
        this.f14674x = new ey0();
        xk4Var.g(this, gl4Var);
        this.W = true;
        r32 r32VarB = hu1Var.b(looper, null);
        this.C = new a84(i94Var, r32VarB);
        this.D = new m84(this, i94Var, r32VarB, xb4Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f14671u = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.f14672v = looper3;
        this.f14670t = hu1Var.b(looper3, this);
    }

    private final void A() {
        this.L = false;
        this.f14676z.g();
        t84[] t84VarArr = this.f14663m;
        int length = t84VarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            t84 t84Var = t84VarArr[i10];
            if (J(t84Var)) {
                t84Var.E();
            }
        }
    }

    private final void B(boolean z10, boolean z11) {
        r(z10 || !this.P, false, true, false);
        this.H.a(z11 ? 1 : 0);
        this.f14668r.f();
        z(1);
    }

    private final void C() {
        this.f14676z.i();
        t84[] t84VarArr = this.f14663m;
        int length = t84VarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            t84 t84Var = t84VarArr[i10];
            if (J(t84Var)) {
                Q(t84Var);
            }
        }
    }

    private final void D() {
        x74 x74VarF = this.C.f();
        boolean z10 = this.M || (x74VarF != null && x74VarF.f17452a.o());
        n84 n84Var = this.G;
        if (z10 != n84Var.f12519g) {
            this.G = new n84(n84Var.f12513a, n84Var.f12514b, n84Var.f12515c, n84Var.f12516d, n84Var.f12517e, n84Var.f12518f, z10, n84Var.f12520h, n84Var.f12521i, n84Var.f12522j, n84Var.f12523k, n84Var.f12524l, n84Var.f12525m, n84Var.f12526n, n84Var.f12528p, n84Var.f12529q, n84Var.f12530r, n84Var.f12527o);
        }
    }

    private final void E(fj4 fj4Var, yk4 yk4Var) {
        this.f14668r.c(this.f14663m, fj4Var, yk4Var.f18087c);
    }

    private final void F() {
        x74 x74VarG = this.C.g();
        if (x74VarG == null) {
            return;
        }
        long jF = x74VarG.f17455d ? x74VarG.f17452a.f() : -9223372036854775807L;
        if (jF != -9223372036854775807L) {
            t(jF);
            if (jF != this.G.f12530r) {
                n84 n84Var = this.G;
                this.G = l0(n84Var.f12514b, jF, n84Var.f12515c, jF, true, 5);
            }
        } else {
            long jB = this.f14676z.b(x74VarG != this.C.h());
            this.U = jB;
            long jE = jB - x74VarG.e();
            long j10 = this.G.f12530r;
            if (!this.A.isEmpty() && !this.G.f12514b.b()) {
                if (this.W) {
                    this.W = false;
                }
                n84 n84Var2 = this.G;
                n84Var2.f12513a.a(n84Var2.f12514b.f10401a);
                int iMin = Math.min(this.V, this.A.size());
                if (iMin > 0) {
                    a5.a.a(this.A.get(iMin - 1));
                }
                if (iMin < this.A.size()) {
                    a5.a.a(this.A.get(iMin));
                }
                this.V = iMin;
            }
            this.G.f12530r = jE;
        }
        this.G.f12528p = this.C.f().c();
        this.G.f12529q = f0();
        n84 n84Var3 = this.G;
        if (n84Var3.f12524l && n84Var3.f12517e == 3 && N(n84Var3.f12513a, n84Var3.f12514b)) {
            n84 n84Var4 = this.G;
            if (n84Var4.f12526n.f15313a == 1.0f) {
                float fA = this.f14662a0.a(e0(n84Var4.f12513a, n84Var4.f12514b.f10401a, n84Var4.f12530r), f0());
                if (this.f14676z.d().f15313a != fA) {
                    x(new sl0(fA, this.G.f12526n.f15314b));
                    o(this.G.f12526n, this.f14676z.d().f15313a, false, false);
                }
            }
        }
    }

    private final void G(h11 h11Var, hh4 hh4Var, h11 h11Var2, hh4 hh4Var2, long j10) {
        if (!N(h11Var, hh4Var)) {
            sl0 sl0Var = hh4Var.b() ? sl0.f15309d : this.G.f12526n;
            if (this.f14676z.d().equals(sl0Var)) {
                return;
            }
            x(sl0Var);
            o(this.G.f12526n, sl0Var.f15313a, false, false);
            return;
        }
        h11Var.e(h11Var.n(hh4Var.f10401a, this.f14674x).f8041c, this.f14673w, 0L);
        j54 j54Var = this.f14662a0;
        fu fuVar = this.f14673w.f8538i;
        int i10 = sv2.f15560a;
        j54Var.d(fuVar);
        if (j10 != -9223372036854775807L) {
            this.f14662a0.e(e0(h11Var, hh4Var.f10401a, j10));
            return;
        }
        if (sv2.b(!h11Var2.o() ? h11Var2.e(h11Var2.n(hh4Var2.f10401a, this.f14674x).f8041c, this.f14673w, 0L).f8530a : null, this.f14673w.f8530a)) {
            return;
        }
        this.f14662a0.e(-9223372036854775807L);
    }

    private final synchronized void H(z33 z33Var, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!Boolean.valueOf(((k74) z33Var).f10862m.I).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean I() {
        x74 x74VarF = this.C.f();
        return (x74VarF == null || x74VarF.d() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean J(t84 t84Var) {
        return t84Var.k() != 0;
    }

    private final boolean K() {
        x74 x74VarG = this.C.g();
        long j10 = x74VarG.f17457f.f17925e;
        if (!x74VarG.f17455d) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.G.f12530r < j10) {
            return true;
        }
        return !M();
    }

    private static boolean L(n84 n84Var, ey0 ey0Var) {
        hh4 hh4Var = n84Var.f12514b;
        h11 h11Var = n84Var.f12513a;
        return h11Var.o() || h11Var.n(hh4Var.f10401a, ey0Var).f8044f;
    }

    private final boolean M() {
        n84 n84Var = this.G;
        return n84Var.f12524l && n84Var.f12525m == 0;
    }

    private final boolean N(h11 h11Var, hh4 hh4Var) {
        if (!hh4Var.b() && !h11Var.o()) {
            h11Var.e(h11Var.n(hh4Var.f10401a, this.f14674x).f8041c, this.f14673w, 0L);
            if (this.f14673w.b()) {
                g01 g01Var = this.f14673w;
                if (g01Var.f8536g && g01Var.f8533d != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static k9[] O(rk4 rk4Var) {
        int iD = rk4Var != null ? rk4Var.d() : 0;
        k9[] k9VarArr = new k9[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            k9VarArr[i10] = rk4Var.j(i10);
        }
        return k9VarArr;
    }

    private static final void P(q84 q84Var) {
        q84Var.j();
        try {
            q84Var.c().u(q84Var.a(), q84Var.g());
        } finally {
            q84Var.h(true);
        }
    }

    private static final void Q(t84 t84Var) {
        if (t84Var.k() == 2) {
            t84Var.z();
        }
    }

    private static final void R(t84 t84Var, long j10) {
        t84Var.Q();
    }

    static Object V(g01 g01Var, ey0 ey0Var, int i10, boolean z10, Object obj, h11 h11Var, h11 h11Var2) {
        int iA = h11Var.a(obj);
        int iB = h11Var.b();
        int i11 = 0;
        int i12 = iA;
        int iA2 = -1;
        while (true) {
            if (i11 >= iB || iA2 != -1) {
                break;
            }
            i12 = h11Var.i(i12, ey0Var, g01Var, i10, z10);
            if (i12 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = h11Var2.a(h11Var.f(i12));
            i11++;
        }
        if (iA2 == -1) {
            return null;
        }
        return h11Var2.f(iA2);
    }

    private final void c(t84 t84Var) {
        if (J(t84Var)) {
            this.f14676z.c(t84Var);
            Q(t84Var);
            t84Var.m();
            this.S--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04bb  */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() throws com.google.android.gms.internal.ads.o54 {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r74.d():void");
    }

    static final /* synthetic */ void d0(q84 q84Var) {
        try {
            P(q84Var);
        } catch (o54 e5) {
            ad2.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e5);
            throw new RuntimeException(e5);
        }
    }

    private final void e() throws o54 {
        int length = this.f14663m.length;
        f(new boolean[2]);
    }

    private final long e0(h11 h11Var, Object obj, long j10) {
        h11Var.e(h11Var.n(obj, this.f14674x).f8041c, this.f14673w, 0L);
        g01 g01Var = this.f14673w;
        if (g01Var.f8533d != -9223372036854775807L && g01Var.b()) {
            g01 g01Var2 = this.f14673w;
            if (g01Var2.f8536g) {
                long j11 = g01Var2.f8534e;
                return sv2.w((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.f14673w.f8533d) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final void f(boolean[] zArr) throws o54 {
        x74 x74VarH = this.C.h();
        yk4 yk4VarI = x74VarH.i();
        int i10 = 0;
        while (true) {
            int length = this.f14663m.length;
            if (i10 >= 2) {
                break;
            }
            if (!yk4VarI.b(i10) && this.f14664n.remove(this.f14663m[i10])) {
                this.f14663m[i10].F();
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = this.f14663m.length;
            if (i11 >= 2) {
                x74VarH.f17458g = true;
                return;
            }
            if (yk4VarI.b(i11)) {
                boolean z10 = zArr[i11];
                t84 t84Var = this.f14663m[i11];
                if (!J(t84Var)) {
                    x74 x74VarH2 = this.C.h();
                    boolean z11 = x74VarH2 == this.C.g();
                    yk4 yk4VarI2 = x74VarH2.i();
                    w84 w84Var = yk4VarI2.f18086b[i11];
                    k9[] k9VarArrO = O(yk4VarI2.f18087c[i11]);
                    boolean z12 = M() && this.G.f12517e == 3;
                    boolean z13 = !z10 && z12;
                    this.S++;
                    this.f14664n.add(t84Var);
                    t84Var.t(w84Var, k9VarArrO, x74VarH2.f17454c[i11], this.U, z13, z11, x74VarH2.f(), x74VarH2.e());
                    t84Var.u(11, new m74(this));
                    this.f14676z.e(t84Var);
                    if (z12) {
                        t84Var.E();
                    }
                }
            }
            i11++;
        }
    }

    private final long f0() {
        return g0(this.G.f12528p);
    }

    private final long g0(long j10) {
        x74 x74VarF = this.C.f();
        if (x74VarF == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.U - x74VarF.e()));
    }

    private final void h(IOException iOException, int i10) {
        o54 o54VarC = o54.c(iOException, i10);
        x74 x74VarG = this.C.g();
        if (x74VarG != null) {
            o54VarC = o54VarC.a(x74VarG.f17457f.f17921a);
        }
        ad2.c("ExoPlayerImplInternal", "Playback error", o54VarC);
        B(false, false);
        this.G = this.G.d(o54VarC);
    }

    private final long h0(hh4 hh4Var, long j10, boolean z10) {
        return i0(hh4Var, j10, this.C.g() != this.C.h(), z10);
    }

    private final long i0(hh4 hh4Var, long j10, boolean z10, boolean z11) throws o54 {
        C();
        this.L = false;
        if (z11 || this.G.f12517e == 3) {
            z(2);
        }
        x74 x74VarG = this.C.g();
        x74 x74VarG2 = x74VarG;
        while (x74VarG2 != null && !hh4Var.equals(x74VarG2.f17457f.f17921a)) {
            x74VarG2 = x74VarG2.g();
        }
        if (z10 || x74VarG != x74VarG2 || (x74VarG2 != null && x74VarG2.e() + j10 < 0)) {
            t84[] t84VarArr = this.f14663m;
            int length = t84VarArr.length;
            for (int i10 = 0; i10 < 2; i10++) {
                c(t84VarArr[i10]);
            }
            if (x74VarG2 != null) {
                while (this.C.g() != x74VarG2) {
                    this.C.d();
                }
                this.C.p(x74VarG2);
                x74VarG2.p(1000000000000L);
                e();
            }
        }
        a84 a84Var = this.C;
        if (x74VarG2 != null) {
            a84Var.p(x74VarG2);
            if (!x74VarG2.f17455d) {
                x74VarG2.f17457f = x74VarG2.f17457f.b(j10);
            } else if (x74VarG2.f17456e) {
                j10 = x74VarG2.f17452a.h(j10);
                x74VarG2.f17452a.m(j10 - this.f14675y, false);
            }
            t(j10);
            p();
        } else {
            a84Var.l();
            t(j10);
        }
        k(false);
        this.f14670t.a0(2);
        return j10;
    }

    private final Pair j0(h11 h11Var) {
        long j10 = 0;
        if (h11Var.o()) {
            return Pair.create(n84.h(), 0L);
        }
        Pair pairL = h11Var.l(this.f14673w, this.f14674x, h11Var.g(this.O), -9223372036854775807L);
        hh4 hh4VarK = this.C.k(h11Var, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (hh4VarK.b()) {
            h11Var.n(hh4VarK.f10401a, this.f14674x);
            if (hh4VarK.f10403c == this.f14674x.e(hh4VarK.f10402b)) {
                this.f14674x.i();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(hh4VarK, Long.valueOf(j10));
    }

    private final void k(boolean z10) {
        x74 x74VarF = this.C.f();
        hh4 hh4Var = x74VarF == null ? this.G.f12514b : x74VarF.f17457f.f17921a;
        boolean z11 = !this.G.f12523k.equals(hh4Var);
        if (z11) {
            this.G = this.G.a(hh4Var);
        }
        n84 n84Var = this.G;
        n84Var.f12528p = x74VarF == null ? n84Var.f12530r : x74VarF.c();
        this.G.f12529q = f0();
        if ((z11 || z10) && x74VarF != null && x74VarF.f17455d) {
            E(x74VarF.h(), x74VarF.i());
        }
    }

    private static Pair k0(h11 h11Var, q74 q74Var, boolean z10, int i10, boolean z11, g01 g01Var, ey0 ey0Var) {
        Pair pairL;
        int i11;
        long j10;
        h11 h11Var2 = q74Var.f14182a;
        if (h11Var.o()) {
            return null;
        }
        h11 h11Var3 = true == h11Var2.o() ? h11Var : h11Var2;
        try {
            pairL = h11Var3.l(g01Var, ey0Var, q74Var.f14183b, q74Var.f14184c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (h11Var.equals(h11Var3)) {
            return pairL;
        }
        if (h11Var.a(pairL.first) == -1) {
            Object objV = V(g01Var, ey0Var, i10, z11, pairL.first, h11Var3, h11Var);
            if (objV != null) {
                i11 = h11Var.n(objV, ey0Var).f8041c;
                j10 = -9223372036854775807L;
            }
            return null;
        }
        if (!h11Var3.n(pairL.first, ey0Var).f8044f || h11Var3.e(ey0Var.f8041c, g01Var, 0L).f8542m != h11Var3.a(pairL.first)) {
            return pairL;
        }
        i11 = h11Var.n(pairL.first, ey0Var).f8041c;
        j10 = q74Var.f14184c;
        return h11Var.l(g01Var, ey0Var, i11, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.n84 l0(com.google.android.gms.internal.ads.hh4 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r74.l0(com.google.android.gms.internal.ads.hh4, long, long, long, boolean, int):com.google.android.gms.internal.ads.n84");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.ey0] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.android.gms.internal.ads.q74] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.google.android.gms.internal.ads.r74] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.h11] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.gms.internal.ads.h11] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(com.google.android.gms.internal.ads.h11 r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r74.m(com.google.android.gms.internal.ads.h11, boolean):void");
    }

    private final void n(sl0 sl0Var, boolean z10) {
        o(sl0Var, sl0Var.f15313a, true, z10);
    }

    private final void o(sl0 sl0Var, float f5, boolean z10, boolean z11) {
        int i10;
        r74 r74Var = this;
        if (z10) {
            if (z11) {
                r74Var.H.a(1);
            }
            n84 n84Var = r74Var.G;
            r74Var = this;
            r74Var.G = new n84(n84Var.f12513a, n84Var.f12514b, n84Var.f12515c, n84Var.f12516d, n84Var.f12517e, n84Var.f12518f, n84Var.f12519g, n84Var.f12520h, n84Var.f12521i, n84Var.f12522j, n84Var.f12523k, n84Var.f12524l, n84Var.f12525m, sl0Var, n84Var.f12528p, n84Var.f12529q, n84Var.f12530r, n84Var.f12527o);
        }
        float f10 = sl0Var.f15313a;
        x74 x74VarG = r74Var.C.g();
        while (true) {
            i10 = 0;
            if (x74VarG == null) {
                break;
            }
            rk4[] rk4VarArr = x74VarG.i().f18087c;
            int length = rk4VarArr.length;
            while (i10 < length) {
                rk4 rk4Var = rk4VarArr[i10];
                i10++;
            }
            x74VarG = x74VarG.g();
        }
        t84[] t84VarArr = r74Var.f14663m;
        int length2 = t84VarArr.length;
        while (i10 < 2) {
            t84 t84Var = t84VarArr[i10];
            if (t84Var != null) {
                t84Var.l(f5, sl0Var.f15313a);
            }
            i10++;
        }
    }

    private final void p() {
        long jE;
        long jE2;
        boolean zH = false;
        if (I()) {
            x74 x74VarF = this.C.f();
            long jG0 = g0(x74VarF.d());
            if (x74VarF == this.C.g()) {
                jE = this.U;
                jE2 = x74VarF.e();
            } else {
                jE = this.U - x74VarF.e();
                jE2 = x74VarF.f17457f.f17922b;
            }
            long j10 = jE - jE2;
            boolean zH2 = this.f14668r.h(j10, jG0, this.f14676z.d().f15313a);
            if (zH2 || jG0 >= 500000 || this.f14675y <= 0) {
                zH = zH2;
            } else {
                this.C.g().f17452a.m(this.G.f12530r, false);
                zH = this.f14668r.h(j10, jG0, this.f14676z.d().f15313a);
            }
        }
        this.M = zH;
        if (zH) {
            this.C.f().k(this.U);
        }
        D();
    }

    private final void q() {
        this.H.c(this.G);
        if (this.H.f13621a) {
            w64 w64Var = this.Z;
            w64Var.f17003a.Y(this.H);
            this.H = new p74(this.G);
        }
    }

    private final void r(boolean z10, boolean z11, boolean z12, boolean z13) {
        hh4 hh4Var;
        boolean z14;
        long j10;
        long j11;
        this.f14670t.C(2);
        this.X = null;
        this.L = false;
        this.f14676z.i();
        this.U = 1000000000000L;
        t84[] t84VarArr = this.f14663m;
        int length = t84VarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                c(t84VarArr[i10]);
            } catch (o54 | RuntimeException e5) {
                ad2.c("ExoPlayerImplInternal", "Disable failed.", e5);
            }
        }
        if (z10) {
            t84[] t84VarArr2 = this.f14663m;
            int length2 = t84VarArr2.length;
            for (int i11 = 0; i11 < 2; i11++) {
                t84 t84Var = t84VarArr2[i11];
                if (this.f14664n.remove(t84Var)) {
                    try {
                        t84Var.F();
                    } catch (RuntimeException e10) {
                        ad2.c("ExoPlayerImplInternal", "Reset failed.", e10);
                    }
                }
            }
        }
        this.S = 0;
        n84 n84Var = this.G;
        hh4 hh4Var2 = n84Var.f12514b;
        long j12 = n84Var.f12530r;
        long j13 = (this.G.f12514b.b() || L(this.G, this.f14674x)) ? this.G.f12515c : this.G.f12530r;
        if (z11) {
            this.T = null;
            Pair pairJ0 = j0(this.G.f12513a);
            hh4 hh4Var3 = (hh4) pairJ0.first;
            long jLongValue = ((Long) pairJ0.second).longValue();
            if (hh4Var3.equals(this.G.f12514b)) {
                hh4Var = hh4Var3;
                z14 = false;
            } else {
                z14 = true;
                hh4Var = hh4Var3;
            }
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            hh4Var = hh4Var2;
            z14 = false;
            j10 = j12;
            j11 = j13;
        }
        this.C.l();
        this.M = false;
        n84 n84Var2 = this.G;
        h11 h11Var = n84Var2.f12513a;
        int i12 = n84Var2.f12517e;
        o54 o54Var = z13 ? null : n84Var2.f12518f;
        fj4 fj4Var = z14 ? fj4.f8300d : n84Var2.f12520h;
        yk4 yk4Var = z14 ? this.f14667q : n84Var2.f12521i;
        List listU = z14 ? c63.u() : n84Var2.f12522j;
        n84 n84Var3 = this.G;
        this.G = new n84(h11Var, hh4Var, j11, j10, i12, o54Var, false, fj4Var, yk4Var, listU, hh4Var, n84Var3.f12524l, n84Var3.f12525m, n84Var3.f12526n, j10, 0L, j10, false);
        if (z12) {
            this.D.g();
        }
    }

    private final void s() {
        x74 x74VarG = this.C.g();
        boolean z10 = false;
        if (x74VarG != null && x74VarG.f17457f.f17928h && this.J) {
            z10 = true;
        }
        this.K = z10;
    }

    private final void t(long j10) {
        x74 x74VarG = this.C.g();
        long jE = j10 + (x74VarG == null ? 1000000000000L : x74VarG.e());
        this.U = jE;
        this.f14676z.f(jE);
        t84[] t84VarArr = this.f14663m;
        int length = t84VarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            t84 t84Var = t84VarArr[i10];
            if (J(t84Var)) {
                t84Var.f(this.U);
            }
        }
        for (x74 x74VarG2 = this.C.g(); x74VarG2 != null; x74VarG2 = x74VarG2.g()) {
            for (rk4 rk4Var : x74VarG2.i().f18087c) {
            }
        }
    }

    private final void u(h11 h11Var, h11 h11Var2) {
        if (h11Var.o() && h11Var2.o()) {
            return;
        }
        int size = this.A.size() - 1;
        if (size < 0) {
            Collections.sort(this.A);
        } else {
            a5.a.a(this.A.get(size));
            throw null;
        }
    }

    private final void v(long j10, long j11) {
        this.f14670t.F(2, j10 + j11);
    }

    private final void w(boolean z10) throws o54 {
        hh4 hh4Var = this.C.g().f17457f.f17921a;
        long jI0 = i0(hh4Var, this.G.f12530r, true, false);
        if (jI0 != this.G.f12530r) {
            n84 n84Var = this.G;
            this.G = l0(hh4Var, jI0, n84Var.f12515c, n84Var.f12516d, z10, 5);
        }
    }

    private final void x(sl0 sl0Var) {
        this.f14670t.C(16);
        this.f14676z.h(sl0Var);
    }

    private final void y(boolean z10, int i10, boolean z11, int i11) {
        this.H.a(z11 ? 1 : 0);
        this.H.b(i11);
        this.G = this.G.c(z10, i10);
        this.L = false;
        for (x74 x74VarG = this.C.g(); x74VarG != null; x74VarG = x74VarG.g()) {
            for (rk4 rk4Var : x74VarG.i().f18087c) {
            }
        }
        if (!M()) {
            C();
            F();
            return;
        }
        int i12 = this.G.f12517e;
        if (i12 == 3) {
            A();
            this.f14670t.a0(2);
        } else if (i12 == 2) {
            this.f14670t.a0(2);
        }
    }

    private final void z(int i10) {
        n84 n84Var = this.G;
        if (n84Var.f12517e != i10) {
            if (i10 != 2) {
                this.Y = -9223372036854775807L;
            }
            this.G = n84Var.e(i10);
        }
    }

    public final Looper S() {
        return this.f14672v;
    }

    final /* synthetic */ Boolean U() {
        return Boolean.valueOf(this.I);
    }

    public final void X() {
        this.f14670t.K(0).a();
    }

    public final void Y(h11 h11Var, int i10, long j10) {
        this.f14670t.E(3, new q74(h11Var, i10, j10)).a();
    }

    public final void Z(boolean z10, int i10) {
        this.f14670t.I(1, z10 ? 1 : 0, i10).a();
    }

    @Override // com.google.android.gms.internal.ads.o84
    public final synchronized void a(q84 q84Var) {
        if (!this.I && this.f14672v.getThread().isAlive()) {
            this.f14670t.E(14, q84Var).a();
            return;
        }
        ad2.e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        q84Var.h(false);
    }

    public final void a0() {
        this.f14670t.K(6).a();
    }

    @Override // com.google.android.gms.internal.ads.l54
    public final void b(sl0 sl0Var) {
        this.f14670t.E(16, sl0Var).a();
    }

    public final synchronized boolean b0() {
        if (!this.I && this.f14672v.getThread().isAlive()) {
            this.f14670t.a0(7);
            H(new k74(this), this.E);
            return this.I;
        }
        return true;
    }

    public final void c0(List list, int i10, long j10, aj4 aj4Var) {
        this.f14670t.E(17, new o74(list, aj4Var, i10, j10, null)).a();
    }

    @Override // com.google.android.gms.internal.ads.l84
    public final void g() {
        this.f14670t.a0(22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.gl4, com.google.android.gms.internal.ads.wy3] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        IOException iOException;
        int i10;
        boolean z10;
        boolean z11;
        x74 x74VarH;
        int i11;
        r32 r32Var;
        hh4 hh4Var;
        boolean z12;
        long j10;
        long j11;
        Throwable th;
        long j12;
        long j13;
        long jH0;
        boolean z13;
        long j14;
        n84 n84Var;
        int i12;
        n84 n84VarL0;
        r32 r32Var2;
        h11 h11VarL;
        try {
            try {
            } catch (de4 e5) {
                de4 de4Var = e5;
                i10 = de4Var.f7280m;
                iOException = de4Var;
                h(iOException, i10);
            } catch (o54 e10) {
                o54 o54VarA = e10;
                if (o54VarA.f13013u == 1 && (x74VarH = this.C.h()) != null) {
                    o54VarA = o54VarA.a(x74VarH.f17457f.f17921a);
                }
                if (o54VarA.A && this.X == null) {
                    ad2.f("ExoPlayerImplInternal", "Recoverable renderer error", o54VarA);
                    this.X = o54VarA;
                    r32 r32Var3 = this.f14670t;
                    r32Var3.D(r32Var3.E(25, o54VarA));
                } else {
                    o54 o54Var = this.X;
                    if (o54Var != null) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(o54Var, o54VarA);
                        } catch (Exception unused) {
                        }
                        o54VarA = this.X;
                    }
                    o54 o54Var2 = o54VarA;
                    ad2.c("ExoPlayerImplInternal", "Playback error", o54Var2);
                    z10 = true;
                    if (o54Var2.f13013u == 1) {
                        if (this.C.g() != this.C.h()) {
                            while (this.C.g() != this.C.h()) {
                                this.C.d();
                            }
                            x74 x74VarG = this.C.g();
                            Objects.requireNonNull(x74VarG);
                            y74 y74Var = x74VarG.f17457f;
                            hh4 hh4Var2 = y74Var.f17921a;
                            long j15 = y74Var.f17922b;
                            this.G = l0(hh4Var2, j15, y74Var.f17923c, j15, true, 0);
                        }
                        z11 = false;
                        z10 = true;
                    } else {
                        z11 = false;
                    }
                    B(z10, z11);
                    this.G = this.G.d(o54Var2);
                }
            } catch (oh0 e11) {
                h(e11, e11.f13248n == 1 ? true != e11.f13247m ? 3003 : AdError.MEDIATION_ERROR_CODE : AdError.NETWORK_ERROR_CODE);
            } catch (t63 e12) {
                t63 t63Var = e12;
                i10 = t63Var.f15703m;
                iOException = t63Var;
                h(iOException, i10);
            } catch (IOException e13) {
                iOException = e13;
                i10 = AdError.SERVER_ERROR_CODE;
                h(iOException, i10);
            }
        } catch (RuntimeException e14) {
            o54 o54VarD = o54.d(e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : AdError.NETWORK_ERROR_CODE);
            ad2.c("ExoPlayerImplInternal", "Playback error", o54VarD);
            B(true, false);
            this.G = this.G.d(o54VarD);
        }
        switch (message.what) {
            case 0:
                i11 = 2;
                this.H.a(1);
                r(false, false, false, true);
                this.f14668r.b();
                z(true != this.G.f12513a.o() ? 2 : 4);
                this.D.f(this.f14669s);
                r32Var = this.f14670t;
                r32Var.a0(i11);
                z10 = true;
                q();
                return z10;
            case 1:
                y(message.arg1 != 0, message.arg2, true, 1);
                z10 = true;
                q();
                return z10;
            case 2:
                d();
                z10 = true;
                q();
                return z10;
            case 3:
                q74 q74Var = (q74) message.obj;
                this.H.a(1);
                Pair pairK0 = k0(this.G.f12513a, q74Var, true, this.N, this.O, this.f14673w, this.f14674x);
                if (pairK0 == null) {
                    Pair pairJ0 = j0(this.G.f12513a);
                    hh4Var = (hh4) pairJ0.first;
                    long jLongValue = ((Long) pairJ0.second).longValue();
                    z12 = !this.G.f12513a.o();
                    j10 = jLongValue;
                    j11 = -9223372036854775807L;
                } else {
                    Object obj = pairK0.first;
                    long jLongValue2 = ((Long) pairK0.second).longValue();
                    long j16 = q74Var.f14184c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                    hh4 hh4VarK = this.C.k(this.G.f12513a, obj, jLongValue2);
                    if (hh4VarK.b()) {
                        this.G.f12513a.n(hh4VarK.f10401a, this.f14674x);
                        if (this.f14674x.e(hh4VarK.f10402b) == hh4VarK.f10403c) {
                            this.f14674x.i();
                        }
                        j11 = j16;
                        j10 = 0;
                        z12 = true;
                        hh4Var = hh4VarK;
                    } else {
                        long j17 = j16;
                        hh4Var = hh4VarK;
                        z12 = q74Var.f14184c == -9223372036854775807L;
                        j10 = jLongValue2;
                        j11 = j17;
                    }
                }
                try {
                    if (this.G.f12513a.o()) {
                        this.T = q74Var;
                    } else if (pairK0 == null) {
                        if (this.G.f12517e != 1) {
                            z(4);
                        }
                        r(false, true, false, true);
                    } else {
                        try {
                            if (hh4Var.equals(this.G.f12514b)) {
                                x74 x74VarG2 = this.C.g();
                                long jN = (x74VarG2 == null || !x74VarG2.f17455d || j10 == 0) ? j10 : x74VarG2.f17452a.n(j10, this.F);
                                long j18 = jN;
                                if (sv2.y(jN) == sv2.y(this.G.f12530r) && ((i12 = (n84Var = this.G).f12517e) == 2 || i12 == 3)) {
                                    long j19 = n84Var.f12530r;
                                    n84VarL0 = l0(hh4Var, j19, j11, j19, z12, 2);
                                    this.G = n84VarL0;
                                    z10 = true;
                                    q();
                                    return z10;
                                }
                                j13 = j18;
                            } else {
                                j13 = j10;
                            }
                            n84 n84Var2 = this.G;
                            h11 h11Var = n84Var2.f12513a;
                            G(h11Var, hh4Var, h11Var, n84Var2.f12514b, j11);
                            z12 = z13;
                            j14 = jH0;
                            n84VarL0 = l0(hh4Var, j14, j11, j14, z12, 2);
                            this.G = n84VarL0;
                            z10 = true;
                            q();
                            return z10;
                        } catch (Throwable th2) {
                            z12 = z13;
                            j12 = jH0;
                            th = th2;
                            this.G = l0(hh4Var, j12, j11, j12, z12, 2);
                            throw th;
                        }
                        jH0 = h0(hh4Var, j13, this.G.f12517e == 4);
                        z13 = z12 | (j10 != jH0);
                    }
                    j14 = j10;
                    n84VarL0 = l0(hh4Var, j14, j11, j14, z12, 2);
                    this.G = n84VarL0;
                    z10 = true;
                    q();
                    return z10;
                } catch (Throwable th3) {
                    th = th3;
                    j12 = j10;
                }
                break;
            case 4:
                x((sl0) message.obj);
                n(this.f14676z.d(), true);
                z10 = true;
                q();
                return z10;
            case 5:
                this.F = (x84) message.obj;
                z10 = true;
                q();
                return z10;
            case 6:
                B(false, true);
                z10 = true;
                q();
                return z10;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                r(true, false, true, false);
                this.f14668r.d();
                z(1);
                HandlerThread handlerThread = this.f14671u;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                synchronized (this) {
                    this.I = true;
                    notifyAll();
                }
                return true;
            case 8:
                if (this.C.o((fh4) message.obj)) {
                    x74 x74VarF = this.C.f();
                    x74VarF.l(this.f14676z.d().f15313a, this.G.f12513a);
                    E(x74VarF.h(), x74VarF.i());
                    if (x74VarF == this.C.g()) {
                        t(x74VarF.f17457f.f17922b);
                        e();
                        n84 n84Var3 = this.G;
                        hh4 hh4Var3 = n84Var3.f12514b;
                        long j20 = x74VarF.f17457f.f17922b;
                        this.G = l0(hh4Var3, j20, n84Var3.f12515c, j20, false, 5);
                    }
                    p();
                }
                z10 = true;
                q();
                return z10;
            case 9:
                if (this.C.o((fh4) message.obj)) {
                    this.C.n(this.U);
                    p();
                }
                z10 = true;
                q();
                return z10;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                float f5 = this.f14676z.d().f15313a;
                x74 x74VarG3 = this.C.g();
                x74 x74VarH2 = this.C.h();
                boolean z14 = true;
                while (x74VarG3 != null && x74VarG3.f17455d) {
                    yk4 yk4VarJ = x74VarG3.j(f5, this.G.f12513a);
                    yk4 yk4VarI = x74VarG3.i();
                    if (yk4VarI != null && yk4VarI.f18087c.length == yk4VarJ.f18087c.length) {
                        for (int i13 = 0; i13 < yk4VarJ.f18087c.length; i13++) {
                            if (yk4VarJ.a(yk4VarI, i13)) {
                            }
                        }
                        z14 &= x74VarG3 != x74VarH2;
                        x74VarG3 = x74VarG3.g();
                    }
                    if (z14) {
                        x74 x74VarG4 = this.C.g();
                        boolean zP = this.C.p(x74VarG4);
                        int length = this.f14663m.length;
                        boolean[] zArr = new boolean[2];
                        long jB = x74VarG4.b(yk4VarJ, this.G.f12530r, zP, zArr);
                        n84 n84Var4 = this.G;
                        boolean z15 = (n84Var4.f12517e == 4 || jB == n84Var4.f12530r) ? false : true;
                        n84 n84Var5 = this.G;
                        i11 = 2;
                        this.G = l0(n84Var5.f12514b, jB, n84Var5.f12515c, n84Var5.f12516d, z15, 5);
                        if (z15) {
                            t(jB);
                        }
                        int length2 = this.f14663m.length;
                        boolean[] zArr2 = new boolean[2];
                        int i14 = 0;
                        while (true) {
                            t84[] t84VarArr = this.f14663m;
                            int length3 = t84VarArr.length;
                            if (i14 < 2) {
                                t84 t84Var = t84VarArr[i14];
                                boolean zJ = J(t84Var);
                                zArr2[i14] = zJ;
                                xi4 xi4Var = x74VarG4.f17454c[i14];
                                if (zJ) {
                                    if (xi4Var != t84Var.n()) {
                                        c(t84Var);
                                    } else if (zArr[i14]) {
                                        t84Var.f(this.U);
                                    }
                                }
                                i14++;
                            } else {
                                f(zArr2);
                            }
                        }
                    } else {
                        i11 = 2;
                        this.C.p(x74VarG3);
                        if (x74VarG3.f17455d) {
                            x74VarG3.a(yk4VarJ, Math.max(x74VarG3.f17457f.f17922b, this.U - x74VarG3.e()), false);
                        }
                    }
                    k(true);
                    if (this.G.f12517e != 4) {
                        p();
                        F();
                        r32Var = this.f14670t;
                        r32Var.a0(i11);
                    }
                    z10 = true;
                    q();
                    return z10;
                }
                z10 = true;
                q();
                return z10;
            case 11:
                int i15 = message.arg1;
                this.N = i15;
                if (!this.C.s(this.G.f12513a, i15)) {
                    w(true);
                }
                k(false);
                z10 = true;
                q();
                return z10;
            case 12:
                boolean z16 = message.arg1 != 0;
                this.O = z16;
                if (!this.C.t(this.G.f12513a, z16)) {
                    w(true);
                }
                k(false);
                z10 = true;
                q();
                return z10;
            case 13:
                boolean z17 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.P != z17) {
                    this.P = z17;
                    if (!z17) {
                        t84[] t84VarArr2 = this.f14663m;
                        int length4 = t84VarArr2.length;
                        for (int i16 = 0; i16 < 2; i16++) {
                            t84 t84Var2 = t84VarArr2[i16];
                            if (!J(t84Var2) && this.f14664n.remove(t84Var2)) {
                                t84Var2.F();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z10 = true;
                q();
                return z10;
            case 14:
                q84 q84Var = (q84) message.obj;
                if (q84Var.b() == this.f14672v) {
                    P(q84Var);
                    int i17 = this.G.f12517e;
                    if (i17 == 3 || i17 == 2) {
                        r32Var2 = this.f14670t;
                        r32Var2.a0(2);
                    }
                } else {
                    this.f14670t.E(15, q84Var).a();
                }
                z10 = true;
                q();
                return z10;
            case 15:
                final q84 q84Var2 = (q84) message.obj;
                Looper looperB = q84Var2.b();
                if (looperB.getThread().isAlive()) {
                    this.B.b(looperB, null).H(new Runnable() { // from class: com.google.android.gms.internal.ads.l74
                        @Override // java.lang.Runnable
                        public final void run() {
                            r74.d0(q84Var2);
                        }
                    });
                } else {
                    ad2.e("TAG", "Trying to send message on a dead thread.");
                    q84Var2.h(false);
                }
                z10 = true;
                q();
                return z10;
            case 16:
                n((sl0) message.obj, false);
                z10 = true;
                q();
                return z10;
            case 17:
                o74 o74Var = (o74) message.obj;
                this.H.a(1);
                if (o74Var.f13048b != -1) {
                    this.T = new q74(new r84(o74Var.f13047a, o74Var.f13050d), o74Var.f13048b, o74Var.f13049c);
                }
                h11VarL = this.D.l(o74Var.f13047a, o74Var.f13050d);
                m(h11VarL, false);
                z10 = true;
                q();
                return z10;
            case 18:
                o74 o74Var2 = (o74) message.obj;
                int iA = message.arg1;
                this.H.a(1);
                m84 m84Var = this.D;
                if (iA == -1) {
                    iA = m84Var.a();
                }
                h11VarL = m84Var.j(iA, o74Var2.f13047a, o74Var2.f13050d);
                m(h11VarL, false);
                z10 = true;
                q();
                return z10;
            case 19:
                a5.a.a(message.obj);
                this.H.a(1);
                throw null;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                int i18 = message.arg1;
                int i19 = message.arg2;
                aj4 aj4Var = (aj4) message.obj;
                this.H.a(1);
                h11VarL = this.D.k(i18, i19, aj4Var);
                m(h11VarL, false);
                z10 = true;
                q();
                return z10;
            case 21:
                aj4 aj4Var2 = (aj4) message.obj;
                this.H.a(1);
                h11VarL = this.D.m(aj4Var2);
                m(h11VarL, false);
                z10 = true;
                q();
                return z10;
            case 22:
                m(this.D.b(), true);
                z10 = true;
                q();
                return z10;
            case 23:
                this.J = message.arg1 != 0;
                s();
                if (this.K && this.C.h() != this.C.g()) {
                    w(true);
                    k(false);
                }
                z10 = true;
                q();
                return z10;
            case 24:
                boolean z18 = message.arg1 == 1;
                if (z18 != this.R) {
                    this.R = z18;
                    if (!z18 && this.G.f12527o) {
                        r32Var2 = this.f14670t;
                        r32Var2.a0(2);
                    }
                }
                z10 = true;
                q();
                return z10;
            case 25:
                w(true);
                z10 = true;
                q();
                return z10;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.eh4
    public final void i(fh4 fh4Var) {
        this.f14670t.E(8, fh4Var).a();
    }

    @Override // com.google.android.gms.internal.ads.wk4
    public final void j() {
        this.f14670t.a0(10);
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final /* bridge */ /* synthetic */ void l(zi4 zi4Var) {
        this.f14670t.E(9, (fh4) zi4Var).a();
    }
}
