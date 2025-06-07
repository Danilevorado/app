package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.core.view.c0;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class u extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f622a;

    /* renamed from: b, reason: collision with root package name */
    private Context f623b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f624c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f625d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f626e;

    /* renamed from: f, reason: collision with root package name */
    h0 f627f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f628g;

    /* renamed from: h, reason: collision with root package name */
    View f629h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f632k;

    /* renamed from: l, reason: collision with root package name */
    d f633l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f634m;

    /* renamed from: n, reason: collision with root package name */
    b.a f635n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f636o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f638q;

    /* renamed from: t, reason: collision with root package name */
    boolean f641t;

    /* renamed from: u, reason: collision with root package name */
    boolean f642u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f643v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f645x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f646y;

    /* renamed from: z, reason: collision with root package name */
    boolean f647z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f630i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f631j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f637p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f639r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f640s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f644w = true;
    final d0 A = new a();
    final d0 B = new b();
    final f0 C = new c();

    class a extends e0 {
        a() {
        }

        @Override // androidx.core.view.d0
        public void b(View view) {
            View view2;
            u uVar = u.this;
            if (uVar.f640s && (view2 = uVar.f629h) != null) {
                view2.setTranslationY(0.0f);
                u.this.f626e.setTranslationY(0.0f);
            }
            u.this.f626e.setVisibility(8);
            u.this.f626e.setTransitioning(false);
            u uVar2 = u.this;
            uVar2.f645x = null;
            uVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = u.this.f625d;
            if (actionBarOverlayLayout != null) {
                w.l0(actionBarOverlayLayout);
            }
        }
    }

    class b extends e0 {
        b() {
        }

        @Override // androidx.core.view.d0
        public void b(View view) {
            u uVar = u.this;
            uVar.f645x = null;
            uVar.f626e.requestLayout();
        }
    }

    class c implements f0 {
        c() {
        }

        @Override // androidx.core.view.f0
        public void a(View view) {
            ((View) u.this.f626e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: o, reason: collision with root package name */
        private final Context f651o;

        /* renamed from: p, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f652p;

        /* renamed from: q, reason: collision with root package name */
        private b.a f653q;

        /* renamed from: r, reason: collision with root package name */
        private WeakReference f654r;

        public d(Context context, b.a aVar) {
            this.f651o = context;
            this.f653q = aVar;
            androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(context).S(1);
            this.f652p = gVarS;
            gVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f653q;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f653q == null) {
                return;
            }
            k();
            u.this.f628g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            u uVar = u.this;
            if (uVar.f633l != this) {
                return;
            }
            if (u.v(uVar.f641t, uVar.f642u, false)) {
                this.f653q.b(this);
            } else {
                u uVar2 = u.this;
                uVar2.f634m = this;
                uVar2.f635n = this.f653q;
            }
            this.f653q = null;
            u.this.u(false);
            u.this.f628g.g();
            u uVar3 = u.this;
            uVar3.f625d.setHideOnContentScrollEnabled(uVar3.f647z);
            u.this.f633l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f654r;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f652p;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f651o);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return u.this.f628g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return u.this.f628g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (u.this.f633l != this) {
                return;
            }
            this.f652p.d0();
            try {
                this.f653q.a(this, this.f652p);
            } finally {
                this.f652p.c0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return u.this.f628g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            u.this.f628g.setCustomView(view);
            this.f654r = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(u.this.f622a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            u.this.f628g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(u.this.f622a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            u.this.f628g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            u.this.f628g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f652p.d0();
            try {
                return this.f653q.d(this, this.f652p);
            } finally {
                this.f652p.c0();
            }
        }
    }

    public u(Activity activity, boolean z10) {
        this.f624c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z10) {
            return;
        }
        this.f629h = decorView.findViewById(R.id.content);
    }

    public u(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }

    private void B() {
        if (this.f643v) {
            this.f643v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f625d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f.f23377p);
        this.f625d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f627f = z(view.findViewById(f.f.f23362a));
        this.f628g = (ActionBarContextView) view.findViewById(f.f.f23367f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f.f23364c);
        this.f626e = actionBarContainer;
        h0 h0Var = this.f627f;
        if (h0Var == null || this.f628g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f622a = h0Var.getContext();
        boolean z10 = (this.f627f.p() & 4) != 0;
        if (z10) {
            this.f632k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f622a);
        I(aVarB.a() || z10);
        G(aVarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f622a.obtainStyledAttributes(null, f.j.f23424a, f.a.f23290c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(f.j.f23474k, false)) {
            H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.j.f23464i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void G(boolean z10) {
        this.f638q = z10;
        if (z10) {
            this.f626e.setTabContainer(null);
            this.f627f.k(null);
        } else {
            this.f627f.k(null);
            this.f626e.setTabContainer(null);
        }
        boolean z11 = A() == 2;
        this.f627f.w(!this.f638q && z11);
        this.f625d.setHasNonEmbeddedTabs(!this.f638q && z11);
    }

    private boolean J() {
        return w.S(this.f626e);
    }

    private void K() {
        if (this.f643v) {
            return;
        }
        this.f643v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f625d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    private void L(boolean z10) {
        if (v(this.f641t, this.f642u, this.f643v)) {
            if (this.f644w) {
                return;
            }
            this.f644w = true;
            y(z10);
            return;
        }
        if (this.f644w) {
            this.f644w = false;
            x(z10);
        }
    }

    static boolean v(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h0 z(View view) {
        if (view instanceof h0) {
            return (h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public int A() {
        return this.f627f.s();
    }

    public void D(boolean z10) {
        E(z10 ? 4 : 0, 4);
    }

    public void E(int i10, int i11) {
        int iP = this.f627f.p();
        if ((i11 & 4) != 0) {
            this.f632k = true;
        }
        this.f627f.o((i10 & i11) | ((~i11) & iP));
    }

    public void F(float f5) {
        w.w0(this.f626e, f5);
    }

    public void H(boolean z10) {
        if (z10 && !this.f625d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f647z = z10;
        this.f625d.setHideOnContentScrollEnabled(z10);
    }

    public void I(boolean z10) {
        this.f627f.m(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f642u) {
            this.f642u = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        androidx.appcompat.view.h hVar = this.f645x;
        if (hVar != null) {
            hVar.a();
            this.f645x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z10) {
        this.f640s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f642u) {
            return;
        }
        this.f642u = true;
        L(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        h0 h0Var = this.f627f;
        if (h0Var == null || !h0Var.n()) {
            return false;
        }
        this.f627f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f636o) {
            return;
        }
        this.f636o = z10;
        int size = this.f637p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a.b) this.f637p.get(i10)).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f627f.p();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f623b == null) {
            TypedValue typedValue = new TypedValue();
            this.f622a.getTheme().resolveAttribute(f.a.f23292e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f623b = new ContextThemeWrapper(this.f622a, i10);
            } else {
                this.f623b = this.f622a;
            }
        }
        return this.f623b;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        G(androidx.appcompat.view.a.b(this.f622a).e());
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f633l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f639r = i10;
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z10) {
        if (this.f632k) {
            return;
        }
        D(z10);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f646y = z10;
        if (z10 || (hVar = this.f645x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void s(CharSequence charSequence) {
        this.f627f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b t(b.a aVar) {
        d dVar = this.f633l;
        if (dVar != null) {
            dVar.c();
        }
        this.f625d.setHideOnContentScrollEnabled(false);
        this.f628g.k();
        d dVar2 = new d(this.f628g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f633l = dVar2;
        dVar2.k();
        this.f628g.h(dVar2);
        u(true);
        return dVar2;
    }

    public void u(boolean z10) {
        c0 c0VarT;
        c0 c0VarF;
        if (z10) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z10) {
                this.f627f.j(4);
                this.f628g.setVisibility(0);
                return;
            } else {
                this.f627f.j(0);
                this.f628g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c0VarF = this.f627f.t(4, 100L);
            c0VarT = this.f628g.f(0, 200L);
        } else {
            c0VarT = this.f627f.t(0, 200L);
            c0VarF = this.f628g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c0VarF, c0VarT);
        hVar.h();
    }

    void w() {
        b.a aVar = this.f635n;
        if (aVar != null) {
            aVar.b(this.f634m);
            this.f634m = null;
            this.f635n = null;
        }
    }

    public void x(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f645x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f639r != 0 || (!this.f646y && !z10)) {
            this.A.b(null);
            return;
        }
        this.f626e.setAlpha(1.0f);
        this.f626e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f5 = -this.f626e.getHeight();
        if (z10) {
            this.f626e.getLocationInWindow(new int[]{0, 0});
            f5 -= r5[1];
        }
        c0 c0VarM = w.e(this.f626e).m(f5);
        c0VarM.k(this.C);
        hVar2.c(c0VarM);
        if (this.f640s && (view = this.f629h) != null) {
            hVar2.c(w.e(view).m(f5));
        }
        hVar2.f(D);
        hVar2.e(250L);
        hVar2.g(this.A);
        this.f645x = hVar2;
        hVar2.h();
    }

    public void y(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f645x;
        if (hVar != null) {
            hVar.a();
        }
        this.f626e.setVisibility(0);
        if (this.f639r == 0 && (this.f646y || z10)) {
            this.f626e.setTranslationY(0.0f);
            float f5 = -this.f626e.getHeight();
            if (z10) {
                this.f626e.getLocationInWindow(new int[]{0, 0});
                f5 -= r5[1];
            }
            this.f626e.setTranslationY(f5);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            c0 c0VarM = w.e(this.f626e).m(0.0f);
            c0VarM.k(this.C);
            hVar2.c(c0VarM);
            if (this.f640s && (view2 = this.f629h) != null) {
                view2.setTranslationY(f5);
                hVar2.c(w.e(this.f629h).m(0.0f));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f645x = hVar2;
            hVar2.h();
        } else {
            this.f626e.setAlpha(1.0f);
            this.f626e.setTranslationY(0.0f);
            if (this.f640s && (view = this.f629h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f625d;
        if (actionBarOverlayLayout != null) {
            w.l0(actionBarOverlayLayout);
        }
    }
}
