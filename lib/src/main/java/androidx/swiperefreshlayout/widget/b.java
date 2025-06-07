package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.h;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: s, reason: collision with root package name */
    private static final Interpolator f3854s = new LinearInterpolator();

    /* renamed from: t, reason: collision with root package name */
    private static final Interpolator f3855t = new k0.b();

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f3856u = {-16777216};

    /* renamed from: m, reason: collision with root package name */
    private final c f3857m;

    /* renamed from: n, reason: collision with root package name */
    private float f3858n;

    /* renamed from: o, reason: collision with root package name */
    private Resources f3859o;

    /* renamed from: p, reason: collision with root package name */
    private Animator f3860p;

    /* renamed from: q, reason: collision with root package name */
    float f3861q;

    /* renamed from: r, reason: collision with root package name */
    boolean f3862r;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f3863a;

        a(c cVar) {
            this.f3863a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f3863a);
            b.this.b(fFloatValue, this.f3863a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0061b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f3865a;

        C0061b(c cVar) {
            this.f3865a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f3865a, true);
            this.f3865a.A();
            this.f3865a.l();
            b bVar = b.this;
            if (!bVar.f3862r) {
                bVar.f3861q += 1.0f;
                return;
            }
            bVar.f3862r = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f3865a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f3861q = 0.0f;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f3867a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f3868b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f3869c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f3870d;

        /* renamed from: e, reason: collision with root package name */
        float f3871e;

        /* renamed from: f, reason: collision with root package name */
        float f3872f;

        /* renamed from: g, reason: collision with root package name */
        float f3873g;

        /* renamed from: h, reason: collision with root package name */
        float f3874h;

        /* renamed from: i, reason: collision with root package name */
        int[] f3875i;

        /* renamed from: j, reason: collision with root package name */
        int f3876j;

        /* renamed from: k, reason: collision with root package name */
        float f3877k;

        /* renamed from: l, reason: collision with root package name */
        float f3878l;

        /* renamed from: m, reason: collision with root package name */
        float f3879m;

        /* renamed from: n, reason: collision with root package name */
        boolean f3880n;

        /* renamed from: o, reason: collision with root package name */
        Path f3881o;

        /* renamed from: p, reason: collision with root package name */
        float f3882p;

        /* renamed from: q, reason: collision with root package name */
        float f3883q;

        /* renamed from: r, reason: collision with root package name */
        int f3884r;

        /* renamed from: s, reason: collision with root package name */
        int f3885s;

        /* renamed from: t, reason: collision with root package name */
        int f3886t;

        /* renamed from: u, reason: collision with root package name */
        int f3887u;

        c() {
            Paint paint = new Paint();
            this.f3868b = paint;
            Paint paint2 = new Paint();
            this.f3869c = paint2;
            Paint paint3 = new Paint();
            this.f3870d = paint3;
            this.f3871e = 0.0f;
            this.f3872f = 0.0f;
            this.f3873g = 0.0f;
            this.f3874h = 5.0f;
            this.f3882p = 1.0f;
            this.f3886t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f3877k = this.f3871e;
            this.f3878l = this.f3872f;
            this.f3879m = this.f3873g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f3867a;
            float f5 = this.f3883q;
            float fMin = (this.f3874h / 2.0f) + f5;
            if (f5 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f3884r * this.f3882p) / 2.0f, this.f3874h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f10 = this.f3871e;
            float f11 = this.f3873g;
            float f12 = (f10 + f11) * 360.0f;
            float f13 = ((this.f3872f + f11) * 360.0f) - f12;
            this.f3868b.setColor(this.f3887u);
            this.f3868b.setAlpha(this.f3886t);
            float f14 = this.f3874h / 2.0f;
            rectF.inset(f14, f14);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f3870d);
            float f15 = -f14;
            rectF.inset(f15, f15);
            canvas.drawArc(rectF, f12, f13, false, this.f3868b);
            b(canvas, f12, f13, rectF);
        }

        void b(Canvas canvas, float f5, float f10, RectF rectF) {
            if (this.f3880n) {
                Path path = this.f3881o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f3881o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f11 = (this.f3884r * this.f3882p) / 2.0f;
                this.f3881o.moveTo(0.0f, 0.0f);
                this.f3881o.lineTo(this.f3884r * this.f3882p, 0.0f);
                Path path3 = this.f3881o;
                float f12 = this.f3884r;
                float f13 = this.f3882p;
                path3.lineTo((f12 * f13) / 2.0f, this.f3885s * f13);
                this.f3881o.offset((fMin + rectF.centerX()) - f11, rectF.centerY() + (this.f3874h / 2.0f));
                this.f3881o.close();
                this.f3869c.setColor(this.f3887u);
                this.f3869c.setAlpha(this.f3886t);
                canvas.save();
                canvas.rotate(f5 + f10, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f3881o, this.f3869c);
                canvas.restore();
            }
        }

        int c() {
            return this.f3886t;
        }

        float d() {
            return this.f3872f;
        }

        int e() {
            return this.f3875i[f()];
        }

        int f() {
            return (this.f3876j + 1) % this.f3875i.length;
        }

        float g() {
            return this.f3871e;
        }

        int h() {
            return this.f3875i[this.f3876j];
        }

        float i() {
            return this.f3878l;
        }

        float j() {
            return this.f3879m;
        }

        float k() {
            return this.f3877k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f3877k = 0.0f;
            this.f3878l = 0.0f;
            this.f3879m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f3886t = i10;
        }

        void o(float f5, float f10) {
            this.f3884r = (int) f5;
            this.f3885s = (int) f10;
        }

        void p(float f5) {
            if (f5 != this.f3882p) {
                this.f3882p = f5;
            }
        }

        void q(float f5) {
            this.f3883q = f5;
        }

        void r(int i10) {
            this.f3887u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f3868b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f3876j = i10;
            this.f3887u = this.f3875i[i10];
        }

        void u(int[] iArr) {
            this.f3875i = iArr;
            t(0);
        }

        void v(float f5) {
            this.f3872f = f5;
        }

        void w(float f5) {
            this.f3873g = f5;
        }

        void x(boolean z10) {
            if (this.f3880n != z10) {
                this.f3880n = z10;
            }
        }

        void y(float f5) {
            this.f3871e = f5;
        }

        void z(float f5) {
            this.f3874h = f5;
            this.f3868b.setStrokeWidth(f5);
        }
    }

    public b(Context context) {
        this.f3859o = ((Context) h.f(context)).getResources();
        c cVar = new c();
        this.f3857m = cVar;
        cVar.u(f3856u);
        k(2.5f);
        m();
    }

    private void a(float f5, c cVar) {
        n(f5, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f5));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f5));
    }

    private int c(float f5, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f5))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f5))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f5))) << 8) | ((i10 & 255) + ((int) (f5 * ((i11 & 255) - r8))));
    }

    private void h(float f5) {
        this.f3858n = f5;
    }

    private void i(float f5, float f10, float f11, float f12) {
        c cVar = this.f3857m;
        float f13 = this.f3859o.getDisplayMetrics().density;
        cVar.z(f10 * f13);
        cVar.q(f5 * f13);
        cVar.t(0);
        cVar.o(f11 * f13, f12 * f13);
    }

    private void m() {
        c cVar = this.f3857m;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f3854s);
        valueAnimatorOfFloat.addListener(new C0061b(cVar));
        this.f3860p = valueAnimatorOfFloat;
    }

    void b(float f5, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f3862r) {
            a(f5, cVar);
            return;
        }
        if (f5 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f5 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f3855t.getInterpolation(f5 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f3855t.getInterpolation((f5 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f10 = fJ + (0.20999998f * f5);
            float f11 = (f5 + this.f3861q) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f10);
            h(f11);
        }
    }

    public void d(boolean z10) {
        this.f3857m.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3858n, bounds.exactCenterX(), bounds.exactCenterY());
        this.f3857m.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f5) {
        this.f3857m.p(f5);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f3857m.u(iArr);
        this.f3857m.t(0);
        invalidateSelf();
    }

    public void g(float f5) {
        this.f3857m.w(f5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3857m.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3860p.isRunning();
    }

    public void j(float f5, float f10) {
        this.f3857m.y(f5);
        this.f3857m.v(f10);
        invalidateSelf();
    }

    public void k(float f5) {
        this.f3857m.z(f5);
        invalidateSelf();
    }

    public void l(int i10) {
        float f5;
        float f10;
        float f11;
        float f12;
        if (i10 == 0) {
            f5 = 11.0f;
            f10 = 3.0f;
            f11 = 12.0f;
            f12 = 6.0f;
        } else {
            f5 = 7.5f;
            f10 = 2.5f;
            f11 = 10.0f;
            f12 = 5.0f;
        }
        i(f5, f10, f11, f12);
        invalidateSelf();
    }

    void n(float f5, c cVar) {
        cVar.r(f5 > 0.75f ? c((f5 - 0.75f) / 0.25f, cVar.h(), cVar.e()) : cVar.h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3857m.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3857m.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f3860p.cancel();
        this.f3857m.A();
        if (this.f3857m.d() != this.f3857m.g()) {
            this.f3862r = true;
            animator = this.f3860p;
            j10 = 666;
        } else {
            this.f3857m.t(0);
            this.f3857m.m();
            animator = this.f3860p;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f3860p.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3860p.cancel();
        h(0.0f);
        this.f3857m.x(false);
        this.f3857m.t(0);
        this.f3857m.m();
        invalidateSelf();
    }
}
