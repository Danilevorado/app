package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.core.view.accessibility.d;
import androidx.core.view.w;
import c5.i;
import c5.j;
import c5.k;
import com.facebook.ads.AdError;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import com.google.android.material.internal.l;
import java.util.List;
import p5.f;
import s5.n;

/* loaded from: classes.dex */
public class Chip extends g implements a.InterfaceC0097a, n, h {
    private static final int J = j.f4809j;
    private static final Rect K = new Rect();
    private static final int[] L = {R.attr.state_selected};
    private static final int[] M = {R.attr.state_checkable};
    private boolean A;
    private int B;
    private int C;
    private CharSequence D;
    private final d E;
    private boolean F;
    private final Rect G;
    private final RectF H;
    private final f I;

    /* renamed from: q, reason: collision with root package name */
    private com.google.android.material.chip.a f20834q;

    /* renamed from: r, reason: collision with root package name */
    private InsetDrawable f20835r;

    /* renamed from: s, reason: collision with root package name */
    private RippleDrawable f20836s;

    /* renamed from: t, reason: collision with root package name */
    private View.OnClickListener f20837t;

    /* renamed from: u, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f20838u;

    /* renamed from: v, reason: collision with root package name */
    private h.a f20839v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20840w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20841x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20842y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f20843z;

    class a extends f {
        a() {
        }

        @Override // p5.f
        public void a(int i10) {
        }

        @Override // p5.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f20834q.H2() ? Chip.this.f20834q.d1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (Chip.this.f20839v != null) {
                Chip.this.f20839v.a(Chip.this, z10);
            }
            if (Chip.this.f20838u != null) {
                Chip.this.f20838u.onCheckedChanged(compoundButton, z10);
            }
        }
    }

    class c extends ViewOutlineProvider {
        c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f20834q != null) {
                Chip.this.f20834q.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class d extends f0.a {
        d(Chip chip) {
            super(chip);
        }

        @Override // f0.a
        protected int B(float f5, float f10) {
            return (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f5, f10)) ? 1 : 0;
        }

        @Override // f0.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.t() && Chip.this.f20837t != null) {
                list.add(1);
            }
        }

        @Override // f0.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // f0.a
        protected void M(androidx.core.view.accessibility.d dVar) {
            dVar.V(Chip.this.s());
            dVar.Y(Chip.this.isClickable());
            dVar.X(Chip.this.getAccessibilityClassName());
            dVar.t0(Chip.this.getText());
        }

        @Override // f0.a
        protected void N(int i10, androidx.core.view.accessibility.d dVar) {
            if (i10 != 1) {
                dVar.b0("");
                dVar.T(Chip.K);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i11 = i.f4791h;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(i11, objArr).trim();
            }
            dVar.b0(closeIconContentDescription);
            dVar.T(Chip.this.getCloseIconTouchBoundsInt());
            dVar.b(d.a.f2384i);
            dVar.c0(Chip.this.isEnabled());
        }

        @Override // f0.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f20843z = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4678f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = J;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.G = new Rect();
        this.H = new RectF();
        this.I = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarR0 = com.google.android.material.chip.a.r0(context2, attributeSet, i10, i11);
        p(context2, attributeSet, i10);
        setChipDrawable(aVarR0);
        aVarR0.U(w.w(this));
        TypedArray typedArrayH = l.h(context2, attributeSet, k.f4857f0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayH.hasValue(k.Q0);
        typedArrayH.recycle();
        this.E = new d(this);
        y();
        if (!zHasValue) {
            q();
        }
        setChecked(this.f20840w);
        setText(aVarR0.d1());
        setEllipsize(aVarR0.X0());
        C();
        if (!this.f20834q.H2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.C);
        }
        this.B = w.B(this);
        super.setOnCheckedChangeListener(new b());
    }

    private void A() {
        this.f20836s = new RippleDrawable(q5.b.a(this.f20834q.b1()), getBackgroundDrawable(), null);
        this.f20834q.G2(false);
        w.s0(this, this.f20836s);
        B();
    }

    private void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f20834q) == null) {
            return;
        }
        int iF0 = (int) (aVar.F0() + this.f20834q.f1() + this.f20834q.m0());
        int iK0 = (int) (this.f20834q.K0() + this.f20834q.g1() + this.f20834q.i0());
        if (this.f20835r != null) {
            Rect rect = new Rect();
            this.f20835r.getPadding(rect);
            iK0 += rect.left;
            iF0 += rect.right;
        }
        w.B0(this, iK0, getPaddingTop(), iF0, getPaddingBottom());
    }

    private void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        p5.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.I);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.H.setEmpty();
        if (o() && this.f20837t != null) {
            this.f20834q.U0(this.H);
        }
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.G.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.G;
    }

    private p5.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.l2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f20843z) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f20842y) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f20841x) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f20843z) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f20842y) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f20841x) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void n() {
        if (getBackgroundDrawable() == this.f20835r && this.f20834q.getCallback() == null) {
            this.f20834q.setCallback(this.f20835r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        com.google.android.material.chip.a aVar = this.f20834q;
        return (aVar == null || aVar.N0() == null) ? false : true;
    }

    private void p(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayH = l.h(context, attributeSet, k.f4857f0, i10, J, new int[0]);
        this.A = typedArrayH.getBoolean(k.L0, false);
        this.C = (int) Math.ceil(typedArrayH.getDimension(k.f5015z0, (float) Math.ceil(com.google.android.material.internal.n.b(getContext(), 48))));
        typedArrayH.recycle();
    }

    private void q() {
        setOutlineProvider(new c());
    }

    private void r(int i10, int i11, int i12, int i13) {
        this.f20835r = new InsetDrawable((Drawable) this.f20834q, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f20842y != z10) {
            this.f20842y = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f20841x != z10) {
            this.f20841x = z10;
            refreshDrawableState();
        }
    }

    private void v() {
        if (this.f20835r != null) {
            this.f20835r = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l2(null);
        }
    }

    private void y() {
        boolean z10;
        if (o() && t() && this.f20837t != null) {
            w.o0(this, this.E);
            z10 = true;
        } else {
            w.o0(this, null);
            z10 = false;
        }
        this.F = z10;
    }

    private void z() {
        if (q5.b.f26294a) {
            A();
            return;
        }
        this.f20834q.G2(true);
        w.s0(this, getBackgroundDrawable());
        B();
        n();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0097a
    public void a() {
        m(this.C);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.F ? super.dispatchHoverEvent(motionEvent) : this.E.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.F) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.E.w(keyEvent) || this.E.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f20834q;
        if ((aVar == null || !aVar.l1()) ? false : this.f20834q.h2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.D)) {
            return this.D;
        }
        if (!s()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f20835r;
        return insetDrawable == null ? this.f20834q : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return Math.max(0.0f, aVar.E0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f20834q;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.F && (this.E.A() == 1 || this.E.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public d5.d getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public s5.k getShapeAppearanceModel() {
        return this.f20834q.C();
    }

    public d5.d getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public boolean m(int i10) {
        this.C = i10;
        if (!w()) {
            if (this.f20835r != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f20834q.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f20834q.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f20835r != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f20835r != null) {
            Rect rect = new Rect();
            this.f20835r.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        r(i11, i12, i11, i12);
        z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        s5.h.f(this, this.f20834q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        if (s()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.F) {
            this.E.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            androidx.core.view.accessibility.d.x0(accessibilityNodeInfo).a0(d.c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.B != i10) {
            this.B = i10;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f20841x
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f20841x
            if (r0 == 0) goto L34
            r5.u()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f20834q;
        return aVar != null && aVar.k1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f20836s) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f20836s) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.t1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.u1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar == null) {
            this.f20840w = z10;
        } else if (aVar.k1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.v1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.w1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.y1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.A1(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.B1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.D1(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f20834q;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f20834q = aVar;
            aVar.w2(false);
            k(this.f20834q);
            m(this.C);
        }
    }

    public void setChipEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.F1(f5);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.H1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    public void setChipIconSize(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.J1(f5);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.O1(z10);
        }
    }

    public void setChipMinHeight(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.P1(f5);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.R1(f5);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipStrokeWidth(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.V1(f5);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.Y1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.Z1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.a2(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.c2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.d2(f5);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setCloseIconStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.f2(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.g2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.i2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.k2(z10);
        }
        y();
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.U(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f20834q == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.m2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.A = z10;
        m(this.C);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(d5.d dVar) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.n2(dVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    public void setIconEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.p2(f5);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setIconStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.r2(f5);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    @Override // com.google.android.material.internal.h
    public void setInternalOnCheckedChangeListener(h.a aVar) {
        this.f20839v = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f20834q == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f20838u = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f20837t = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.u2(colorStateList);
        }
        if (this.f20834q.i1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.v2(i10);
            if (this.f20834q.i1()) {
                return;
            }
            A();
        }
    }

    @Override // s5.n
    public void setShapeAppearanceModel(s5.k kVar) {
        this.f20834q.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(d5.d dVar) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.x2(dVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.H2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f20834q;
        if (aVar2 != null) {
            aVar2.z2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.B2(i10);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.B2(i10);
        }
        C();
    }

    public void setTextAppearance(p5.d dVar) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.A2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.C2(f5);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.D2(i10);
        }
    }

    public void setTextStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.E2(f5);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f20834q;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f20834q;
        return aVar != null && aVar.m1();
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f20837t;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.F) {
            this.E.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.A;
    }
}
