package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f3569a;

    /* renamed from: b, reason: collision with root package name */
    private int f3570b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f3571c;

    static class a extends i {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3569a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3569a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3569a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3569a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3569a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3569a.o0() - this.f3569a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3569a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3569a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3569a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3569a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3569a.o0() - this.f3569a.e0()) - this.f3569a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3569a.n0(view, true, this.f3571c);
            return this.f3571c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3569a.n0(view, true, this.f3571c);
            return this.f3571c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f3569a.C0(i10);
        }
    }

    static class b extends i {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3569a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3569a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3569a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3569a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3569a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3569a.W() - this.f3569a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3569a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3569a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3569a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3569a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3569a.W() - this.f3569a.g0()) - this.f3569a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3569a.n0(view, true, this.f3571c);
            return this.f3571c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3569a.n0(view, true, this.f3571c);
            return this.f3571c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f3569a.D0(i10);
        }
    }

    private i(RecyclerView.o oVar) {
        this.f3570b = Integer.MIN_VALUE;
        this.f3571c = new Rect();
        this.f3569a = oVar;
    }

    /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i10) {
        if (i10 == 0) {
            return a(oVar);
        }
        if (i10 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f3570b) {
            return 0;
        }
        return n() - this.f3570b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f3570b = n();
    }
}
