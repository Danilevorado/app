package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.w;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int D = ViewConfiguration.getTapTimeout();
    boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: o, reason: collision with root package name */
    final View f2534o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f2535p;

    /* renamed from: s, reason: collision with root package name */
    private int f2538s;

    /* renamed from: t, reason: collision with root package name */
    private int f2539t;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2543x;

    /* renamed from: y, reason: collision with root package name */
    boolean f2544y;

    /* renamed from: z, reason: collision with root package name */
    boolean f2545z;

    /* renamed from: m, reason: collision with root package name */
    final C0038a f2532m = new C0038a();

    /* renamed from: n, reason: collision with root package name */
    private final Interpolator f2533n = new AccelerateInterpolator();

    /* renamed from: q, reason: collision with root package name */
    private float[] f2536q = {0.0f, 0.0f};

    /* renamed from: r, reason: collision with root package name */
    private float[] f2537r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: u, reason: collision with root package name */
    private float[] f2540u = {0.0f, 0.0f};

    /* renamed from: v, reason: collision with root package name */
    private float[] f2541v = {0.0f, 0.0f};

    /* renamed from: w, reason: collision with root package name */
    private float[] f2542w = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0038a {

        /* renamed from: a, reason: collision with root package name */
        private int f2546a;

        /* renamed from: b, reason: collision with root package name */
        private int f2547b;

        /* renamed from: c, reason: collision with root package name */
        private float f2548c;

        /* renamed from: d, reason: collision with root package name */
        private float f2549d;

        /* renamed from: j, reason: collision with root package name */
        private float f2555j;

        /* renamed from: k, reason: collision with root package name */
        private int f2556k;

        /* renamed from: e, reason: collision with root package name */
        private long f2550e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f2554i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f2551f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f2552g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f2553h = 0;

        C0038a() {
        }

        private float e(long j10) {
            if (j10 < this.f2550e) {
                return 0.0f;
            }
            long j11 = this.f2554i;
            if (j11 < 0 || j10 < j11) {
                return a.f((j10 - r0) / this.f2546a, 0.0f, 1.0f) * 0.5f;
            }
            float f5 = this.f2555j;
            return (1.0f - f5) + (f5 * a.f((j10 - j11) / this.f2556k, 0.0f, 1.0f));
        }

        private float g(float f5) {
            return ((-4.0f) * f5 * f5) + (f5 * 4.0f);
        }

        public void a() {
            if (this.f2551f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f2551f;
            this.f2551f = jCurrentAnimationTimeMillis;
            float f5 = j10 * fG;
            this.f2552g = (int) (this.f2548c * f5);
            this.f2553h = (int) (f5 * this.f2549d);
        }

        public int b() {
            return this.f2552g;
        }

        public int c() {
            return this.f2553h;
        }

        public int d() {
            float f5 = this.f2548c;
            return (int) (f5 / Math.abs(f5));
        }

        public int f() {
            float f5 = this.f2549d;
            return (int) (f5 / Math.abs(f5));
        }

        public boolean h() {
            return this.f2554i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2554i + ((long) this.f2556k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2556k = a.h((int) (jCurrentAnimationTimeMillis - this.f2550e), 0, this.f2547b);
            this.f2555j = e(jCurrentAnimationTimeMillis);
            this.f2554i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f2547b = i10;
        }

        public void k(int i10) {
            this.f2546a = i10;
        }

        public void l(float f5, float f10) {
            this.f2548c = f5;
            this.f2549d = f10;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2550e = jCurrentAnimationTimeMillis;
            this.f2554i = -1L;
            this.f2551f = jCurrentAnimationTimeMillis;
            this.f2555j = 0.5f;
            this.f2552g = 0;
            this.f2553h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.A) {
                if (aVar.f2544y) {
                    aVar.f2544y = false;
                    aVar.f2532m.m();
                }
                C0038a c0038a = a.this.f2532m;
                if (c0038a.h() || !a.this.E()) {
                    a.this.A = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f2545z) {
                    aVar2.f2545z = false;
                    aVar2.c();
                }
                c0038a.a();
                a.this.t(c0038a.b(), c0038a.c());
                w.g0(a.this.f2534o, this);
            }
        }
    }

    public a(View view) {
        this.f2534o = view;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = (int) ((1575.0f * f5) + 0.5f);
        y(f10, f10);
        float f11 = (int) ((f5 * 315.0f) + 0.5f);
        z(f11, f11);
        v(1);
        x(Float.MAX_VALUE, Float.MAX_VALUE);
        C(0.2f, 0.2f);
        D(1.0f, 1.0f);
        u(D);
        B(500);
        A(500);
    }

    private void F() {
        int i10;
        if (this.f2535p == null) {
            this.f2535p = new b();
        }
        this.A = true;
        this.f2544y = true;
        if (this.f2543x || (i10 = this.f2539t) <= 0) {
            this.f2535p.run();
        } else {
            w.h0(this.f2534o, this.f2535p, i10);
        }
        this.f2543x = true;
    }

    private float d(int i10, float f5, float f10, float f11) {
        float fR = r(this.f2536q[i10], f10, this.f2537r[i10], f5);
        if (fR == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f2540u[i10];
        float f13 = this.f2541v[i10];
        float f14 = this.f2542w[i10];
        float f15 = f12 * f11;
        return fR > 0.0f ? f(fR * f15, f13, f14) : -f((-fR) * f15, f13, f14);
    }

    static float f(float f5, float f10, float f11) {
        return f5 > f11 ? f11 : f5 < f10 ? f10 : f5;
    }

    static int h(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float q(float f5, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2538s;
        if (i10 == 0 || i10 == 1) {
            if (f5 < f10) {
                if (f5 >= 0.0f) {
                    return 1.0f - (f5 / f10);
                }
                if (this.A && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f5 < 0.0f) {
            return f5 / (-f10);
        }
        return 0.0f;
    }

    private float r(float f5, float f10, float f11, float f12) {
        float interpolation;
        float f13 = f(f5 * f10, 0.0f, f11);
        float fQ = q(f10 - f12, f13) - q(f12, f13);
        if (fQ < 0.0f) {
            interpolation = -this.f2533n.getInterpolation(-fQ);
        } else {
            if (fQ <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2533n.getInterpolation(fQ);
        }
        return f(interpolation, -1.0f, 1.0f);
    }

    private void s() {
        if (this.f2544y) {
            this.A = false;
        } else {
            this.f2532m.i();
        }
    }

    public a A(int i10) {
        this.f2532m.j(i10);
        return this;
    }

    public a B(int i10) {
        this.f2532m.k(i10);
        return this;
    }

    public a C(float f5, float f10) {
        float[] fArr = this.f2536q;
        fArr[0] = f5;
        fArr[1] = f10;
        return this;
    }

    public a D(float f5, float f10) {
        float[] fArr = this.f2540u;
        fArr[0] = f5 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    boolean E() {
        C0038a c0038a = this.f2532m;
        int iF = c0038a.f();
        int iD = c0038a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2534o.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.B
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.s()
            goto L58
        L1a:
            r5.f2545z = r2
            r5.f2543x = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2534o
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2534o
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2532m
            r7.l(r0, r6)
            boolean r6 = r5.A
            if (r6 != 0) goto L58
            boolean r6 = r5.E()
            if (r6 == 0) goto L58
            r5.F()
        L58:
            boolean r6 = r5.C
            if (r6 == 0) goto L61
            boolean r6 = r5.A
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void t(int i10, int i11);

    public a u(int i10) {
        this.f2539t = i10;
        return this;
    }

    public a v(int i10) {
        this.f2538s = i10;
        return this;
    }

    public a w(boolean z10) {
        if (this.B && !z10) {
            s();
        }
        this.B = z10;
        return this;
    }

    public a x(float f5, float f10) {
        float[] fArr = this.f2537r;
        fArr[0] = f5;
        fArr[1] = f10;
        return this;
    }

    public a y(float f5, float f10) {
        float[] fArr = this.f2542w;
        fArr[0] = f5 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    public a z(float f5, float f10) {
        float[] fArr = this.f2541v;
        fArr[0] = f5 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }
}
