package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.z0;
import androidx.core.view.w;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s5.k;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    private static final int U0 = c5.j.f4805f;
    private TextView A;
    private ColorStateList A0;
    private int B;
    private PorterDuff.Mode B0;
    private int C;
    private ColorStateList C0;
    private CharSequence D;
    private ColorStateList D0;
    private boolean E;
    private int E0;
    private TextView F;
    private int F0;
    private ColorStateList G;
    private int G0;
    private int H;
    private ColorStateList H0;
    private z0.d I;
    private int I0;
    private z0.d J;
    private int J0;
    private ColorStateList K;
    private int K0;
    private ColorStateList L;
    private int L0;
    private CharSequence M;
    private int M0;
    private final TextView N;
    private boolean N0;
    private boolean O;
    final com.google.android.material.internal.b O0;
    private CharSequence P;
    private boolean P0;
    private boolean Q;
    private boolean Q0;
    private s5.g R;
    private ValueAnimator R0;
    private s5.g S;
    private boolean S0;
    private s5.g T;
    private boolean T0;
    private s5.k U;
    private boolean V;
    private final int W;

    /* renamed from: a0, reason: collision with root package name */
    private int f21121a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f21122b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f21123c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f21124d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f21125e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f21126f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f21127g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Rect f21128h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Rect f21129i0;

    /* renamed from: j0, reason: collision with root package name */
    private final RectF f21130j0;

    /* renamed from: k0, reason: collision with root package name */
    private Typeface f21131k0;

    /* renamed from: l0, reason: collision with root package name */
    private Drawable f21132l0;

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f21133m;

    /* renamed from: m0, reason: collision with root package name */
    private int f21134m0;

    /* renamed from: n, reason: collision with root package name */
    private final k f21135n;

    /* renamed from: n0, reason: collision with root package name */
    private final LinkedHashSet f21136n0;

    /* renamed from: o, reason: collision with root package name */
    private final LinearLayout f21137o;

    /* renamed from: o0, reason: collision with root package name */
    private int f21138o0;

    /* renamed from: p, reason: collision with root package name */
    private final FrameLayout f21139p;

    /* renamed from: p0, reason: collision with root package name */
    private final SparseArray f21140p0;

    /* renamed from: q, reason: collision with root package name */
    EditText f21141q;

    /* renamed from: q0, reason: collision with root package name */
    private final CheckableImageButton f21142q0;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f21143r;

    /* renamed from: r0, reason: collision with root package name */
    private final LinkedHashSet f21144r0;

    /* renamed from: s, reason: collision with root package name */
    private int f21145s;

    /* renamed from: s0, reason: collision with root package name */
    private ColorStateList f21146s0;

    /* renamed from: t, reason: collision with root package name */
    private int f21147t;

    /* renamed from: t0, reason: collision with root package name */
    private PorterDuff.Mode f21148t0;

    /* renamed from: u, reason: collision with root package name */
    private int f21149u;

    /* renamed from: u0, reason: collision with root package name */
    private Drawable f21150u0;

    /* renamed from: v, reason: collision with root package name */
    private int f21151v;

    /* renamed from: v0, reason: collision with root package name */
    private int f21152v0;

    /* renamed from: w, reason: collision with root package name */
    private final com.google.android.material.textfield.g f21153w;

    /* renamed from: w0, reason: collision with root package name */
    private Drawable f21154w0;

    /* renamed from: x, reason: collision with root package name */
    boolean f21155x;

    /* renamed from: x0, reason: collision with root package name */
    private View.OnLongClickListener f21156x0;

    /* renamed from: y, reason: collision with root package name */
    private int f21157y;

    /* renamed from: y0, reason: collision with root package name */
    private View.OnLongClickListener f21158y0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21159z;

    /* renamed from: z0, reason: collision with root package name */
    private final CheckableImageButton f21160z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.T0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f21155x) {
                textInputLayout.m0(editable.length());
            }
            if (TextInputLayout.this.E) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f21142q0.performClick();
            TextInputLayout.this.f21142q0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f21141q.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.O0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f21165d;

        public e(TextInputLayout textInputLayout) {
            this.f21165d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            EditText editText = this.f21165d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f21165d.getHint();
            CharSequence error = this.f21165d.getError();
            CharSequence placeholderText = this.f21165d.getPlaceholderText();
            int counterMaxLength = this.f21165d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f21165d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f21165d.N();
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z11 ? hint.toString() : "";
            this.f21165d.f21135n.v(dVar);
            if (z10) {
                dVar.t0(text);
            } else if (!TextUtils.isEmpty(string)) {
                dVar.t0(string);
                if (z12 && placeholderText != null) {
                    placeholderText = string + ", " + ((Object) placeholderText);
                    dVar.t0(placeholderText);
                }
            } else if (placeholderText != null) {
                dVar.t0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    dVar.h0(string);
                } else {
                    if (z10) {
                        string = ((Object) text) + ", " + string;
                    }
                    dVar.t0(string);
                }
                dVar.q0(!z10);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            dVar.j0(counterMaxLength);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                dVar.d0(error);
            }
            View viewS = this.f21165d.f21153w.s();
            if (viewS != null) {
                dVar.i0(viewS);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends e0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        CharSequence f21166o;

        /* renamed from: p, reason: collision with root package name */
        boolean f21167p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f21168q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f21169r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence f21170s;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21166o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f21167p = parcel.readInt() == 1;
            this.f21168q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f21169r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f21170s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f21166o) + " hint=" + ((Object) this.f21168q) + " helperText=" + ((Object) this.f21169r) + " placeholderText=" + ((Object) this.f21170s) + "}";
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f21166o, parcel, i10);
            parcel.writeInt(this.f21167p ? 1 : 0);
            TextUtils.writeToParcel(this.f21168q, parcel, i10);
            TextUtils.writeToParcel(this.f21169r, parcel, i10);
            TextUtils.writeToParcel(this.f21170s, parcel, i10);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.D);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [boolean, int] */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11;
        ?? r32;
        int colorForState;
        int i12 = U0;
        super(t5.a.c(context, attributeSet, i10, i12), attributeSet, i10);
        this.f21145s = -1;
        this.f21147t = -1;
        this.f21149u = -1;
        this.f21151v = -1;
        this.f21153w = new com.google.android.material.textfield.g(this);
        this.f21128h0 = new Rect();
        this.f21129i0 = new Rect();
        this.f21130j0 = new RectF();
        this.f21136n0 = new LinkedHashSet();
        this.f21138o0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f21140p0 = sparseArray;
        this.f21144r0 = new LinkedHashSet();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.O0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f21133m = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f21139p = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f21137o = linearLayout;
        d0 d0Var = new d0(context2);
        this.N = d0Var;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        d0Var.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        int i13 = c5.h.f4767b;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i13, (ViewGroup) linearLayout, false);
        this.f21160z0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(i13, (ViewGroup) frameLayout2, false);
        this.f21142q0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = d5.a.f22931a;
        bVar.i0(timeInterpolator);
        bVar.f0(timeInterpolator);
        bVar.S(8388659);
        int[] iArr = c5.k.Z4;
        int i14 = c5.k.f4996w5;
        int i15 = c5.k.f4980u5;
        int i16 = c5.k.J5;
        int i17 = c5.k.O5;
        int i18 = c5.k.S5;
        z0 z0VarI = l.i(context2, attributeSet, iArr, i10, i12, i14, i15, i16, i17, i18);
        k kVar = new k(this, z0VarI);
        this.f21135n = kVar;
        this.O = z0VarI.a(c5.k.R5, true);
        setHint(z0VarI.p(c5.k.e5));
        this.Q0 = z0VarI.a(c5.k.Q5, true);
        this.P0 = z0VarI.a(c5.k.L5, true);
        int i19 = c5.k.f4869g5;
        if (z0VarI.s(i19)) {
            i11 = -1;
            setMinEms(z0VarI.k(i19, -1));
        } else {
            i11 = -1;
            int i20 = c5.k.f4847d5;
            if (z0VarI.s(i20)) {
                setMinWidth(z0VarI.f(i20, -1));
            }
        }
        int i21 = c5.k.f5;
        if (z0VarI.s(i21)) {
            setMaxEms(z0VarI.k(i21, i11));
        } else {
            int i22 = c5.k.f4839c5;
            if (z0VarI.s(i22)) {
                setMaxWidth(z0VarI.f(i22, i11));
            }
        }
        this.U = s5.k.e(context2, attributeSet, i10, i12).m();
        this.W = context2.getResources().getDimensionPixelOffset(c5.d.M);
        this.f21122b0 = z0VarI.e(c5.k.f4893j5, 0);
        this.f21124d0 = z0VarI.f(c5.k.f4948q5, context2.getResources().getDimensionPixelSize(c5.d.N));
        this.f21125e0 = z0VarI.f(c5.k.f4956r5, context2.getResources().getDimensionPixelSize(c5.d.O));
        this.f21123c0 = this.f21124d0;
        float fD = z0VarI.d(c5.k.n5, -1.0f);
        float fD2 = z0VarI.d(c5.k.f4917m5, -1.0f);
        float fD3 = z0VarI.d(c5.k.f4901k5, -1.0f);
        float fD4 = z0VarI.d(c5.k.f4909l5, -1.0f);
        k.b bVarV = this.U.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.U = bVarV.m();
        ColorStateList colorStateListB = p5.c.b(context2, z0VarI, c5.k.f4877h5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.I0 = defaultColor;
            this.f21127g0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.J0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.K0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.K0 = this.I0;
                ColorStateList colorStateListA = g.a.a(context2, c5.c.f4701c);
                this.J0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.L0 = colorForState;
        } else {
            this.f21127g0 = 0;
            this.I0 = 0;
            this.J0 = 0;
            this.K0 = 0;
            this.L0 = 0;
        }
        int i23 = c5.k.f4831b5;
        if (z0VarI.s(i23)) {
            ColorStateList colorStateListC = z0VarI.c(i23);
            this.D0 = colorStateListC;
            this.C0 = colorStateListC;
        }
        int i24 = c5.k.f4932o5;
        ColorStateList colorStateListB2 = p5.c.b(context2, z0VarI, i24);
        this.G0 = z0VarI.b(i24, 0);
        this.E0 = androidx.core.content.a.c(context2, c5.c.f4702d);
        this.M0 = androidx.core.content.a.c(context2, c5.c.f4703e);
        this.F0 = androidx.core.content.a.c(context2, c5.c.f4704f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i25 = c5.k.f4940p5;
        if (z0VarI.s(i25)) {
            setBoxStrokeErrorColor(p5.c.b(context2, z0VarI, i25));
        }
        if (z0VarI.n(i18, -1) != -1) {
            r32 = 0;
            setHintTextAppearance(z0VarI.n(i18, 0));
        } else {
            r32 = 0;
        }
        int iN = z0VarI.n(i16, r32);
        CharSequence charSequenceP = z0VarI.p(c5.k.E5);
        boolean zA = z0VarI.a(c5.k.F5, r32);
        checkableImageButton.setId(c5.f.J);
        if (p5.c.g(context2)) {
            androidx.core.view.h.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r32);
        }
        int i26 = c5.k.H5;
        if (z0VarI.s(i26)) {
            this.A0 = p5.c.b(context2, z0VarI, i26);
        }
        int i27 = c5.k.I5;
        if (z0VarI.s(i27)) {
            this.B0 = n.f(z0VarI.k(i27, -1), null);
        }
        int i28 = c5.k.G5;
        if (z0VarI.s(i28)) {
            setErrorIconDrawable(z0VarI.g(i28));
        }
        checkableImageButton.setContentDescription(getResources().getText(c5.i.f4789f));
        w.y0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = z0VarI.n(i17, 0);
        boolean zA2 = z0VarI.a(c5.k.N5, false);
        CharSequence charSequenceP2 = z0VarI.p(c5.k.M5);
        int iN3 = z0VarI.n(c5.k.f4824a6, 0);
        CharSequence charSequenceP3 = z0VarI.p(c5.k.Z5);
        int iN4 = z0VarI.n(c5.k.f4910l6, 0);
        CharSequence charSequenceP4 = z0VarI.p(c5.k.f4902k6);
        boolean zA3 = z0VarI.a(c5.k.f4964s5, false);
        setCounterMaxLength(z0VarI.k(c5.k.f4972t5, -1));
        this.C = z0VarI.n(i14, 0);
        this.B = z0VarI.n(i15, 0);
        setBoxBackgroundMode(z0VarI.k(c5.k.f4885i5, 0));
        if (p5.c.g(context2)) {
            androidx.core.view.h.d((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iN5 = z0VarI.n(c5.k.A5, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.b(this, iN5));
        sparseArray.append(0, new i(this));
        sparseArray.append(1, new j(this, iN5 == 0 ? z0VarI.n(c5.k.V5, 0) : iN5));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, iN5));
        sparseArray.append(3, new com.google.android.material.textfield.d(this, iN5));
        int i29 = c5.k.W5;
        if (!z0VarI.s(i29)) {
            int i30 = c5.k.C5;
            if (z0VarI.s(i30)) {
                this.f21146s0 = p5.c.b(context2, z0VarI, i30);
            }
            int i31 = c5.k.D5;
            if (z0VarI.s(i31)) {
                this.f21148t0 = n.f(z0VarI.k(i31, -1), null);
            }
        }
        int i32 = c5.k.B5;
        if (z0VarI.s(i32)) {
            setEndIconMode(z0VarI.k(i32, 0));
            int i33 = c5.k.f5020z5;
            if (z0VarI.s(i33)) {
                setEndIconContentDescription(z0VarI.p(i33));
            }
            setEndIconCheckable(z0VarI.a(c5.k.f5012y5, true));
        } else if (z0VarI.s(i29)) {
            int i34 = c5.k.X5;
            if (z0VarI.s(i34)) {
                this.f21146s0 = p5.c.b(context2, z0VarI, i34);
            }
            int i35 = c5.k.Y5;
            if (z0VarI.s(i35)) {
                this.f21148t0 = n.f(z0VarI.k(i35, -1), null);
            }
            setEndIconMode(z0VarI.a(i29, false) ? 1 : 0);
            setEndIconContentDescription(z0VarI.p(c5.k.U5));
        }
        d0Var.setId(c5.f.P);
        d0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        w.q0(d0Var, 1);
        setErrorContentDescription(charSequenceP);
        setCounterOverflowTextAppearance(this.B);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.C);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setSuffixTextAppearance(iN4);
        int i36 = c5.k.K5;
        if (z0VarI.s(i36)) {
            setErrorTextColor(z0VarI.c(i36));
        }
        int i37 = c5.k.P5;
        if (z0VarI.s(i37)) {
            setHelperTextColor(z0VarI.c(i37));
        }
        int i38 = c5.k.T5;
        if (z0VarI.s(i38)) {
            setHintTextColor(z0VarI.c(i38));
        }
        int i39 = c5.k.f5004x5;
        if (z0VarI.s(i39)) {
            setCounterTextColor(z0VarI.c(i39));
        }
        int i40 = c5.k.f4988v5;
        if (z0VarI.s(i40)) {
            setCounterOverflowTextColor(z0VarI.c(i40));
        }
        int i41 = c5.k.f4832b6;
        if (z0VarI.s(i41)) {
            setPlaceholderTextColor(z0VarI.c(i41));
        }
        int i42 = c5.k.f4918m6;
        if (z0VarI.s(i42)) {
            setSuffixTextColor(z0VarI.c(i42));
        }
        setEnabled(z0VarI.a(c5.k.f4823a5, true));
        z0VarI.w();
        w.y0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            w.z0(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(d0Var);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(kVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
        setSuffixText(charSequenceP4);
    }

    private boolean A() {
        return this.O && !TextUtils.isEmpty(this.P) && (this.R instanceof com.google.android.material.textfield.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(int i10) {
        if (i10 != 0 || this.N0) {
            J();
        } else {
            h0();
        }
    }

    private void B() {
        Iterator it = this.f21136n0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f21126f0 = colorForState2;
        } else if (z11) {
            this.f21126f0 = colorForState;
        } else {
            this.f21126f0 = defaultColor;
        }
    }

    private void C(int i10) {
        Iterator it = this.f21144r0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i10);
        }
    }

    private void C0() {
        if (this.f21141q == null) {
            return;
        }
        w.B0(this.N, getContext().getResources().getDimensionPixelSize(c5.d.f4724t), this.f21141q.getPaddingTop(), (K() || L()) ? 0 : w.F(this.f21141q), this.f21141q.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        s5.g gVar;
        if (this.T == null || (gVar = this.S) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f21141q.isFocused()) {
            Rect bounds = this.T.getBounds();
            Rect bounds2 = this.S.getBounds();
            float fX = this.O0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = d5.a.c(iCenterX, bounds2.left, fX);
            bounds.right = d5.a.c(iCenterX, bounds2.right, fX);
            this.T.draw(canvas);
        }
    }

    private void D0() {
        int visibility = this.N.getVisibility();
        int i10 = (this.M == null || N()) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().c(i10 == 0);
        }
        t0();
        this.N.setVisibility(i10);
        q0();
    }

    private void E(Canvas canvas) {
        if (this.O) {
            this.O0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.R0.cancel();
        }
        if (z10 && this.Q0) {
            k(0.0f);
        } else {
            this.O0.d0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.c) this.R).g0()) {
            x();
        }
        this.N0 = true;
        J();
        this.f21135n.i(true);
        D0();
    }

    private int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f21141q.getCompoundPaddingLeft();
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f21141q.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean I() {
        return this.f21138o0 != 0;
    }

    private void J() {
        TextView textView = this.F;
        if (textView == null || !this.E) {
            return;
        }
        textView.setText((CharSequence) null);
        z0.n.a(this.f21133m, this.J);
        this.F.setVisibility(4);
    }

    private boolean L() {
        return this.f21160z0.getVisibility() == 0;
    }

    private boolean P() {
        return this.f21121a0 == 1 && this.f21141q.getMinLines() <= 1;
    }

    private void Q() throws Resources.NotFoundException {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.f21121a0 != 0) {
            v0();
        }
    }

    private void R() {
        if (A()) {
            RectF rectF = this.f21130j0;
            this.O0.o(rectF, this.f21141q.getWidth(), this.f21141q.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f21123c0);
            ((com.google.android.material.textfield.c) this.R).j0(rectF);
        }
    }

    private void S() {
        if (!A() || this.N0) {
            return;
        }
        x();
        R();
    }

    private static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    private void X() {
        TextView textView = this.F;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            w.s0(this.f21141q, this.R);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zN = w.N(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = zN || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zN);
        checkableImageButton.setPressable(zN);
        checkableImageButton.setLongClickable(z10);
        w.y0(checkableImageButton, z11 ? 1 : 2);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        return (this.f21160z0.getVisibility() == 0 || ((I() && K()) || this.M != null)) && this.f21137o.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f21135n.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        EditText editText = this.f21141q;
        return (editText == null || this.R == null || editText.getBackground() != null || this.f21121a0 == 0) ? false : true;
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = (com.google.android.material.textfield.e) this.f21140p0.get(this.f21138o0);
        return eVar != null ? eVar : (com.google.android.material.textfield.e) this.f21140p0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f21160z0.getVisibility() == 0) {
            return this.f21160z0;
        }
        if (I() && K()) {
            return this.f21142q0;
        }
        return null;
    }

    private void h0() {
        if (this.F == null || !this.E || TextUtils.isEmpty(this.D)) {
            return;
        }
        this.F.setText(this.D);
        z0.n.a(this.f21133m, this.I);
        this.F.setVisibility(0);
        this.F.bringToFront();
        announceForAccessibility(this.D);
    }

    private void i() {
        TextView textView = this.F;
        if (textView != null) {
            this.f21133m.addView(textView);
            this.F.setVisibility(0);
        }
    }

    private void i0(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            com.google.android.material.textfield.f.a(this, this.f21142q0, this.f21146s0, this.f21148t0);
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(drawableMutate, this.f21153w.p());
        this.f21142q0.setImageDrawable(drawableMutate);
    }

    private void j() throws Resources.NotFoundException {
        EditText editText;
        int iG;
        int dimensionPixelSize;
        int iF;
        Resources resources;
        int i10;
        if (this.f21141q == null || this.f21121a0 != 1) {
            return;
        }
        if (p5.c.h(getContext())) {
            editText = this.f21141q;
            iG = w.G(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(c5.d.f4718n);
            iF = w.F(this.f21141q);
            resources = getResources();
            i10 = c5.d.f4717m;
        } else {
            if (!p5.c.g(getContext())) {
                return;
            }
            editText = this.f21141q;
            iG = w.G(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(c5.d.f4716l);
            iF = w.F(this.f21141q);
            resources = getResources();
            i10 = c5.d.f4715k;
        }
        w.B0(editText, iG, dimensionPixelSize, iF, resources.getDimensionPixelSize(i10));
    }

    private void j0() {
        Resources resources;
        int i10;
        if (this.f21121a0 == 1) {
            if (p5.c.h(getContext())) {
                resources = getResources();
                i10 = c5.d.f4720p;
            } else {
                if (!p5.c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i10 = c5.d.f4719o;
            }
            this.f21122b0 = resources.getDimensionPixelSize(i10);
        }
    }

    private void k0(Rect rect) {
        s5.g gVar = this.S;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f21124d0, rect.right, i10);
        }
        s5.g gVar2 = this.T;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.f21125e0, rect.right, i11);
        }
    }

    private void l() {
        s5.g gVar = this.R;
        if (gVar == null) {
            return;
        }
        s5.k kVarC = gVar.C();
        s5.k kVar = this.U;
        if (kVarC != kVar) {
            this.R.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.R.Z(this.f21123c0, this.f21126f0);
        }
        int iP = p();
        this.f21127g0 = iP;
        this.R.V(ColorStateList.valueOf(iP));
        if (this.f21138o0 == 3) {
            this.f21141q.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void l0() {
        if (this.A != null) {
            EditText editText = this.f21141q;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        if (this.S == null || this.T == null) {
            return;
        }
        if (w()) {
            this.S.V(ColorStateList.valueOf(this.f21141q.isFocused() ? this.E0 : this.f21126f0));
            this.T.V(ColorStateList.valueOf(this.f21126f0));
        }
        invalidate();
    }

    private void n(RectF rectF) {
        float f5 = rectF.left;
        int i10 = this.W;
        rectF.left = f5 - i10;
        rectF.right += i10;
    }

    private static void n0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? c5.i.f4786c : c5.i.f4785b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void o() {
        int i10 = this.f21121a0;
        if (i10 == 0) {
            this.R = null;
        } else if (i10 == 1) {
            this.R = new s5.g(this.U);
            this.S = new s5.g();
            this.T = new s5.g();
            return;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f21121a0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.R = (!this.O || (this.R instanceof com.google.android.material.textfield.c)) ? new s5.g(this.U) : new com.google.android.material.textfield.c(this.U);
        }
        this.S = null;
        this.T = null;
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A;
        if (textView != null) {
            d0(textView, this.f21159z ? this.B : this.C);
            if (!this.f21159z && (colorStateList2 = this.K) != null) {
                this.A.setTextColor(colorStateList2);
            }
            if (!this.f21159z || (colorStateList = this.L) == null) {
                return;
            }
            this.A.setTextColor(colorStateList);
        }
    }

    private int p() {
        return this.f21121a0 == 1 ? i5.a.g(i5.a.e(this, c5.b.f4684l, 0), this.f21127g0) : this.f21127g0;
    }

    private void p0() {
        if (this.f21138o0 == 3 && this.f21121a0 == 2) {
            ((com.google.android.material.textfield.d) this.f21140p0.get(3)).O((AutoCompleteTextView) this.f21141q);
        }
    }

    private Rect q(Rect rect) {
        int paddingTop;
        int iH;
        if (this.f21141q == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f21129i0;
        boolean zE = n.e(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f21121a0;
        if (i10 == 1) {
            rect2.left = G(rect.left, zE);
            paddingTop = rect.top + this.f21122b0;
        } else {
            if (i10 == 2) {
                rect2.left = rect.left + this.f21141q.getPaddingLeft();
                rect2.top = rect.top - u();
                iH = rect.right - this.f21141q.getPaddingRight();
                rect2.right = iH;
                return rect2;
            }
            rect2.left = G(rect.left, zE);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        iH = H(rect.right, zE);
        rect2.right = iH;
        return rect2;
    }

    private int r(Rect rect, Rect rect2, float f5) {
        return P() ? (int) (rect2.top + f5) : rect.bottom - this.f21141q.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f5) {
        return P() ? (int) (rect.centerY() - (f5 / 2.0f)) : rect.top + this.f21141q.getCompoundPaddingTop();
    }

    private boolean s0() {
        int iMax;
        if (this.f21141q == null || this.f21141q.getMeasuredHeight() >= (iMax = Math.max(this.f21137o.getMeasuredHeight(), this.f21135n.getMeasuredHeight()))) {
            return false;
        }
        this.f21141q.setMinimumHeight(iMax);
        return true;
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f21141q != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f21138o0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f21141q = editText;
        int i10 = this.f21145s;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f21149u);
        }
        int i11 = this.f21147t;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f21151v);
        }
        Q();
        setTextInputAccessibilityDelegate(new e(this));
        this.O0.j0(this.f21141q.getTypeface());
        this.O0.b0(this.f21141q.getTextSize());
        this.O0.X(this.f21141q.getLetterSpacing());
        int gravity = this.f21141q.getGravity();
        this.O0.S((gravity & (-113)) | 48);
        this.O0.a0(gravity);
        this.f21141q.addTextChangedListener(new a());
        if (this.C0 == null) {
            this.C0 = this.f21141q.getHintTextColors();
        }
        if (this.O) {
            if (TextUtils.isEmpty(this.P)) {
                CharSequence hint = this.f21141q.getHint();
                this.f21143r = hint;
                setHint(hint);
                this.f21141q.setHint((CharSequence) null);
            }
            this.Q = true;
        }
        if (this.A != null) {
            m0(this.f21141q.getText().length());
        }
        r0();
        this.f21153w.f();
        this.f21135n.bringToFront();
        this.f21137o.bringToFront();
        this.f21139p.bringToFront();
        this.f21160z0.bringToFront();
        B();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.P)) {
            return;
        }
        this.P = charSequence;
        this.O0.h0(charSequence);
        if (this.N0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.E == z10) {
            return;
        }
        if (z10) {
            i();
        } else {
            X();
            this.F = null;
        }
        this.E = z10;
    }

    private Rect t(Rect rect) {
        if (this.f21141q == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f21129i0;
        float fW = this.O0.w();
        rect2.left = rect.left + this.f21141q.getCompoundPaddingLeft();
        rect2.top = s(rect, fW);
        rect2.right = rect.right - this.f21141q.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, fW);
        return rect2;
    }

    private void t0() {
        this.f21139p.setVisibility((this.f21142q0.getVisibility() != 0 || L()) ? 8 : 0);
        this.f21137o.setVisibility(K() || L() || !((this.M == null || N()) ? 8 : false) ? 0 : 8);
    }

    private int u() {
        float fQ;
        if (!this.O) {
            return 0;
        }
        int i10 = this.f21121a0;
        if (i10 == 0) {
            fQ = this.O0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.O0.q() / 2.0f;
        }
        return (int) fQ;
    }

    private void u0() {
        this.f21160z0.setVisibility(getErrorIconDrawable() != null && this.f21153w.z() && this.f21153w.l() ? 0 : 8);
        t0();
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private boolean v() {
        return this.f21121a0 == 2 && w();
    }

    private void v0() {
        if (this.f21121a0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21133m.getLayoutParams();
            int iU = u();
            if (iU != layoutParams.topMargin) {
                layoutParams.topMargin = iU;
                this.f21133m.requestLayout();
            }
        }
    }

    private boolean w() {
        return this.f21123c0 > -1 && this.f21126f0 != 0;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.c) this.R).h0();
        }
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList textColors;
        com.google.android.material.internal.b bVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f21141q;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f21141q;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean zL = this.f21153w.l();
        ColorStateList colorStateList = this.C0;
        if (colorStateList != null) {
            this.O0.R(colorStateList);
            this.O0.Z(this.C0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.C0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.M0) : this.M0;
            this.O0.R(ColorStateList.valueOf(colorForState));
            this.O0.Z(ColorStateList.valueOf(colorForState));
        } else if (zL) {
            this.O0.R(this.f21153w.q());
        } else {
            if (this.f21159z && (textView = this.A) != null) {
                bVar = this.O0;
                textColors = textView.getTextColors();
            } else if (z13 && (textColors = this.D0) != null) {
                bVar = this.O0;
            }
            bVar.R(textColors);
        }
        if (z12 || !this.P0 || (isEnabled() && z13)) {
            if (z11 || this.N0) {
                y(z10);
                return;
            }
            return;
        }
        if (z11 || !this.N0) {
            F(z10);
        }
    }

    private void y(boolean z10) {
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.R0.cancel();
        }
        if (z10 && this.Q0) {
            k(1.0f);
        } else {
            this.O0.d0(1.0f);
        }
        this.N0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f21135n.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.F == null || (editText = this.f21141q) == null) {
            return;
        }
        this.F.setGravity(editText.getGravity());
        this.F.setPadding(this.f21141q.getCompoundPaddingLeft(), this.f21141q.getCompoundPaddingTop(), this.f21141q.getCompoundPaddingRight(), this.f21141q.getCompoundPaddingBottom());
    }

    private z0.d z() {
        z0.d dVar = new z0.d();
        dVar.b0(87L);
        dVar.d0(d5.a.f22931a);
        return dVar;
    }

    private void z0() {
        EditText editText = this.f21141q;
        A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void E0() {
        /*
            r5 = this;
            s5.g r0 = r5.R
            if (r0 == 0) goto Lcf
            int r0 = r5.f21121a0
            if (r0 != 0) goto La
            goto Lcf
        La:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r5.f21141q
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L30
            android.widget.EditText r3 = r5.f21141q
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L3c
            int r3 = r5.M0
        L39:
            r5.f21126f0 = r3
            goto L72
        L3c:
            com.google.android.material.textfield.g r3 = r5.f21153w
            boolean r3 = r3.l()
            if (r3 == 0) goto L53
            android.content.res.ColorStateList r3 = r5.H0
            if (r3 == 0) goto L4c
        L48:
            r5.B0(r0, r1)
            goto L72
        L4c:
            com.google.android.material.textfield.g r3 = r5.f21153w
            int r3 = r3.p()
            goto L39
        L53:
            boolean r3 = r5.f21159z
            if (r3 == 0) goto L65
            android.widget.TextView r3 = r5.A
            if (r3 == 0) goto L65
            android.content.res.ColorStateList r4 = r5.H0
            if (r4 == 0) goto L60
            goto L48
        L60:
            int r3 = r3.getCurrentTextColor()
            goto L39
        L65:
            if (r0 == 0) goto L6a
            int r3 = r5.G0
            goto L39
        L6a:
            if (r1 == 0) goto L6f
            int r3 = r5.F0
            goto L39
        L6f:
            int r3 = r5.E0
            goto L39
        L72:
            r5.u0()
            r5.V()
            r5.W()
            r5.U()
            com.google.android.material.textfield.e r3 = r5.getEndIconDelegate()
            boolean r3 = r3.d()
            if (r3 == 0) goto L91
            com.google.android.material.textfield.g r3 = r5.f21153w
            boolean r3 = r3.l()
            r5.i0(r3)
        L91:
            int r3 = r5.f21121a0
            r4 = 2
            if (r3 != r4) goto Lae
            int r3 = r5.f21123c0
            if (r0 == 0) goto La3
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto La3
            int r4 = r5.f21125e0
            goto La5
        La3:
            int r4 = r5.f21124d0
        La5:
            r5.f21123c0 = r4
            int r4 = r5.f21123c0
            if (r4 == r3) goto Lae
            r5.S()
        Lae:
            int r3 = r5.f21121a0
            if (r3 != r2) goto Lcc
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto Lbd
            int r0 = r5.J0
        Lba:
            r5.f21127g0 = r0
            goto Lcc
        Lbd:
            if (r1 == 0) goto Lc4
            if (r0 != 0) goto Lc4
            int r0 = r5.L0
            goto Lba
        Lc4:
            if (r0 == 0) goto Lc9
            int r0 = r5.K0
            goto Lba
        Lc9:
            int r0 = r5.I0
            goto Lba
        Lcc:
            r5.l()
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E0():void");
    }

    public boolean K() {
        return this.f21139p.getVisibility() == 0 && this.f21142q0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f21153w.A();
    }

    final boolean N() {
        return this.N0;
    }

    public boolean O() {
        return this.Q;
    }

    public void U() {
        com.google.android.material.textfield.f.c(this, this.f21142q0, this.f21146s0);
    }

    public void V() {
        com.google.android.material.textfield.f.c(this, this.f21160z0, this.A0);
    }

    public void W() {
        this.f21135n.j();
    }

    public void Y(float f5, float f10, float f11, float f12) {
        boolean zE = n.e(this);
        this.V = zE;
        float f13 = zE ? f10 : f5;
        if (!zE) {
            f5 = f10;
        }
        float f14 = zE ? f12 : f11;
        if (!zE) {
            f11 = f12;
        }
        s5.g gVar = this.R;
        if (gVar != null && gVar.E() == f13 && this.R.F() == f5 && this.R.s() == f14 && this.R.t() == f11) {
            return;
        }
        this.U = this.U.v().A(f13).E(f5).s(f14).w(f11).m();
        l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f21133m.addView(view, layoutParams2);
        this.f21133m.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void d0(TextView textView, int i10) {
        boolean z10 = true;
        try {
            androidx.core.widget.i.n(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            androidx.core.widget.i.n(textView, c5.j.f4800a);
            textView.setTextColor(androidx.core.content.a.c(getContext(), c5.c.f4699a));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f21141q;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f21143r != null) {
            boolean z10 = this.Q;
            this.Q = false;
            CharSequence hint = editText.getHint();
            this.f21141q.setHint(this.f21143r);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f21141q.setHint(hint);
                this.Q = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f21133m.getChildCount());
        for (int i11 = 0; i11 < this.f21133m.getChildCount(); i11++) {
            View childAt = this.f21133m.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f21141q) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.S0) {
            return;
        }
        this.S0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.O0;
        boolean zG0 = bVar != null ? bVar.g0(drawableState) | false : false;
        if (this.f21141q != null) {
            w0(w.S(this) && isEnabled());
        }
        r0();
        E0();
        if (zG0) {
            invalidate();
        }
        this.S0 = false;
    }

    public void g(f fVar) {
        this.f21136n0.add(fVar);
        if (this.f21141q != null) {
            fVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f21141q;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    s5.g getBoxBackground() {
        int i10 = this.f21121a0;
        if (i10 == 1 || i10 == 2) {
            return this.R;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f21127g0;
    }

    public int getBoxBackgroundMode() {
        return this.f21121a0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f21122b0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (n.e(this) ? this.U.j() : this.U.l()).a(this.f21130j0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (n.e(this) ? this.U.l() : this.U.j()).a(this.f21130j0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (n.e(this) ? this.U.r() : this.U.t()).a(this.f21130j0);
    }

    public float getBoxCornerRadiusTopStart() {
        return (n.e(this) ? this.U.t() : this.U.r()).a(this.f21130j0);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.f21124d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f21125e0;
    }

    public int getCounterMaxLength() {
        return this.f21157y;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f21155x && this.f21159z && (textView = this.A) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.K;
    }

    public ColorStateList getCounterTextColor() {
        return this.K;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.f21141q;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f21142q0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f21142q0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f21138o0;
    }

    CheckableImageButton getEndIconView() {
        return this.f21142q0;
    }

    public CharSequence getError() {
        if (this.f21153w.z()) {
            return this.f21153w.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f21153w.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f21153w.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f21160z0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f21153w.p();
    }

    public CharSequence getHelperText() {
        if (this.f21153w.A()) {
            return this.f21153w.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f21153w.t();
    }

    public CharSequence getHint() {
        if (this.O) {
            return this.P;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.O0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.O0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public int getMaxEms() {
        return this.f21147t;
    }

    public int getMaxWidth() {
        return this.f21151v;
    }

    public int getMinEms() {
        return this.f21145s;
    }

    public int getMinWidth() {
        return this.f21149u;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f21142q0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f21142q0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.E) {
            return this.D;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.H;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.G;
    }

    public CharSequence getPrefixText() {
        return this.f21135n.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f21135n.b();
    }

    public TextView getPrefixTextView() {
        return this.f21135n.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f21135n.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f21135n.e();
    }

    public CharSequence getSuffixText() {
        return this.M;
    }

    public ColorStateList getSuffixTextColor() {
        return this.N.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.N;
    }

    public Typeface getTypeface() {
        return this.f21131k0;
    }

    public void h(g gVar) {
        this.f21144r0.add(gVar);
    }

    void k(float f5) {
        if (this.O0.x() == f5) {
            return;
        }
        if (this.R0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.R0 = valueAnimator;
            valueAnimator.setInterpolator(d5.a.f22932b);
            this.R0.setDuration(167L);
            this.R0.addUpdateListener(new d());
        }
        this.R0.setFloatValues(this.O0.x(), f5);
        this.R0.start();
    }

    void m0(int i10) {
        boolean z10 = this.f21159z;
        int i11 = this.f21157y;
        if (i11 == -1) {
            this.A.setText(String.valueOf(i10));
            this.A.setContentDescription(null);
            this.f21159z = false;
        } else {
            this.f21159z = i10 > i11;
            n0(getContext(), this.A, i10, this.f21157y, this.f21159z);
            if (z10 != this.f21159z) {
                o0();
            }
            this.A.setText(androidx.core.text.a.c().j(getContext().getString(c5.i.f4787d, Integer.valueOf(i10), Integer.valueOf(this.f21157y))));
        }
        if (this.f21141q == null || z10 == this.f21159z) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f21141q;
        if (editText != null) {
            Rect rect = this.f21128h0;
            com.google.android.material.internal.c.a(this, editText, rect);
            k0(rect);
            if (this.O) {
                this.O0.b0(this.f21141q.getTextSize());
                int gravity = this.f21141q.getGravity();
                this.O0.S((gravity & (-113)) | 48);
                this.O0.a0(gravity);
                this.O0.O(q(rect));
                this.O0.W(t(rect));
                this.O0.K();
                if (!A() || this.N0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean zS0 = s0();
        boolean zQ0 = q0();
        if (zS0 || zQ0) {
            this.f21141q.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f21166o);
        if (hVar.f21167p) {
            this.f21142q0.post(new b());
        }
        setHint(hVar.f21168q);
        setHelperText(hVar.f21169r);
        setPlaceholderText(hVar.f21170s);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.V;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float fA = this.U.r().a(this.f21130j0);
            float fA2 = this.U.t().a(this.f21130j0);
            float fA3 = this.U.j().a(this.f21130j0);
            float fA4 = this.U.l().a(this.f21130j0);
            float f5 = z10 ? fA : fA2;
            if (z10) {
                fA = fA2;
            }
            float f10 = z10 ? fA3 : fA4;
            if (z10) {
                fA3 = fA4;
            }
            Y(f5, fA, f10, fA3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f21153w.l()) {
            hVar.f21166o = getError();
        }
        hVar.f21167p = I() && this.f21142q0.isChecked();
        hVar.f21168q = getHint();
        hVar.f21169r = getHelperText();
        hVar.f21170s = getPlaceholderText();
        return hVar;
    }

    boolean q0() {
        boolean z10;
        if (this.f21141q == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f21135n.getMeasuredWidth() - this.f21141q.getPaddingLeft();
            if (this.f21132l0 == null || this.f21134m0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f21132l0 = colorDrawable;
                this.f21134m0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.i.a(this.f21141q);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f21132l0;
            if (drawable != drawable2) {
                androidx.core.widget.i.i(this.f21141q, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f21132l0 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.i.a(this.f21141q);
                androidx.core.widget.i.i(this.f21141q, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f21132l0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.N.getMeasuredWidth() - this.f21141q.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + androidx.core.view.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.i.a(this.f21141q);
            Drawable drawable3 = this.f21150u0;
            if (drawable3 == null || this.f21152v0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f21150u0 = colorDrawable2;
                    this.f21152v0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.f21150u0;
                if (drawable4 != drawable5) {
                    this.f21154w0 = drawableArrA3[2];
                    androidx.core.widget.i.i(this.f21141q, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f21152v0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.i.i(this.f21141q, drawableArrA3[0], drawableArrA3[1], this.f21150u0, drawableArrA3[3]);
            }
        } else {
            if (this.f21150u0 == null) {
                return z10;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.i.a(this.f21141q);
            if (drawableArrA4[2] == this.f21150u0) {
                androidx.core.widget.i.i(this.f21141q, drawableArrA4[0], drawableArrA4[1], this.f21154w0, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.f21150u0 = null;
        }
        return z11;
    }

    void r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f21141q;
        if (editText == null || this.f21121a0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (i0.a(background)) {
            background = background.mutate();
        }
        if (this.f21153w.l()) {
            currentTextColor = this.f21153w.p();
        } else {
            if (!this.f21159z || (textView = this.A) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f21141q.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.k.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f21127g0 != i10) {
            this.f21127g0 = i10;
            this.I0 = i10;
            this.K0 = i10;
            this.L0 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.f21127g0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) throws Resources.NotFoundException {
        if (i10 == this.f21121a0) {
            return;
        }
        this.f21121a0 = i10;
        if (this.f21141q != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f21122b0 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.G0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E0();
        } else {
            this.E0 = colorStateList.getDefaultColor();
            this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.G0 = defaultColor;
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f21124d0 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f21125e0 = i10;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f21155x != z10) {
            if (z10) {
                d0 d0Var = new d0(getContext());
                this.A = d0Var;
                d0Var.setId(c5.f.K);
                Typeface typeface = this.f21131k0;
                if (typeface != null) {
                    this.A.setTypeface(typeface);
                }
                this.A.setMaxLines(1);
                this.f21153w.e(this.A, 2);
                androidx.core.view.h.d((ViewGroup.MarginLayoutParams) this.A.getLayoutParams(), getResources().getDimensionPixelOffset(c5.d.P));
                o0();
                l0();
            } else {
                this.f21153w.B(this.A, 2);
                this.A = null;
            }
            this.f21155x = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f21157y != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f21157y = i10;
            if (this.f21155x) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.B != i10) {
            this.B = i10;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.C != i10) {
            this.C = i10;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.f21141q != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f21142q0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f21142q0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f21142q0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f21142q0.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.f.a(this, this.f21142q0, this.f21146s0, this.f21148t0);
            U();
        }
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f21138o0;
        if (i11 == i10) {
            return;
        }
        this.f21138o0 = i10;
        C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f21121a0)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.f.a(this, this.f21142q0, this.f21146s0, this.f21148t0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f21121a0 + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f21142q0, onClickListener, this.f21156x0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21156x0 = onLongClickListener;
        c0(this.f21142q0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f21146s0 != colorStateList) {
            this.f21146s0 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.f21142q0, colorStateList, this.f21148t0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f21148t0 != mode) {
            this.f21148t0 = mode;
            com.google.android.material.textfield.f.a(this, this.f21142q0, this.f21146s0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (K() != z10) {
            this.f21142q0.setVisibility(z10 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f21153w.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f21153w.v();
        } else {
            this.f21153w.O(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f21153w.D(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f21153w.E(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
        V();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f21160z0.setImageDrawable(drawable);
        u0();
        com.google.android.material.textfield.f.a(this, this.f21160z0, this.A0, this.B0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f21160z0, onClickListener, this.f21158y0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21158y0 = onLongClickListener;
        c0(this.f21160z0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.f21160z0, colorStateList, this.B0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.B0 != mode) {
            this.B0 = mode;
            com.google.android.material.textfield.f.a(this, this.f21160z0, this.A0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f21153w.F(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f21153w.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f21153w.P(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f21153w.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f21153w.I(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f21153w.H(i10);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            if (z10) {
                CharSequence hint = this.f21141q.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.P)) {
                        setHint(hint);
                    }
                    this.f21141q.setHint((CharSequence) null);
                }
                this.Q = true;
            } else {
                this.Q = false;
                if (!TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.f21141q.getHint())) {
                    this.f21141q.setHint(this.P);
                }
                setHintInternal(null);
            }
            if (this.f21141q != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.O0.P(i10);
        this.D0 = this.O0.p();
        if (this.f21141q != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                this.O0.R(colorStateList);
            }
            this.D0 = colorStateList;
            if (this.f21141q != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f21147t = i10;
        EditText editText = this.f21141q;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f21151v = i10;
        EditText editText = this.f21141q;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f21145s = i10;
        EditText editText = this.f21141q;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f21149u = i10;
        EditText editText = this.f21141q;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f21142q0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f21142q0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f21138o0 != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f21146s0 = colorStateList;
        com.google.android.material.textfield.f.a(this, this.f21142q0, colorStateList, this.f21148t0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f21148t0 = mode;
        com.google.android.material.textfield.f.a(this, this.f21142q0, this.f21146s0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.F == null) {
            d0 d0Var = new d0(getContext());
            this.F = d0Var;
            d0Var.setId(c5.f.N);
            w.y0(this.F, 2);
            z0.d dVarZ = z();
            this.I = dVarZ;
            dVarZ.g0(67L);
            this.J = z();
            setPlaceholderTextAppearance(this.H);
            setPlaceholderTextColor(this.G);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.E) {
                setPlaceholderTextEnabled(true);
            }
            this.D = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.H = i10;
        TextView textView = this.F;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            TextView textView = this.F;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f21135n.k(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f21135n.l(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f21135n.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f21135n.n(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f21135n.o(charSequence);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f21135n.p(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f21135n.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21135n.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f21135n.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f21135n.t(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f21135n.u(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.N.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i10) {
        androidx.core.widget.i.n(this.N, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f21141q;
        if (editText != null) {
            w.o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f21131k0) {
            this.f21131k0 = typeface;
            this.O0.j0(typeface);
            this.f21153w.L(typeface);
            TextView textView = this.A;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z10) {
        x0(z10, false);
    }
}
