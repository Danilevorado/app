package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class n extends RecyclerView.r {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f3580a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f3581b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.t f3582c = new a();

    class a extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        boolean f3583a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3583a) {
                this.f3583a = false;
                n.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f3583a = true;
        }
    }

    private void f() {
        this.f3580a.Y0(this.f3582c);
        this.f3580a.setOnFlingListener(null);
    }

    private void i() {
        if (this.f3580a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3580a.k(this.f3582c);
        this.f3580a.setOnFlingListener(this);
    }

    private boolean j(RecyclerView.o oVar, int i10, int i11) {
        RecyclerView.z zVarD;
        int iH;
        if (!(oVar instanceof RecyclerView.z.b) || (zVarD = d(oVar)) == null || (iH = h(oVar, i10, i11)) == -1) {
            return false;
        }
        zVarD.p(iH);
        oVar.J1(zVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i10, int i11) {
        RecyclerView.o layoutManager = this.f3580a.getLayoutManager();
        if (layoutManager == null || this.f3580a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3580a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && j(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3580a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f3580a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f3581b = new Scroller(this.f3580a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.z d(RecyclerView.o oVar) {
        return e(oVar);
    }

    protected abstract g e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i10, int i11);

    void k() {
        RecyclerView.o layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f3580a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        if (iArrC[0] == 0 && iArrC[1] == 0) {
            return;
        }
        this.f3580a.l1(iArrC[0], iArrC[1]);
    }
}
