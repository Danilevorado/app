package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.n0;
import com.google.android.material.internal.l;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class h extends androidx.appcompat.widget.d {

    /* renamed from: q, reason: collision with root package name */
    private final n0 f21252q;

    /* renamed from: r, reason: collision with root package name */
    private final AccessibilityManager f21253r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f21254s;

    /* renamed from: t, reason: collision with root package name */
    private final int f21255t;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            h hVar = h.this;
            h.this.f(i10 < 0 ? hVar.f21252q.u() : hVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = h.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = h.this.f21252q.x();
                    i10 = h.this.f21252q.w();
                    j10 = h.this.f21252q.v();
                }
                onItemClickListener.onItemClick(h.this.f21252q.f(), view, i10, j10);
            }
            h.this.f21252q.dismiss();
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4674b);
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(t5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f21254s = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, c5.k.f4859f2, i10, c5.j.f4801b, new int[0]);
        int i11 = c5.k.f4866g2;
        if (typedArrayH.hasValue(i11) && typedArrayH.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f21255t = typedArrayH.getResourceId(c5.k.f4874h2, c5.h.f4775j);
        this.f21253r = (AccessibilityManager) context2.getSystemService("accessibility");
        n0 n0Var = new n0(context2);
        this.f21252q = n0Var;
        n0Var.I(true);
        n0Var.C(this);
        n0Var.H(2);
        n0Var.o(getAdapter());
        n0Var.K(new a());
        int i12 = c5.k.f4882i2;
        if (typedArrayH.hasValue(i12)) {
            setSimpleItems(typedArrayH.getResourceId(i12, 0));
        }
        typedArrayH.recycle();
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutD = d();
        int i10 = 0;
        if (adapter == null || textInputLayoutD == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f21252q.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutD);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableE = this.f21252q.e();
        if (drawableE != null) {
            drawableE.getPadding(this.f21254s);
            Rect rect = this.f21254s;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutD.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutD = d();
        return (textInputLayoutD == null || !textInputLayoutD.O()) ? super.getHint() : textInputLayoutD.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null && textInputLayoutD.O() && super.getHint() == null && com.google.android.material.internal.g.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f21252q.o(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f21255t, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AccessibilityManager accessibilityManager = this.f21253r;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f21252q.show();
        }
    }
}
