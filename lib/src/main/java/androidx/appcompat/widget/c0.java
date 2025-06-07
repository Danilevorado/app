package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1117a;

    /* renamed from: b, reason: collision with root package name */
    private x0 f1118b;

    /* renamed from: c, reason: collision with root package name */
    private x0 f1119c;

    /* renamed from: d, reason: collision with root package name */
    private x0 f1120d;

    /* renamed from: e, reason: collision with root package name */
    private x0 f1121e;

    /* renamed from: f, reason: collision with root package name */
    private x0 f1122f;

    /* renamed from: g, reason: collision with root package name */
    private x0 f1123g;

    /* renamed from: h, reason: collision with root package name */
    private x0 f1124h;

    /* renamed from: i, reason: collision with root package name */
    private final e0 f1125i;

    /* renamed from: j, reason: collision with root package name */
    private int f1126j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f1127k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f1128l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1129m;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1131b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f1132c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1130a = i10;
            this.f1131b = i11;
            this.f1132c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1130a) != -1) {
                typeface = g.a(typeface, i10, (this.f1131b & 2) != 0);
            }
            c0.this.n(this.f1132c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ TextView f1134m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Typeface f1135n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f1136o;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1134m = textView;
            this.f1135n = typeface;
            this.f1136o = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1134m.setTypeface(this.f1135n, this.f1136o);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class e {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class f {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class g {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    c0(TextView textView) {
        this.f1117a = textView;
        this.f1125i = new e0(textView);
    }

    private void B(int i10, float f5) {
        this.f1125i.t(i10, f5);
    }

    private void C(Context context, z0 z0Var) {
        String strO;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f1126j = z0Var.k(f.j.H2, this.f1126j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = z0Var.k(f.j.J2, -1);
            this.f1127k = iK;
            if (iK != -1) {
                this.f1126j = (this.f1126j & 2) | 0;
            }
        }
        int i11 = f.j.I2;
        if (!z0Var.s(i11) && !z0Var.s(f.j.K2)) {
            int i12 = f.j.G2;
            if (z0Var.s(i12)) {
                this.f1129m = false;
                int iK2 = z0Var.k(i12, 1);
                if (iK2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1128l = typeface;
                return;
            }
            return;
        }
        this.f1128l = null;
        int i13 = f.j.K2;
        if (z0Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1127k;
        int i15 = this.f1126j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = z0Var.j(i11, this.f1126j, new a(i14, i15, new WeakReference(this.f1117a)));
                if (typefaceJ != null) {
                    if (i10 >= 28 && this.f1127k != -1) {
                        typefaceJ = g.a(Typeface.create(typefaceJ, 0), this.f1127k, (this.f1126j & 2) != 0);
                    }
                    this.f1128l = typefaceJ;
                }
                this.f1129m = this.f1128l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1128l != null || (strO = z0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1127k == -1) {
            typefaceCreate = Typeface.create(strO, this.f1126j);
        } else {
            typefaceCreate = g.a(Typeface.create(strO, 0), this.f1127k, (this.f1126j & 2) != 0);
        }
        this.f1128l = typefaceCreate;
    }

    private void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        k.i(drawable, x0Var, this.f1117a.getDrawableState());
    }

    private static x0 d(Context context, k kVar, int i10) {
        ColorStateList colorStateListF = kVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f1403d = true;
        x0Var.f1400a = colorStateListF;
        return x0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f1117a);
            TextView textView = this.f1117a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f1117a);
        if (drawableArrA2[0] != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f1117a;
            Drawable drawable7 = drawableArrA2[0];
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1117a.getCompoundDrawables();
        TextView textView3 = this.f1117a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        x0 x0Var = this.f1124h;
        this.f1118b = x0Var;
        this.f1119c = x0Var;
        this.f1120d = x0Var;
        this.f1121e = x0Var;
        this.f1122f = x0Var;
        this.f1123g = x0Var;
    }

    void A(int i10, float f5) {
        if (j1.f1266b || l()) {
            return;
        }
        B(i10, f5);
    }

    void b() {
        if (this.f1118b != null || this.f1119c != null || this.f1120d != null || this.f1121e != null) {
            Drawable[] compoundDrawables = this.f1117a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1118b);
            a(compoundDrawables[1], this.f1119c);
            a(compoundDrawables[2], this.f1120d);
            a(compoundDrawables[3], this.f1121e);
        }
        if (this.f1122f == null && this.f1123g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f1117a);
        a(drawableArrA[0], this.f1122f);
        a(drawableArrA[2], this.f1123g);
    }

    void c() {
        this.f1125i.a();
    }

    int e() {
        return this.f1125i.f();
    }

    int f() {
        return this.f1125i.g();
    }

    int g() {
        return this.f1125i.h();
    }

    int[] h() {
        return this.f1125i.i();
    }

    int i() {
        return this.f1125i.j();
    }

    ColorStateList j() {
        x0 x0Var = this.f1124h;
        if (x0Var != null) {
            return x0Var.f1400a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        x0 x0Var = this.f1124h;
        if (x0Var != null) {
            return x0Var.f1401b;
        }
        return null;
    }

    boolean l() {
        return this.f1125i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f1129m) {
            this.f1128l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (androidx.core.view.w.R(textView)) {
                    textView.post(new b(textView, typeface, this.f1126j));
                } else {
                    textView.setTypeface(typeface, this.f1126j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (j1.f1266b) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        z0 z0VarT = z0.t(context, i10, f.j.E2);
        int i11 = f.j.M2;
        if (z0VarT.s(i11)) {
            s(z0VarT.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = f.j.F2;
        if (z0VarT.s(i13) && z0VarT.f(i13, -1) == 0) {
            this.f1117a.setTextSize(0, 0.0f);
        }
        C(context, z0VarT);
        if (i12 >= 26) {
            int i14 = f.j.L2;
            if (z0VarT.s(i14) && (strO = z0VarT.o(i14)) != null) {
                f.d(this.f1117a, strO);
            }
        }
        z0VarT.w();
        Typeface typeface = this.f1128l;
        if (typeface != null) {
            this.f1117a.setTypeface(typeface, this.f1126j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        c0.a.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f1117a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f1125i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f1125i.q(iArr, i10);
    }

    void v(int i10) {
        this.f1125i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f1124h == null) {
            this.f1124h = new x0();
        }
        x0 x0Var = this.f1124h;
        x0Var.f1400a = colorStateList;
        x0Var.f1403d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f1124h == null) {
            this.f1124h = new x0();
        }
        x0 x0Var = this.f1124h;
        x0Var.f1401b = mode;
        x0Var.f1402c = mode != null;
        z();
    }
}
