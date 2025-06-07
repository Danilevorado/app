package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        int f3198e;

        /* renamed from: f, reason: collision with root package name */
        int f3199f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f3198e = -1;
            this.f3199f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3198e = -1;
            this.f3199f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3198e = -1;
            this.f3199f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3198e = -1;
            this.f3199f = 0;
        }

        public int e() {
            return this.f3198e;
        }

        public int f() {
            return this.f3199f;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f3200a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f3201b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f3202c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3203d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f3203d) {
                return d(i10, i11);
            }
            int i12 = this.f3201b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f3201b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f3202c) {
                return e(i10, i11);
            }
            int i12 = this.f3200a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f3200a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f3203d || (iA = a(this.f3201b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f3201b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f3201b.clear();
        }

        public void h() {
            this.f3200a.clear();
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        e3(RecyclerView.o.i0(context, attributeSet, i10, i11).f3359b);
    }

    private void N2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i12 = 1;
            i14 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
        }
        while (i11 != i14) {
            View view = this.L[i11];
            b bVar = (b) view.getLayoutParams();
            int iA3 = a3(vVar, a0Var, h0(view));
            bVar.f3199f = iA3;
            bVar.f3198e = i13;
            i13 += iA3;
            i11 += i12;
        }
    }

    private void O2() {
        int iJ = J();
        for (int i10 = 0; i10 < iJ; i10++) {
            b bVar = (b) I(i10).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    private void P2(int i10) {
        this.K = Q2(this.K, this.J, i10);
    }

    static int[] Q2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void R2() {
        this.M.clear();
        this.N.clear();
    }

    private int S2(RecyclerView.a0 a0Var) {
        if (J() != 0 && a0Var.b() != 0) {
            T1();
            boolean zR2 = r2();
            View viewY1 = Y1(!zR2, true);
            View viewX1 = X1(!zR2, true);
            if (viewY1 != null && viewX1 != null) {
                int iB = this.O.b(h0(viewY1), this.J);
                int iB2 = this.O.b(h0(viewX1), this.J);
                int iMax = this.f3209x ? Math.max(0, ((this.O.b(a0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.f3206u.d(viewX1) - this.f3206u.g(viewY1)) / ((this.O.b(h0(viewX1), this.J) - this.O.b(h0(viewY1), this.J)) + 1))) + (this.f3206u.m() - this.f3206u.g(viewY1)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.a0 a0Var) {
        if (J() != 0 && a0Var.b() != 0) {
            T1();
            View viewY1 = Y1(!r2(), true);
            View viewX1 = X1(!r2(), true);
            if (viewY1 != null && viewX1 != null) {
                if (!r2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int iD = this.f3206u.d(viewX1) - this.f3206u.g(viewY1);
                int iB = this.O.b(h0(viewY1), this.J);
                return (int) ((iD / ((this.O.b(h0(viewX1), this.J) - iB) + 1)) * (this.O.b(a0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iZ2 = Z2(vVar, a0Var, aVar.f3213b);
        if (z10) {
            while (iZ2 > 0) {
                int i11 = aVar.f3213b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f3213b = i12;
                iZ2 = Z2(vVar, a0Var, i12);
            }
            return;
        }
        int iB = a0Var.b() - 1;
        int i13 = aVar.f3213b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iZ22 = Z2(vVar, a0Var, i14);
            if (iZ22 <= iZ2) {
                break;
            }
            i13 = i14;
            iZ2 = iZ22;
        }
        aVar.f3213b = i13;
    }

    private void V2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int Y2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int iF = vVar.f(i10);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int Z2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = vVar.f(i10);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = vVar.f(i10);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void b3(float f5, int i10) {
        P2(Math.max(Math.round(f5 * this.J), i10));
    }

    private void c3(View view, int i10, boolean z10) {
        int iK;
        int iK2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3363b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f3198e, bVar.f3199f);
        if (this.f3204s == 1) {
            iK2 = RecyclerView.o.K(iW2, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iK = RecyclerView.o.K(this.f3206u.n(), X(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iK3 = RecyclerView.o.K(iW2, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iK4 = RecyclerView.o.K(this.f3206u.n(), p0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iK = iK3;
            iK2 = iK4;
        }
        d3(view, iK2, iK, z10);
    }

    private void d3(View view, int i10, int i11, boolean z10) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z10 ? H1(view, i10, i11, pVar) : F1(view, i10, i11, pVar)) {
            view.measure(i10, i11);
        }
    }

    private void f3() {
        int iW;
        int iG0;
        if (p2() == 1) {
            iW = o0() - f0();
            iG0 = e0();
        } else {
            iW = W() - d0();
            iG0 = g0();
        }
        P2(iW - iG0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i10, int i11) {
        int iN;
        int iN2;
        if (this.K == null) {
            super.C1(rect, i10, i11);
        }
        int iE0 = e0() + f0();
        int iG0 = g0() + d0();
        if (this.f3204s == 1) {
            iN2 = RecyclerView.o.n(i11, rect.height() + iG0, b0());
            int[] iArr = this.K;
            iN = RecyclerView.o.n(i10, iArr[iArr.length - 1] + iE0, c0());
        } else {
            iN = RecyclerView.o.n(i10, rect.width() + iE0, c0());
            int[] iArr2 = this.K;
            iN2 = RecyclerView.o.n(i11, iArr2[iArr2.length - 1] + iG0, b0());
        }
        B1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f3204s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3204s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Y2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void N1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iF = this.J;
        for (int i10 = 0; i10 < this.J && cVar.c(a0Var) && iF > 0; i10++) {
            int i11 = cVar.f3224d;
            cVar2.a(i11, Math.max(0, cVar.f3227g));
            iF -= this.O.f(i11);
            cVar.f3224d += cVar.f3225e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.d dVar) {
        int iF;
        int iE;
        int iF2;
        boolean z10;
        boolean z11;
        int iE2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iY2 = Y2(vVar, a0Var, bVar.a());
        if (this.f3204s == 0) {
            iE2 = bVar.e();
            iF = bVar.f();
            iF2 = 1;
            z10 = false;
            z11 = false;
            iE = iY2;
        } else {
            iF = 1;
            iE = bVar.e();
            iF2 = bVar.f();
            z10 = false;
            z11 = false;
            iE2 = iY2;
        }
        dVar.a0(d.c.a(iE2, iF, iE, iF2, z10, z11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    int W2(int i10, int i11) {
        if (this.f3204s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            O2();
        }
        super.X0(vVar, a0Var);
        R2();
    }

    public int X2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.I = false;
    }

    public void e3(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            t1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11, int i12) {
        T1();
        int iM = this.f3206u.m();
        int i13 = this.f3206u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewI = I(i10);
            int iH0 = h0(viewI);
            if (iH0 >= 0 && iH0 < i12 && Z2(vVar, a0Var, iH0) == 0) {
                if (((RecyclerView.p) viewI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewI;
                    }
                } else {
                    if (this.f3206u.g(viewI) < i13 && this.f3206u.d(viewI) >= iM) {
                        return viewI;
                    }
                    if (view == null) {
                        view = viewI;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3204s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Y2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return this.Q ? S2(a0Var) : super.r(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return this.Q ? T2(a0Var) : super.s(a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0218  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void s2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.s2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return this.Q ? S2(a0Var) : super.u(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        super.u2(vVar, a0Var, aVar, i10);
        f3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            U2(vVar, a0Var, aVar, i10);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return this.Q ? T2(a0Var) : super.v(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        f3();
        V2();
        return super.w1(i10, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        f3();
        V2();
        return super.y1(i10, vVar, a0Var);
    }
}
