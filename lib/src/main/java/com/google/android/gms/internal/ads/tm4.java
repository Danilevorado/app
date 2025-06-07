package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tm4 {

    /* renamed from: a, reason: collision with root package name */
    private final cm4 f15903a = new cm4();

    /* renamed from: b, reason: collision with root package name */
    private final pm4 f15904b;

    /* renamed from: c, reason: collision with root package name */
    private final sm4 f15905c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15906d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f15907e;

    /* renamed from: f, reason: collision with root package name */
    private float f15908f;

    /* renamed from: g, reason: collision with root package name */
    private float f15909g;

    /* renamed from: h, reason: collision with root package name */
    private float f15910h;

    /* renamed from: i, reason: collision with root package name */
    private float f15911i;

    /* renamed from: j, reason: collision with root package name */
    private int f15912j;

    /* renamed from: k, reason: collision with root package name */
    private long f15913k;

    /* renamed from: l, reason: collision with root package name */
    private long f15914l;

    /* renamed from: m, reason: collision with root package name */
    private long f15915m;

    /* renamed from: n, reason: collision with root package name */
    private long f15916n;

    /* renamed from: o, reason: collision with root package name */
    private long f15917o;

    /* renamed from: p, reason: collision with root package name */
    private long f15918p;

    /* renamed from: q, reason: collision with root package name */
    private long f15919q;

    public tm4(Context context) {
        pm4 pm4VarC;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i10 = sv2.f15560a;
            pm4VarC = rm4.c(applicationContext);
            if (pm4VarC == null) {
                pm4VarC = qm4.c(applicationContext);
            }
        } else {
            pm4VarC = null;
        }
        this.f15904b = pm4VarC;
        this.f15905c = pm4VarC != null ? sm4.a() : null;
        this.f15913k = -9223372036854775807L;
        this.f15914l = -9223372036854775807L;
        this.f15908f = -1.0f;
        this.f15911i = 1.0f;
        this.f15912j = 0;
    }

    public static /* synthetic */ void b(tm4 tm4Var, Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            tm4Var.f15913k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            ad2.e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            tm4Var.f15913k = -9223372036854775807L;
        }
        tm4Var.f15914l = j10;
    }

    private final void k() {
        Surface surface;
        if (sv2.f15560a < 30 || (surface = this.f15907e) == null || this.f15912j == Integer.MIN_VALUE || this.f15910h == 0.0f) {
            return;
        }
        this.f15910h = 0.0f;
        om4.a(surface, 0.0f);
    }

    private final void l() {
        this.f15915m = 0L;
        this.f15918p = -1L;
        this.f15916n = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.sv2.f15560a
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r9.f15907e
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.cm4 r0 = r9.f15903a
            boolean r0 = r0.g()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.cm4 r0 = r9.f15903a
            float r0 = r0.a()
            goto L1c
        L1a:
            float r0 = r9.f15908f
        L1c:
            float r2 = r9.f15909g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L58
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.cm4 r1 = r9.f15903a
            boolean r1 = r1.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.cm4 r1 = r9.f15903a
            long r3 = r1.d()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.f15909g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r4 != 0) goto L68
            com.google.android.gms.internal.ads.cm4 r2 = r9.f15903a
            int r2 = r2.b()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            if (r5 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r9.f15909g = r0
            r9.n(r6)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tm4.m():void");
    }

    private final void n(boolean z10) {
        Surface surface;
        if (sv2.f15560a < 30 || (surface = this.f15907e) == null || this.f15912j == Integer.MIN_VALUE) {
            return;
        }
        float f5 = 0.0f;
        if (this.f15906d) {
            float f10 = this.f15909g;
            if (f10 != -1.0f) {
                f5 = this.f15911i * f10;
            }
        }
        if (z10 || this.f15910h != f5) {
            this.f15910h = f5;
            om4.a(surface, f5);
        }
    }

    public final long a(long j10) {
        long j11;
        if (this.f15918p != -1 && this.f15903a.g()) {
            long jC = this.f15903a.c();
            long j12 = this.f15919q + ((long) ((jC * (this.f15915m - this.f15918p)) / this.f15911i));
            if (Math.abs(j10 - j12) > 20000000) {
                l();
            } else {
                j10 = j12;
            }
        }
        this.f15916n = this.f15915m;
        this.f15917o = j10;
        sm4 sm4Var = this.f15905c;
        if (sm4Var == null || this.f15913k == -9223372036854775807L) {
            return j10;
        }
        long j13 = sm4Var.f15331m;
        if (j13 == -9223372036854775807L) {
            return j10;
        }
        long j14 = this.f15913k;
        long j15 = j13 + (((j10 - j13) / j14) * j14);
        if (j10 <= j15) {
            j11 = j15 - j14;
        } else {
            j15 = j14 + j15;
            j11 = j15;
        }
        long j16 = this.f15914l;
        if (j15 - j10 >= j10 - j11) {
            j15 = j11;
        }
        return j15 - j16;
    }

    public final void c(float f5) {
        this.f15908f = f5;
        this.f15903a.f();
        m();
    }

    public final void d(long j10) {
        long j11 = this.f15916n;
        if (j11 != -1) {
            this.f15918p = j11;
            this.f15919q = this.f15917o;
        }
        this.f15915m++;
        this.f15903a.e(j10 * 1000);
        m();
    }

    public final void e(float f5) {
        this.f15911i = f5;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.f15906d = true;
        l();
        if (this.f15904b != null) {
            sm4 sm4Var = this.f15905c;
            Objects.requireNonNull(sm4Var);
            sm4Var.b();
            this.f15904b.b(new nm4(this));
        }
        n(false);
    }

    public final void h() {
        this.f15906d = false;
        pm4 pm4Var = this.f15904b;
        if (pm4Var != null) {
            pm4Var.a();
            sm4 sm4Var = this.f15905c;
            Objects.requireNonNull(sm4Var);
            sm4Var.c();
        }
        k();
    }

    public final void i(Surface surface) {
        if (true == (surface instanceof lm4)) {
            surface = null;
        }
        if (this.f15907e == surface) {
            return;
        }
        k();
        this.f15907e = surface;
        n(true);
    }

    public final void j(int i10) {
        if (this.f15912j == i10) {
            return;
        }
        this.f15912j = i10;
        n(true);
    }
}
