package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.w;
import c5.b;
import p5.c;
import s5.g;
import s5.k;
import s5.n;

/* loaded from: classes.dex */
class a {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f20813t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f20814u = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f20815a;

    /* renamed from: b, reason: collision with root package name */
    private k f20816b;

    /* renamed from: c, reason: collision with root package name */
    private int f20817c;

    /* renamed from: d, reason: collision with root package name */
    private int f20818d;

    /* renamed from: e, reason: collision with root package name */
    private int f20819e;

    /* renamed from: f, reason: collision with root package name */
    private int f20820f;

    /* renamed from: g, reason: collision with root package name */
    private int f20821g;

    /* renamed from: h, reason: collision with root package name */
    private int f20822h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f20823i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f20824j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f20825k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f20826l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f20827m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20828n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20829o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20830p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20831q;

    /* renamed from: r, reason: collision with root package name */
    private LayerDrawable f20832r;

    /* renamed from: s, reason: collision with root package name */
    private int f20833s;

    a(MaterialButton materialButton, k kVar) {
        this.f20815a = materialButton;
        this.f20816b = kVar;
    }

    private void E(int i10, int i11) {
        int iG = w.G(this.f20815a);
        int paddingTop = this.f20815a.getPaddingTop();
        int iF = w.F(this.f20815a);
        int paddingBottom = this.f20815a.getPaddingBottom();
        int i12 = this.f20819e;
        int i13 = this.f20820f;
        this.f20820f = i11;
        this.f20819e = i10;
        if (!this.f20829o) {
            F();
        }
        w.B0(this.f20815a, iG, (paddingTop + i10) - i12, iF, (paddingBottom + i11) - i13);
    }

    private void F() {
        this.f20815a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.U(this.f20833s);
        }
    }

    private void G(k kVar) {
        if (f20814u && !this.f20829o) {
            int iG = w.G(this.f20815a);
            int paddingTop = this.f20815a.getPaddingTop();
            int iF = w.F(this.f20815a);
            int paddingBottom = this.f20815a.getPaddingBottom();
            F();
            w.B0(this.f20815a, iG, paddingTop, iF, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void H() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.a0(this.f20822h, this.f20825k);
            if (gVarN != null) {
                gVarN.Z(this.f20822h, this.f20828n ? i5.a.d(this.f20815a, b.f4684l) : 0);
            }
        }
    }

    private InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f20817c, this.f20819e, this.f20818d, this.f20820f);
    }

    private Drawable a() {
        g gVar = new g(this.f20816b);
        gVar.L(this.f20815a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f20824j);
        PorterDuff.Mode mode = this.f20823i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.a0(this.f20822h, this.f20825k);
        g gVar2 = new g(this.f20816b);
        gVar2.setTint(0);
        gVar2.Z(this.f20822h, this.f20828n ? i5.a.d(this.f20815a, b.f4684l) : 0);
        if (f20813t) {
            g gVar3 = new g(this.f20816b);
            this.f20827m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(q5.b.a(this.f20826l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f20827m);
            this.f20832r = rippleDrawable;
            return rippleDrawable;
        }
        q5.a aVar = new q5.a(this.f20816b);
        this.f20827m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, q5.b.a(this.f20826l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f20827m});
        this.f20832r = layerDrawable;
        return I(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f20832r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f20813t ? (LayerDrawable) ((InsetDrawable) this.f20832r.getDrawable(0)).getDrawable() : this.f20832r).getDrawable(!z10 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(ColorStateList colorStateList) {
        if (this.f20825k != colorStateList) {
            this.f20825k = colorStateList;
            H();
        }
    }

    void B(int i10) {
        if (this.f20822h != i10) {
            this.f20822h = i10;
            H();
        }
    }

    void C(ColorStateList colorStateList) {
        if (this.f20824j != colorStateList) {
            this.f20824j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f20824j);
            }
        }
    }

    void D(PorterDuff.Mode mode) {
        if (this.f20823i != mode) {
            this.f20823i = mode;
            if (f() == null || this.f20823i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.f20823i);
        }
    }

    int b() {
        return this.f20821g;
    }

    public int c() {
        return this.f20820f;
    }

    public int d() {
        return this.f20819e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f20832r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f20832r.getNumberOfLayers() > 2 ? this.f20832r.getDrawable(2) : this.f20832r.getDrawable(1));
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f20826l;
    }

    k i() {
        return this.f20816b;
    }

    ColorStateList j() {
        return this.f20825k;
    }

    int k() {
        return this.f20822h;
    }

    ColorStateList l() {
        return this.f20824j;
    }

    PorterDuff.Mode m() {
        return this.f20823i;
    }

    boolean o() {
        return this.f20829o;
    }

    boolean p() {
        return this.f20831q;
    }

    void q(TypedArray typedArray) {
        this.f20817c = typedArray.getDimensionPixelOffset(c5.k.f4906l2, 0);
        this.f20818d = typedArray.getDimensionPixelOffset(c5.k.f4914m2, 0);
        this.f20819e = typedArray.getDimensionPixelOffset(c5.k.f4922n2, 0);
        this.f20820f = typedArray.getDimensionPixelOffset(c5.k.f4929o2, 0);
        int i10 = c5.k.f4961s2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f20821g = dimensionPixelSize;
            y(this.f20816b.w(dimensionPixelSize));
            this.f20830p = true;
        }
        this.f20822h = typedArray.getDimensionPixelSize(c5.k.C2, 0);
        this.f20823i = com.google.android.material.internal.n.f(typedArray.getInt(c5.k.f4953r2, -1), PorterDuff.Mode.SRC_IN);
        this.f20824j = c.a(this.f20815a.getContext(), typedArray, c5.k.f4945q2);
        this.f20825k = c.a(this.f20815a.getContext(), typedArray, c5.k.B2);
        this.f20826l = c.a(this.f20815a.getContext(), typedArray, c5.k.A2);
        this.f20831q = typedArray.getBoolean(c5.k.f4937p2, false);
        this.f20833s = typedArray.getDimensionPixelSize(c5.k.f4969t2, 0);
        int iG = w.G(this.f20815a);
        int paddingTop = this.f20815a.getPaddingTop();
        int iF = w.F(this.f20815a);
        int paddingBottom = this.f20815a.getPaddingBottom();
        if (typedArray.hasValue(c5.k.f4898k2)) {
            s();
        } else {
            F();
        }
        w.B0(this.f20815a, iG + this.f20817c, paddingTop + this.f20819e, iF + this.f20818d, paddingBottom + this.f20820f);
    }

    void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void s() {
        this.f20829o = true;
        this.f20815a.setSupportBackgroundTintList(this.f20824j);
        this.f20815a.setSupportBackgroundTintMode(this.f20823i);
    }

    void t(boolean z10) {
        this.f20831q = z10;
    }

    void u(int i10) {
        if (this.f20830p && this.f20821g == i10) {
            return;
        }
        this.f20821g = i10;
        this.f20830p = true;
        y(this.f20816b.w(i10));
    }

    public void v(int i10) {
        E(this.f20819e, i10);
    }

    public void w(int i10) {
        E(i10, this.f20820f);
    }

    void x(ColorStateList colorStateList) {
        if (this.f20826l != colorStateList) {
            this.f20826l = colorStateList;
            boolean z10 = f20813t;
            if (z10 && (this.f20815a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f20815a.getBackground()).setColor(q5.b.a(colorStateList));
            } else {
                if (z10 || !(this.f20815a.getBackground() instanceof q5.a)) {
                    return;
                }
                ((q5.a) this.f20815a.getBackground()).setTintList(q5.b.a(colorStateList));
            }
        }
    }

    void y(k kVar) {
        this.f20816b = kVar;
        G(kVar);
    }

    void z(boolean z10) {
        this.f20828n = z10;
        H();
    }
}
