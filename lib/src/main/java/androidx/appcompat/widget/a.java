package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: m, reason: collision with root package name */
    protected final C0010a f1064m;

    /* renamed from: n, reason: collision with root package name */
    protected final Context f1065n;

    /* renamed from: o, reason: collision with root package name */
    protected ActionMenuView f1066o;

    /* renamed from: p, reason: collision with root package name */
    protected c f1067p;

    /* renamed from: q, reason: collision with root package name */
    protected int f1068q;

    /* renamed from: r, reason: collision with root package name */
    protected androidx.core.view.c0 f1069r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1070s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1071t;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0010a implements androidx.core.view.d0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1072a = false;

        /* renamed from: b, reason: collision with root package name */
        int f1073b;

        protected C0010a() {
        }

        @Override // androidx.core.view.d0
        public void a(View view) {
            this.f1072a = true;
        }

        @Override // androidx.core.view.d0
        public void b(View view) {
            if (this.f1072a) {
                return;
            }
            a aVar = a.this;
            aVar.f1069r = null;
            a.super.setVisibility(this.f1073b);
        }

        @Override // androidx.core.view.d0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1072a = false;
        }

        public C0010a d(androidx.core.view.c0 c0Var, int i10) {
            a.this.f1069r = c0Var;
            this.f1073b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1064m = new C0010a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.f23288a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1065n = context;
        } else {
            this.f1065n = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.c0 f(int i10, long j10) {
        androidx.core.view.c0 c0VarB;
        androidx.core.view.c0 c0Var = this.f1069r;
        if (c0Var != null) {
            c0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            c0VarB = androidx.core.view.w.e(this).b(1.0f);
        } else {
            c0VarB = androidx.core.view.w.e(this).b(0.0f);
        }
        c0VarB.f(j10);
        c0VarB.h(this.f1064m.d(c0VarB, i10));
        return c0VarB;
    }

    public int getAnimatedVisibility() {
        return this.f1069r != null ? this.f1064m.f1073b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1068q;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, f.j.f23424a, f.a.f23290c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(f.j.f23469j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f1067p;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1071t = false;
        }
        if (!this.f1071t) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1071t = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1071t = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1070s = false;
        }
        if (!this.f1070s) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1070s = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1070s = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.c0 c0Var = this.f1069r;
            if (c0Var != null) {
                c0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
