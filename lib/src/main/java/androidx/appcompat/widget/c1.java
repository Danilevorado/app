package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public class c1 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f1138a;

    /* renamed from: b, reason: collision with root package name */
    private int f1139b;

    /* renamed from: c, reason: collision with root package name */
    private View f1140c;

    /* renamed from: d, reason: collision with root package name */
    private View f1141d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1142e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1143f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1144g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1145h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f1146i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f1147j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1148k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f1149l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1150m;

    /* renamed from: n, reason: collision with root package name */
    private c f1151n;

    /* renamed from: o, reason: collision with root package name */
    private int f1152o;

    /* renamed from: p, reason: collision with root package name */
    private int f1153p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f1154q;

    class a implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1155m;

        a() {
            this.f1155m = new androidx.appcompat.view.menu.a(c1.this.f1138a.getContext(), 0, R.id.home, 0, 0, c1.this.f1146i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            Window.Callback callback = c1Var.f1149l;
            if (callback == null || !c1Var.f1150m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1155m);
        }
    }

    class b extends androidx.core.view.e0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1157a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1158b;

        b(int i10) {
            this.f1158b = i10;
        }

        @Override // androidx.core.view.e0, androidx.core.view.d0
        public void a(View view) {
            this.f1157a = true;
        }

        @Override // androidx.core.view.d0
        public void b(View view) {
            if (this.f1157a) {
                return;
            }
            c1.this.f1138a.setVisibility(this.f1158b);
        }

        @Override // androidx.core.view.e0, androidx.core.view.d0
        public void c(View view) {
            c1.this.f1138a.setVisibility(0);
        }
    }

    public c1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, f.h.f23408a, f.e.f23349n);
    }

    public c1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1152o = 0;
        this.f1153p = 0;
        this.f1138a = toolbar;
        this.f1146i = toolbar.getTitle();
        this.f1147j = toolbar.getSubtitle();
        this.f1145h = this.f1146i != null;
        this.f1144g = toolbar.getNavigationIcon();
        z0 z0VarV = z0.v(toolbar.getContext(), null, f.j.f23424a, f.a.f23290c, 0);
        this.f1154q = z0VarV.g(f.j.f23479l);
        if (z10) {
            CharSequence charSequenceP = z0VarV.p(f.j.f23509r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                F(charSequenceP);
            }
            CharSequence charSequenceP2 = z0VarV.p(f.j.f23499p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                E(charSequenceP2);
            }
            Drawable drawableG = z0VarV.g(f.j.f23489n);
            if (drawableG != null) {
                A(drawableG);
            }
            Drawable drawableG2 = z0VarV.g(f.j.f23484m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f1144g == null && (drawable = this.f1154q) != null) {
                D(drawable);
            }
            o(z0VarV.k(f.j.f23459h, 0));
            int iN = z0VarV.n(f.j.f23454g, 0);
            if (iN != 0) {
                y(LayoutInflater.from(this.f1138a.getContext()).inflate(iN, (ViewGroup) this.f1138a, false));
                o(this.f1139b | 16);
            }
            int iM = z0VarV.m(f.j.f23469j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1138a.getLayoutParams();
                layoutParams.height = iM;
                this.f1138a.setLayoutParams(layoutParams);
            }
            int iE = z0VarV.e(f.j.f23449f, -1);
            int iE2 = z0VarV.e(f.j.f23444e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1138a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = z0VarV.n(f.j.f23514s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1138a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = z0VarV.n(f.j.f23504q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1138a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = z0VarV.n(f.j.f23494o, 0);
            if (iN4 != 0) {
                this.f1138a.setPopupTheme(iN4);
            }
        } else {
            this.f1139b = x();
        }
        z0VarV.w();
        z(i10);
        this.f1148k = this.f1138a.getNavigationContentDescription();
        this.f1138a.setNavigationOnClickListener(new a());
    }

    private void G(CharSequence charSequence) {
        this.f1146i = charSequence;
        if ((this.f1139b & 8) != 0) {
            this.f1138a.setTitle(charSequence);
            if (this.f1145h) {
                androidx.core.view.w.r0(this.f1138a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f1139b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1148k)) {
                this.f1138a.setNavigationContentDescription(this.f1153p);
            } else {
                this.f1138a.setNavigationContentDescription(this.f1148k);
            }
        }
    }

    private void I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1139b & 4) != 0) {
            toolbar = this.f1138a;
            drawable = this.f1144g;
            if (drawable == null) {
                drawable = this.f1154q;
            }
        } else {
            toolbar = this.f1138a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f1139b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1143f) == null) {
            drawable = this.f1142e;
        }
        this.f1138a.setLogo(drawable);
    }

    private int x() {
        if (this.f1138a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1154q = this.f1138a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f1143f = drawable;
        J();
    }

    public void B(int i10) {
        C(i10 == 0 ? null : getContext().getString(i10));
    }

    public void C(CharSequence charSequence) {
        this.f1148k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.f1144g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f1147j = charSequence;
        if ((this.f1139b & 8) != 0) {
            this.f1138a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.f1145h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.h0
    public void a(Menu menu, m.a aVar) {
        if (this.f1151n == null) {
            c cVar = new c(this.f1138a.getContext());
            this.f1151n = cVar;
            cVar.p(f.f.f23368g);
        }
        this.f1151n.j(aVar);
        this.f1138a.K((androidx.appcompat.view.menu.g) menu, this.f1151n);
    }

    @Override // androidx.appcompat.widget.h0
    public boolean b() {
        return this.f1138a.B();
    }

    @Override // androidx.appcompat.widget.h0
    public void c() {
        this.f1150m = true;
    }

    @Override // androidx.appcompat.widget.h0
    public void collapseActionView() {
        this.f1138a.e();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean d() {
        return this.f1138a.A();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean e() {
        return this.f1138a.w();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean f() {
        return this.f1138a.Q();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean g() {
        return this.f1138a.d();
    }

    @Override // androidx.appcompat.widget.h0
    public Context getContext() {
        return this.f1138a.getContext();
    }

    @Override // androidx.appcompat.widget.h0
    public CharSequence getTitle() {
        return this.f1138a.getTitle();
    }

    @Override // androidx.appcompat.widget.h0
    public void h() {
        this.f1138a.f();
    }

    @Override // androidx.appcompat.widget.h0
    public void i(m.a aVar, g.a aVar2) {
        this.f1138a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.h0
    public void j(int i10) {
        this.f1138a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.h0
    public void k(t0 t0Var) {
        View view = this.f1140c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1138a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1140c);
            }
        }
        this.f1140c = t0Var;
    }

    @Override // androidx.appcompat.widget.h0
    public ViewGroup l() {
        return this.f1138a;
    }

    @Override // androidx.appcompat.widget.h0
    public void m(boolean z10) {
    }

    @Override // androidx.appcompat.widget.h0
    public boolean n() {
        return this.f1138a.v();
    }

    @Override // androidx.appcompat.widget.h0
    public void o(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1139b ^ i10;
        this.f1139b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1138a.setTitle(this.f1146i);
                    toolbar = this.f1138a;
                    charSequence = this.f1147j;
                } else {
                    charSequence = null;
                    this.f1138a.setTitle((CharSequence) null);
                    toolbar = this.f1138a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1141d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1138a.addView(view);
            } else {
                this.f1138a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.h0
    public int p() {
        return this.f1139b;
    }

    @Override // androidx.appcompat.widget.h0
    public Menu q() {
        return this.f1138a.getMenu();
    }

    @Override // androidx.appcompat.widget.h0
    public void r(int i10) {
        A(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.h0
    public int s() {
        return this.f1152o;
    }

    @Override // androidx.appcompat.widget.h0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.h0
    public void setIcon(Drawable drawable) {
        this.f1142e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowCallback(Window.Callback callback) {
        this.f1149l = callback;
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1145h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.h0
    public androidx.core.view.c0 t(int i10, long j10) {
        return androidx.core.view.w.e(this.f1138a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.h0
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.h0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.h0
    public void w(boolean z10) {
        this.f1138a.setCollapsible(z10);
    }

    public void y(View view) {
        View view2 = this.f1141d;
        if (view2 != null && (this.f1139b & 16) != 0) {
            this.f1138a.removeView(view2);
        }
        this.f1141d = view;
        if (view == null || (this.f1139b & 16) == 0) {
            return;
        }
        this.f1138a.addView(view);
    }

    public void z(int i10) {
        if (i10 == this.f1153p) {
            return;
        }
        this.f1153p = i10;
        if (TextUtils.isEmpty(this.f1138a.getNavigationContentDescription())) {
            B(this.f1153p);
        }
    }
}
