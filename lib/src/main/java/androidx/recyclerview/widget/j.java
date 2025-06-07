package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j extends n {

    /* renamed from: d, reason: collision with root package name */
    private i f3572d;

    /* renamed from: e, reason: collision with root package name */
    private i f3573e;

    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.f3580a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f3561j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View m(RecyclerView.o oVar, i iVar) {
        int iJ = oVar.J();
        View view = null;
        if (iJ == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iJ; i11++) {
            View viewI = oVar.I(i11);
            int iAbs = Math.abs((iVar.g(viewI) + (iVar.e(viewI) / 2)) - iM);
            if (iAbs < i10) {
                view = viewI;
                i10 = iAbs;
            }
        }
        return view;
    }

    private i n(RecyclerView.o oVar) {
        i iVar = this.f3573e;
        if (iVar == null || iVar.f3569a != oVar) {
            this.f3573e = i.a(oVar);
        }
        return this.f3573e;
    }

    private i o(RecyclerView.o oVar) {
        if (oVar.l()) {
            return p(oVar);
        }
        if (oVar.k()) {
            return n(oVar);
        }
        return null;
    }

    private i p(RecyclerView.o oVar) {
        i iVar = this.f3572d;
        if (iVar == null || iVar.f3569a != oVar) {
            this.f3572d = i.c(oVar);
        }
        return this.f3572d;
    }

    private boolean q(RecyclerView.o oVar, int i10, int i11) {
        return oVar.k() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean r(RecyclerView.o oVar) {
        PointF pointFA;
        int iY = oVar.Y();
        if (!(oVar instanceof RecyclerView.z.b) || (pointFA = ((RecyclerView.z.b) oVar).a(iY - 1)) == null) {
            return false;
        }
        return pointFA.x < 0.0f || pointFA.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.k()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected g e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new a(this.f3580a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View g(RecyclerView.o oVar) {
        i iVarN;
        if (oVar.l()) {
            iVarN = p(oVar);
        } else {
            if (!oVar.k()) {
                return null;
            }
            iVarN = n(oVar);
        }
        return m(oVar, iVarN);
    }

    @Override // androidx.recyclerview.widget.n
    public int h(RecyclerView.o oVar, int i10, int i11) {
        i iVarO;
        int iY = oVar.Y();
        if (iY == 0 || (iVarO = o(oVar)) == null) {
            return -1;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int iJ = oVar.J();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = oVar.I(i14);
            if (viewI != null) {
                int iL = l(oVar, viewI, iVarO);
                if (iL <= 0 && iL > i12) {
                    view2 = viewI;
                    i12 = iL;
                }
                if (iL >= 0 && iL < i13) {
                    view = viewI;
                    i13 = iL;
                }
            }
        }
        boolean zQ = q(oVar, i10, i11);
        if (zQ && view != null) {
            return oVar.h0(view);
        }
        if (!zQ && view2 != null) {
            return oVar.h0(view2);
        }
        if (zQ) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iH0 = oVar.h0(view) + (r(oVar) == zQ ? -1 : 1);
        if (iH0 < 0 || iH0 >= iY) {
            return -1;
        }
        return iH0;
    }
}
