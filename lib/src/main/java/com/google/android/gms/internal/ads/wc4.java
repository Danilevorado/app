package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
final class wc4 {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a, reason: collision with root package name */
    private final vc4 f17060a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f17061b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f17062c;

    /* renamed from: d, reason: collision with root package name */
    private int f17063d;

    /* renamed from: e, reason: collision with root package name */
    private int f17064e;

    /* renamed from: f, reason: collision with root package name */
    private uc4 f17065f;

    /* renamed from: g, reason: collision with root package name */
    private int f17066g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17067h;

    /* renamed from: i, reason: collision with root package name */
    private long f17068i;

    /* renamed from: j, reason: collision with root package name */
    private float f17069j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17070k;

    /* renamed from: l, reason: collision with root package name */
    private long f17071l;

    /* renamed from: m, reason: collision with root package name */
    private long f17072m;

    /* renamed from: n, reason: collision with root package name */
    private Method f17073n;

    /* renamed from: o, reason: collision with root package name */
    private long f17074o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17075p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17076q;

    /* renamed from: r, reason: collision with root package name */
    private long f17077r;

    /* renamed from: s, reason: collision with root package name */
    private long f17078s;

    /* renamed from: t, reason: collision with root package name */
    private long f17079t;

    /* renamed from: u, reason: collision with root package name */
    private long f17080u;

    /* renamed from: v, reason: collision with root package name */
    private long f17081v;

    /* renamed from: w, reason: collision with root package name */
    private int f17082w;

    /* renamed from: x, reason: collision with root package name */
    private int f17083x;

    /* renamed from: y, reason: collision with root package name */
    private long f17084y;

    /* renamed from: z, reason: collision with root package name */
    private long f17085z;

    public wc4(vc4 vc4Var) {
        this.f17060a = vc4Var;
        int i10 = sv2.f15560a;
        try {
            this.f17073n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f17061b = new long[10];
    }

    private final long l(long j10) {
        return (j10 * 1000000) / this.f17066g;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m() {
        /*
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12.f17084y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2b
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            float r4 = r12.f17069j
            long r0 = r0 - r2
            long r0 = com.google.android.gms.internal.ads.sv2.u(r0, r4)
            int r2 = r12.f17066g
            long r2 = (long) r2
            long r0 = r0 * r2
            long r2 = r12.B
            long r4 = r12.A
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r6
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2b:
            long r2 = r12.f17078s
            long r2 = r0 - r2
            r6 = 5
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L93
            android.media.AudioTrack r2 = r12.f17062c
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.getPlayState()
            r6 = 1
            if (r3 != r6) goto L42
            goto L91
        L42:
            int r2 = r2.getPlaybackHeadPosition()
            long r6 = (long) r2
            boolean r2 = r12.f17067h
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 0
            if (r2 == 0) goto L62
            r2 = 2
            if (r3 != r2) goto L5f
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L5e
            long r10 = r12.f17079t
            r12.f17081v = r10
        L5e:
            r3 = r2
        L5f:
            long r10 = r12.f17081v
            long r6 = r6 + r10
        L62:
            int r2 = com.google.android.gms.internal.ads.sv2.f15560a
            r10 = 29
            if (r2 > r10) goto L82
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L7e
            long r6 = r12.f17079t
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7f
            r2 = 3
            if (r3 != r2) goto L7f
            long r2 = r12.f17085z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L91
            r12.f17085z = r0
            goto L91
        L7e:
            r8 = r6
        L7f:
            r12.f17085z = r4
            r6 = r8
        L82:
            long r2 = r12.f17079t
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L8f
            long r2 = r12.f17080u
            r4 = 1
            long r2 = r2 + r4
            r12.f17080u = r2
        L8f:
            r12.f17079t = r6
        L91:
            r12.f17078s = r0
        L93:
            long r0 = r12.f17079t
            long r2 = r12.f17080u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wc4.m():long");
    }

    private final void n() {
        this.f17071l = 0L;
        this.f17083x = 0;
        this.f17082w = 0;
        this.f17072m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f17070k = false;
    }

    public final int a(long j10) {
        return this.f17064e - ((int) (j10 - (m() * this.f17063d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(boolean r22) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wc4.b(boolean):long");
    }

    public final void c(long j10) {
        this.A = m();
        this.f17084y = SystemClock.elapsedRealtime() * 1000;
        this.B = j10;
    }

    public final void d() {
        n();
        this.f17062c = null;
        this.f17065f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.f17062c = r4
            r3.f17063d = r7
            r3.f17064e = r8
            com.google.android.gms.internal.ads.uc4 r0 = new com.google.android.gms.internal.ads.uc4
            r0.<init>(r4)
            r3.f17065f = r0
            int r4 = r4.getSampleRate()
            r3.f17066g = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L25
            int r5 = com.google.android.gms.internal.ads.sv2.f15560a
            r2 = 23
            if (r5 >= r2) goto L25
            r5 = 5
            if (r6 == r5) goto L26
            if (r6 != r4) goto L25
            r6 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            r3.f17067h = r0
            boolean r4 = com.google.android.gms.internal.ads.sv2.c(r6)
            r3.f17076q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.l(r7)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.f17068i = r7
            r7 = 0
            r3.f17079t = r7
            r3.f17080u = r7
            r3.f17081v = r7
            r3.f17075p = r1
            r3.f17084y = r5
            r3.f17085z = r5
            r3.f17077r = r7
            r3.f17074o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f17069j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wc4.e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void f() {
        uc4 uc4Var = this.f17065f;
        Objects.requireNonNull(uc4Var);
        uc4Var.e();
    }

    public final boolean g(long j10) {
        if (j10 > m()) {
            return true;
        }
        if (!this.f17067h) {
            return false;
        }
        AudioTrack audioTrack = this.f17062c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && m() == 0;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.f17062c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j10) {
        return this.f17085z != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f17085z >= 200;
    }

    public final boolean j(long j10) {
        AudioTrack audioTrack = this.f17062c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f17067h) {
            if (playState == 2) {
                this.f17075p = false;
                return false;
            }
            if (playState == 1) {
                if (m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.f17075p;
        boolean zG = g(j10);
        this.f17075p = zG;
        if (z10 && !zG && playState != 1) {
            vc4 vc4Var = this.f17060a;
            int i10 = this.f17064e;
            long jY = sv2.y(this.f17068i);
            ld4 ld4Var = (ld4) vc4Var;
            if (ld4Var.f11516a.f14267n != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                qd4 qd4Var = ld4Var.f11516a;
                ((vd4) qd4Var.f14267n).f16663a.A0.t(i10, jY, jElapsedRealtime - qd4Var.S);
            }
        }
        return true;
    }

    public final boolean k() {
        n();
        if (this.f17084y != -9223372036854775807L) {
            return false;
        }
        uc4 uc4Var = this.f17065f;
        Objects.requireNonNull(uc4Var);
        uc4Var.e();
        return true;
    }
}
