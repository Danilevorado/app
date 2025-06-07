package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class m0 extends ViewGroup {
    private int A;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1296m;

    /* renamed from: n, reason: collision with root package name */
    private int f1297n;

    /* renamed from: o, reason: collision with root package name */
    private int f1298o;

    /* renamed from: p, reason: collision with root package name */
    private int f1299p;

    /* renamed from: q, reason: collision with root package name */
    private int f1300q;

    /* renamed from: r, reason: collision with root package name */
    private int f1301r;

    /* renamed from: s, reason: collision with root package name */
    private float f1302s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1303t;

    /* renamed from: u, reason: collision with root package name */
    private int[] f1304u;

    /* renamed from: v, reason: collision with root package name */
    private int[] f1305v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f1306w;

    /* renamed from: x, reason: collision with root package name */
    private int f1307x;

    /* renamed from: y, reason: collision with root package name */
    private int f1308y;

    /* renamed from: z, reason: collision with root package name */
    private int f1309z;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1296m = true;
        this.f1297n = -1;
        this.f1298o = 0;
        this.f1300q = 8388659;
        int[] iArr = f.j.f23426a1;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.w.m0(this, context, iArr, attributeSet, z0VarV.r(), i10, 0);
        int iK = z0VarV.k(f.j.f23436c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = z0VarV.k(f.j.f23431b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = z0VarV.a(f.j.f23441d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1302s = z0VarV.i(f.j.f23451f1, -1.0f);
        this.f1297n = z0VarV.k(f.j.f23446e1, -1);
        this.f1303t = z0VarV.a(f.j.f23466i1, false);
        setDividerDrawable(z0VarV.g(f.j.f23456g1));
        this.f1309z = z0VarV.k(f.j.f23471j1, 0);
        this.A = z0VarV.f(f.j.f23461h1, 0);
        z0VarV.w();
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private void k(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewS = s(i12);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewS.getMeasuredWidth();
                    measureChildWithMargins(viewS, i11, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void l(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewS = s(i12);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewS.getMeasuredHeight();
                    measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = j1.b(this);
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewS = s(i10);
            if (viewS != null && viewS.getVisibility() != 8 && t(i10)) {
                a aVar = (a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewS.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1307x);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                a aVar2 = (a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f1307x;
                } else {
                    right = viewS2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f1307x;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1297n < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1297n;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1297n == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1298o;
        if (this.f1299p == 1 && (i10 = this.f1300q & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1301r) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1301r;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1297n;
    }

    public Drawable getDividerDrawable() {
        return this.f1306w;
    }

    public int getDividerPadding() {
        return this.A;
    }

    public int getDividerWidth() {
        return this.f1307x;
    }

    public int getGravity() {
        return this.f1300q;
    }

    public int getOrientation() {
        return this.f1299p;
    }

    public int getShowDividers() {
        return this.f1309z;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1302s;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewS = s(i10);
            if (viewS != null && viewS.getVisibility() != 8 && t(i10)) {
                i(canvas, (viewS.getTop() - ((LinearLayout.LayoutParams) ((a) viewS.getLayoutParams())).topMargin) - this.f1308y);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.f1308y : viewS2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i10) {
        this.f1306w.setBounds(getPaddingLeft() + this.A, i10, (getWidth() - getPaddingRight()) - this.A, this.f1308y + i10);
        this.f1306w.draw(canvas);
    }

    void j(Canvas canvas, int i10) {
        this.f1306w.setBounds(i10, getPaddingTop() + this.A, this.f1307x + i10, (getHeight() - getPaddingBottom()) - this.A);
        this.f1306w.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1299p;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1306w == null) {
            return;
        }
        if (this.f1299p == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1299p == 1) {
            v(i10, i11, i12, i13);
        } else {
            u(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1299p == 1) {
            z(i10, i11);
        } else {
            x(i10, i11);
        }
    }

    int p(View view, int i10) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1296m = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1297n = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1306w) {
            return;
        }
        this.f1306w = drawable;
        if (drawable != null) {
            this.f1307x = drawable.getIntrinsicWidth();
            this.f1308y = drawable.getIntrinsicHeight();
        } else {
            this.f1307x = 0;
            this.f1308y = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.A = i10;
    }

    public void setGravity(int i10) {
        if (this.f1300q != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1300q = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1300q;
        if ((8388615 & i12) != i11) {
            this.f1300q = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1303t = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1299p != i10) {
            this.f1299p = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1309z) {
            requestLayout();
        }
        this.f1309z = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1300q;
        if ((i12 & 112) != i11) {
            this.f1300q = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.f1302s = Math.max(0.0f, f5);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i10) {
        if (i10 == 0) {
            return (this.f1309z & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1309z & 4) != 0;
        }
        if ((this.f1309z & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1300q
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1301r
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1301r
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.m0$a r5 = (androidx.appcompat.widget.m0.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.w.B(r17)
            int r1 = androidx.core.view.e.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1308y
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc6
        Lc5:
            r1 = r14
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.v(int, int, int, int):void");
    }

    void w(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03b2 A[PHI: r3
  0x03b2: PHI (r3v36 int) = (r3v32 int), (r3v37 int) binds: [B:168:0x03b0, B:164:0x03a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.x(int, int):void");
    }

    int y(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02dc A[PHI: r10
  0x02dc: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02da, B:131:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.z(int, int):void");
    }
}
