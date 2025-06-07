package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.h0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f2715m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f2716n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f2717o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2718p;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        this.f2718p = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.f24373h);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(j0.c.f24374i);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, m mVar) {
        String str;
        super(context, attributeSet);
        this.f2718p = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.f24373h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(j0.c.f24374i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(j0.c.f24375j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentH0 = mVar.h0(id);
        if (classAttribute != null && fragmentH0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = mVar.q0().a(context.getClassLoader(), classAttribute);
            fragmentA.F0(context, attributeSet, null);
            mVar.l().o(true).c(this, fragmentA, string).i();
        }
        mVar.S0(this);
    }

    private void a(View view) {
        ArrayList arrayList = this.f2716n;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2715m == null) {
            this.f2715m = new ArrayList();
        }
        this.f2715m.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (m.z0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (m.z0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h0 h0VarU = h0.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2717o;
        h0 h0VarU2 = onApplyWindowInsetsListener != null ? h0.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : androidx.core.view.w.a0(this, h0VarU);
        if (!h0VarU2.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.w.g(getChildAt(i10), h0VarU2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f2718p && this.f2715m != null) {
            for (int i10 = 0; i10 < this.f2715m.size(); i10++) {
                super.drawChild(canvas, (View) this.f2715m.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList arrayList;
        if (!this.f2718p || (arrayList = this.f2715m) == null || arrayList.size() <= 0 || !this.f2715m.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f2716n;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f2715m;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2718p = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    void setDrawDisappearingViewsLast(boolean z10) {
        this.f2718p = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2717o = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2716n == null) {
                this.f2716n = new ArrayList();
            }
            this.f2716n.add(view);
        }
        super.startViewTransition(view);
    }
}
