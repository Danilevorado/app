package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.m0;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements n.a {
    private static final int[] R = {R.attr.state_checked};
    private int H;
    private boolean I;
    boolean J;
    private final CheckedTextView K;
    private FrameLayout L;
    private androidx.appcompat.view.menu.i M;
    private ColorStateList N;
    private boolean O;
    private Drawable P;
    private final androidx.core.view.a Q;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.V(NavigationMenuItemView.this.J);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.Q = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(c5.h.f4766a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c5.d.f4707c));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(c5.f.f4742e);
        this.K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        w.o0(checkedTextView, aVar);
    }

    private void B() {
        m0.a aVar;
        int i10;
        if (D()) {
            this.K.setVisibility(8);
            FrameLayout frameLayout = this.L;
            if (frameLayout == null) {
                return;
            }
            aVar = (m0.a) frameLayout.getLayoutParams();
            i10 = -1;
        } else {
            this.K.setVisibility(0);
            FrameLayout frameLayout2 = this.L;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (m0.a) frameLayout2.getLayoutParams();
            i10 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i10;
        this.L.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(f.a.f23307t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(R, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.M.getTitle() == null && this.M.getIcon() == null && this.M.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.L == null) {
                this.L = (FrameLayout) ((ViewStub) findViewById(c5.f.f4741d)).inflate();
            }
            this.L.removeAllViews();
            this.L.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(androidx.appcompat.view.menu.i iVar, int i10) {
        this.M = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            w.s0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        d1.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.i iVar = this.M;
        if (iVar != null && iVar.isCheckable() && this.M.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.J != z10) {
            this.J = z10;
            this.Q.l(this.K, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.K.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.N);
            }
            int i10 = this.H;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.I) {
            if (this.P == null) {
                Drawable drawableE = androidx.core.content.res.h.e(getResources(), c5.e.f4737g, getContext().getTheme());
                this.P = drawableE;
                if (drawableE != null) {
                    int i11 = this.H;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.P;
        }
        androidx.core.widget.i.i(this.K, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.K.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.H = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.M;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.K.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.I = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.i.n(this.K, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }
}
