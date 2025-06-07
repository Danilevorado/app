package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.b implements b.a {
    private boolean A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private final SparseBooleanArray J;
    e K;
    a L;
    RunnableC0011c M;
    private b N;
    final f O;
    int P;

    /* renamed from: w, reason: collision with root package name */
    d f1104w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f1105x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1106y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1107z;

    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, f.a.f23296i);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = c.this.f1104w;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f776u : view2);
            }
            j(c.this.O);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            c cVar = c.this;
            cVar.L = null;
            cVar.P = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = c.this.L;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0011c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private e f1110m;

        public RunnableC0011c(e eVar) {
            this.f1110m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f770o != null) {
                ((androidx.appcompat.view.menu.b) c.this).f770o.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f776u;
            if (view != null && view.getWindowToken() != null && this.f1110m.m()) {
                c.this.K = this.f1110m;
            }
            c.this.M = null;
        }
    }

    private class d extends r implements ActionMenuView.a {

        class a extends l0 {

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ c f1113v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1113v = cVar;
            }

            @Override // androidx.appcompat.widget.l0
            public androidx.appcompat.view.menu.p b() {
                e eVar = c.this.K;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.l0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.l0
            public boolean d() {
                c cVar = c.this;
                if (cVar.M != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, f.a.f23295h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            d1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, f.a.f23296i);
            h(8388613);
            j(c.this.O);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f770o != null) {
                ((androidx.appcompat.view.menu.b) c.this).f770o.close();
            }
            c.this.K = null;
            super.e();
        }
    }

    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.a(gVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f770o) {
                return false;
            }
            c.this.P = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.b(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, f.g.f23390c, f.g.f23389b);
        this.J = new SparseBooleanArray();
        this.O = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f776u;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1104w;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1106y) {
            return this.f1105x;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0011c runnableC0011c = this.M;
        if (runnableC0011c != null && (obj = this.f776u) != null) {
            ((View) obj).removeCallbacks(runnableC0011c);
            this.M = null;
            return true;
        }
        e eVar = this.K;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.L;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.M != null || E();
    }

    public boolean E() {
        e eVar = this.K;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.E) {
            this.D = androidx.appcompat.view.a.b(this.f769n).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f770o;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.H = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f776u = actionMenuView;
        actionMenuView.b(this.f770o);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1104w;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1106y = true;
            this.f1105x = drawable;
        }
    }

    public void J(boolean z10) {
        this.f1107z = z10;
        this.A = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f1107z || E() || (gVar = this.f770o) == null || this.f776u == null || this.M != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0011c runnableC0011c = new RunnableC0011c(new e(this.f769n, this.f770o, this.f1104w, true));
        this.M = runnableC0011c;
        ((View) this.f776u).post(runnableC0011c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        y();
        super.a(gVar, z10);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void c(Context context, androidx.appcompat.view.menu.g gVar) {
        super.c(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.A) {
            this.f1107z = aVarB.f();
        }
        if (!this.G) {
            this.B = aVarB.c();
        }
        if (!this.E) {
            this.D = aVarB.d();
        }
        int measuredWidth = this.B;
        if (this.f1107z) {
            if (this.f1104w == null) {
                d dVar = new d(this.f768m);
                this.f1104w = dVar;
                if (this.f1106y) {
                    dVar.setImageDrawable(this.f1105x);
                    this.f1105x = null;
                    this.f1106y = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1104w.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1104w.getMeasuredWidth();
        } else {
            this.f1104w = null;
        }
        this.C = measuredWidth;
        this.I = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean d(androidx.appcompat.view.menu.r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f770o) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View viewZ = z(rVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.P = rVar.getItem().getItemId();
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f769n, rVar, viewZ);
        this.L = aVar;
        aVar.g(z10);
        this.L.k();
        super.d(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        super.e(z10);
        ((View) this.f776u).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f770o;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b bVarB = ((androidx.appcompat.view.menu.i) arrayListS.get(i10)).b();
                if (bVarB != null) {
                    bVarB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f770o;
        ArrayList arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.f1107z && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.i) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1104w;
        if (z11) {
            if (dVar == null) {
                this.f1104w = new d(this.f768m);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1104w.getParent();
            if (viewGroup != this.f776u) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1104w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f776u;
                actionMenuView.addView(this.f1104w, actionMenuView.F());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f776u;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1104w);
            }
        }
        ((ActionMenuView) this.f776u).setOverflowReserved(this.f1107z);
    }

    @Override // androidx.appcompat.view.menu.b
    public void f(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.f(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f776u);
        if (this.N == null) {
            this.N = new b();
        }
        actionMenuItemView.setPopupCallback(this.N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        ArrayList arrayListE;
        int size;
        int i10;
        int iL;
        boolean z10;
        int i11;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f770o;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i12 = cVar.D;
        int i13 = cVar.C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f776u;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayListE.get(i16);
            if (iVar.o()) {
                i14++;
            } else if (iVar.n()) {
                i15++;
            } else {
                z11 = true;
            }
            if (cVar.H && iVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (cVar.f1107z && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = cVar.J;
        sparseBooleanArray.clear();
        if (cVar.F) {
            int i18 = cVar.I;
            iL = i13 / i18;
            i10 = i18 + ((i13 % i18) / iL);
        } else {
            i10 = 0;
            iL = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) arrayListE.get(i19);
            if (iVar2.o()) {
                View viewN = cVar.n(iVar2, view, viewGroup);
                if (cVar.F) {
                    iL -= ActionMenuView.L(viewN, i10, iL, iMakeMeasureSpec, r32);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                z10 = r32;
                i11 = size;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!cVar.F || iL > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View viewN2 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.F) {
                        int iL2 = ActionMenuView.L(viewN2, i10, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z14 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 = z15 & (!cVar.F ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.i iVar3 = (androidx.appcompat.view.menu.i) arrayListE.get(i21);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i17++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                iVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i11 = size;
                iVar2.u(z10);
            }
            i19++;
            r32 = z10;
            size = i11;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1104w) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f776u;
        androidx.appcompat.view.menu.n nVarO = super.o(viewGroup);
        if (nVar != nVarO) {
            ((ActionMenuView) nVarO).setPresenter(this);
        }
        return nVarO;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i10, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
