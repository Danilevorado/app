package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h<S> extends p {

    /* renamed from: o0, reason: collision with root package name */
    private int f20922o0;

    /* renamed from: p0, reason: collision with root package name */
    private com.google.android.material.datepicker.d f20923p0;

    /* renamed from: q0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f20924q0;

    /* renamed from: r0, reason: collision with root package name */
    private com.google.android.material.datepicker.l f20925r0;

    /* renamed from: s0, reason: collision with root package name */
    private k f20926s0;

    /* renamed from: t0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f20927t0;

    /* renamed from: u0, reason: collision with root package name */
    private RecyclerView f20928u0;

    /* renamed from: v0, reason: collision with root package name */
    private RecyclerView f20929v0;

    /* renamed from: w0, reason: collision with root package name */
    private View f20930w0;

    /* renamed from: x0, reason: collision with root package name */
    private View f20931x0;

    /* renamed from: y0, reason: collision with root package name */
    static final Object f20920y0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: z0, reason: collision with root package name */
    static final Object f20921z0 = "NAVIGATION_PREV_TAG";
    static final Object A0 = "NAVIGATION_NEXT_TAG";
    static final Object B0 = "SELECTOR_TOGGLE_TAG";

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f20932m;

        a(int i10) {
            this.f20932m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f20929v0.p1(this.f20932m);
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.Z(null);
        }
    }

    class c extends q {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.f20929v0.getWidth();
                iArr[1] = h.this.f20929v0.getWidth();
            } else {
                iArr[0] = h.this.f20929v0.getHeight();
                iArr[1] = h.this.f20929v0.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j10) {
            if (h.this.f20924q0.f().n(j10)) {
                h.this.f20923p0.t(j10);
                Iterator it = h.this.f20986n0.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(h.this.f20923p0.s());
                }
                h.this.f20929v0.getAdapter().l();
                if (h.this.f20928u0 != null) {
                    h.this.f20928u0.getAdapter().l();
                }
            }
        }
    }

    class e extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f20936a = s.k();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f20937b = s.k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.d dVar : h.this.f20923p0.l()) {
                    Object obj = dVar.f2363a;
                    if (obj != null && dVar.f2364b != null) {
                        this.f20936a.setTimeInMillis(((Long) obj).longValue());
                        this.f20937b.setTimeInMillis(((Long) dVar.f2364b).longValue());
                        int iC = tVar.C(this.f20936a.get(1));
                        int iC2 = tVar.C(this.f20937b.get(1));
                        View viewC = gridLayoutManager.C(iC);
                        View viewC2 = gridLayoutManager.C(iC2);
                        int iX2 = iC / gridLayoutManager.X2();
                        int iX22 = iC2 / gridLayoutManager.X2();
                        int i10 = iX2;
                        while (i10 <= iX22) {
                            if (gridLayoutManager.C(gridLayoutManager.X2() * i10) != null) {
                                canvas.drawRect(i10 == iX2 ? viewC.getLeft() + (viewC.getWidth() / 2) : 0, r9.getTop() + h.this.f20927t0.f20910d.c(), i10 == iX22 ? viewC2.getLeft() + (viewC2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - h.this.f20927t0.f20910d.b(), h.this.f20927t0.f20914h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            h hVar;
            int i10;
            super.g(view, dVar);
            if (h.this.f20931x0.getVisibility() == 0) {
                hVar = h.this;
                i10 = c5.i.f4798o;
            } else {
                hVar = h.this;
                i10 = c5.i.f4796m;
            }
            dVar.h0(hVar.V(i10));
        }
    }

    class g extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f20940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f20941b;

        g(n nVar, MaterialButton materialButton) {
            this.f20940a = nVar;
            this.f20941b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f20941b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager linearLayoutManagerC2 = h.this.c2();
            int iZ1 = i10 < 0 ? linearLayoutManagerC2.Z1() : linearLayoutManagerC2.c2();
            h.this.f20925r0 = this.f20940a.B(iZ1);
            this.f20941b.setText(this.f20940a.C(iZ1));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h, reason: collision with other inner class name */
    class ViewOnClickListenerC0099h implements View.OnClickListener {
        ViewOnClickListenerC0099h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.h2();
        }
    }

    class i implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ n f20944m;

        i(n nVar) {
            this.f20944m = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iZ1 = h.this.c2().Z1() + 1;
            if (iZ1 < h.this.f20929v0.getAdapter().c()) {
                h.this.f2(this.f20944m.B(iZ1));
            }
        }
    }

    class j implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ n f20946m;

        j(n nVar) {
            this.f20946m = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC2 = h.this.c2().c2() - 1;
            if (iC2 >= 0) {
                h.this.f2(this.f20946m.B(iC2));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j10);
    }

    private void U1(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(c5.f.f4754q);
        materialButton.setTag(B0);
        w.o0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(c5.f.f4756s);
        materialButton2.setTag(f20921z0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(c5.f.f4755r);
        materialButton3.setTag(A0);
        this.f20930w0 = view.findViewById(c5.f.f4763z);
        this.f20931x0 = view.findViewById(c5.f.f4758u);
        g2(k.DAY);
        materialButton.setText(this.f20925r0.x());
        this.f20929v0.k(new g(nVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0099h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n V1() {
        return new e();
    }

    static int a2(Context context) {
        return context.getResources().getDimensionPixelSize(c5.d.f4729y);
    }

    private static int b2(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(c5.d.F) + resources.getDimensionPixelOffset(c5.d.G) + resources.getDimensionPixelOffset(c5.d.E);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c5.d.A);
        int i10 = m.f20972r;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(c5.d.f4729y) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(c5.d.D)) + resources.getDimensionPixelOffset(c5.d.f4727w);
    }

    public static h d2(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.j());
        hVar.B1(bundle);
        return hVar;
    }

    private void e2(int i10) {
        this.f20929v0.post(new a(i10));
    }

    @Override // com.google.android.material.datepicker.p
    public boolean L1(o oVar) {
        return super.L1(oVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f20922o0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f20923p0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20924q0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f20925r0);
    }

    com.google.android.material.datepicker.a W1() {
        return this.f20924q0;
    }

    com.google.android.material.datepicker.c X1() {
        return this.f20927t0;
    }

    com.google.android.material.datepicker.l Y1() {
        return this.f20925r0;
    }

    public com.google.android.material.datepicker.d Z1() {
        return this.f20923p0;
    }

    LinearLayoutManager c2() {
        return (LinearLayoutManager) this.f20929v0.getLayoutManager();
    }

    void f2(com.google.android.material.datepicker.l lVar) {
        RecyclerView recyclerView;
        int i10;
        n nVar = (n) this.f20929v0.getAdapter();
        int iD = nVar.D(lVar);
        int iD2 = iD - nVar.D(this.f20925r0);
        boolean z10 = Math.abs(iD2) > 3;
        boolean z11 = iD2 > 0;
        this.f20925r0 = lVar;
        if (!z10 || !z11) {
            if (z10) {
                recyclerView = this.f20929v0;
                i10 = iD + 3;
            }
            e2(iD);
        }
        recyclerView = this.f20929v0;
        i10 = iD - 3;
        recyclerView.h1(i10);
        e2(iD);
    }

    void g2(k kVar) {
        this.f20926s0 = kVar;
        if (kVar == k.YEAR) {
            this.f20928u0.getLayoutManager().x1(((t) this.f20928u0.getAdapter()).C(this.f20925r0.f20967o));
            this.f20930w0.setVisibility(0);
            this.f20931x0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f20930w0.setVisibility(8);
            this.f20931x0.setVisibility(0);
            f2(this.f20925r0);
        }
    }

    void h2() {
        k kVar = this.f20926s0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            g2(k.DAY);
        } else if (kVar == k.DAY) {
            g2(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t0(Bundle bundle) {
        super.t0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f20922o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f20923p0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f20924q0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f20925r0 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(v(), this.f20922o0);
        this.f20927t0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l lVarM = this.f20924q0.m();
        if (com.google.android.material.datepicker.i.r2(contextThemeWrapper)) {
            i10 = c5.h.f4780o;
            i11 = 1;
        } else {
            i10 = c5.h.f4778m;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(b2(t1()));
        GridView gridView = (GridView) viewInflate.findViewById(c5.f.f4759v);
        w.o0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(lVarM.f20968p);
        gridView.setEnabled(false);
        this.f20929v0 = (RecyclerView) viewInflate.findViewById(c5.f.f4762y);
        this.f20929v0.setLayoutManager(new c(v(), i11, false, i11));
        this.f20929v0.setTag(f20920y0);
        n nVar = new n(contextThemeWrapper, this.f20923p0, this.f20924q0, new d());
        this.f20929v0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(c5.g.f4765b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(c5.f.f4763z);
        this.f20928u0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f20928u0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f20928u0.setAdapter(new t(this));
            this.f20928u0.h(V1());
        }
        if (viewInflate.findViewById(c5.f.f4754q) != null) {
            U1(viewInflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.r2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f20929v0);
        }
        this.f20929v0.h1(nVar.D(this.f20925r0));
        return viewInflate;
    }
}
