package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class g extends CheckBox implements androidx.core.widget.k {

    /* renamed from: m, reason: collision with root package name */
    private final j f1201m;

    /* renamed from: n, reason: collision with root package name */
    private final e f1202n;

    /* renamed from: o, reason: collision with root package name */
    private final c0 f1203o;

    /* renamed from: p, reason: collision with root package name */
    private n f1204p;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23302o);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        v0.a(this, getContext());
        j jVar = new j(this);
        this.f1201m = jVar;
        jVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f1202n = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f1203o = c0Var;
        c0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1204p == null) {
            this.f1204p = new n(this);
        }
        return this.f1204p;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1202n;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f1203o;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f1201m;
        return jVar != null ? jVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1202n;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1202n;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f1201m;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f1201m;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1203o.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1203o.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1202n;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1202n;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(g.a.b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f1201m;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1203o;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1203o;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1202n;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1202n;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f1201m;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1201m;
        if (jVar != null) {
            jVar.h(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1203o.w(colorStateList);
        this.f1203o.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1203o.x(mode);
        this.f1203o.b();
    }
}
