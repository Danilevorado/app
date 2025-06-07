package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class g1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: w, reason: collision with root package name */
    private static g1 f1205w;

    /* renamed from: x, reason: collision with root package name */
    private static g1 f1206x;

    /* renamed from: m, reason: collision with root package name */
    private final View f1207m;

    /* renamed from: n, reason: collision with root package name */
    private final CharSequence f1208n;

    /* renamed from: o, reason: collision with root package name */
    private final int f1209o;

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f1210p = new Runnable() { // from class: androidx.appcompat.widget.f1
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f1200m.e();
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f1211q = new Runnable() { // from class: androidx.appcompat.widget.e1
        @Override // java.lang.Runnable
        public final void run() {
            this.f1193m.d();
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private int f1212r;

    /* renamed from: s, reason: collision with root package name */
    private int f1213s;

    /* renamed from: t, reason: collision with root package name */
    private h1 f1214t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1215u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1216v;

    private g1(View view, CharSequence charSequence) {
        this.f1207m = view;
        this.f1208n = charSequence;
        this.f1209o = androidx.core.view.y.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1207m.removeCallbacks(this.f1210p);
    }

    private void c() {
        this.f1216v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() throws Resources.NotFoundException {
        i(false);
    }

    private void f() {
        this.f1207m.postDelayed(this.f1210p, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(g1 g1Var) {
        g1 g1Var2 = f1205w;
        if (g1Var2 != null) {
            g1Var2.b();
        }
        f1205w = g1Var;
        if (g1Var != null) {
            g1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        g1 g1Var = f1205w;
        if (g1Var != null && g1Var.f1207m == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new g1(view, charSequence);
            return;
        }
        g1 g1Var2 = f1206x;
        if (g1Var2 != null && g1Var2.f1207m == view) {
            g1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1216v && Math.abs(x10 - this.f1212r) <= this.f1209o && Math.abs(y10 - this.f1213s) <= this.f1209o) {
            return false;
        }
        this.f1212r = x10;
        this.f1213s = y10;
        this.f1216v = false;
        return true;
    }

    void d() {
        if (f1206x == this) {
            f1206x = null;
            h1 h1Var = this.f1214t;
            if (h1Var != null) {
                h1Var.c();
                this.f1214t = null;
                c();
                this.f1207m.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1205w == this) {
            g(null);
        }
        this.f1207m.removeCallbacks(this.f1211q);
    }

    void i(boolean z10) throws Resources.NotFoundException {
        long longPressTimeout;
        if (androidx.core.view.w.R(this.f1207m)) {
            g(null);
            g1 g1Var = f1206x;
            if (g1Var != null) {
                g1Var.d();
            }
            f1206x = this;
            this.f1215u = z10;
            h1 h1Var = new h1(this.f1207m.getContext());
            this.f1214t = h1Var;
            h1Var.e(this.f1207m, this.f1212r, this.f1213s, this.f1215u, this.f1208n);
            this.f1207m.addOnAttachStateChangeListener(this);
            if (this.f1215u) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((androidx.core.view.w.K(this.f1207m) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1207m.removeCallbacks(this.f1211q);
            this.f1207m.postDelayed(this.f1211q, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1214t != null && this.f1215u) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1207m.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1207m.isEnabled() && this.f1214t == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f1212r = view.getWidth() / 2;
        this.f1213s = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
