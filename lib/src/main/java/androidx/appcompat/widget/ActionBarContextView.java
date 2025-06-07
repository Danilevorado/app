package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private TextView A;
    private TextView B;
    private int C;
    private int D;
    private boolean E;
    private int F;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f929u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f930v;

    /* renamed from: w, reason: collision with root package name */
    private View f931w;

    /* renamed from: x, reason: collision with root package name */
    private View f932x;

    /* renamed from: y, reason: collision with root package name */
    private View f933y;

    /* renamed from: z, reason: collision with root package name */
    private LinearLayout f934z;

    class a implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f935m;

        a(androidx.appcompat.view.b bVar) {
            this.f935m = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f935m.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23294g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        z0 z0VarV = z0.v(context, attributeSet, f.j.f23544y, i10, 0);
        androidx.core.view.w.s0(this, z0VarV.g(f.j.f23549z));
        this.C = z0VarV.n(f.j.D, 0);
        this.D = z0VarV.n(f.j.C, 0);
        this.f1068q = z0VarV.m(f.j.B, 0);
        this.F = z0VarV.n(f.j.A, f.g.f23391d);
        z0VarV.w();
    }

    private void i() {
        if (this.f934z == null) {
            LayoutInflater.from(getContext()).inflate(f.g.f23388a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f934z = linearLayout;
            this.A = (TextView) linearLayout.findViewById(f.f.f23366e);
            this.B = (TextView) this.f934z.findViewById(f.f.f23365d);
            if (this.C != 0) {
                this.A.setTextAppearance(getContext(), this.C);
            }
            if (this.D != 0) {
                this.B.setTextAppearance(getContext(), this.D);
            }
        }
        this.A.setText(this.f929u);
        this.B.setText(this.f930v);
        boolean z10 = !TextUtils.isEmpty(this.f929u);
        boolean z11 = !TextUtils.isEmpty(this.f930v);
        int i10 = 0;
        this.B.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f934z;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f934z.getParent() == null) {
            addView(this.f934z);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.c0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f931w == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f930v;
    }

    public CharSequence getTitle() {
        return this.f929u;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(androidx.appcompat.view.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f931w
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.F
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f931w = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f931w
            goto L15
        L22:
            android.view.View r0 = r3.f931w
            int r1 = f.f.f23370i
            android.view.View r0 = r0.findViewById(r1)
            r3.f932x = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            androidx.appcompat.widget.c r0 = r3.f1067p
            if (r0 == 0) goto L41
            r0.y()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1067p = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1067p
            android.content.Context r2 = r3.f1065n
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1067p
            androidx.appcompat.view.menu.n r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1066o = r4
            r1 = 0
            androidx.core.view.w.s0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1066o
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(androidx.appcompat.view.b):void");
    }

    public boolean j() {
        return this.E;
    }

    public void k() {
        removeAllViews();
        this.f933y = null;
        this.f1066o = null;
        this.f1067p = null;
        View view = this.f932x;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1067p;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1067p;
        if (cVar != null) {
            cVar.B();
            this.f1067p.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = j1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f931w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f931w.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i14, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f931w, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f934z;
        if (linearLayout != null && this.f933y == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f934z, iE, paddingTop, paddingTop2, zB);
        }
        int i16 = iE;
        View view2 = this.f933y;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1066o;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1068q;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f931w;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f931w.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1066o;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1066o, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f934z;
        if (linearLayout != null && this.f933y == null) {
            if (this.E) {
                this.f934z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f934z.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f934z.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f933y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f933y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1068q > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1068q = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f933y;
        if (view2 != null) {
            removeView(view2);
        }
        this.f933y = view;
        if (view != null && (linearLayout = this.f934z) != null) {
            removeView(linearLayout);
            this.f934z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f930v = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f929u = charSequence;
        i();
        androidx.core.view.w.r0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.E) {
            requestLayout();
        }
        this.E = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
