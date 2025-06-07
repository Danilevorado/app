package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.z0;
import androidx.core.view.w;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.n;

/* loaded from: classes.dex */
class k extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    private final TextInputLayout f21266m;

    /* renamed from: n, reason: collision with root package name */
    private final TextView f21267n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f21268o;

    /* renamed from: p, reason: collision with root package name */
    private final CheckableImageButton f21269p;

    /* renamed from: q, reason: collision with root package name */
    private ColorStateList f21270q;

    /* renamed from: r, reason: collision with root package name */
    private PorterDuff.Mode f21271r;

    /* renamed from: s, reason: collision with root package name */
    private View.OnLongClickListener f21272s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21273t;

    k(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f21266m = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(c5.h.f4768c, (ViewGroup) this, false);
        this.f21269p = checkableImageButton;
        d0 d0Var = new d0(getContext());
        this.f21267n = d0Var;
        g(z0Var);
        f(z0Var);
        addView(checkableImageButton);
        addView(d0Var);
    }

    private void f(z0 z0Var) {
        this.f21267n.setVisibility(8);
        this.f21267n.setId(c5.f.O);
        this.f21267n.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        w.q0(this.f21267n, 1);
        l(z0Var.n(c5.k.f4848d6, 0));
        int i10 = c5.k.f4855e6;
        if (z0Var.s(i10)) {
            m(z0Var.c(i10));
        }
        k(z0Var.p(c5.k.f4840c6));
    }

    private void g(z0 z0Var) {
        if (p5.c.g(getContext())) {
            androidx.core.view.h.c((ViewGroup.MarginLayoutParams) this.f21269p.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        int i10 = c5.k.f4886i6;
        if (z0Var.s(i10)) {
            this.f21270q = p5.c.b(getContext(), z0Var, i10);
        }
        int i11 = c5.k.f4894j6;
        if (z0Var.s(i11)) {
            this.f21271r = n.f(z0Var.k(i11, -1), null);
        }
        int i12 = c5.k.f4878h6;
        if (z0Var.s(i12)) {
            p(z0Var.g(i12));
            int i13 = c5.k.f4870g6;
            if (z0Var.s(i13)) {
                o(z0Var.p(i13));
            }
            n(z0Var.a(c5.k.f4862f6, true));
        }
    }

    private void x() {
        int i10 = (this.f21268o == null || this.f21273t) ? 8 : 0;
        setVisibility(this.f21269p.getVisibility() == 0 || i10 == 0 ? 0 : 8);
        this.f21267n.setVisibility(i10);
        this.f21266m.q0();
    }

    CharSequence a() {
        return this.f21268o;
    }

    ColorStateList b() {
        return this.f21267n.getTextColors();
    }

    TextView c() {
        return this.f21267n;
    }

    CharSequence d() {
        return this.f21269p.getContentDescription();
    }

    Drawable e() {
        return this.f21269p.getDrawable();
    }

    boolean h() {
        return this.f21269p.getVisibility() == 0;
    }

    void i(boolean z10) {
        this.f21273t = z10;
        x();
    }

    void j() {
        f.c(this.f21266m, this.f21269p, this.f21270q);
    }

    void k(CharSequence charSequence) {
        this.f21268o = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f21267n.setText(charSequence);
        x();
    }

    void l(int i10) {
        androidx.core.widget.i.n(this.f21267n, i10);
    }

    void m(ColorStateList colorStateList) {
        this.f21267n.setTextColor(colorStateList);
    }

    void n(boolean z10) {
        this.f21269p.setCheckable(z10);
    }

    void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f21269p.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        w();
    }

    void p(Drawable drawable) {
        this.f21269p.setImageDrawable(drawable);
        if (drawable != null) {
            f.a(this.f21266m, this.f21269p, this.f21270q, this.f21271r);
            u(true);
            j();
        } else {
            u(false);
            q(null);
            r(null);
            o(null);
        }
    }

    void q(View.OnClickListener onClickListener) {
        f.e(this.f21269p, onClickListener, this.f21272s);
    }

    void r(View.OnLongClickListener onLongClickListener) {
        this.f21272s = onLongClickListener;
        f.f(this.f21269p, onLongClickListener);
    }

    void s(ColorStateList colorStateList) {
        if (this.f21270q != colorStateList) {
            this.f21270q = colorStateList;
            f.a(this.f21266m, this.f21269p, colorStateList, this.f21271r);
        }
    }

    void t(PorterDuff.Mode mode) {
        if (this.f21271r != mode) {
            this.f21271r = mode;
            f.a(this.f21266m, this.f21269p, this.f21270q, mode);
        }
    }

    void u(boolean z10) {
        if (h() != z10) {
            this.f21269p.setVisibility(z10 ? 0 : 8);
            w();
            x();
        }
    }

    void v(androidx.core.view.accessibility.d dVar) {
        View view;
        if (this.f21267n.getVisibility() == 0) {
            dVar.i0(this.f21267n);
            view = this.f21267n;
        } else {
            view = this.f21269p;
        }
        dVar.u0(view);
    }

    void w() {
        EditText editText = this.f21266m.f21141q;
        if (editText == null) {
            return;
        }
        w.B0(this.f21267n, h() ? 0 : w.G(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(c5.d.f4724t), editText.getCompoundPaddingBottom());
    }
}
