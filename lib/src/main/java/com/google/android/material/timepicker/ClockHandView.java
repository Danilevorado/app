package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.w;
import c5.j;
import c5.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class ClockHandView extends View {
    private c A;
    private double B;
    private int C;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f21286m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21287n;

    /* renamed from: o, reason: collision with root package name */
    private float f21288o;

    /* renamed from: p, reason: collision with root package name */
    private float f21289p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21290q;

    /* renamed from: r, reason: collision with root package name */
    private int f21291r;

    /* renamed from: s, reason: collision with root package name */
    private final List f21292s;

    /* renamed from: t, reason: collision with root package name */
    private final int f21293t;

    /* renamed from: u, reason: collision with root package name */
    private final float f21294u;

    /* renamed from: v, reason: collision with root package name */
    private final Paint f21295v;

    /* renamed from: w, reason: collision with root package name */
    private final RectF f21296w;

    /* renamed from: x, reason: collision with root package name */
    private final int f21297x;

    /* renamed from: y, reason: collision with root package name */
    private float f21298y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21299z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f5, boolean z10);
    }

    public interface d {
        void a(float f5, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4693u);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21292s = new ArrayList();
        Paint paint = new Paint();
        this.f21295v = paint;
        this.f21296w = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f4865g1, i10, j.f4815p);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f4881i1, 0);
        this.f21293t = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f4889j1, 0);
        this.f21297x = getResources().getDimensionPixelSize(c5.d.f4713i);
        this.f21294u = r6.getDimensionPixelSize(c5.d.f4711g);
        int color = typedArrayObtainStyledAttributes.getColor(k.f4873h1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f21291r = ViewConfiguration.get(context).getScaledTouchSlop();
        w.y0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.C * ((float) Math.cos(this.B))) + width;
        float f5 = height;
        float fSin = (this.C * ((float) Math.sin(this.B))) + f5;
        this.f21295v.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f21293t, this.f21295v);
        double dSin = Math.sin(this.B);
        double dCos = Math.cos(this.B);
        this.f21295v.setStrokeWidth(this.f21297x);
        canvas.drawLine(width, f5, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f21295v);
        canvas.drawCircle(width, f5, this.f21294u, this.f21295v);
    }

    private int e(float f5, float f10) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f10 - (getHeight() / 2), f5 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair h(float f5) {
        float f10 = f();
        if (Math.abs(f10 - f5) > 180.0f) {
            if (f10 > 180.0f && f5 < 180.0f) {
                f5 += 360.0f;
            }
            if (f10 < 180.0f && f5 > 180.0f) {
                f10 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f10), Float.valueOf(f5));
    }

    private boolean i(float f5, float f10, boolean z10, boolean z11, boolean z12) {
        float fE = e(f5, f10);
        boolean z13 = false;
        boolean z14 = f() != fE;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f21287n) {
            z13 = true;
        }
        l(fE, z13);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f5, boolean z10) {
        float f10 = f5 % 360.0f;
        this.f21298y = f10;
        this.B = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.C * ((float) Math.cos(this.B)));
        float fSin = height + (this.C * ((float) Math.sin(this.B)));
        RectF rectF = this.f21296w;
        int i10 = this.f21293t;
        rectF.set(width - i10, fSin - i10, width + i10, fSin + i10);
        Iterator it = this.f21292s.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(f10, z10);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f21292s.add(dVar);
    }

    public RectF d() {
        return this.f21296w;
    }

    public float f() {
        return this.f21298y;
    }

    public int g() {
        return this.f21293t;
    }

    public void j(int i10) {
        this.C = i10;
        invalidate();
    }

    public void k(float f5) {
        l(f5, false);
    }

    public void l(float f5, boolean z10) {
        ValueAnimator valueAnimator = this.f21286m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m(f5, false);
            return;
        }
        Pair pairH = h(f5);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f21286m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f21286m.addUpdateListener(new a());
        this.f21286m.addListener(new b());
        this.f21286m.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f21288o = x10;
            this.f21289p = y10;
            this.f21290q = true;
            this.f21299z = false;
            z10 = false;
            z11 = false;
            z12 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f21288o);
            int i11 = (int) (y10 - this.f21289p);
            this.f21290q = (i10 * i10) + (i11 * i11) > this.f21291r;
            boolean z13 = this.f21299z;
            z10 = actionMasked == 1;
            z12 = false;
            z11 = z13;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
        }
        boolean zI = i(x10, y10, z11, z12, z10) | this.f21299z;
        this.f21299z = zI;
        if (zI && z10 && (cVar = this.A) != null) {
            cVar.a(e(x10, y10), this.f21290q);
        }
        return true;
    }
}
