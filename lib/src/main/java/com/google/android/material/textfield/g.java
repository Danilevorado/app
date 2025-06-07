package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.core.view.w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21225a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f21226b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f21227c;

    /* renamed from: d, reason: collision with root package name */
    private int f21228d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f21229e;

    /* renamed from: f, reason: collision with root package name */
    private Animator f21230f;

    /* renamed from: g, reason: collision with root package name */
    private final float f21231g;

    /* renamed from: h, reason: collision with root package name */
    private int f21232h;

    /* renamed from: i, reason: collision with root package name */
    private int f21233i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f21234j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21235k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f21236l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f21237m;

    /* renamed from: n, reason: collision with root package name */
    private int f21238n;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f21239o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f21240p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21241q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f21242r;

    /* renamed from: s, reason: collision with root package name */
    private int f21243s;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f21244t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f21245u;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21246a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f21247b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21248c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f21249d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f21246a = i10;
            this.f21247b = textView;
            this.f21248c = i11;
            this.f21249d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f21232h = this.f21246a;
            g.this.f21230f = null;
            TextView textView = this.f21247b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f21248c == 1 && g.this.f21236l != null) {
                    g.this.f21236l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f21249d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f21249d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f21249d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = g.this.f21226b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public g(TextInputLayout textInputLayout) {
        this.f21225a = textInputLayout.getContext();
        this.f21226b = textInputLayout;
        this.f21231g = r0.getResources().getDimensionPixelSize(c5.d.f4710f);
    }

    private void C(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f21232h = i11;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        return w.S(this.f21226b) && this.f21226b.isEnabled() && !(this.f21233i == this.f21232h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void Q(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f21230f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f21241q, this.f21242r, 2, i10, i11);
            i(arrayList, this.f21235k, this.f21236l, 1, i10, i11);
            d5.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            C(i10, i11);
        }
        this.f21226b.r0();
        this.f21226b.w0(z10);
        this.f21226b.E0();
    }

    private boolean g() {
        return (this.f21227c == null || this.f21226b.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(j(textView, i12 == i10));
            if (i12 == i10) {
                list.add(k(textView));
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(d5.a.f22931a);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f21231g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(d5.a.f22934d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f21236l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f21242r;
    }

    private int u(boolean z10, int i10, int i11) {
        return z10 ? this.f21225a.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean x(int i10) {
        return (i10 != 1 || this.f21236l == null || TextUtils.isEmpty(this.f21234j)) ? false : true;
    }

    boolean A() {
        return this.f21241q;
    }

    void B(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f21227c == null) {
            return;
        }
        if (!y(i10) || (frameLayout = this.f21229e) == null) {
            this.f21227c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f21228d - 1;
        this.f21228d = i11;
        M(this.f21227c, i11);
    }

    void D(CharSequence charSequence) {
        this.f21237m = charSequence;
        TextView textView = this.f21236l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void E(boolean z10) {
        if (this.f21235k == z10) {
            return;
        }
        h();
        if (z10) {
            d0 d0Var = new d0(this.f21225a);
            this.f21236l = d0Var;
            d0Var.setId(c5.f.L);
            this.f21236l.setTextAlignment(5);
            Typeface typeface = this.f21245u;
            if (typeface != null) {
                this.f21236l.setTypeface(typeface);
            }
            F(this.f21238n);
            G(this.f21239o);
            D(this.f21237m);
            this.f21236l.setVisibility(4);
            w.q0(this.f21236l, 1);
            e(this.f21236l, 0);
        } else {
            v();
            B(this.f21236l, 0);
            this.f21236l = null;
            this.f21226b.r0();
            this.f21226b.E0();
        }
        this.f21235k = z10;
    }

    void F(int i10) {
        this.f21238n = i10;
        TextView textView = this.f21236l;
        if (textView != null) {
            this.f21226b.d0(textView, i10);
        }
    }

    void G(ColorStateList colorStateList) {
        this.f21239o = colorStateList;
        TextView textView = this.f21236l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void H(int i10) {
        this.f21243s = i10;
        TextView textView = this.f21242r;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i10);
        }
    }

    void I(boolean z10) {
        if (this.f21241q == z10) {
            return;
        }
        h();
        if (z10) {
            d0 d0Var = new d0(this.f21225a);
            this.f21242r = d0Var;
            d0Var.setId(c5.f.M);
            this.f21242r.setTextAlignment(5);
            Typeface typeface = this.f21245u;
            if (typeface != null) {
                this.f21242r.setTypeface(typeface);
            }
            this.f21242r.setVisibility(4);
            w.q0(this.f21242r, 1);
            H(this.f21243s);
            J(this.f21244t);
            e(this.f21242r, 1);
            this.f21242r.setAccessibilityDelegate(new b());
        } else {
            w();
            B(this.f21242r, 1);
            this.f21242r = null;
            this.f21226b.r0();
            this.f21226b.E0();
        }
        this.f21241q = z10;
    }

    void J(ColorStateList colorStateList) {
        this.f21244t = colorStateList;
        TextView textView = this.f21242r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void L(Typeface typeface) {
        if (typeface != this.f21245u) {
            this.f21245u = typeface;
            K(this.f21236l, typeface);
            K(this.f21242r, typeface);
        }
    }

    void O(CharSequence charSequence) {
        h();
        this.f21234j = charSequence;
        this.f21236l.setText(charSequence);
        int i10 = this.f21232h;
        if (i10 != 1) {
            this.f21233i = 1;
        }
        Q(i10, this.f21233i, N(this.f21236l, charSequence));
    }

    void P(CharSequence charSequence) {
        h();
        this.f21240p = charSequence;
        this.f21242r.setText(charSequence);
        int i10 = this.f21232h;
        if (i10 != 2) {
            this.f21233i = 2;
        }
        Q(i10, this.f21233i, N(this.f21242r, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f21227c == null && this.f21229e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f21225a);
            this.f21227c = linearLayout;
            linearLayout.setOrientation(0);
            this.f21226b.addView(this.f21227c, -1, -2);
            this.f21229e = new FrameLayout(this.f21225a);
            this.f21227c.addView(this.f21229e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f21226b.getEditText() != null) {
                f();
            }
        }
        if (y(i10)) {
            this.f21229e.setVisibility(0);
            this.f21229e.addView(textView);
        } else {
            this.f21227c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21227c.setVisibility(0);
        this.f21228d++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f21226b.getEditText();
            boolean zG = p5.c.g(this.f21225a);
            LinearLayout linearLayout = this.f21227c;
            int i10 = c5.d.f4722r;
            w.B0(linearLayout, u(zG, i10, w.G(editText)), u(zG, c5.d.f4723s, this.f21225a.getResources().getDimensionPixelSize(c5.d.f4721q)), u(zG, i10, w.F(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f21230f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return x(this.f21233i);
    }

    CharSequence n() {
        return this.f21237m;
    }

    CharSequence o() {
        return this.f21234j;
    }

    int p() {
        TextView textView = this.f21236l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList q() {
        TextView textView = this.f21236l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.f21240p;
    }

    View s() {
        return this.f21242r;
    }

    int t() {
        TextView textView = this.f21242r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void v() {
        this.f21234j = null;
        h();
        if (this.f21232h == 1) {
            this.f21233i = (!this.f21241q || TextUtils.isEmpty(this.f21240p)) ? 0 : 2;
        }
        Q(this.f21232h, this.f21233i, N(this.f21236l, ""));
    }

    void w() {
        h();
        int i10 = this.f21232h;
        if (i10 == 2) {
            this.f21233i = 0;
        }
        Q(i10, this.f21233i, N(this.f21242r, ""));
    }

    boolean y(int i10) {
        return i10 == 0 || i10 == 1;
    }

    boolean z() {
        return this.f21235k;
    }
}
