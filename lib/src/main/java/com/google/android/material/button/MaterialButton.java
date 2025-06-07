package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.view.w;
import androidx.core.widget.i;
import c5.j;
import c5.k;
import com.google.android.material.internal.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s5.h;
import s5.n;

/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {
    private static final int[] C = {R.attr.state_checkable};
    private static final int[] D = {R.attr.state_checked};
    private static final int E = j.f4807h;
    private boolean A;
    private int B;

    /* renamed from: p, reason: collision with root package name */
    private final com.google.android.material.button.a f20781p;

    /* renamed from: q, reason: collision with root package name */
    private final LinkedHashSet f20782q;

    /* renamed from: r, reason: collision with root package name */
    private b f20783r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuff.Mode f20784s;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f20785t;

    /* renamed from: u, reason: collision with root package name */
    private Drawable f20786u;

    /* renamed from: v, reason: collision with root package name */
    private int f20787v;

    /* renamed from: w, reason: collision with root package name */
    private int f20788w;

    /* renamed from: x, reason: collision with root package name */
    private int f20789x;

    /* renamed from: y, reason: collision with root package name */
    private int f20790y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f20791z;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class c extends e0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        boolean f20792o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f20792o = parcel.readInt() == 1;
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20792o ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4690r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = E;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20782q = new LinkedHashSet();
        this.f20791z = false;
        this.A = false;
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, k.f4890j2, i10, i11, new int[0]);
        this.f20790y = typedArrayH.getDimensionPixelSize(k.f4993w2, 0);
        this.f20784s = com.google.android.material.internal.n.f(typedArrayH.getInt(k.f5017z2, -1), PorterDuff.Mode.SRC_IN);
        this.f20785t = p5.c.a(getContext(), typedArrayH, k.f5009y2);
        this.f20786u = p5.c.d(getContext(), typedArrayH, k.f4977u2);
        this.B = typedArrayH.getInteger(k.f4985v2, 1);
        this.f20787v = typedArrayH.getDimensionPixelSize(k.f5001x2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, s5.k.e(context2, attributeSet, i10, i11).m());
        this.f20781p = aVar;
        aVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.f20790y);
        h(this.f20786u != null);
    }

    private boolean b() {
        int i10 = this.B;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.B;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.B;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return w.B(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f20781p;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            i.i(this, this.f20786u, null, null, null);
        } else if (b()) {
            i.i(this, null, null, this.f20786u, null);
        } else if (d()) {
            i.i(this, null, this.f20786u, null, null);
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z10) {
        Drawable drawable = this.f20786u;
        boolean z11 = true;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f20786u = drawableMutate;
            androidx.core.graphics.drawable.a.o(drawableMutate, this.f20785t);
            PorterDuff.Mode mode = this.f20784s;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f20786u, mode);
            }
            int intrinsicWidth = this.f20787v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f20786u.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f20787v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f20786u.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f20786u;
            int i10 = this.f20788w;
            int i11 = this.f20789x;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f20786u.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrA = i.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f20786u) && ((!b() || drawable5 == this.f20786u) && (!d() || drawable4 == this.f20786u))) {
            z11 = false;
        }
        if (z11) {
            g();
        }
    }

    private void i(int i10, int i11) {
        if (this.f20786u == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f20788w = 0;
                if (this.B == 16) {
                    this.f20789x = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f20787v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f20786u.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f20790y) - getPaddingBottom()) / 2;
                if (this.f20789x != textHeight) {
                    this.f20789x = textHeight;
                    h(false);
                }
                return;
            }
            return;
        }
        this.f20789x = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.B;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f20788w = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f20787v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f20786u.getIntrinsicWidth();
        }
        int textWidth = ((((i10 - getTextWidth()) - w.F(this)) - intrinsicWidth) - this.f20790y) - w.G(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (e() != (this.B == 4)) {
            textWidth = -textWidth;
        }
        if (this.f20788w != textWidth) {
            this.f20788w = textWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f20781p;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f20781p.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f20786u;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.f20790y;
    }

    public int getIconSize() {
        return this.f20787v;
    }

    public ColorStateList getIconTint() {
        return this.f20785t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f20784s;
    }

    public int getInsetBottom() {
        return this.f20781p.c();
    }

    public int getInsetTop() {
        return this.f20781p.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f20781p.h();
        }
        return null;
    }

    public s5.k getShapeAppearanceModel() {
        if (f()) {
            return this.f20781p.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f20781p.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f20781p.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f20781p.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f20781p.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f20791z;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f20781p.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f20792o);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f20792o = this.f20791z;
        return cVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f20786u != null) {
            if (this.f20786u.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f20781p.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f20781p.s();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f20781p.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f20791z != z10) {
            this.f20791z = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f20791z);
            }
            if (this.A) {
                return;
            }
            this.A = true;
            Iterator it = this.f20782q.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this, this.f20791z);
            }
            this.A = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f20781p.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        if (f()) {
            this.f20781p.f().U(f5);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f20786u != drawable) {
            this.f20786u = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f20790y != i10) {
            this.f20790y = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f20787v != i10) {
            this.f20787v = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f20785t != colorStateList) {
            this.f20785t = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f20784s != mode) {
            this.f20784s = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(g.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f20781p.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f20781p.w(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f20783r = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f20783r;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f20781p.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(g.a.a(getContext(), i10));
        }
    }

    @Override // s5.n
    public void setShapeAppearanceModel(s5.k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f20781p.y(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f20781p.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f20781p.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f20781p.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f20781p.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f20781p.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f20791z);
    }
}
