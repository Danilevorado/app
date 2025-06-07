package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.d;
import androidx.core.view.w;
import c5.j;
import c5.k;
import com.google.android.material.internal.a;
import com.google.android.material.internal.l;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.e {

    /* renamed from: w, reason: collision with root package name */
    private static final int f20848w = j.f4808i;

    /* renamed from: q, reason: collision with root package name */
    private int f20849q;

    /* renamed from: r, reason: collision with root package name */
    private int f20850r;

    /* renamed from: s, reason: collision with root package name */
    private e f20851s;

    /* renamed from: t, reason: collision with root package name */
    private final com.google.android.material.internal.a f20852t;

    /* renamed from: u, reason: collision with root package name */
    private final int f20853u;

    /* renamed from: v, reason: collision with root package name */
    private final f f20854v;

    class a implements a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set set) {
            if (ChipGroup.this.f20851s != null) {
                e eVar = ChipGroup.this.f20851s;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f20852t.j(ChipGroup.this));
            }
        }
    }

    class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f20856a;

        b(d dVar) {
            this.f20856a = dVar;
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f20852t.l()) {
                this.f20856a.a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i10);
    }

    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: m, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f20858m;

        private f() {
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(w.k());
                }
                ChipGroup.this.f20852t.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f20858m;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f20852t.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f20858m;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4677e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20848w;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a();
        this.f20852t = aVar;
        f fVar = new f(this, null);
        this.f20854v = fVar;
        TypedArray typedArrayH = l.h(getContext(), attributeSet, k.U0, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(k.W0, 0);
        setChipSpacingHorizontal(typedArrayH.getDimensionPixelOffset(k.X0, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayH.getDimensionPixelOffset(k.Y0, dimensionPixelOffset));
        setSingleLine(typedArrayH.getBoolean(k.f4819a1, false));
        setSingleSelection(typedArrayH.getBoolean(k.f4827b1, false));
        setSelectionRequired(typedArrayH.getBoolean(k.Z0, false));
        this.f20853u = typedArrayH.getResourceId(k.V0, -1);
        typedArrayH.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        w.y0(this, 1);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.google.android.material.internal.e
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (((Chip) getChildAt(i11)) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f20852t.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f20852t.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f20849q;
    }

    public int getChipSpacingVertical() {
        return this.f20850r;
    }

    public boolean h() {
        return this.f20852t.l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f20853u;
        if (i10 != -1) {
            this.f20852t.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.d.x0(accessibilityNodeInfo).Z(d.b.a(getRowCount(), c() ? getChipCount() : -1, false, h() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f20849q != i10) {
            this.f20849q = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f20850r != i10) {
            this.f20850r = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f20851s = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f20854v.f20858m = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f20852t.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // com.google.android.material.internal.e
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        this.f20852t.q(z10);
    }
}
