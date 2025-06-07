package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.j;
import com.google.android.material.internal.n;
import d5.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import q5.b;
import s5.g;

/* loaded from: classes.dex */
public class a extends g implements Drawable.Callback, j.b {
    private static final int[] V0 = {R.attr.state_enabled};
    private static final ShapeDrawable W0 = new ShapeDrawable(new OvalShape());
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private boolean G0;
    private int H0;
    private int I0;
    private ColorFilter J0;
    private PorterDuffColorFilter K0;
    private ColorStateList L;
    private ColorStateList L0;
    private ColorStateList M;
    private PorterDuff.Mode M0;
    private float N;
    private int[] N0;
    private float O;
    private boolean O0;
    private ColorStateList P;
    private ColorStateList P0;
    private float Q;
    private WeakReference Q0;
    private ColorStateList R;
    private TextUtils.TruncateAt R0;
    private CharSequence S;
    private boolean S0;
    private boolean T;
    private int T0;
    private Drawable U;
    private boolean U0;
    private ColorStateList V;
    private float W;
    private boolean X;
    private boolean Y;
    private Drawable Z;

    /* renamed from: a0, reason: collision with root package name */
    private Drawable f20860a0;

    /* renamed from: b0, reason: collision with root package name */
    private ColorStateList f20861b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f20862c0;

    /* renamed from: d0, reason: collision with root package name */
    private CharSequence f20863d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f20864e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f20865f0;

    /* renamed from: g0, reason: collision with root package name */
    private Drawable f20866g0;

    /* renamed from: h0, reason: collision with root package name */
    private ColorStateList f20867h0;

    /* renamed from: i0, reason: collision with root package name */
    private d f20868i0;

    /* renamed from: j0, reason: collision with root package name */
    private d f20869j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f20870k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f20871l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f20872m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f20873n0;

    /* renamed from: o0, reason: collision with root package name */
    private float f20874o0;

    /* renamed from: p0, reason: collision with root package name */
    private float f20875p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f20876q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f20877r0;

    /* renamed from: s0, reason: collision with root package name */
    private final Context f20878s0;

    /* renamed from: t0, reason: collision with root package name */
    private final Paint f20879t0;

    /* renamed from: u0, reason: collision with root package name */
    private final Paint f20880u0;

    /* renamed from: v0, reason: collision with root package name */
    private final Paint.FontMetrics f20881v0;

    /* renamed from: w0, reason: collision with root package name */
    private final RectF f20882w0;

    /* renamed from: x0, reason: collision with root package name */
    private final PointF f20883x0;

    /* renamed from: y0, reason: collision with root package name */
    private final Path f20884y0;

    /* renamed from: z0, reason: collision with root package name */
    private final j f20885z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0097a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.O = -1.0f;
        this.f20879t0 = new Paint(1);
        this.f20881v0 = new Paint.FontMetrics();
        this.f20882w0 = new RectF();
        this.f20883x0 = new PointF();
        this.f20884y0 = new Path();
        this.I0 = 255;
        this.M0 = PorterDuff.Mode.SRC_IN;
        this.Q0 = new WeakReference(null);
        L(context);
        this.f20878s0 = context;
        j jVar = new j(this);
        this.f20885z0 = jVar;
        this.S = "";
        jVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f20880u0 = null;
        int[] iArr = V0;
        setState(iArr);
        h2(iArr);
        this.S0 = true;
        if (b.f26294a) {
            W0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (this.S != null) {
            Paint.Align alignP0 = p0(rect, this.f20883x0);
            n0(rect, this.f20882w0);
            if (this.f20885z0.d() != null) {
                this.f20885z0.e().drawableState = getState();
                this.f20885z0.j(this.f20878s0);
            }
            this.f20885z0.e().setTextAlign(alignP0);
            int iSave = 0;
            boolean z10 = Math.round(this.f20885z0.f(d1().toString())) > Math.round(this.f20882w0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f20882w0);
            }
            CharSequence charSequenceEllipsize = this.S;
            if (z10 && this.R0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f20885z0.e(), this.f20882w0.width(), this.R0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f20883x0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f20885z0.e());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean I2() {
        return this.f20865f0 && this.f20866g0 != null && this.G0;
    }

    private boolean J2() {
        return this.T && this.U != null;
    }

    private boolean K2() {
        return this.Y && this.Z != null;
    }

    private void L2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void M2() {
        this.P0 = this.O0 ? b.a(this.R) : null;
    }

    private void N2() {
        this.f20860a0 = new RippleDrawable(b.a(b1()), this.Z, W0);
    }

    private float V0() {
        Drawable drawable = this.G0 ? this.f20866g0 : this.U;
        float fCeil = this.W;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(n.b(this.f20878s0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float W0() {
        Drawable drawable = this.G0 ? this.f20866g0 : this.U;
        float f5 = this.W;
        return (f5 > 0.0f || drawable == null) ? f5 : drawable.getIntrinsicWidth();
    }

    private void X1(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            onStateChange(getState());
        }
    }

    private void g0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Z) {
            if (drawable.isStateful()) {
                drawable.setState(S0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.f20861b0);
            return;
        }
        Drawable drawable2 = this.U;
        if (drawable == drawable2 && this.X) {
            androidx.core.graphics.drawable.a.o(drawable2, this.V);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2() || I2()) {
            float f5 = this.f20870k0 + this.f20871l0;
            float fW0 = W0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f10 = rect.left + f5;
                rectF.left = f10;
                rectF.right = f10 + fW0;
            } else {
                float f11 = rect.right - f5;
                rectF.right = f11;
                rectF.left = f11 - fW0;
            }
            float fV0 = V0();
            float fExactCenterY = rect.exactCenterY() - (fV0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fV0;
        }
    }

    private ColorFilter h1() {
        ColorFilter colorFilter = this.J0;
        return colorFilter != null ? colorFilter : this.K0;
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (K2()) {
            float f5 = this.f20877r0 + this.f20876q0 + this.f20862c0 + this.f20875p0 + this.f20874o0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f5;
            } else {
                rectF.left = rect.left + f5;
            }
        }
    }

    private static boolean j1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f5 = this.f20877r0 + this.f20876q0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f10 = rect.right - f5;
                rectF.right = f10;
                rectF.left = f10 - this.f20862c0;
            } else {
                float f11 = rect.left + f5;
                rectF.left = f11;
                rectF.right = f11 + this.f20862c0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f12 = this.f20862c0;
            float f13 = fExactCenterY - (f12 / 2.0f);
            rectF.top = f13;
            rectF.bottom = f13 + f12;
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f5 = this.f20877r0 + this.f20876q0 + this.f20862c0 + this.f20875p0 + this.f20874o0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f10 = rect.right;
                rectF.right = f10;
                rectF.left = f10 - f5;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f5;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.S != null) {
            float fI0 = this.f20870k0 + i0() + this.f20873n0;
            float fM0 = this.f20877r0 + m0() + this.f20874o0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + fI0;
                rectF.right = rect.right - fM0;
            } else {
                rectF.left = rect.left + fM0;
                rectF.right = rect.right - fI0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean n1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float o0() {
        this.f20885z0.e().getFontMetrics(this.f20881v0);
        Paint.FontMetrics fontMetrics = this.f20881v0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean o1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean p1(p5.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean q0() {
        return this.f20865f0 && this.f20866g0 != null && this.f20864e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.q1(android.util.AttributeSet, int, int):void");
    }

    public static a r0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.q1(attributeSet, i10, i11);
        return aVar;
    }

    private void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            h0(rect, this.f20882w0);
            RectF rectF = this.f20882w0;
            float f5 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f5, f10);
            this.f20866g0.setBounds(0, 0, (int) this.f20882w0.width(), (int) this.f20882w0.height());
            this.f20866g0.draw(canvas);
            canvas.translate(-f5, -f10);
        }
    }

    private boolean s1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.L;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.A0) : 0);
        boolean state = true;
        if (this.A0 != iL) {
            this.A0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.M;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.B0) : 0);
        if (this.B0 != iL2) {
            this.B0 = iL2;
            zOnStateChange = true;
        }
        int iG = i5.a.g(iL, iL2);
        if ((this.C0 != iG) | (x() == null)) {
            this.C0 = iG;
            V(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.P;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.D0) : 0;
        if (this.D0 != colorForState) {
            this.D0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.P0 == null || !b.b(iArr)) ? 0 : this.P0.getColorForState(iArr, this.E0);
        if (this.E0 != colorForState2) {
            this.E0 = colorForState2;
            if (this.O0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f20885z0.d() == null || this.f20885z0.d().i() == null) ? 0 : this.f20885z0.d().i().getColorForState(iArr, this.F0);
        if (this.F0 != colorForState3) {
            this.F0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = j1(getState(), R.attr.state_checked) && this.f20864e0;
        if (this.G0 == z11 || this.f20866g0 == null) {
            z10 = false;
        } else {
            float fI0 = i0();
            this.G0 = z11;
            if (fI0 != i0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.L0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.H0) : 0;
        if (this.H0 != colorForState4) {
            this.H0 = colorForState4;
            this.K0 = k5.a.a(this, this.L0, this.M0);
        } else {
            state = zOnStateChange;
        }
        if (o1(this.U)) {
            state |= this.U.setState(iArr);
        }
        if (o1(this.f20866g0)) {
            state |= this.f20866g0.setState(iArr);
        }
        if (o1(this.Z)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.Z.setState(iArr3);
        }
        if (b.f26294a && o1(this.f20860a0)) {
            state |= this.f20860a0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            r1();
        }
        return state;
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.U0) {
            return;
        }
        this.f20879t0.setColor(this.B0);
        this.f20879t0.setStyle(Paint.Style.FILL);
        this.f20879t0.setColorFilter(h1());
        this.f20882w0.set(rect);
        canvas.drawRoundRect(this.f20882w0, E0(), E0(), this.f20879t0);
    }

    private void u0(Canvas canvas, Rect rect) {
        if (J2()) {
            h0(rect, this.f20882w0);
            RectF rectF = this.f20882w0;
            float f5 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f5, f10);
            this.U.setBounds(0, 0, (int) this.f20882w0.width(), (int) this.f20882w0.height());
            this.U.draw(canvas);
            canvas.translate(-f5, -f10);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.Q <= 0.0f || this.U0) {
            return;
        }
        this.f20879t0.setColor(this.D0);
        this.f20879t0.setStyle(Paint.Style.STROKE);
        if (!this.U0) {
            this.f20879t0.setColorFilter(h1());
        }
        RectF rectF = this.f20882w0;
        float f5 = rect.left;
        float f10 = this.Q;
        rectF.set(f5 + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.O - (this.Q / 2.0f);
        canvas.drawRoundRect(this.f20882w0, f11, f11, this.f20879t0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.U0) {
            return;
        }
        this.f20879t0.setColor(this.A0);
        this.f20879t0.setStyle(Paint.Style.FILL);
        this.f20882w0.set(rect);
        canvas.drawRoundRect(this.f20882w0, E0(), E0(), this.f20879t0);
    }

    private void x0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (K2()) {
            k0(rect, this.f20882w0);
            RectF rectF = this.f20882w0;
            float f5 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f5, f10);
            this.Z.setBounds(0, 0, (int) this.f20882w0.width(), (int) this.f20882w0.height());
            if (b.f26294a) {
                this.f20860a0.setBounds(this.Z.getBounds());
                this.f20860a0.jumpToCurrentState();
                drawable = this.f20860a0;
            } else {
                drawable = this.Z;
            }
            drawable.draw(canvas);
            canvas.translate(-f5, -f10);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        this.f20879t0.setColor(this.E0);
        this.f20879t0.setStyle(Paint.Style.FILL);
        this.f20882w0.set(rect);
        if (!this.U0) {
            canvas.drawRoundRect(this.f20882w0, E0(), E0(), this.f20879t0);
        } else {
            h(new RectF(rect), this.f20884y0);
            super.p(canvas, this.f20879t0, this.f20884y0, u());
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        Paint paint = this.f20880u0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.j(-16777216, 127));
            canvas.drawRect(rect, this.f20880u0);
            if (J2() || I2()) {
                h0(rect, this.f20882w0);
                canvas.drawRect(this.f20882w0, this.f20880u0);
            }
            if (this.S != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f20880u0);
            }
            if (K2()) {
                k0(rect, this.f20882w0);
                canvas.drawRect(this.f20882w0, this.f20880u0);
            }
            this.f20880u0.setColor(androidx.core.graphics.a.j(-65536, 127));
            j0(rect, this.f20882w0);
            canvas.drawRect(this.f20882w0, this.f20880u0);
            this.f20880u0.setColor(androidx.core.graphics.a.j(-16711936, 127));
            l0(rect, this.f20882w0);
            canvas.drawRect(this.f20882w0, this.f20880u0);
        }
    }

    public void A1(boolean z10) {
        if (this.f20865f0 != z10) {
            boolean zI2 = I2();
            this.f20865f0 = z10;
            boolean zI22 = I2();
            if (zI2 != zI22) {
                if (zI22) {
                    g0(this.f20866g0);
                } else {
                    L2(this.f20866g0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public void A2(p5.d dVar) {
        this.f20885z0.h(dVar, this.f20878s0);
    }

    public Drawable B0() {
        return this.f20866g0;
    }

    public void B1(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            onStateChange(getState());
        }
    }

    public void B2(int i10) {
        A2(new p5.d(this.f20878s0, i10));
    }

    public ColorStateList C0() {
        return this.f20867h0;
    }

    public void C1(int i10) {
        B1(g.a.a(this.f20878s0, i10));
    }

    public void C2(float f5) {
        if (this.f20874o0 != f5) {
            this.f20874o0 = f5;
            invalidateSelf();
            r1();
        }
    }

    public ColorStateList D0() {
        return this.M;
    }

    public void D1(float f5) {
        if (this.O != f5) {
            this.O = f5;
            setShapeAppearanceModel(C().w(f5));
        }
    }

    public void D2(int i10) {
        C2(this.f20878s0.getResources().getDimension(i10));
    }

    public float E0() {
        return this.U0 ? E() : this.O;
    }

    public void E1(int i10) {
        D1(this.f20878s0.getResources().getDimension(i10));
    }

    public void E2(float f5) {
        if (this.f20873n0 != f5) {
            this.f20873n0 = f5;
            invalidateSelf();
            r1();
        }
    }

    public float F0() {
        return this.f20877r0;
    }

    public void F1(float f5) {
        if (this.f20877r0 != f5) {
            this.f20877r0 = f5;
            invalidateSelf();
            r1();
        }
    }

    public void F2(int i10) {
        E2(this.f20878s0.getResources().getDimension(i10));
    }

    public Drawable G0() {
        Drawable drawable = this.U;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void G1(int i10) {
        F1(this.f20878s0.getResources().getDimension(i10));
    }

    public void G2(boolean z10) {
        if (this.O0 != z10) {
            this.O0 = z10;
            M2();
            onStateChange(getState());
        }
    }

    public float H0() {
        return this.W;
    }

    public void H1(Drawable drawable) {
        Drawable drawableG0 = G0();
        if (drawableG0 != drawable) {
            float fI0 = i0();
            this.U = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float fI02 = i0();
            L2(drawableG0);
            if (J2()) {
                g0(this.U);
            }
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    boolean H2() {
        return this.S0;
    }

    public ColorStateList I0() {
        return this.V;
    }

    public void I1(int i10) {
        H1(g.a.b(this.f20878s0, i10));
    }

    public float J0() {
        return this.N;
    }

    public void J1(float f5) {
        if (this.W != f5) {
            float fI0 = i0();
            this.W = f5;
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public float K0() {
        return this.f20870k0;
    }

    public void K1(int i10) {
        J1(this.f20878s0.getResources().getDimension(i10));
    }

    public ColorStateList L0() {
        return this.P;
    }

    public void L1(ColorStateList colorStateList) {
        this.X = true;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (J2()) {
                androidx.core.graphics.drawable.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float M0() {
        return this.Q;
    }

    public void M1(int i10) {
        L1(g.a.a(this.f20878s0, i10));
    }

    public Drawable N0() {
        Drawable drawable = this.Z;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void N1(int i10) {
        O1(this.f20878s0.getResources().getBoolean(i10));
    }

    public CharSequence O0() {
        return this.f20863d0;
    }

    public void O1(boolean z10) {
        if (this.T != z10) {
            boolean zJ2 = J2();
            this.T = z10;
            boolean zJ22 = J2();
            if (zJ2 != zJ22) {
                if (zJ22) {
                    g0(this.U);
                } else {
                    L2(this.U);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public float P0() {
        return this.f20876q0;
    }

    public void P1(float f5) {
        if (this.N != f5) {
            this.N = f5;
            invalidateSelf();
            r1();
        }
    }

    public float Q0() {
        return this.f20862c0;
    }

    public void Q1(int i10) {
        P1(this.f20878s0.getResources().getDimension(i10));
    }

    public float R0() {
        return this.f20875p0;
    }

    public void R1(float f5) {
        if (this.f20870k0 != f5) {
            this.f20870k0 = f5;
            invalidateSelf();
            r1();
        }
    }

    public int[] S0() {
        return this.N0;
    }

    public void S1(int i10) {
        R1(this.f20878s0.getResources().getDimension(i10));
    }

    public ColorStateList T0() {
        return this.f20861b0;
    }

    public void T1(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (this.U0) {
                b0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void U0(RectF rectF) {
        l0(getBounds(), rectF);
    }

    public void U1(int i10) {
        T1(g.a.a(this.f20878s0, i10));
    }

    public void V1(float f5) {
        if (this.Q != f5) {
            this.Q = f5;
            this.f20879t0.setStrokeWidth(f5);
            if (this.U0) {
                super.c0(f5);
            }
            invalidateSelf();
        }
    }

    public void W1(int i10) {
        V1(this.f20878s0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt X0() {
        return this.R0;
    }

    public d Y0() {
        return this.f20869j0;
    }

    public void Y1(Drawable drawable) {
        Drawable drawableN0 = N0();
        if (drawableN0 != drawable) {
            float fM0 = m0();
            this.Z = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f26294a) {
                N2();
            }
            float fM02 = m0();
            L2(drawableN0);
            if (K2()) {
                g0(this.Z);
            }
            invalidateSelf();
            if (fM0 != fM02) {
                r1();
            }
        }
    }

    public float Z0() {
        return this.f20872m0;
    }

    public void Z1(CharSequence charSequence) {
        if (this.f20863d0 != charSequence) {
            this.f20863d0 = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        r1();
        invalidateSelf();
    }

    public float a1() {
        return this.f20871l0;
    }

    public void a2(float f5) {
        if (this.f20876q0 != f5) {
            this.f20876q0 = f5;
            invalidateSelf();
            if (K2()) {
                r1();
            }
        }
    }

    public ColorStateList b1() {
        return this.R;
    }

    public void b2(int i10) {
        a2(this.f20878s0.getResources().getDimension(i10));
    }

    public d c1() {
        return this.f20868i0;
    }

    public void c2(int i10) {
        Y1(g.a.b(this.f20878s0, i10));
    }

    public CharSequence d1() {
        return this.S;
    }

    public void d2(float f5) {
        if (this.f20862c0 != f5) {
            this.f20862c0 = f5;
            invalidateSelf();
            if (K2()) {
                r1();
            }
        }
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.I0;
        int iA = i10 < 255 ? g5.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        w0(canvas, bounds);
        t0(canvas, bounds);
        if (this.U0) {
            super.draw(canvas);
        }
        v0(canvas, bounds);
        y0(canvas, bounds);
        u0(canvas, bounds);
        s0(canvas, bounds);
        if (this.S0) {
            A0(canvas, bounds);
        }
        x0(canvas, bounds);
        z0(canvas, bounds);
        if (this.I0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public p5.d e1() {
        return this.f20885z0.d();
    }

    public void e2(int i10) {
        d2(this.f20878s0.getResources().getDimension(i10));
    }

    public float f1() {
        return this.f20874o0;
    }

    public void f2(float f5) {
        if (this.f20875p0 != f5) {
            this.f20875p0 = f5;
            invalidateSelf();
            if (K2()) {
                r1();
            }
        }
    }

    public float g1() {
        return this.f20873n0;
    }

    public void g2(int i10) {
        f2(this.f20878s0.getResources().getDimension(i10));
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f20870k0 + i0() + this.f20873n0 + this.f20885z0.f(d1().toString()) + this.f20874o0 + m0() + this.f20877r0), this.T0);
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.O);
        } else {
            outline.setRoundRect(bounds, this.O);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h2(int[] iArr) {
        if (Arrays.equals(this.N0, iArr)) {
            return false;
        }
        this.N0 = iArr;
        if (K2()) {
            return s1(getState(), iArr);
        }
        return false;
    }

    float i0() {
        if (J2() || I2()) {
            return this.f20871l0 + W0() + this.f20872m0;
        }
        return 0.0f;
    }

    public boolean i1() {
        return this.O0;
    }

    public void i2(ColorStateList colorStateList) {
        if (this.f20861b0 != colorStateList) {
            this.f20861b0 = colorStateList;
            if (K2()) {
                androidx.core.graphics.drawable.a.o(this.Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return n1(this.L) || n1(this.M) || n1(this.P) || (this.O0 && n1(this.P0)) || p1(this.f20885z0.d()) || q0() || o1(this.U) || o1(this.f20866g0) || n1(this.L0);
    }

    public void j2(int i10) {
        i2(g.a.a(this.f20878s0, i10));
    }

    public boolean k1() {
        return this.f20864e0;
    }

    public void k2(boolean z10) {
        if (this.Y != z10) {
            boolean zK2 = K2();
            this.Y = z10;
            boolean zK22 = K2();
            if (zK2 != zK22) {
                if (zK22) {
                    g0(this.Z);
                } else {
                    L2(this.Z);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public boolean l1() {
        return o1(this.Z);
    }

    public void l2(InterfaceC0097a interfaceC0097a) {
        this.Q0 = new WeakReference(interfaceC0097a);
    }

    float m0() {
        if (K2()) {
            return this.f20875p0 + this.f20862c0 + this.f20876q0;
        }
        return 0.0f;
    }

    public boolean m1() {
        return this.Y;
    }

    public void m2(TextUtils.TruncateAt truncateAt) {
        this.R0 = truncateAt;
    }

    public void n2(d dVar) {
        this.f20869j0 = dVar;
    }

    public void o2(int i10) {
        n2(d.c(this.f20878s0, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (J2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.U, i10);
        }
        if (I2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f20866g0, i10);
        }
        if (K2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.Z, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (J2()) {
            zOnLevelChange |= this.U.setLevel(i10);
        }
        if (I2()) {
            zOnLevelChange |= this.f20866g0.setLevel(i10);
        }
        if (K2()) {
            zOnLevelChange |= this.Z.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // s5.g, android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        if (this.U0) {
            super.onStateChange(iArr);
        }
        return s1(iArr, S0());
    }

    Paint.Align p0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.S != null) {
            float fI0 = this.f20870k0 + i0() + this.f20873n0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + fI0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fI0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - o0();
        }
        return align;
    }

    public void p2(float f5) {
        if (this.f20872m0 != f5) {
            float fI0 = i0();
            this.f20872m0 = f5;
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void q2(int i10) {
        p2(this.f20878s0.getResources().getDimension(i10));
    }

    protected void r1() {
        InterfaceC0097a interfaceC0097a = (InterfaceC0097a) this.Q0.get();
        if (interfaceC0097a != null) {
            interfaceC0097a.a();
        }
    }

    public void r2(float f5) {
        if (this.f20871l0 != f5) {
            float fI0 = i0();
            this.f20871l0 = f5;
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void s2(int i10) {
        r2(this.f20878s0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.I0 != i10) {
            this.I0 = i10;
            invalidateSelf();
        }
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.J0 != colorFilter) {
            this.J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // s5.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.M0 != mode) {
            this.M0 = mode;
            this.K0 = k5.a.a(this, this.L0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (J2()) {
            visible |= this.U.setVisible(z10, z11);
        }
        if (I2()) {
            visible |= this.f20866g0.setVisible(z10, z11);
        }
        if (K2()) {
            visible |= this.Z.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(boolean z10) {
        if (this.f20864e0 != z10) {
            this.f20864e0 = z10;
            float fI0 = i0();
            if (!z10 && this.G0) {
                this.G0 = false;
            }
            float fI02 = i0();
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void t2(int i10) {
        this.T0 = i10;
    }

    public void u1(int i10) {
        t1(this.f20878s0.getResources().getBoolean(i10));
    }

    public void u2(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            M2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(Drawable drawable) {
        if (this.f20866g0 != drawable) {
            float fI0 = i0();
            this.f20866g0 = drawable;
            float fI02 = i0();
            L2(this.f20866g0);
            g0(this.f20866g0);
            invalidateSelf();
            if (fI0 != fI02) {
                r1();
            }
        }
    }

    public void v2(int i10) {
        u2(g.a.a(this.f20878s0, i10));
    }

    public void w1(int i10) {
        v1(g.a.b(this.f20878s0, i10));
    }

    void w2(boolean z10) {
        this.S0 = z10;
    }

    public void x1(ColorStateList colorStateList) {
        if (this.f20867h0 != colorStateList) {
            this.f20867h0 = colorStateList;
            if (q0()) {
                androidx.core.graphics.drawable.a.o(this.f20866g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void x2(d dVar) {
        this.f20868i0 = dVar;
    }

    public void y1(int i10) {
        x1(g.a.a(this.f20878s0, i10));
    }

    public void y2(int i10) {
        x2(d.c(this.f20878s0, i10));
    }

    public void z1(int i10) {
        A1(this.f20878s0.getResources().getBoolean(i10));
    }

    public void z2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.S, charSequence)) {
            return;
        }
        this.S = charSequence;
        this.f20885z0.i(true);
        invalidateSelf();
        r1();
    }
}
