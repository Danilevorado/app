package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.h0;
import androidx.core.view.r;
import androidx.core.view.w;

/* loaded from: classes.dex */
public abstract class n {

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f21093m;

        a(View view) {
            this.f21093m = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f21093m.getContext().getSystemService("input_method")).showSoftInput(this.f21093m, 1);
        }
    }

    class b implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f21094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f21095b;

        b(d dVar, e eVar) {
            this.f21094a = dVar;
            this.f21095b = eVar;
        }

        @Override // androidx.core.view.r
        public h0 a(View view, h0 h0Var) {
            return this.f21094a.a(view, h0Var, new e(this.f21095b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            w.l0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        h0 a(View view, h0 h0Var, e eVar);
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f21096a;

        /* renamed from: b, reason: collision with root package name */
        public int f21097b;

        /* renamed from: c, reason: collision with root package name */
        public int f21098c;

        /* renamed from: d, reason: collision with root package name */
        public int f21099d;

        public e(int i10, int i11, int i12, int i13) {
            this.f21096a = i10;
            this.f21097b = i11;
            this.f21098c = i12;
            this.f21099d = i13;
        }

        public e(e eVar) {
            this.f21096a = eVar.f21096a;
            this.f21097b = eVar.f21097b;
            this.f21098c = eVar.f21098c;
            this.f21099d = eVar.f21099d;
        }
    }

    public static void a(View view, d dVar) {
        w.A0(view, new b(dVar, new e(w.G(view), view.getPaddingTop(), w.F(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float fW = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fW += w.w((View) parent);
        }
        return fW;
    }

    public static boolean e(View view) {
        return w.B(view) == 1;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (w.R(view)) {
            w.l0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
