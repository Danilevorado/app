package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.p0;
import androidx.core.view.w;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int N = f.g.f23392e;
    private View A;
    View B;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private boolean I;
    private m.a J;
    ViewTreeObserver K;
    private PopupWindow.OnDismissListener L;
    boolean M;

    /* renamed from: n, reason: collision with root package name */
    private final Context f781n;

    /* renamed from: o, reason: collision with root package name */
    private final int f782o;

    /* renamed from: p, reason: collision with root package name */
    private final int f783p;

    /* renamed from: q, reason: collision with root package name */
    private final int f784q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f785r;

    /* renamed from: s, reason: collision with root package name */
    final Handler f786s;

    /* renamed from: t, reason: collision with root package name */
    private final List f787t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    final List f788u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f789v = new a();

    /* renamed from: w, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f790w = new b();

    /* renamed from: x, reason: collision with root package name */
    private final o0 f791x = new c();

    /* renamed from: y, reason: collision with root package name */
    private int f792y = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f793z = 0;
    private boolean H = false;
    private int C = C();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!d.this.b() || d.this.f788u.size() <= 0 || ((C0009d) d.this.f788u.get(0)).f801a.A()) {
                return;
            }
            View view = d.this.B;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator it = d.this.f788u.iterator();
            while (it.hasNext()) {
                ((C0009d) it.next()).f801a.show();
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
            ViewTreeObserver viewTreeObserver = d.this.K;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.K = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.K.removeGlobalOnLayoutListener(dVar.f789v);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements o0 {

        class a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ C0009d f797m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ MenuItem f798n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ g f799o;

            a(C0009d c0009d, MenuItem menuItem, g gVar) {
                this.f797m = c0009d;
                this.f798n = menuItem;
                this.f799o = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0009d c0009d = this.f797m;
                if (c0009d != null) {
                    d.this.M = true;
                    c0009d.f802b.e(false);
                    d.this.M = false;
                }
                if (this.f798n.isEnabled() && this.f798n.hasSubMenu()) {
                    this.f799o.L(this.f798n, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.o0
        public void c(g gVar, MenuItem menuItem) {
            d.this.f786s.removeCallbacksAndMessages(null);
            int size = d.this.f788u.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (gVar == ((C0009d) d.this.f788u.get(i10)).f802b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            d.this.f786s.postAtTime(new a(i11 < d.this.f788u.size() ? (C0009d) d.this.f788u.get(i11) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.o0
        public void d(g gVar, MenuItem menuItem) {
            d.this.f786s.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0009d {

        /* renamed from: a, reason: collision with root package name */
        public final p0 f801a;

        /* renamed from: b, reason: collision with root package name */
        public final g f802b;

        /* renamed from: c, reason: collision with root package name */
        public final int f803c;

        public C0009d(p0 p0Var, g gVar, int i10) {
            this.f801a = p0Var;
            this.f802b = gVar;
            this.f803c = i10;
        }

        public ListView a() {
            return this.f801a.f();
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f781n = context;
        this.A = view;
        this.f783p = i10;
        this.f784q = i11;
        this.f785r = z10;
        Resources resources = context.getResources();
        this.f782o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f23324b));
        this.f786s = new Handler();
    }

    private MenuItem A(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(C0009d c0009d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(c0009d.f802b, gVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = c0009d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemA == fVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return w.B(this.A) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List list = this.f788u;
        ListView listViewA = ((C0009d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.B.getWindowVisibleDisplayFrame(rect);
        return this.C == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void E(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0009d c0009d;
        View viewB;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f781n);
        f fVar = new f(gVar, layoutInflaterFrom, this.f785r, N);
        if (!b() && this.H) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.w(gVar));
        }
        int iN = k.n(fVar, null, this.f781n, this.f782o);
        p0 p0VarY = y();
        p0VarY.o(fVar);
        p0VarY.E(iN);
        p0VarY.F(this.f793z);
        if (this.f788u.size() > 0) {
            List list = this.f788u;
            c0009d = (C0009d) list.get(list.size() - 1);
            viewB = B(c0009d, gVar);
        } else {
            c0009d = null;
            viewB = null;
        }
        if (viewB != null) {
            p0VarY.T(false);
            p0VarY.Q(null);
            int iD = D(iN);
            boolean z10 = iD == 1;
            this.C = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                p0VarY.C(viewB);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.A.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewB.getLocationOnScreen(iArr2);
                if ((this.f793z & 7) == 5) {
                    iArr[0] = iArr[0] + this.A.getWidth();
                    iArr2[0] = iArr2[0] + viewB.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f793z & 5) == 5) {
                if (!z10) {
                    iN = viewB.getWidth();
                    i12 = i10 - iN;
                }
                i12 = i10 + iN;
            } else {
                if (z10) {
                    iN = viewB.getWidth();
                    i12 = i10 + iN;
                }
                i12 = i10 - iN;
            }
            p0VarY.k(i12);
            p0VarY.L(true);
            p0VarY.i(i11);
        } else {
            if (this.D) {
                p0VarY.k(this.F);
            }
            if (this.E) {
                p0VarY.i(this.G);
            }
            p0VarY.G(m());
        }
        this.f788u.add(new C0009d(p0VarY, gVar, this.C));
        p0VarY.show();
        ListView listViewF = p0VarY.f();
        listViewF.setOnKeyListener(this);
        if (c0009d == null && this.I && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(f.g.f23399l, (ViewGroup) listViewF, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewF.addHeaderView(frameLayout, null, false);
            p0VarY.show();
        }
    }

    private p0 y() {
        p0 p0Var = new p0(this.f781n, null, this.f783p, this.f784q);
        p0Var.S(this.f791x);
        p0Var.K(this);
        p0Var.J(this);
        p0Var.C(this.A);
        p0Var.F(this.f793z);
        p0Var.I(true);
        p0Var.H(2);
        return p0Var;
    }

    private int z(g gVar) {
        int size = this.f788u.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == ((C0009d) this.f788u.get(i10)).f802b) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        int iZ = z(gVar);
        if (iZ < 0) {
            return;
        }
        int i10 = iZ + 1;
        if (i10 < this.f788u.size()) {
            ((C0009d) this.f788u.get(i10)).f802b.e(false);
        }
        C0009d c0009d = (C0009d) this.f788u.remove(iZ);
        c0009d.f802b.O(this);
        if (this.M) {
            c0009d.f801a.R(null);
            c0009d.f801a.D(0);
        }
        c0009d.f801a.dismiss();
        int size = this.f788u.size();
        this.C = size > 0 ? ((C0009d) this.f788u.get(size - 1)).f803c : C();
        if (size != 0) {
            if (z10) {
                ((C0009d) this.f788u.get(0)).f802b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.J;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.K;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.K.removeGlobalOnLayoutListener(this.f789v);
            }
            this.K = null;
        }
        this.B.removeOnAttachStateChangeListener(this.f790w);
        this.L.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.f788u.size() > 0 && ((C0009d) this.f788u.get(0)).f801a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d(r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (C0009d c0009d : this.f788u) {
            if (rVar == c0009d.f802b) {
                c0009d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        k(rVar);
        m.a aVar = this.J;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f788u.size();
        if (size > 0) {
            C0009d[] c0009dArr = (C0009d[]) this.f788u.toArray(new C0009d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0009d c0009d = c0009dArr[i10];
                if (c0009d.f801a.b()) {
                    c0009d.f801a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        Iterator it = this.f788u.iterator();
        while (it.hasNext()) {
            k.x(((C0009d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView f() {
        if (this.f788u.isEmpty()) {
            return null;
        }
        return ((C0009d) this.f788u.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(m.a aVar) {
        this.J = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void k(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        gVar.c(this, this.f781n);
        if (b()) {
            E(gVar);
        } else {
            this.f787t.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void o(View view) {
        if (this.A != view) {
            this.A = view;
            this.f793z = androidx.core.view.e.b(this.f792y, w.B(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0009d c0009d;
        int size = this.f788u.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0009d = null;
                break;
            }
            c0009d = (C0009d) this.f788u.get(i10);
            if (!c0009d.f801a.b()) {
                break;
            } else {
                i10++;
            }
        }
        if (c0009d != null) {
            c0009d.f802b.e(false);
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
        this.H = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(int i10) {
        if (this.f792y != i10) {
            this.f792y = i10;
            this.f793z = androidx.core.view.e.b(i10, w.B(this.A));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        this.D = true;
        this.F = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (b()) {
            return;
        }
        Iterator it = this.f787t.iterator();
        while (it.hasNext()) {
            E((g) it.next());
        }
        this.f787t.clear();
        View view = this.A;
        this.B = view;
        if (view != null) {
            boolean z10 = this.K == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.K = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f789v);
            }
            this.B.addOnAttachStateChangeListener(this.f790w);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z10) {
        this.I = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i10) {
        this.E = true;
        this.G = i10;
    }
}
