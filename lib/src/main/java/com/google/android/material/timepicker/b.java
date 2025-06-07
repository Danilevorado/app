package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.w;
import c5.f;
import c5.h;
import c5.k;
import java.lang.reflect.InvocationTargetException;
import s5.g;
import s5.i;

/* loaded from: classes.dex */
abstract class b extends ConstraintLayout {
    private final Runnable K;
    private int L;
    private g M;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            b.this.F();
        }
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f4771f, this);
        w.s0(this, B());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.U3, i10, 0);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.V3, 0);
        this.K = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable B() {
        g gVar = new g();
        this.M = gVar;
        gVar.T(new i(0.5f));
        this.M.V(ColorStateList.valueOf(-1));
        return this.M;
    }

    private static boolean E(View view) {
        return "skip".equals(view.getTag());
    }

    private void G() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.K);
            handler.post(this.K);
        }
    }

    public int C() {
        return this.L;
    }

    public void D(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.L = i10;
        F();
    }

    protected void F() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (E(getChildAt(i11))) {
                i10++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f5 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id = childAt.getId();
            int i13 = f.f4739b;
            if (id != i13 && !E(childAt)) {
                dVar.h(childAt.getId(), i13, this.L, f5);
                f5 += 360.0f / (childCount - i10);
            }
        }
        dVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(w.k());
        }
        G();
    }

    @Override // android.view.View
    protected void onFinishInflate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onFinishInflate();
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        G();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.M.V(ColorStateList.valueOf(i10));
    }
}
