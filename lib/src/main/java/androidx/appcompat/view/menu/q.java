package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.p0;
import androidx.core.view.w;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int H = f.g.f23400m;
    private m.a A;
    ViewTreeObserver B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean G;

    /* renamed from: n, reason: collision with root package name */
    private final Context f904n;

    /* renamed from: o, reason: collision with root package name */
    private final g f905o;

    /* renamed from: p, reason: collision with root package name */
    private final f f906p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f907q;

    /* renamed from: r, reason: collision with root package name */
    private final int f908r;

    /* renamed from: s, reason: collision with root package name */
    private final int f909s;

    /* renamed from: t, reason: collision with root package name */
    private final int f910t;

    /* renamed from: u, reason: collision with root package name */
    final p0 f911u;

    /* renamed from: x, reason: collision with root package name */
    private PopupWindow.OnDismissListener f914x;

    /* renamed from: y, reason: collision with root package name */
    private View f915y;

    /* renamed from: z, reason: collision with root package name */
    View f916z;

    /* renamed from: v, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f912v = new a();

    /* renamed from: w, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f913w = new b();
    private int F = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!q.this.b() || q.this.f911u.A()) {
                return;
            }
            View view = q.this.f916z;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f911u.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.B = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.B.removeGlobalOnLayoutListener(qVar.f912v);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f904n = context;
        this.f905o = gVar;
        this.f907q = z10;
        this.f906p = new f(gVar, LayoutInflater.from(context), z10, H);
        this.f909s = i10;
        this.f910t = i11;
        Resources resources = context.getResources();
        this.f908r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f23324b));
        this.f915y = view;
        this.f911u = new p0(context, null, i10, i11);
        gVar.c(this, context);
    }

    private boolean y() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (b()) {
            return true;
        }
        if (this.C || (view = this.f915y) == null) {
            return false;
        }
        this.f916z = view;
        this.f911u.J(this);
        this.f911u.K(this);
        this.f911u.I(true);
        View view2 = this.f916z;
        boolean z10 = this.B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.B = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f912v);
        }
        view2.addOnAttachStateChangeListener(this.f913w);
        this.f911u.C(view2);
        this.f911u.F(this.F);
        if (!this.D) {
            this.E = k.n(this.f906p, null, this.f904n, this.f908r);
            this.D = true;
        }
        this.f911u.E(this.E);
        this.f911u.H(2);
        this.f911u.G(m());
        this.f911u.show();
        ListView listViewF = this.f911u.f();
        listViewF.setOnKeyListener(this);
        if (this.G && this.f905o.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f904n).inflate(f.g.f23399l, (ViewGroup) listViewF, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f905o.x());
            }
            frameLayout.setEnabled(false);
            listViewF.addHeaderView(frameLayout, null, false);
        }
        this.f911u.o(this.f906p);
        this.f911u.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        if (gVar != this.f905o) {
            return;
        }
        dismiss();
        m.a aVar = this.A;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.C && this.f911u.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f904n, rVar, this.f916z, this.f907q, this.f909s, this.f910t);
            lVar.j(this.A);
            lVar.g(k.w(rVar));
            lVar.i(this.f914x);
            this.f914x = null;
            this.f905o.e(false);
            int iA = this.f911u.a();
            int iM = this.f911u.m();
            if ((Gravity.getAbsoluteGravity(this.F, w.B(this.f915y)) & 7) == 5) {
                iA += this.f915y.getWidth();
            }
            if (lVar.n(iA, iM)) {
                m.a aVar = this.A;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.f911u.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        this.D = false;
        f fVar = this.f906p;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView f() {
        return this.f911u.f();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(m.a aVar) {
        this.A = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void k(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.k
    public void o(View view) {
        this.f915y = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.C = true;
        this.f905o.close();
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.f916z.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.f912v);
            this.B = null;
        }
        this.f916z.removeOnAttachStateChangeListener(this.f913w);
        PopupWindow.OnDismissListener onDismissListener = this.f914x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void q(boolean z10) {
        this.f906p.d(z10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(int i10) {
        this.F = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        this.f911u.k(i10);
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f914x = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z10) {
        this.G = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i10) {
        this.f911u.i(i10);
    }
}
