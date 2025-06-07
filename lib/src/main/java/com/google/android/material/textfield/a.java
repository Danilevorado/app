package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class a extends com.google.android.material.textfield.e {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f21171e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f21172f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.f f21173g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.g f21174h;

    /* renamed from: i, reason: collision with root package name */
    private AnimatorSet f21175i;

    /* renamed from: j, reason: collision with root package name */
    private ValueAnimator f21176j;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0102a implements TextWatcher {
        C0102a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f21221a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f21172f);
            a aVar = a.this;
            aVar.f21223c.setOnFocusChangeListener(aVar.f21172f);
            editText.removeTextChangedListener(a.this.f21171e);
            editText.addTextChangedListener(a.this.f21171e);
        }
    }

    class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        class RunnableC0103a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ EditText f21181m;

            RunnableC0103a(EditText editText) {
                this.f21181m = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21181m.removeTextChangedListener(a.this.f21171e);
                a.this.i(true);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0103a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f21172f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f21223c.getOnFocusChangeListener() == a.this.f21172f) {
                a.this.f21223c.setOnFocusChangeListener(null);
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f21221a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f21221a.U();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f21221a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f21221a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f21223c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f21223c.setScaleX(fFloatValue);
            a.this.f21223c.setScaleY(fFloatValue);
        }
    }

    a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f21171e = new C0102a();
        this.f21172f = new b();
        this.f21173g = new c();
        this.f21174h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        boolean z11 = this.f21221a.K() == z10;
        if (z10 && !this.f21175i.isRunning()) {
            this.f21176j.cancel();
            this.f21175i.start();
            if (z11) {
                this.f21175i.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f21175i.cancel();
        this.f21176j.start();
        if (z11) {
            this.f21176j.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(d5.a.f22931a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(d5.a.f22934d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    private void l() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f21175i = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f21175i.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f21176j = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f21221a.getEditText();
        return editText != null && (editText.hasFocus() || this.f21223c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        TextInputLayout textInputLayout = this.f21221a;
        int i10 = this.f21224d;
        if (i10 == 0) {
            i10 = c5.e.f4736f;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f21221a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(c5.i.f4788e));
        this.f21221a.setEndIconCheckable(false);
        this.f21221a.setEndIconOnClickListener(new e());
        this.f21221a.g(this.f21173g);
        this.f21221a.h(this.f21174h);
        l();
    }

    @Override // com.google.android.material.textfield.e
    void c(boolean z10) {
        if (this.f21221a.getSuffixText() == null) {
            return;
        }
        i(z10);
    }
}
