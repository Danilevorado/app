package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class d0 extends TextView implements androidx.core.widget.k {

    /* renamed from: m, reason: collision with root package name */
    private final e f1164m;

    /* renamed from: n, reason: collision with root package name */
    private final c0 f1165n;

    /* renamed from: o, reason: collision with root package name */
    private final b0 f1166o;

    /* renamed from: p, reason: collision with root package name */
    private n f1167p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1168q;

    /* renamed from: r, reason: collision with root package name */
    private a f1169r;

    /* renamed from: s, reason: collision with root package name */
    private Future f1170s;

    private interface a {
        void a(int[] iArr, int i10);

        void b(TextClassifier textClassifier);

        int[] c();

        void d(int i10);

        TextClassifier e();

        int f();

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.d0.a
        public void a(int[] iArr, int i10) {
            d0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.d0.a
        public void b(TextClassifier textClassifier) {
            d0.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.d0.a
        public int[] c() {
            return d0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.d0.a
        public void d(int i10) {
        }

        @Override // androidx.appcompat.widget.d0.a
        public TextClassifier e() {
            return d0.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.d0.a
        public int f() {
            return d0.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.d0.a
        public void g(int i10, int i11, int i12, int i13) {
            d0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.d0.a
        public int h() {
            return d0.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.d0.a
        public int i() {
            return d0.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.d0.a
        public void j(int i10) {
        }

        @Override // androidx.appcompat.widget.d0.a
        public int k() {
            return d0.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.d0.a
        public void l(int i10) {
            d0.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.d0.b, androidx.appcompat.widget.d0.a
        public void d(int i10) {
            d0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.d0.b, androidx.appcompat.widget.d0.a
        public void j(int i10) {
            d0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public d0(Context context) {
        this(context, null);
    }

    public d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public d0(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        this.f1168q = false;
        this.f1169r = null;
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f1164m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f1165n = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        this.f1166o = new b0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private void A() {
        Future future = this.f1170s;
        if (future != null) {
            try {
                this.f1170s = null;
                a5.a.a(future.get());
                androidx.core.widget.i.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private n getEmojiTextViewHelper() {
        if (this.f1167p == null) {
            this.f1167p = new n(this);
        }
        return this.f1167p;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1164m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f1266b) {
            return getSuperCaller().f();
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j1.f1266b) {
            return getSuperCaller().i();
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j1.f1266b) {
            return getSuperCaller().k();
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j1.f1266b) {
            return getSuperCaller().c();
        }
        c0 c0Var = this.f1165n;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (j1.f1266b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.c(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f1169r == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f1169r = bVar;
        }
        return this.f1169r;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1164m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1164m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1165n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1165n.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        A();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        return (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1166o) == null) ? getSuperCaller().e() : b0Var.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1165n.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        A();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        c0 c0Var = this.f1165n;
        if ((c0Var == null || j1.f1266b || !c0Var.l()) ? false : true) {
            this.f1165n.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (j1.f1266b) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (j1.f1266b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (j1.f1266b) {
            getSuperCaller().l(i10);
            return;
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1164m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1164m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? g.a.b(context, i10) : null, i11 != 0 ? g.a.b(context, i11) : null, i12 != 0 ? g.a.b(context, i12) : null, i13 != 0 ? g.a.b(context, i13) : null);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? g.a.b(context, i10) : null, i11 != 0 ? g.a.b(context, i11) : null, i12 != 0 ? g.a.b(context, i12) : null, i13 != 0 ? g.a.b(context, i13) : null);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.i.j(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i10);
        } else {
            androidx.core.widget.i.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.i.l(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.c cVar) {
        androidx.core.widget.i.m(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1164m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1164m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1165n.w(colorStateList);
        this.f1165n.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1165n.x(mode);
        this.f1165n.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1166o) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.c> future) {
        this.f1170s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        androidx.core.widget.i.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f5) {
        if (j1.f1266b) {
            super.setTextSize(i10, f5);
            return;
        }
        c0 c0Var = this.f1165n;
        if (c0Var != null) {
            c0Var.A(i10, f5);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1168q) {
            return;
        }
        Typeface typefaceA = null;
        if (typeface != null && i10 > 0) {
            typefaceA = androidx.core.graphics.e.a(getContext(), typeface, i10);
        }
        this.f1168q = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1168q = false;
        }
    }
}
