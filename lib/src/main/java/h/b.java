package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class b extends Drawable implements Drawable.Callback {

    /* renamed from: m, reason: collision with root package name */
    private d f23919m;

    /* renamed from: n, reason: collision with root package name */
    private Rect f23920n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f23921o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f23922p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23924r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23926t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f23927u;

    /* renamed from: v, reason: collision with root package name */
    private long f23928v;

    /* renamed from: w, reason: collision with root package name */
    private long f23929w;

    /* renamed from: x, reason: collision with root package name */
    private c f23930x;

    /* renamed from: q, reason: collision with root package name */
    private int f23923q = 255;

    /* renamed from: s, reason: collision with root package name */
    private int f23925s = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b, reason: collision with other inner class name */
    private static class C0139b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements Drawable.Callback {

        /* renamed from: m, reason: collision with root package name */
        private Drawable.Callback f23932m;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f23932m;
            this.f23932m = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f23932m = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f23932m;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f23932m;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f23933a;

        /* renamed from: b, reason: collision with root package name */
        Resources f23934b;

        /* renamed from: c, reason: collision with root package name */
        int f23935c;

        /* renamed from: d, reason: collision with root package name */
        int f23936d;

        /* renamed from: e, reason: collision with root package name */
        int f23937e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray f23938f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f23939g;

        /* renamed from: h, reason: collision with root package name */
        int f23940h;

        /* renamed from: i, reason: collision with root package name */
        boolean f23941i;

        /* renamed from: j, reason: collision with root package name */
        boolean f23942j;

        /* renamed from: k, reason: collision with root package name */
        Rect f23943k;

        /* renamed from: l, reason: collision with root package name */
        boolean f23944l;

        /* renamed from: m, reason: collision with root package name */
        boolean f23945m;

        /* renamed from: n, reason: collision with root package name */
        int f23946n;

        /* renamed from: o, reason: collision with root package name */
        int f23947o;

        /* renamed from: p, reason: collision with root package name */
        int f23948p;

        /* renamed from: q, reason: collision with root package name */
        int f23949q;

        /* renamed from: r, reason: collision with root package name */
        boolean f23950r;

        /* renamed from: s, reason: collision with root package name */
        int f23951s;

        /* renamed from: t, reason: collision with root package name */
        boolean f23952t;

        /* renamed from: u, reason: collision with root package name */
        boolean f23953u;

        /* renamed from: v, reason: collision with root package name */
        boolean f23954v;

        /* renamed from: w, reason: collision with root package name */
        boolean f23955w;

        /* renamed from: x, reason: collision with root package name */
        boolean f23956x;

        /* renamed from: y, reason: collision with root package name */
        boolean f23957y;

        /* renamed from: z, reason: collision with root package name */
        int f23958z;

        d(d dVar, b bVar, Resources resources) {
            this.f23941i = false;
            this.f23944l = false;
            this.f23956x = true;
            this.A = 0;
            this.B = 0;
            this.f23933a = bVar;
            this.f23934b = resources != null ? resources : dVar != null ? dVar.f23934b : null;
            int iF = b.f(resources, dVar != null ? dVar.f23935c : 0);
            this.f23935c = iF;
            if (dVar == null) {
                this.f23939g = new Drawable[10];
                this.f23940h = 0;
                return;
            }
            this.f23936d = dVar.f23936d;
            this.f23937e = dVar.f23937e;
            this.f23954v = true;
            this.f23955w = true;
            this.f23941i = dVar.f23941i;
            this.f23944l = dVar.f23944l;
            this.f23956x = dVar.f23956x;
            this.f23957y = dVar.f23957y;
            this.f23958z = dVar.f23958z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f23935c == iF) {
                if (dVar.f23942j) {
                    this.f23943k = dVar.f23943k != null ? new Rect(dVar.f23943k) : null;
                    this.f23942j = true;
                }
                if (dVar.f23945m) {
                    this.f23946n = dVar.f23946n;
                    this.f23947o = dVar.f23947o;
                    this.f23948p = dVar.f23948p;
                    this.f23949q = dVar.f23949q;
                    this.f23945m = true;
                }
            }
            if (dVar.f23950r) {
                this.f23951s = dVar.f23951s;
                this.f23950r = true;
            }
            if (dVar.f23952t) {
                this.f23953u = dVar.f23953u;
                this.f23952t = true;
            }
            Drawable[] drawableArr = dVar.f23939g;
            this.f23939g = new Drawable[drawableArr.length];
            this.f23940h = dVar.f23940h;
            SparseArray sparseArray = dVar.f23938f;
            this.f23938f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f23940h);
            int i10 = this.f23940h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null) {
                    Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                    if (constantState != null) {
                        this.f23938f.put(i11, constantState);
                    } else {
                        this.f23939g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void e() {
            SparseArray sparseArray = this.f23938f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f23939g[this.f23938f.keyAt(i10)] = s(((Drawable.ConstantState) this.f23938f.valueAt(i10)).newDrawable(this.f23934b));
                }
                this.f23938f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            androidx.core.graphics.drawable.a.m(drawable, this.f23958z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f23933a);
            return drawableMutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f23940h;
            if (i10 >= this.f23939g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f23933a);
            this.f23939g[i10] = drawable;
            this.f23940h++;
            this.f23937e = drawable.getChangingConfigurations() | this.f23937e;
            p();
            this.f23943k = null;
            this.f23942j = false;
            this.f23945m = false;
            this.f23954v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f23940h;
                Drawable[] drawableArr = this.f23939g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f23937e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0139b.c(theme));
            }
        }

        public boolean c() {
            if (this.f23954v) {
                return this.f23955w;
            }
            e();
            this.f23954v = true;
            int i10 = this.f23940h;
            Drawable[] drawableArr = this.f23939g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f23955w = false;
                    return false;
                }
            }
            this.f23955w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f23940h;
            Drawable[] drawableArr = this.f23939g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f23938f.get(i11);
                    if (constantState != null && C0139b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f23945m = true;
            e();
            int i10 = this.f23940h;
            Drawable[] drawableArr = this.f23939g;
            this.f23947o = -1;
            this.f23946n = -1;
            this.f23949q = 0;
            this.f23948p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f23946n) {
                    this.f23946n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f23947o) {
                    this.f23947o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f23948p) {
                    this.f23948p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f23949q) {
                    this.f23949q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f23939g.length;
        }

        public final Drawable g(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f23939g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f23938f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableS = s(((Drawable.ConstantState) this.f23938f.valueAt(iIndexOfKey)).newDrawable(this.f23934b));
            this.f23939g[i10] = drawableS;
            this.f23938f.removeAt(iIndexOfKey);
            if (this.f23938f.size() == 0) {
                this.f23938f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23936d | this.f23937e;
        }

        public final int h() {
            return this.f23940h;
        }

        public final int i() {
            if (!this.f23945m) {
                d();
            }
            return this.f23947o;
        }

        public final int j() {
            if (!this.f23945m) {
                d();
            }
            return this.f23949q;
        }

        public final int k() {
            if (!this.f23945m) {
                d();
            }
            return this.f23948p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f23941i) {
                return null;
            }
            Rect rect2 = this.f23943k;
            if (rect2 != null || this.f23942j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f23940h;
            Drawable[] drawableArr = this.f23939g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f23942j = true;
            this.f23943k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f23945m) {
                d();
            }
            return this.f23946n;
        }

        public final int n() {
            if (this.f23950r) {
                return this.f23951s;
            }
            e();
            int i10 = this.f23940h;
            Drawable[] drawableArr = this.f23939g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f23951s = opacity;
            this.f23950r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f23939g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f23939g = drawableArr;
        }

        void p() {
            this.f23950r = false;
            this.f23952t = false;
        }

        public final boolean q() {
            return this.f23944l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f23944l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f23940h;
            Drawable[] drawableArr = this.f23939g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean zM = androidx.core.graphics.drawable.a.m(drawableArr[i13], i10);
                    if (i13 == i11) {
                        z10 = zM;
                    }
                }
            }
            this.f23958z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f23941i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f23934b = resources;
                int iF = b.f(resources, this.f23935c);
                int i10 = this.f23935c;
                this.f23935c = iF;
                if (i10 != iF) {
                    this.f23945m = false;
                    this.f23942j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f23930x == null) {
            this.f23930x = new c();
        }
        drawable.setCallback(this.f23930x.b(drawable.getCallback()));
        try {
            if (this.f23919m.A <= 0 && this.f23924r) {
                drawable.setAlpha(this.f23923q);
            }
            d dVar = this.f23919m;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f23919m;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f23919m.f23956x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            androidx.core.graphics.drawable.a.j(drawable, this.f23919m.C);
            Rect rect = this.f23920n;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f23930x.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    void a(boolean z10) {
        boolean z11;
        boolean z12 = true;
        this.f23924r = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            long j10 = this.f23928v;
            if (j10 == 0) {
                z11 = false;
            } else if (j10 <= jUptimeMillis) {
                drawable.setAlpha(this.f23923q);
                this.f23928v = 0L;
                z11 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j10 - jUptimeMillis) * 255)) / this.f23919m.A)) * this.f23923q) / 255);
                z11 = true;
            }
        } else {
            this.f23928v = 0L;
            z11 = false;
        }
        Drawable drawable2 = this.f23922p;
        if (drawable2 != null) {
            long j11 = this.f23929w;
            if (j11 == 0) {
                z12 = z11;
            } else if (j11 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f23922p = null;
                this.f23929w = 0L;
                z12 = z11;
            } else {
                drawable2.setAlpha(((((int) ((j11 - jUptimeMillis) * 255)) / this.f23919m.B) * this.f23923q) / 255);
            }
        } else {
            this.f23929w = 0L;
            z12 = z11;
        }
        if (z10 && z12) {
            scheduleSelf(this.f23927u, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f23919m.b(theme);
    }

    abstract d b();

    int c() {
        return this.f23925s;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f23919m.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f23922p;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f23925s
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f23919m
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f23922p
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f23921o
            if (r0 == 0) goto L29
            r9.f23922p = r0
            h.b$d r0 = r9.f23919m
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f23929w = r0
            goto L35
        L29:
            r9.f23922p = r4
            r9.f23929w = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f23921o
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$d r0 = r9.f23919m
            int r1 = r0.f23940h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f23921o = r0
            r9.f23925s = r10
            if (r0 == 0) goto L5a
            h.b$d r10 = r9.f23919m
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f23928v = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f23921o = r4
            r10 = -1
            r9.f23925s = r10
        L5a:
            long r0 = r9.f23928v
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f23929w
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f23927u
            if (r10 != 0) goto L73
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.f23927u = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23923q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f23919m.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f23919m.c()) {
            return null;
        }
        this.f23919m.f23936d = getChangingConfigurations();
        return this.f23919m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f23921o;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f23920n;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f23919m.q()) {
            return this.f23919m.i();
        }
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f23919m.q()) {
            return this.f23919m.m();
        }
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f23919m.q()) {
            return this.f23919m.j();
        }
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f23919m.q()) {
            return this.f23919m.k();
        }
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f23921o;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f23919m.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            C0139b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f23919m.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f23921o;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    void h(d dVar) {
        this.f23919m = dVar;
        int i10 = this.f23925s;
        if (i10 >= 0) {
            Drawable drawableG = dVar.g(i10);
            this.f23921o = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f23922p = null;
    }

    final void i(Resources resources) {
        this.f23919m.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f23919m;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f23921o || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f23919m.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f23922p;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f23922p = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f23921o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f23924r) {
                this.f23921o.setAlpha(this.f23923q);
            }
        }
        if (this.f23929w != 0) {
            this.f23929w = 0L;
            z10 = true;
        }
        if (this.f23928v != 0) {
            this.f23928v = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f23926t && super.mutate() == this) {
            d dVarB = b();
            dVarB.r();
            h(dVarB);
            this.f23926t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23922p;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f23921o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f23919m.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f23922p;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f23921o;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f23921o || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f23924r && this.f23923q == i10) {
            return;
        }
        this.f23924r = true;
        this.f23923q = i10;
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            if (this.f23928v == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f23919m;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f23921o;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f23919m;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f23921o;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f23919m;
        if (dVar.f23956x != z10) {
            dVar.f23956x = z10;
            Drawable drawable = this.f23921o;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f5, float f10) {
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f5, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f23920n;
        if (rect == null) {
            this.f23920n = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f23921o;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f23919m;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f23921o, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f23919m;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f23921o, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f23922p;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f23921o;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f23921o || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
