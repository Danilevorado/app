package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.h;
import androidx.core.view.w;
import c5.j;
import c5.k;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import s5.k;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: w, reason: collision with root package name */
    private static final String f20793w = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: x, reason: collision with root package name */
    private static final int f20794x = j.f4813n;

    /* renamed from: m, reason: collision with root package name */
    private final List f20795m;

    /* renamed from: n, reason: collision with root package name */
    private final e f20796n;

    /* renamed from: o, reason: collision with root package name */
    private final LinkedHashSet f20797o;

    /* renamed from: p, reason: collision with root package name */
    private final Comparator f20798p;

    /* renamed from: q, reason: collision with root package name */
    private Integer[] f20799q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20800r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20801s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20802t;

    /* renamed from: u, reason: collision with root package name */
    private final int f20803u;

    /* renamed from: v, reason: collision with root package name */
    private Set f20804v;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.a0(d.c.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final s5.c f20807e = new s5.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        s5.c f20808a;

        /* renamed from: b, reason: collision with root package name */
        s5.c f20809b;

        /* renamed from: c, reason: collision with root package name */
        s5.c f20810c;

        /* renamed from: d, reason: collision with root package name */
        s5.c f20811d;

        c(s5.c cVar, s5.c cVar2, s5.c cVar3, s5.c cVar4) {
            this.f20808a = cVar;
            this.f20809b = cVar3;
            this.f20810c = cVar4;
            this.f20811d = cVar2;
        }

        public static c a(c cVar) {
            s5.c cVar2 = f20807e;
            return new c(cVar2, cVar.f20811d, cVar2, cVar.f20810c);
        }

        public static c b(c cVar, View view) {
            return n.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            s5.c cVar2 = cVar.f20808a;
            s5.c cVar3 = cVar.f20811d;
            s5.c cVar4 = f20807e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            s5.c cVar2 = f20807e;
            return new c(cVar2, cVar2, cVar.f20809b, cVar.f20810c);
        }

        public static c e(c cVar, View view) {
            return n.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            s5.c cVar2 = cVar.f20808a;
            s5.c cVar3 = f20807e;
            return new c(cVar2, cVar3, cVar.f20809b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    private class e implements MaterialButton.b {
        private e() {
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4691s);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20794x;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20795m = new ArrayList();
        this.f20796n = new e(this, null);
        this.f20797o = new LinkedHashSet();
        this.f20798p = new a();
        this.f20800r = false;
        this.f20804v = new HashSet();
        TypedArray typedArrayH = l.h(getContext(), attributeSet, k.D2, i10, i11, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(k.G2, false));
        this.f20803u = typedArrayH.getResourceId(k.E2, -1);
        this.f20802t = typedArrayH.getBoolean(k.F2, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        w.y0(this, 1);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonH = h(i10);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                h.c(layoutParamsD, 0);
                h.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                h.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e(f20793w, "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f20804v);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f20801s && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f20802t || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    private void g(int i10, boolean z10) {
        Iterator it = this.f20797o.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i10, z10);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private c j(int i10, int i11, int i12) {
        c cVar = (c) this.f20795m.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            h.c(layoutParams, 0);
            h.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f20800r = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f20800r = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f20808a).t(cVar.f20811d).F(cVar.f20809b).x(cVar.f20810c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f20804v;
        this.f20804v = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = h(i10).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f20798p);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f20799q = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(w.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f20796n);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f20793w, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        s5.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f20795m.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        w.o0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f20797o.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f20801s || this.f20804v.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f20804v.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = h(i10).getId();
            if (this.f20804v.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f20799q;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f20793w, "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f20801s;
    }

    void m(MaterialButton materialButton, boolean z10) {
        if (this.f20800r) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f20803u;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.d.x0(accessibilityNodeInfo).Z(d.b.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f20795m.remove(iIndexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonH = h(i10);
            if (materialButtonH.getVisibility() != 8) {
                k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f20802t = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f20801s != z10) {
            this.f20801s = z10;
            f();
        }
    }
}
