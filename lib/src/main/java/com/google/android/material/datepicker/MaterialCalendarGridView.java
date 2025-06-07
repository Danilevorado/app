package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.w;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: m, reason: collision with root package name */
    private final Calendar f20886m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f20887n;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.Z(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20886m = s.k();
        if (i.r2(getContext())) {
            setNextFocusLeftId(c5.f.f4738a);
            setNextFocusRightId(c5.f.f4740c);
        }
        this.f20887n = i.s2(getContext());
        w.o0(this, new a());
    }

    private void a(int i10, Rect rect) {
        int iB;
        if (i10 == 33) {
            iB = getAdapter().i();
        } else {
            if (i10 != 130) {
                super.onFocusChanged(true, i10, rect);
                return;
            }
            iB = getAdapter().b();
        }
        setSelection(iB);
    }

    private View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iD;
        int iA2;
        int iD2;
        int width;
        int i10;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter = getAdapter();
        d dVar = adapter.f20974n;
        c cVar = adapter.f20976p;
        int iMax = Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.i(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator it = dVar.l().iterator();
        while (it.hasNext()) {
            androidx.core.util.d dVar2 = (androidx.core.util.d) it.next();
            Object obj = dVar2.f2363a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (dVar2.f2364b != null) {
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) dVar2.f2364b).longValue();
                if (!e(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                    boolean zE = com.google.android.material.internal.n.e(this);
                    if (jLongValue < item.longValue()) {
                        if (adapter.f(iMax)) {
                            right2 = 0;
                        } else {
                            View viewC = materialCalendarGridView.c(iMax - 1);
                            right2 = !zE ? viewC.getRight() : viewC.getLeft();
                        }
                        iD = right2;
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f20886m.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f20886m.get(5));
                        iD = d(materialCalendarGridView.c(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if (adapter.g(iMin)) {
                            right = getWidth();
                        } else {
                            View viewC2 = materialCalendarGridView.c(iMin);
                            right = !zE ? viewC2.getRight() : viewC2.getLeft();
                        }
                        iD2 = right;
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f20886m.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f20886m.get(5));
                        iD2 = d(materialCalendarGridView.c(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i11 = iMax;
                    int i12 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewC3 = materialCalendarGridView.c(numColumns);
                        int top = viewC3.getTop() + cVar.f20907a.c();
                        m mVar = adapter;
                        int bottom = viewC3.getBottom() - cVar.f20907a.b();
                        if (zE) {
                            int i13 = iA2 > numColumns2 ? 0 : iD2;
                            width = numColumns > iA ? getWidth() : iD;
                            i10 = i13;
                        } else {
                            i10 = numColumns > iA ? 0 : iD;
                            width = iA2 > numColumns2 ? getWidth() : iD2;
                        }
                        canvas.drawRect(i10, top, width, bottom, cVar.f20914h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = mVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i11;
                    iMin = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f20887n) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            i10 = getAdapter().b();
        }
        super.setSelection(i10);
    }
}
