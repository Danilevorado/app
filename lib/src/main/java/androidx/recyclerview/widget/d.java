package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.w;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.t C;

    /* renamed from: a, reason: collision with root package name */
    private final int f3505a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3506b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f3507c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f3508d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3509e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3510f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f3511g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f3512h;

    /* renamed from: i, reason: collision with root package name */
    private final int f3513i;

    /* renamed from: j, reason: collision with root package name */
    private final int f3514j;

    /* renamed from: k, reason: collision with root package name */
    int f3515k;

    /* renamed from: l, reason: collision with root package name */
    int f3516l;

    /* renamed from: m, reason: collision with root package name */
    float f3517m;

    /* renamed from: n, reason: collision with root package name */
    int f3518n;

    /* renamed from: o, reason: collision with root package name */
    int f3519o;

    /* renamed from: p, reason: collision with root package name */
    float f3520p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f3523s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f3530z;

    /* renamed from: q, reason: collision with root package name */
    private int f3521q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f3522r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3524t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3525u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f3526v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f3527w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f3528x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f3529y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3533a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3533a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3533a) {
                this.f3533a = false;
                return;
            }
            if (((Float) d.this.f3530z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0055d implements ValueAnimator.AnimatorUpdateListener {
        C0055d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3507c.setAlpha(iFloatValue);
            d.this.f3508d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3530z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3507c = stateListDrawable;
        this.f3508d = drawable;
        this.f3511g = stateListDrawable2;
        this.f3512h = drawable2;
        this.f3509e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3510f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3513i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3514j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3505a = i11;
        this.f3506b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0055d());
        j(recyclerView);
    }

    private void C(float f5) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f5));
        if (Math.abs(this.f3516l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3517m, fMax, iArrP, this.f3523s.computeVerticalScrollRange(), this.f3523s.computeVerticalScrollOffset(), this.f3522r);
        if (iX != 0) {
            this.f3523s.scrollBy(0, iX);
        }
        this.f3517m = fMax;
    }

    private void k() {
        this.f3523s.removeCallbacks(this.B);
    }

    private void l() {
        this.f3523s.W0(this);
        this.f3523s.X0(this);
        this.f3523s.Y0(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f3522r;
        int i11 = this.f3513i;
        int i12 = this.f3519o;
        int i13 = this.f3518n;
        this.f3511g.setBounds(0, 0, i13, i11);
        this.f3512h.setBounds(0, 0, this.f3521q, this.f3514j);
        canvas.translate(0.0f, i10 - i11);
        this.f3512h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f3511g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f3521q;
        int i11 = this.f3509e;
        int i12 = i10 - i11;
        int i13 = this.f3516l;
        int i14 = this.f3515k;
        int i15 = i13 - (i14 / 2);
        this.f3507c.setBounds(0, 0, i11, i14);
        this.f3508d.setBounds(0, 0, this.f3510f, this.f3522r);
        if (s()) {
            this.f3508d.draw(canvas);
            canvas.translate(this.f3509e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f3507c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i12 = this.f3509e;
        } else {
            canvas.translate(i12, 0.0f);
            this.f3508d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3507c.draw(canvas);
        }
        canvas.translate(-i12, -i15);
    }

    private int[] o() {
        int[] iArr = this.f3529y;
        int i10 = this.f3506b;
        iArr[0] = i10;
        iArr[1] = this.f3521q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f3528x;
        int i10 = this.f3506b;
        iArr[0] = i10;
        iArr[1] = this.f3522r - i10;
        return iArr;
    }

    private void r(float f5) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f5));
        if (Math.abs(this.f3519o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3520p, fMax, iArrO, this.f3523s.computeHorizontalScrollRange(), this.f3523s.computeHorizontalScrollOffset(), this.f3521q);
        if (iX != 0) {
            this.f3523s.scrollBy(iX, 0);
        }
        this.f3520p = fMax;
    }

    private boolean s() {
        return w.B(this.f3523s) == 1;
    }

    private void w(int i10) {
        k();
        this.f3523s.postDelayed(this.B, i10);
    }

    private int x(float f5, float f10, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f10 - f5) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f3523s.h(this);
        this.f3523s.j(this);
        this.f3523s.k(this.C);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f3530z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3530z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3530z.setDuration(500L);
        this.f3530z.setStartDelay(0L);
        this.f3530z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f3523s.computeVerticalScrollRange();
        int i12 = this.f3522r;
        this.f3524t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f3505a;
        int iComputeHorizontalScrollRange = this.f3523s.computeHorizontalScrollRange();
        int i13 = this.f3521q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f3505a;
        this.f3525u = z10;
        boolean z11 = this.f3524t;
        if (!z11 && !z10) {
            if (this.f3526v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f5 = i12;
            this.f3516l = (int) ((f5 * (i11 + (f5 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3515k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f3525u) {
            float f10 = i13;
            this.f3519o = (int) ((f10 * (i10 + (f10 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3518n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f3526v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3526v;
        if (i10 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f3527w = 1;
                this.f3520p = (int) motionEvent.getX();
            } else if (zU) {
                this.f3527w = 2;
                this.f3517m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3526v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f3527w = 1;
                    this.f3520p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f3527w = 2;
                    this.f3517m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3526v == 2) {
            this.f3517m = 0.0f;
            this.f3520p = 0.0f;
            y(1);
            this.f3527w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3526v == 2) {
            A();
            if (this.f3527w == 1) {
                r(motionEvent.getX());
            }
            if (this.f3527w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f3521q != this.f3523s.getWidth() || this.f3522r != this.f3523s.getHeight()) {
            this.f3521q = this.f3523s.getWidth();
            this.f3522r = this.f3523s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3524t) {
                n(canvas);
            }
            if (this.f3525u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3523s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f3523s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3530z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3530z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3530z.setDuration(i10);
        this.f3530z.start();
    }

    boolean t(float f5, float f10) {
        if (f10 >= this.f3522r - this.f3513i) {
            int i10 = this.f3519o;
            int i11 = this.f3518n;
            if (f5 >= i10 - (i11 / 2) && f5 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f5, float f10) {
        if (!s() ? f5 >= this.f3521q - this.f3509e : f5 <= this.f3509e / 2) {
            int i10 = this.f3516l;
            int i11 = this.f3515k;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f3523s.invalidate();
    }

    void y(int i10) {
        int i11;
        if (i10 == 2 && this.f3526v != 2) {
            this.f3507c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3526v != 2 || i10 == 2) {
            i11 = i10 == 1 ? 1500 : 1200;
            this.f3526v = i10;
        }
        this.f3507c.setState(E);
        w(i11);
        this.f3526v = i10;
    }
}
