package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.d;
import androidx.core.view.w;
import c5.f;
import c5.h;
import c5.j;
import c5.k;
import com.google.android.material.timepicker.ClockHandView;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {
    private final ClockHandView N;
    private final Rect O;
    private final RectF P;
    private final SparseArray Q;
    private final androidx.core.view.a R;
    private final int[] S;
    private final float[] T;
    private final int U;
    private final int V;
    private final int W;

    /* renamed from: a0, reason: collision with root package name */
    private final int f21280a0;

    /* renamed from: b0, reason: collision with root package name */
    private String[] f21281b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f21282c0;

    /* renamed from: d0, reason: collision with root package name */
    private final ColorStateList f21283d0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.D(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.N.g()) - ClockFaceView.this.U);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, d dVar) {
            super.g(view, dVar);
            int iIntValue = ((Integer) view.getTag(f.f4752o)).intValue();
            if (iIntValue > 0) {
                dVar.u0((View) ClockFaceView.this.Q.get(iIntValue - 1));
            }
            dVar.a0(d.c.a(0, 1, iIntValue, 1, false, view.isSelected()));
            dVar.Y(true);
            dVar.b(d.a.f2384i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x10 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.N.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x10, height, 0));
            ClockFaceView.this.N.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x10, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4693u);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = new Rect();
        this.P = new RectF();
        this.Q = new SparseArray();
        this.T = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f4843d1, i10, j.f4815p);
        Resources resources = getResources();
        ColorStateList colorStateListA = p5.c.a(context, typedArrayObtainStyledAttributes, k.f4858f1);
        this.f21283d0 = colorStateListA;
        LayoutInflater.from(context).inflate(h.f4770e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f4746i);
        this.N = clockHandView;
        this.U = resources.getDimensionPixelSize(c5.d.f4712h);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.S = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = g.a.a(context, c5.c.f4700b).getDefaultColor();
        ColorStateList colorStateListA2 = p5.c.a(context, typedArrayObtainStyledAttributes, k.f4851e1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.R = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        N(strArr, 0);
        this.V = resources.getDimensionPixelSize(c5.d.f4725u);
        this.W = resources.getDimensionPixelSize(c5.d.f4726v);
        this.f21280a0 = resources.getDimensionPixelSize(c5.d.f4714j);
    }

    private void K() {
        RectF rectFD = this.N.d();
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            TextView textView = (TextView) this.Q.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.O);
                offsetDescendantRectToMyCoords(textView, this.O);
                textView.setSelected(rectFD.contains(this.O.centerX(), this.O.centerY()));
                textView.getPaint().setShader(L(rectFD, this.O, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient L(RectF rectF, Rect rect, TextView textView) {
        this.P.set(rect);
        this.P.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.P)) {
            return new RadialGradient(rectF.centerX() - this.P.left, rectF.centerY() - this.P.top, rectF.width() * 0.5f, this.S, this.T, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float M(float f5, float f10, float f11) {
        return Math.max(Math.max(f5, f10), f11);
    }

    private void O(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.Q.size();
        for (int i11 = 0; i11 < Math.max(this.f21281b0.length, size); i11++) {
            TextView textView = (TextView) this.Q.get(i11);
            if (i11 >= this.f21281b0.length) {
                removeView(textView);
                this.Q.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f4769d, (ViewGroup) this, false);
                    this.Q.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f21281b0[i11]);
                textView.setTag(f.f4752o, Integer.valueOf(i11));
                w.o0(textView, this.R);
                textView.setTextColor(this.f21283d0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f21281b0[i11]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.b
    public void D(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i10 != C()) {
            super.D(i10);
            this.N.j(C());
        }
    }

    public void N(String[] strArr, int i10) {
        this.f21281b0 = strArr;
        O(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f5, boolean z10) {
        if (Math.abs(this.f21282c0 - f5) > 0.001f) {
            this.f21282c0 = f5;
            K();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d.x0(accessibilityNodeInfo).Z(d.b.a(1, this.f21281b0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        K();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM = (int) (this.f21280a0 / M(this.V / displayMetrics.heightPixels, this.W / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM, 1073741824);
        setMeasuredDimension(iM, iM);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
