package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.w;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class d extends com.google.android.material.textfield.e {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f21188t = true;

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f21189e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f21190f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.e f21191g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.f f21192h;

    /* renamed from: i, reason: collision with root package name */
    private final TextInputLayout.g f21193i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f21194j;

    /* renamed from: k, reason: collision with root package name */
    private final c.b f21195k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21196l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21197m;

    /* renamed from: n, reason: collision with root package name */
    private long f21198n;

    /* renamed from: o, reason: collision with root package name */
    private StateListDrawable f21199o;

    /* renamed from: p, reason: collision with root package name */
    private s5.g f21200p;

    /* renamed from: q, reason: collision with root package name */
    private AccessibilityManager f21201q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f21202r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f21203s;

    class a extends com.google.android.material.internal.k {

        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC0104a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f21205m;

            RunnableC0104a(AutoCompleteTextView autoCompleteTextView) {
                this.f21205m = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f21205m.isPopupShowing();
                d.this.J(zIsPopupShowing);
                d.this.f21196l = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewC = d.C(d.this.f21221a.getEditText());
            if (d.this.f21201q.isTouchExplorationEnabled() && d.H(autoCompleteTextViewC) && !d.this.f21223c.hasFocus()) {
                autoCompleteTextViewC.dismissDropDown();
            }
            autoCompleteTextViewC.post(new RunnableC0104a(autoCompleteTextViewC));
        }
    }

    class b implements AutoCompleteTextView.OnDismissListener {
        b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.N();
            d.this.J(false);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f21223c.setChecked(dVar.f21197m);
            d.this.f21203s.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class C0105d implements ValueAnimator.AnimatorUpdateListener {
        C0105d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f21223c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class e implements View.OnFocusChangeListener {
        e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            d.this.f21221a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            d.this.J(false);
            d.this.f21196l = false;
        }
    }

    class f extends TextInputLayout.e {
        f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            if (!d.H(d.this.f21221a.getEditText())) {
                dVar.X(Spinner.class.getName());
            }
            if (dVar.K()) {
                dVar.h0(null);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewC = d.C(d.this.f21221a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f21201q.isEnabled() && !d.H(d.this.f21221a.getEditText())) {
                d.this.M(autoCompleteTextViewC);
                d.this.N();
            }
        }
    }

    class g implements TextInputLayout.f {
        g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewC = d.C(textInputLayout.getEditText());
            d.this.K(autoCompleteTextViewC);
            d.this.y(autoCompleteTextViewC);
            d.this.L(autoCompleteTextViewC);
            autoCompleteTextViewC.setThreshold(0);
            autoCompleteTextViewC.removeTextChangedListener(d.this.f21189e);
            autoCompleteTextViewC.addTextChangedListener(d.this.f21189e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.H(autoCompleteTextViewC) && d.this.f21201q.isTouchExplorationEnabled()) {
                w.y0(d.this.f21223c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f21191g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class h implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f21214m;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f21214m = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21214m.removeTextChangedListener(d.this.f21189e);
            }
        }

        h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f21190f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (d.f21188t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i10 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(d.this.f21194j);
                d.this.I();
            }
        }
    }

    class i implements View.OnAttachStateChangeListener {
        i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            d.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            d.this.I();
        }
    }

    class j implements c.b {
        j() {
        }

        @Override // androidx.core.view.accessibility.c.b
        public void onTouchExplorationStateChanged(boolean z10) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = d.this.f21221a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || d.H(autoCompleteTextView)) {
                return;
            }
            w.y0(d.this.f21223c, z10 ? 2 : 1);
        }
    }

    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.M((AutoCompleteTextView) d.this.f21221a.getEditText());
        }
    }

    class l implements View.OnTouchListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f21219m;

        l(AutoCompleteTextView autoCompleteTextView) {
            this.f21219m = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.G()) {
                    d.this.f21196l = false;
                }
                d.this.M(this.f21219m);
                d.this.N();
            }
            return false;
        }
    }

    d(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f21189e = new a();
        this.f21190f = new e();
        this.f21191g = new f(this.f21221a);
        this.f21192h = new g();
        this.f21193i = new h();
        this.f21194j = new i();
        this.f21195k = new j();
        this.f21196l = false;
        this.f21197m = false;
        this.f21198n = Long.MAX_VALUE;
    }

    private void A(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, s5.g gVar) {
        LayerDrawable layerDrawable;
        int iD = i5.a.d(autoCompleteTextView, c5.b.f4684l);
        s5.g gVar2 = new s5.g(gVar.C());
        int iH = i5.a.h(i10, iD, 0.1f);
        gVar2.V(new ColorStateList(iArr, new int[]{iH, 0}));
        if (f21188t) {
            gVar2.setTint(iD);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iH, iD});
            s5.g gVar3 = new s5.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        w.s0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        TextInputLayout textInputLayout;
        if (this.f21201q == null || (textInputLayout = this.f21221a) == null || !w.R(textInputLayout)) {
            return;
        }
        androidx.core.view.accessibility.c.a(this.f21201q, this.f21195k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator D(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(d5.a.f22931a);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new C0105d());
        return valueAnimatorOfFloat;
    }

    private s5.g E(float f5, float f10, float f11, int i10) {
        s5.k kVarM = s5.k.a().A(f5).E(f5).s(f10).w(f10).m();
        s5.g gVarM = s5.g.m(this.f21222b, f11);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.X(0, i10, 0, i10);
        return gVarM;
    }

    private void F() {
        this.f21203s = D(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(50, 1.0f, 0.0f);
        this.f21202r = valueAnimatorD;
        valueAnimatorD.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f21198n;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        AccessibilityManager accessibilityManager = this.f21201q;
        if (accessibilityManager != null) {
            androidx.core.view.accessibility.c.b(accessibilityManager, this.f21195k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z10) {
        if (this.f21197m != z10) {
            this.f21197m = z10;
            this.f21203s.cancel();
            this.f21202r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f21188t) {
            int boxBackgroundMode = this.f21221a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f21200p;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f21199o;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f21190f);
        if (f21188t) {
            autoCompleteTextView.setOnDismissListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f21196l = false;
        }
        if (this.f21196l) {
            this.f21196l = false;
            return;
        }
        if (f21188t) {
            J(!this.f21197m);
        } else {
            this.f21197m = !this.f21197m;
            this.f21223c.toggle();
        }
        if (!this.f21197m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f21196l = true;
        this.f21198n = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f21221a.getBoxBackgroundMode();
        s5.g boxBackground = this.f21221a.getBoxBackground();
        int iD = i5.a.d(autoCompleteTextView, c5.b.f4680h);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, iD, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, iD, iArr, boxBackground);
        }
    }

    private void z(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, s5.g gVar) {
        int boxBackgroundColor = this.f21221a.getBoxBackgroundColor();
        int[] iArr2 = {i5.a.h(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f21188t) {
            w.s0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        s5.g gVar2 = new s5.g(gVar.C());
        gVar2.V(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int iG = w.G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iF = w.F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        w.s0(autoCompleteTextView, layerDrawable);
        w.B0(autoCompleteTextView, iG, paddingTop, iF, paddingBottom);
    }

    void O(AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f21221a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // com.google.android.material.textfield.e
    void a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f21222b.getResources().getDimensionPixelOffset(c5.d.K);
        float dimensionPixelOffset2 = this.f21222b.getResources().getDimensionPixelOffset(c5.d.H);
        int dimensionPixelOffset3 = this.f21222b.getResources().getDimensionPixelOffset(c5.d.I);
        s5.g gVarE = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        s5.g gVarE2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f21200p = gVarE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f21199o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarE);
        this.f21199o.addState(new int[0], gVarE2);
        int i10 = this.f21224d;
        if (i10 == 0) {
            i10 = f21188t ? c5.e.f4734d : c5.e.f4735e;
        }
        this.f21221a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f21221a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(c5.i.f4790g));
        this.f21221a.setEndIconOnClickListener(new k());
        this.f21221a.g(this.f21192h);
        this.f21221a.h(this.f21193i);
        F();
        this.f21201q = (AccessibilityManager) this.f21222b.getSystemService("accessibility");
        this.f21221a.addOnAttachStateChangeListener(this.f21194j);
        B();
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}
