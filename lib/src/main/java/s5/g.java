package s5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import s5.k;
import s5.l;
import s5.m;

/* loaded from: classes.dex */
public class g extends Drawable implements n {
    private static final String J = g.class.getSimpleName();
    private static final Paint K;
    private final Paint A;
    private final r5.a B;
    private final l.b C;
    private final l D;
    private PorterDuffColorFilter E;
    private PorterDuffColorFilter F;
    private int G;
    private final RectF H;
    private boolean I;

    /* renamed from: m, reason: collision with root package name */
    private c f26919m;

    /* renamed from: n, reason: collision with root package name */
    private final m.g[] f26920n;

    /* renamed from: o, reason: collision with root package name */
    private final m.g[] f26921o;

    /* renamed from: p, reason: collision with root package name */
    private final BitSet f26922p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26923q;

    /* renamed from: r, reason: collision with root package name */
    private final Matrix f26924r;

    /* renamed from: s, reason: collision with root package name */
    private final Path f26925s;

    /* renamed from: t, reason: collision with root package name */
    private final Path f26926t;

    /* renamed from: u, reason: collision with root package name */
    private final RectF f26927u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f26928v;

    /* renamed from: w, reason: collision with root package name */
    private final Region f26929w;

    /* renamed from: x, reason: collision with root package name */
    private final Region f26930x;

    /* renamed from: y, reason: collision with root package name */
    private k f26931y;

    /* renamed from: z, reason: collision with root package name */
    private final Paint f26932z;

    class a implements l.b {
        a() {
        }

        @Override // s5.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f26922p.set(i10, mVar.e());
            g.this.f26920n[i10] = mVar.f(matrix);
        }

        @Override // s5.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f26922p.set(i10 + 4, mVar.e());
            g.this.f26921o[i10] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26934a;

        b(float f5) {
            this.f26934a = f5;
        }

        @Override // s5.k.c
        public s5.c a(s5.c cVar) {
            return cVar instanceof i ? cVar : new s5.b(this.f26934a, cVar);
        }
    }

    static final class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public k f26936a;

        /* renamed from: b, reason: collision with root package name */
        public l5.a f26937b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f26938c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f26939d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f26940e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f26941f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f26942g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f26943h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f26944i;

        /* renamed from: j, reason: collision with root package name */
        public float f26945j;

        /* renamed from: k, reason: collision with root package name */
        public float f26946k;

        /* renamed from: l, reason: collision with root package name */
        public float f26947l;

        /* renamed from: m, reason: collision with root package name */
        public int f26948m;

        /* renamed from: n, reason: collision with root package name */
        public float f26949n;

        /* renamed from: o, reason: collision with root package name */
        public float f26950o;

        /* renamed from: p, reason: collision with root package name */
        public float f26951p;

        /* renamed from: q, reason: collision with root package name */
        public int f26952q;

        /* renamed from: r, reason: collision with root package name */
        public int f26953r;

        /* renamed from: s, reason: collision with root package name */
        public int f26954s;

        /* renamed from: t, reason: collision with root package name */
        public int f26955t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f26956u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f26957v;

        public c(c cVar) {
            this.f26939d = null;
            this.f26940e = null;
            this.f26941f = null;
            this.f26942g = null;
            this.f26943h = PorterDuff.Mode.SRC_IN;
            this.f26944i = null;
            this.f26945j = 1.0f;
            this.f26946k = 1.0f;
            this.f26948m = 255;
            this.f26949n = 0.0f;
            this.f26950o = 0.0f;
            this.f26951p = 0.0f;
            this.f26952q = 0;
            this.f26953r = 0;
            this.f26954s = 0;
            this.f26955t = 0;
            this.f26956u = false;
            this.f26957v = Paint.Style.FILL_AND_STROKE;
            this.f26936a = cVar.f26936a;
            this.f26937b = cVar.f26937b;
            this.f26947l = cVar.f26947l;
            this.f26938c = cVar.f26938c;
            this.f26939d = cVar.f26939d;
            this.f26940e = cVar.f26940e;
            this.f26943h = cVar.f26943h;
            this.f26942g = cVar.f26942g;
            this.f26948m = cVar.f26948m;
            this.f26945j = cVar.f26945j;
            this.f26954s = cVar.f26954s;
            this.f26952q = cVar.f26952q;
            this.f26956u = cVar.f26956u;
            this.f26946k = cVar.f26946k;
            this.f26949n = cVar.f26949n;
            this.f26950o = cVar.f26950o;
            this.f26951p = cVar.f26951p;
            this.f26953r = cVar.f26953r;
            this.f26955t = cVar.f26955t;
            this.f26941f = cVar.f26941f;
            this.f26957v = cVar.f26957v;
            if (cVar.f26944i != null) {
                this.f26944i = new Rect(cVar.f26944i);
            }
        }

        public c(k kVar, l5.a aVar) {
            this.f26939d = null;
            this.f26940e = null;
            this.f26941f = null;
            this.f26942g = null;
            this.f26943h = PorterDuff.Mode.SRC_IN;
            this.f26944i = null;
            this.f26945j = 1.0f;
            this.f26946k = 1.0f;
            this.f26948m = 255;
            this.f26949n = 0.0f;
            this.f26950o = 0.0f;
            this.f26951p = 0.0f;
            this.f26952q = 0;
            this.f26953r = 0;
            this.f26954s = 0;
            this.f26955t = 0;
            this.f26956u = false;
            this.f26957v = Paint.Style.FILL_AND_STROKE;
            this.f26936a = kVar;
            this.f26937b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f26923q = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    private g(c cVar) {
        this.f26920n = new m.g[4];
        this.f26921o = new m.g[4];
        this.f26922p = new BitSet(8);
        this.f26924r = new Matrix();
        this.f26925s = new Path();
        this.f26926t = new Path();
        this.f26927u = new RectF();
        this.f26928v = new RectF();
        this.f26929w = new Region();
        this.f26930x = new Region();
        Paint paint = new Paint(1);
        this.f26932z = paint;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new r5.a();
        this.D = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.H = new RectF();
        this.I = true;
        this.f26919m = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        e0();
        d0(getState());
        this.C = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private float D() {
        if (K()) {
            return this.A.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.f26919m;
        int i10 = cVar.f26952q;
        return i10 != 1 && cVar.f26953r > 0 && (i10 == 2 || S());
    }

    private boolean J() {
        Paint.Style style = this.f26919m.f26957v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f26919m.f26957v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.A.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private void P(Canvas canvas) {
        if (I()) {
            canvas.save();
            R(canvas);
            if (this.I) {
                int iWidth = (int) (this.H.width() - getBounds().width());
                int iHeight = (int) (this.H.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.H.width()) + (this.f26919m.f26953r * 2) + iWidth, ((int) this.H.height()) + (this.f26919m.f26953r * 2) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f5 = (getBounds().left - this.f26919m.f26953r) - iWidth;
                float f10 = (getBounds().top - this.f26919m.f26953r) - iHeight;
                canvas2.translate(-f5, -f10);
                n(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f5, f10, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    private static int Q(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void R(Canvas canvas) {
        canvas.translate(A(), B());
    }

    private boolean d0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f26919m.f26939d == null || color2 == (colorForState2 = this.f26919m.f26939d.getColorForState(iArr, (color2 = this.f26932z.getColor())))) {
            z10 = false;
        } else {
            this.f26932z.setColor(colorForState2);
            z10 = true;
        }
        if (this.f26919m.f26940e == null || color == (colorForState = this.f26919m.f26940e.getColorForState(iArr, (color = this.A.getColor())))) {
            return z10;
        }
        this.A.setColor(colorForState);
        return true;
    }

    private boolean e0() {
        PorterDuffColorFilter porterDuffColorFilter = this.E;
        PorterDuffColorFilter porterDuffColorFilter2 = this.F;
        c cVar = this.f26919m;
        this.E = k(cVar.f26942g, cVar.f26943h, this.f26932z, true);
        c cVar2 = this.f26919m;
        this.F = k(cVar2.f26941f, cVar2.f26943h, this.A, false);
        c cVar3 = this.f26919m;
        if (cVar3.f26956u) {
            this.B.d(cVar3.f26942g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.c.a(porterDuffColorFilter, this.E) && androidx.core.util.c.a(porterDuffColorFilter2, this.F)) ? false : true;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.G = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void f0() {
        float fH = H();
        this.f26919m.f26953r = (int) Math.ceil(0.75f * fH);
        this.f26919m.f26954s = (int) Math.ceil(fH * 0.25f);
        e0();
        M();
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f26919m.f26945j != 1.0f) {
            this.f26924r.reset();
            Matrix matrix = this.f26924r;
            float f5 = this.f26919m.f26945j;
            matrix.setScale(f5, f5, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f26924r);
        }
        path.computeBounds(this.H, true);
    }

    private void i() {
        k kVarY = C().y(new b(-D()));
        this.f26931y = kVarY;
        this.D.d(kVarY, this.f26919m.f26946k, v(), this.f26926t);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.G = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static g m(Context context, float f5) {
        int iC = i5.a.c(context, c5.b.f4684l, g.class.getSimpleName());
        g gVar = new g();
        gVar.L(context);
        gVar.V(ColorStateList.valueOf(iC));
        gVar.U(f5);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f26922p.cardinality() > 0) {
            Log.w(J, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f26919m.f26954s != 0) {
            canvas.drawPath(this.f26925s, this.B.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f26920n[i10].b(this.B, this.f26919m.f26953r, canvas);
            this.f26921o[i10].b(this.B, this.f26919m.f26953r, canvas);
        }
        if (this.I) {
            int iA = A();
            int iB = B();
            canvas.translate(-iA, -iB);
            canvas.drawPath(this.f26925s, K);
            canvas.translate(iA, iB);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f26932z, this.f26925s, this.f26919m.f26936a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f26919m.f26946k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF v() {
        this.f26928v.set(u());
        float fD = D();
        this.f26928v.inset(fD, fD);
        return this.f26928v;
    }

    public int A() {
        c cVar = this.f26919m;
        return (int) (cVar.f26954s * Math.sin(Math.toRadians(cVar.f26955t)));
    }

    public int B() {
        c cVar = this.f26919m;
        return (int) (cVar.f26954s * Math.cos(Math.toRadians(cVar.f26955t)));
    }

    public k C() {
        return this.f26919m.f26936a;
    }

    public float E() {
        return this.f26919m.f26936a.r().a(u());
    }

    public float F() {
        return this.f26919m.f26936a.t().a(u());
    }

    public float G() {
        return this.f26919m.f26951p;
    }

    public float H() {
        return w() + G();
    }

    public void L(Context context) {
        this.f26919m.f26937b = new l5.a(context);
        f0();
    }

    public boolean N() {
        l5.a aVar = this.f26919m.f26937b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f26919m.f26936a.u(u());
    }

    public boolean S() {
        return (O() || this.f26925s.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void T(s5.c cVar) {
        setShapeAppearanceModel(this.f26919m.f26936a.x(cVar));
    }

    public void U(float f5) {
        c cVar = this.f26919m;
        if (cVar.f26950o != f5) {
            cVar.f26950o = f5;
            f0();
        }
    }

    public void V(ColorStateList colorStateList) {
        c cVar = this.f26919m;
        if (cVar.f26939d != colorStateList) {
            cVar.f26939d = colorStateList;
            onStateChange(getState());
        }
    }

    public void W(float f5) {
        c cVar = this.f26919m;
        if (cVar.f26946k != f5) {
            cVar.f26946k = f5;
            this.f26923q = true;
            invalidateSelf();
        }
    }

    public void X(int i10, int i11, int i12, int i13) {
        c cVar = this.f26919m;
        if (cVar.f26944i == null) {
            cVar.f26944i = new Rect();
        }
        this.f26919m.f26944i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void Y(float f5) {
        c cVar = this.f26919m;
        if (cVar.f26949n != f5) {
            cVar.f26949n = f5;
            f0();
        }
    }

    public void Z(float f5, int i10) {
        c0(f5);
        b0(ColorStateList.valueOf(i10));
    }

    public void a0(float f5, ColorStateList colorStateList) {
        c0(f5);
        b0(colorStateList);
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f26919m;
        if (cVar.f26940e != colorStateList) {
            cVar.f26940e = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f5) {
        this.f26919m.f26947l = f5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f26932z.setColorFilter(this.E);
        int alpha = this.f26932z.getAlpha();
        this.f26932z.setAlpha(Q(alpha, this.f26919m.f26948m));
        this.A.setColorFilter(this.F);
        this.A.setStrokeWidth(this.f26919m.f26947l);
        int alpha2 = this.A.getAlpha();
        this.A.setAlpha(Q(alpha2, this.f26919m.f26948m));
        if (this.f26923q) {
            i();
            g(u(), this.f26925s);
            this.f26923q = false;
        }
        P(canvas);
        if (J()) {
            o(canvas);
        }
        if (K()) {
            r(canvas);
        }
        this.f26932z.setAlpha(alpha);
        this.A.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26919m.f26948m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26919m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f26919m.f26952q == 2) {
            return;
        }
        if (O()) {
            outline.setRoundRect(getBounds(), E() * this.f26919m.f26946k);
            return;
        }
        g(u(), this.f26925s);
        if (this.f26925s.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f26925s);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f26919m.f26944i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f26929w.set(getBounds());
        g(u(), this.f26925s);
        this.f26930x.setPath(this.f26925s, this.f26929w);
        this.f26929w.op(this.f26930x, Region.Op.DIFFERENCE);
        return this.f26929w;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.D;
        c cVar = this.f26919m;
        lVar.e(cVar.f26936a, cVar.f26946k, rectF, this.C, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f26923q = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f26919m.f26942g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f26919m.f26941f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f26919m.f26940e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f26919m.f26939d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i10) {
        float fH = H() + y();
        l5.a aVar = this.f26919m.f26937b;
        return aVar != null ? aVar.c(i10, fH) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f26919m = new c(this.f26919m);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f26923q = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = d0(iArr) || e0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f26919m.f26936a, rectF);
    }

    protected void r(Canvas canvas) {
        q(canvas, this.A, this.f26926t, this.f26931y, v());
    }

    public float s() {
        return this.f26919m.f26936a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f26919m;
        if (cVar.f26948m != i10) {
            cVar.f26948m = i10;
            M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26919m.f26938c = colorFilter;
        M();
    }

    @Override // s5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f26919m.f26936a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f26919m.f26942g = colorStateList;
        e0();
        M();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f26919m;
        if (cVar.f26943h != mode) {
            cVar.f26943h = mode;
            e0();
            M();
        }
    }

    public float t() {
        return this.f26919m.f26936a.l().a(u());
    }

    protected RectF u() {
        this.f26927u.set(getBounds());
        return this.f26927u;
    }

    public float w() {
        return this.f26919m.f26950o;
    }

    public ColorStateList x() {
        return this.f26919m.f26939d;
    }

    public float y() {
        return this.f26919m.f26949n;
    }

    public int z() {
        return this.G;
    }
}
