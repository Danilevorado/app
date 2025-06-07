package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class j74 extends w94 implements a64 {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f10339i0 = 0;
    private final h94 A;
    private final long B;
    private int C;
    private int D;
    private boolean E;
    private int F;
    private x84 G;
    private wp0 H;
    private i90 I;
    private i90 J;
    private k9 K;
    private k9 L;
    private AudioTrack M;
    private Object N;
    private Surface O;
    private int P;
    private kn2 Q;
    private g54 R;
    private g54 S;
    private int T;
    private u74 U;
    private float V;
    private boolean W;
    private fs1 X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private al4 f10340a0;

    /* renamed from: b, reason: collision with root package name */
    final yk4 f10341b;

    /* renamed from: b0, reason: collision with root package name */
    private vh1 f10342b0;

    /* renamed from: c, reason: collision with root package name */
    final wp0 f10343c;

    /* renamed from: c0, reason: collision with root package name */
    private i90 f10344c0;

    /* renamed from: d, reason: collision with root package name */
    private final jw1 f10345d;

    /* renamed from: d0, reason: collision with root package name */
    private n84 f10346d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f10347e;

    /* renamed from: e0, reason: collision with root package name */
    private int f10348e0;

    /* renamed from: f, reason: collision with root package name */
    private final au0 f10349f;

    /* renamed from: f0, reason: collision with root package name */
    private long f10350f0;

    /* renamed from: g, reason: collision with root package name */
    private final t84[] f10351g;

    /* renamed from: g0, reason: collision with root package name */
    private final w64 f10352g0;

    /* renamed from: h, reason: collision with root package name */
    private final xk4 f10353h;

    /* renamed from: h0, reason: collision with root package name */
    private aj4 f10354h0;

    /* renamed from: i, reason: collision with root package name */
    private final r32 f10355i;

    /* renamed from: j, reason: collision with root package name */
    private final r74 f10356j;

    /* renamed from: k, reason: collision with root package name */
    private final x92 f10357k;

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArraySet f10358l;

    /* renamed from: m, reason: collision with root package name */
    private final ey0 f10359m;

    /* renamed from: n, reason: collision with root package name */
    private final List f10360n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f10361o;

    /* renamed from: p, reason: collision with root package name */
    private final gh4 f10362p;

    /* renamed from: q, reason: collision with root package name */
    private final i94 f10363q;

    /* renamed from: r, reason: collision with root package name */
    private final Looper f10364r;

    /* renamed from: s, reason: collision with root package name */
    private final gl4 f10365s;

    /* renamed from: t, reason: collision with root package name */
    private final hu1 f10366t;

    /* renamed from: u, reason: collision with root package name */
    private final f74 f10367u;

    /* renamed from: v, reason: collision with root package name */
    private final h74 f10368v;

    /* renamed from: w, reason: collision with root package name */
    private final a54 f10369w;

    /* renamed from: x, reason: collision with root package name */
    private final e54 f10370x;

    /* renamed from: y, reason: collision with root package name */
    private final f94 f10371y;

    /* renamed from: z, reason: collision with root package name */
    private final g94 f10372z;

    static {
        u40.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.fl4, com.google.android.gms.internal.ads.i94, java.lang.Object] */
    public j74(z54 z54Var, au0 au0Var) {
        Object obj;
        jw1 jw1Var = new jw1(hu1.f9421a);
        this.f10345d = jw1Var;
        try {
            ad2.d("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-rc02] [" + sv2.f15564e + "]");
            Context applicationContext = z54Var.f18416a.getApplicationContext();
            this.f10347e = applicationContext;
            ?? A = z54Var.f18423h.a(z54Var.f18417b);
            this.f10363q = A;
            this.U = z54Var.f18425j;
            this.P = z54Var.f18426k;
            this.W = false;
            this.B = z54Var.f18430o;
            f74 f74Var = new f74(this, null);
            this.f10367u = f74Var;
            h74 h74Var = new h74(0 == true ? 1 : 0);
            this.f10368v = h74Var;
            Handler handler = new Handler(z54Var.f18424i);
            t84[] t84VarArrA = ((s54) z54Var.f18418c).f15119m.a(handler, f74Var, f74Var, f74Var, f74Var);
            this.f10351g = t84VarArrA;
            int length = t84VarArrA.length;
            xk4 xk4Var = (xk4) z54Var.f18420e.a();
            this.f10353h = xk4Var;
            this.f10362p = z54.a(((t54) z54Var.f18419d).f15699m);
            kl4 kl4VarD = kl4.d(((x54) z54Var.f18422g).f17419m);
            this.f10365s = kl4VarD;
            this.f10361o = z54Var.f18427l;
            this.G = z54Var.f18428m;
            Looper looper = z54Var.f18424i;
            this.f10364r = looper;
            hu1 hu1Var = z54Var.f18417b;
            this.f10366t = hu1Var;
            this.f10349f = au0Var;
            x92 x92Var = new x92(looper, hu1Var, new v72() { // from class: com.google.android.gms.internal.ads.u64
                @Override // com.google.android.gms.internal.ads.v72
                public final void a(Object obj2, g4 g4Var) {
                }
            });
            this.f10357k = x92Var;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f10358l = copyOnWriteArraySet;
            this.f10360n = new ArrayList();
            this.f10354h0 = new aj4(0);
            int length2 = t84VarArrA.length;
            yk4 yk4Var = new yk4(new w84[2], new rk4[2], rc1.f14741b, null);
            this.f10341b = yk4Var;
            this.f10359m = new ey0();
            un0 un0Var = new un0();
            un0Var.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            xk4Var.c();
            un0Var.d(29, true);
            wp0 wp0VarE = un0Var.e();
            this.f10343c = wp0VarE;
            un0 un0Var2 = new un0();
            un0Var2.b(wp0VarE);
            un0Var2.a(4);
            un0Var2.a(10);
            this.H = un0Var2.e();
            this.f10355i = hu1Var.b(looper, null);
            w64 w64Var = new w64(this);
            this.f10352g0 = w64Var;
            this.f10346d0 = n84.g(yk4Var);
            A.D(au0Var, looper);
            int i10 = sv2.f15560a;
            this.f10356j = new r74(t84VarArrA, xk4Var, yk4Var, (v74) z54Var.f18421f.a(), kl4VarD, 0, false, A, this.G, z54Var.f18433r, z54Var.f18429n, false, looper, hu1Var, w64Var, i10 < 31 ? new xb4() : y64.a(applicationContext, this, z54Var.f18431p), null);
            this.V = 1.0f;
            i90 i90Var = i90.f9626y;
            this.I = i90Var;
            this.J = i90Var;
            this.f10344c0 = i90Var;
            this.f10348e0 = -1;
            if (i10 >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.T = audioManager == null ? -1 : audioManager.generateAudioSessionId();
                obj = null;
            } else {
                AudioTrack audioTrack = this.M;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.M.release();
                    obj = null;
                    this.M = null;
                }
                if (this.M == null) {
                    this.M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.T = this.M.getAudioSessionId();
            }
            this.X = fs1.f8394b;
            this.Y = true;
            Objects.requireNonNull(A);
            x92Var.b(A);
            kl4VarD.b(new Handler(looper), A);
            copyOnWriteArraySet.add(f74Var);
            this.f10369w = new a54(z54Var.f18416a, handler, f74Var);
            this.f10370x = new e54(z54Var.f18416a, handler, f74Var);
            sv2.b(obj, obj);
            f94 f94Var = new f94(z54Var.f18416a, handler, f74Var);
            this.f10371y = f94Var;
            int i11 = this.U.f16222a;
            f94Var.f(3);
            this.f10372z = new g94(z54Var.f18416a);
            this.A = new h94(z54Var.f18416a);
            this.f10340a0 = i0(f94Var);
            this.f10342b0 = vh1.f16691e;
            this.Q = kn2.f11168c;
            xk4Var.b(this.U);
            m0(1, 10, Integer.valueOf(this.T));
            m0(2, 10, Integer.valueOf(this.T));
            m0(1, 3, this.U);
            m0(2, 4, Integer.valueOf(this.P));
            m0(2, 5, 0);
            m0(1, 9, Boolean.valueOf(this.W));
            m0(2, 7, h74Var);
            m0(6, 8, h74Var);
            jw1Var.e();
        } catch (Throwable th) {
            this.f10345d.e();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void T(j74 j74Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        j74Var.o0(surface);
        j74Var.O = surface;
    }

    private final int c0() {
        if (this.f10346d0.f12513a.o()) {
            return this.f10348e0;
        }
        n84 n84Var = this.f10346d0;
        return n84Var.f12513a.n(n84Var.f12514b.f10401a, this.f10359m).f8041c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d0(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private final long e0(n84 n84Var) {
        if (n84Var.f12513a.o()) {
            return sv2.w(this.f10350f0);
        }
        if (n84Var.f12514b.b()) {
            return n84Var.f12530r;
        }
        h11 h11Var = n84Var.f12513a;
        hh4 hh4Var = n84Var.f12514b;
        long j10 = n84Var.f12530r;
        g0(h11Var, hh4Var, j10);
        return j10;
    }

    private static long f0(n84 n84Var) {
        g01 g01Var = new g01();
        ey0 ey0Var = new ey0();
        n84Var.f12513a.n(n84Var.f12514b.f10401a, ey0Var);
        long j10 = n84Var.f12515c;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = n84Var.f12513a.e(ey0Var.f8041c, g01Var, 0L).f8540k;
        return 0L;
    }

    private final long g0(h11 h11Var, hh4 hh4Var, long j10) {
        h11Var.n(hh4Var.f10401a, this.f10359m);
        return j10;
    }

    private final Pair h0(h11 h11Var, int i10, long j10) {
        if (h11Var.o()) {
            this.f10348e0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f10350f0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= h11Var.c()) {
            i10 = h11Var.g(false);
            long j11 = h11Var.e(i10, this.f17033a, 0L).f8540k;
            j10 = sv2.y(0L);
        }
        return h11Var.l(this.f17033a, this.f10359m, i10, sv2.w(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static al4 i0(f94 f94Var) {
        return new al4(0, f94Var.b(), f94Var.a());
    }

    private final n84 j0(n84 n84Var, h11 h11Var, Pair pair) {
        long jG;
        n84 n84VarB;
        gt1.d(h11Var.o() || pair != null);
        h11 h11Var2 = n84Var.f12513a;
        n84 n84VarF = n84Var.f(h11Var);
        if (h11Var.o()) {
            hh4 hh4VarH = n84.h();
            long jW = sv2.w(this.f10350f0);
            n84 n84VarA = n84VarF.b(hh4VarH, jW, jW, jW, 0L, fj4.f8300d, this.f10341b, c63.u()).a(hh4VarH);
            n84VarA.f12528p = n84VarA.f12530r;
            return n84VarA;
        }
        Object obj = n84VarF.f12514b.f10401a;
        int i10 = sv2.f15560a;
        boolean z10 = !obj.equals(pair.first);
        hh4 hh4Var = z10 ? new hh4(pair.first) : n84VarF.f12514b;
        long jLongValue = ((Long) pair.second).longValue();
        long jW2 = sv2.w(j());
        if (!h11Var2.o()) {
            h11Var2.n(obj, this.f10359m);
        }
        if (z10 || jLongValue < jW2) {
            gt1.f(!hh4Var.b());
            n84 n84VarA2 = n84VarF.b(hh4Var, jLongValue, jLongValue, jLongValue, 0L, z10 ? fj4.f8300d : n84VarF.f12520h, z10 ? this.f10341b : n84VarF.f12521i, z10 ? c63.u() : n84VarF.f12522j).a(hh4Var);
            n84VarA2.f12528p = jLongValue;
            return n84VarA2;
        }
        if (jLongValue == jW2) {
            int iA = h11Var.a(n84VarF.f12523k.f10401a);
            if (iA != -1 && h11Var.d(iA, this.f10359m, false).f8041c == h11Var.n(hh4Var.f10401a, this.f10359m).f8041c) {
                return n84VarF;
            }
            h11Var.n(hh4Var.f10401a, this.f10359m);
            jG = hh4Var.b() ? this.f10359m.g(hh4Var.f10402b, hh4Var.f10403c) : this.f10359m.f8042d;
            n84VarB = n84VarF.b(hh4Var, n84VarF.f12530r, n84VarF.f12530r, n84VarF.f12516d, jG - n84VarF.f12530r, n84VarF.f12520h, n84VarF.f12521i, n84VarF.f12522j).a(hh4Var);
        } else {
            gt1.f(!hh4Var.b());
            long jMax = Math.max(0L, n84VarF.f12529q - (jLongValue - jW2));
            jG = n84VarF.f12528p;
            if (n84VarF.f12523k.equals(n84VarF.f12514b)) {
                jG = jLongValue + jMax;
            }
            n84VarB = n84VarF.b(hh4Var, jLongValue, jLongValue, jLongValue, jMax, n84VarF.f12520h, n84VarF.f12521i, n84VarF.f12522j);
        }
        n84VarB.f12528p = jG;
        return n84VarB;
    }

    private final q84 k0(p84 p84Var) {
        int iC0 = c0();
        r74 r74Var = this.f10356j;
        h11 h11Var = this.f10346d0.f12513a;
        if (iC0 == -1) {
            iC0 = 0;
        }
        return new q84(r74Var, p84Var, h11Var, iC0, this.f10366t, r74Var.S());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(final int i10, final int i11) {
        if (i10 == this.Q.b() && i11 == this.Q.a()) {
            return;
        }
        this.Q = new kn2(i10, i11);
        x92 x92Var = this.f10357k;
        x92Var.d(24, new u62() { // from class: com.google.android.gms.internal.ads.c64
            @Override // com.google.android.gms.internal.ads.u62
            public final void a(Object obj) {
                int i12 = i10;
                int i13 = i11;
                int i14 = j74.f10339i0;
                ((xq0) obj).a(i12, i13);
            }
        });
        x92Var.c();
        m0(2, 14, new kn2(i10, i11));
    }

    private final void m0(int i10, int i11, Object obj) {
        t84[] t84VarArr = this.f10351g;
        int length = t84VarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            t84 t84Var = t84VarArr[i12];
            if (t84Var.b() == i10) {
                q84 q84VarK0 = k0(t84Var);
                q84VarK0.f(i11);
                q84VarK0.e(obj);
                q84VarK0.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        m0(1, 2, Float.valueOf(this.V * this.f10370x.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        t84[] t84VarArr = this.f10351g;
        int length = t84VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= 2) {
                break;
            }
            t84 t84Var = t84VarArr[i10];
            if (t84Var.b() == 2) {
                q84 q84VarK0 = k0(t84Var);
                q84VarK0.f(1);
                q84VarK0.e(obj);
                q84VarK0.d();
                arrayList.add(q84VarK0);
            }
            i10++;
        }
        Object obj2 = this.N;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((q84) it.next()).i(this.B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.N;
            Surface surface = this.O;
            if (obj3 == surface) {
                surface.release();
                this.O = null;
            }
        }
        this.N = obj;
        if (z10) {
            p0(false, o54.d(new s74(3), 1003));
        }
    }

    private final void p0(boolean z10, o54 o54Var) {
        n84 n84Var = this.f10346d0;
        n84 n84VarA = n84Var.a(n84Var.f12514b);
        n84VarA.f12528p = n84VarA.f12530r;
        n84VarA.f12529q = 0L;
        n84 n84VarE = n84VarA.e(1);
        if (o54Var != null) {
            n84VarE = n84VarE.d(o54Var);
        }
        n84 n84Var2 = n84VarE;
        this.C++;
        this.f10356j.a0();
        r0(n84Var2, 0, 1, false, n84Var2.f12513a.o() && !this.f10346d0.f12513a.o(), 4, e0(n84Var2), -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        n84 n84Var = this.f10346d0;
        if (n84Var.f12524l == z11 && n84Var.f12525m == i12) {
            return;
        }
        this.C++;
        n84 n84VarC = n84Var.c(z11, i12);
        this.f10356j.Z(z11, i12);
        r0(n84VarC, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04f6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r0(final com.google.android.gms.internal.ads.n84 r43, final int r44, final int r45, boolean r46, boolean r47, final int r48, long r49, int r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j74.r0(com.google.android.gms.internal.ads.n84, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        int iE = e();
        if (iE == 2 || iE == 3) {
            t0();
            boolean z10 = this.f10346d0.f12527o;
            v();
            v();
        }
    }

    private final void t0() {
        this.f10345d.b();
        if (Thread.currentThread() != this.f10364r.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f10364r.getThread().getName());
            if (this.Y) {
                throw new IllegalStateException(str);
            }
            ad2.f("ExoPlayerImpl", str, this.Z ? null : new IllegalStateException());
            this.Z = true;
        }
    }

    private static boolean u0(n84 n84Var) {
        return n84Var.f12517e == 3 && n84Var.f12524l && n84Var.f12525m == 0;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final boolean A() {
        t0();
        return this.f10346d0.f12514b.b();
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final boolean D() {
        t0();
        return false;
    }

    public final o54 F() {
        t0();
        return this.f10346d0.f12518f;
    }

    @Override // com.google.android.gms.internal.ads.a64
    public final int N() {
        t0();
        int length = this.f10351g.length;
        return 2;
    }

    final /* synthetic */ void X(p74 p74Var) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.C - p74Var.f13623c;
        this.C = i10;
        boolean z11 = true;
        if (p74Var.f13624d) {
            this.D = p74Var.f13625e;
            this.E = true;
        }
        if (p74Var.f13626f) {
            this.F = p74Var.f13627g;
        }
        if (i10 == 0) {
            h11 h11Var = p74Var.f13622b.f12513a;
            if (!this.f10346d0.f12513a.o() && h11Var.o()) {
                this.f10348e0 = -1;
                this.f10350f0 = 0L;
            }
            if (!h11Var.o()) {
                List listY = ((r84) h11Var).y();
                gt1.f(listY.size() == this.f10360n.size());
                for (int i11 = 0; i11 < listY.size(); i11++) {
                    ((i74) this.f10360n.get(i11)).f9601b = (h11) listY.get(i11);
                }
            }
            if (this.E) {
                if (p74Var.f13622b.f12514b.equals(this.f10346d0.f12514b) && p74Var.f13622b.f12516d == this.f10346d0.f12530r) {
                    z11 = false;
                }
                if (z11) {
                    if (h11Var.o() || p74Var.f13622b.f12514b.b()) {
                        j11 = p74Var.f13622b.f12516d;
                    } else {
                        n84 n84Var = p74Var.f13622b;
                        hh4 hh4Var = n84Var.f12514b;
                        j11 = n84Var.f12516d;
                        g0(h11Var, hh4Var, j11);
                    }
                    z10 = z11;
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                    z10 = z11;
                }
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.E = false;
            r0(p74Var.f13622b, 1, this.F, false, z10, this.D, j10, -1, false);
        }
    }

    final /* synthetic */ void Y(final p74 p74Var) {
        this.f10355i.H(new Runnable() { // from class: com.google.android.gms.internal.ads.x64
            @Override // java.lang.Runnable
            public final void run() {
                this.f17423m.X(p74Var);
            }
        });
    }

    final /* synthetic */ void Z(xq0 xq0Var) {
        xq0Var.G0(this.H);
    }

    @Override // com.google.android.gms.internal.ads.a64
    public final void a(jh4 jh4Var) {
        t0();
        List listSingletonList = Collections.singletonList(jh4Var);
        t0();
        t0();
        c0();
        k();
        this.C++;
        if (!this.f10360n.isEmpty()) {
            int size = this.f10360n.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f10360n.remove(i10);
            }
            this.f10354h0 = this.f10354h0.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            k84 k84Var = new k84((jh4) listSingletonList.get(i11), this.f10361o);
            arrayList.add(k84Var);
            this.f10360n.add(i11, new i74(k84Var.f10869b, k84Var.f10868a.F()));
        }
        this.f10354h0 = this.f10354h0.g(0, arrayList.size());
        r84 r84Var = new r84(this.f10360n, this.f10354h0);
        if (!r84Var.o() && r84Var.c() < 0) {
            throw new od(r84Var, -1, -9223372036854775807L);
        }
        int iG = r84Var.g(false);
        n84 n84VarJ0 = j0(this.f10346d0, r84Var, h0(r84Var, iG, -9223372036854775807L));
        int i12 = n84VarJ0.f12517e;
        if (iG != -1 && i12 != 1) {
            i12 = (r84Var.o() || iG >= r84Var.c()) ? 4 : 2;
        }
        n84 n84VarE = n84VarJ0.e(i12);
        this.f10356j.c0(arrayList, iG, sv2.w(-9223372036854775807L), this.f10354h0);
        r0(n84VarE, 0, 1, false, (this.f10346d0.f12514b.f10401a.equals(n84VarE.f12514b.f10401a) || this.f10346d0.f12513a.o()) ? false : true, 4, e0(n84VarE), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int b() {
        t0();
        if (A()) {
            return this.f10346d0.f12514b.f10402b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int c() {
        t0();
        if (this.f10346d0.f12513a.o()) {
            return 0;
        }
        n84 n84Var = this.f10346d0;
        return n84Var.f12513a.a(n84Var.f12514b.f10401a);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int d() {
        t0();
        if (A()) {
            return this.f10346d0.f12514b.f10403c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int e() {
        t0();
        return this.f10346d0.f12517e;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int f() {
        t0();
        int iC0 = c0();
        if (iC0 == -1) {
            return 0;
        }
        return iC0;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int g() {
        t0();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final int h() {
        t0();
        return this.f10346d0.f12525m;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final long i() {
        t0();
        if (A()) {
            n84 n84Var = this.f10346d0;
            return n84Var.f12523k.equals(n84Var.f12514b) ? sv2.y(this.f10346d0.f12528p) : l();
        }
        t0();
        if (this.f10346d0.f12513a.o()) {
            return this.f10350f0;
        }
        n84 n84Var2 = this.f10346d0;
        long j10 = 0;
        if (n84Var2.f12523k.f10404d != n84Var2.f12514b.f10404d) {
            return sv2.y(n84Var2.f12513a.e(f(), this.f17033a, 0L).f8541l);
        }
        long j11 = n84Var2.f12528p;
        if (this.f10346d0.f12523k.b()) {
            n84 n84Var3 = this.f10346d0;
            n84Var3.f12513a.n(n84Var3.f12523k.f10401a, this.f10359m).h(this.f10346d0.f12523k.f10402b);
        } else {
            j10 = j11;
        }
        n84 n84Var4 = this.f10346d0;
        g0(n84Var4.f12513a, n84Var4.f12523k, j10);
        return sv2.y(j10);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final long j() {
        t0();
        if (!A()) {
            return k();
        }
        n84 n84Var = this.f10346d0;
        n84Var.f12513a.n(n84Var.f12514b.f10401a, this.f10359m);
        n84 n84Var2 = this.f10346d0;
        long j10 = n84Var2.f12515c;
        if (j10 == -9223372036854775807L) {
            long j11 = n84Var2.f12513a.e(f(), this.f17033a, 0L).f8540k;
            return sv2.y(0L);
        }
        int i10 = sv2.f15560a;
        return sv2.y(j10) + sv2.y(0L);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final long k() {
        t0();
        return sv2.y(e0(this.f10346d0));
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final long l() {
        long jG;
        t0();
        if (A()) {
            n84 n84Var = this.f10346d0;
            hh4 hh4Var = n84Var.f12514b;
            n84Var.f12513a.n(hh4Var.f10401a, this.f10359m);
            jG = this.f10359m.g(hh4Var.f10402b, hh4Var.f10403c);
        } else {
            h11 h11VarM = m();
            if (h11VarM.o()) {
                return -9223372036854775807L;
            }
            jG = h11VarM.e(f(), this.f17033a, 0L).f8541l;
        }
        return sv2.y(jG);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final h11 m() {
        t0();
        return this.f10346d0.f12513a;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final long n() {
        t0();
        return sv2.y(this.f10346d0.f12529q);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final void o() {
        t0();
        boolean zV = v();
        int iB = this.f10370x.b(zV, 2);
        q0(zV, iB, d0(zV, iB));
        n84 n84Var = this.f10346d0;
        if (n84Var.f12517e != 1) {
            return;
        }
        n84 n84VarD = n84Var.d(null);
        n84 n84VarE = n84VarD.e(true == n84VarD.f12513a.o() ? 4 : 2);
        this.C++;
        this.f10356j.X();
        r0(n84VarE, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final rc1 p() {
        t0();
        return this.f10346d0.f12521i.f18088d;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final void q() {
        AudioTrack audioTrack;
        ad2.d("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-rc02] [" + sv2.f15564e + "] [" + u40.a() + "]");
        t0();
        if (sv2.f15560a < 21 && (audioTrack = this.M) != null) {
            audioTrack.release();
            this.M = null;
        }
        this.f10371y.e();
        this.f10370x.d();
        if (!this.f10356j.b0()) {
            x92 x92Var = this.f10357k;
            x92Var.d(10, new u62() { // from class: com.google.android.gms.internal.ads.b64
                @Override // com.google.android.gms.internal.ads.u62
                public final void a(Object obj) {
                    ((xq0) obj).D0(o54.d(new s74(1), 1003));
                }
            });
            x92Var.c();
        }
        this.f10357k.e();
        this.f10355i.G(null);
        this.f10365s.a(this.f10363q);
        n84 n84VarE = this.f10346d0.e(1);
        this.f10346d0 = n84VarE;
        n84 n84VarA = n84VarE.a(n84VarE.f12514b);
        this.f10346d0 = n84VarA;
        n84VarA.f12528p = n84VarA.f12530r;
        this.f10346d0.f12529q = 0L;
        this.f10363q.E0();
        this.f10353h.a();
        Surface surface = this.O;
        if (surface != null) {
            surface.release();
            this.O = null;
        }
        this.X = fs1.f8394b;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final void r(boolean z10) {
        t0();
        int iB = this.f10370x.b(z10, e());
        q0(z10, iB, d0(z10, iB));
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final void s(Surface surface) {
        t0();
        o0(surface);
        int i10 = surface == null ? 0 : -1;
        l0(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.a64
    public final void t(l94 l94Var) {
        i94 i94Var = this.f10363q;
        Objects.requireNonNull(l94Var);
        i94Var.u(l94Var);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final void u() {
        t0();
        t0();
        this.f10370x.b(v(), 1);
        p0(false, null);
        this.X = new fs1(c63.u(), this.f10346d0.f12530r);
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final boolean v() {
        t0();
        return this.f10346d0.f12524l;
    }

    @Override // com.google.android.gms.internal.ads.au0
    public final void w(float f5) {
        t0();
        final float fMax = Math.max(0.0f, Math.min(f5, 1.0f));
        if (this.V == fMax) {
            return;
        }
        this.V = fMax;
        n0();
        x92 x92Var = this.f10357k;
        x92Var.d(22, new u62() { // from class: com.google.android.gms.internal.ads.s64
            @Override // com.google.android.gms.internal.ads.u62
            public final void a(Object obj) {
                float f10 = fMax;
                int i10 = j74.f10339i0;
                ((xq0) obj).v0(f10);
            }
        });
        x92Var.c();
    }

    @Override // com.google.android.gms.internal.ads.a64
    public final void x(l94 l94Var) {
        t0();
        this.f10363q.J(l94Var);
    }

    @Override // com.google.android.gms.internal.ads.w94
    public final void y(int i10, long j10, int i11, boolean z10) {
        t0();
        gt1.d(i10 >= 0);
        this.f10363q.A();
        h11 h11Var = this.f10346d0.f12513a;
        if (h11Var.o() || i10 < h11Var.c()) {
            this.C++;
            if (A()) {
                ad2.e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                p74 p74Var = new p74(this.f10346d0);
                p74Var.a(1);
                this.f10352g0.f17003a.Y(p74Var);
                return;
            }
            int i12 = e() != 1 ? 2 : 1;
            int iF = f();
            n84 n84VarJ0 = j0(this.f10346d0.e(i12), h11Var, h0(h11Var, i10, j10));
            this.f10356j.Y(h11Var, i10, sv2.w(j10));
            r0(n84VarJ0, 0, 1, true, true, 1, e0(n84VarJ0), iF, false);
        }
    }
}
