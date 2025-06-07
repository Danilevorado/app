package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0053b f3449a;

    /* renamed from: b, reason: collision with root package name */
    final a f3450b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f3451c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f3452a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f3453b;

        a() {
        }

        private void c() {
            if (this.f3453b == null) {
                this.f3453b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f3452a &= ~(1 << i10);
                return;
            }
            a aVar = this.f3453b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f3453b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f3452a) : Long.bitCount(this.f3452a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f3452a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3452a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3452a & (1 << i10)) != 0;
            }
            c();
            return this.f3453b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3453b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3452a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3452a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3453b != null) {
                c();
                this.f3453b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3453b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3452a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3452a = j12;
            long j13 = j10 - 1;
            this.f3452a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3453b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3453b.f(0);
            }
            return z10;
        }

        void g() {
            this.f3452a = 0L;
            a aVar = this.f3453b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f3452a |= 1 << i10;
            } else {
                c();
                this.f3453b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f3453b == null) {
                return Long.toBinaryString(this.f3452a);
            }
            return this.f3453b.toString() + "xx" + Long.toBinaryString(this.f3452a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0053b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        RecyclerView.d0 c(View view);

        void d(int i10);

        void e(View view);

        int f();

        void g(int i10);

        void h();

        void i(View view, int i10, ViewGroup.LayoutParams layoutParams);

        int j(View view);
    }

    b(InterfaceC0053b interfaceC0053b) {
        this.f3449a = interfaceC0053b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iF = this.f3449a.f();
        int i11 = i10;
        while (i11 < iF) {
            int iB = i10 - (i11 - this.f3450b.b(i11));
            if (iB == 0) {
                while (this.f3450b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f3451c.add(view);
        this.f3449a.b(view);
    }

    private boolean t(View view) {
        if (!this.f3451c.remove(view)) {
            return false;
        }
        this.f3449a.e(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iF = i10 < 0 ? this.f3449a.f() : h(i10);
        this.f3450b.e(iF, z10);
        if (z10) {
            l(view);
        }
        this.f3449a.addView(view, iF);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iF = i10 < 0 ? this.f3449a.f() : h(i10);
        this.f3450b.e(iF, z10);
        if (z10) {
            l(view);
        }
        this.f3449a.i(view, iF, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f3450b.f(iH);
        this.f3449a.d(iH);
    }

    View e(int i10) {
        int size = this.f3451c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f3451c.get(i11);
            RecyclerView.d0 d0VarC = this.f3449a.c(view);
            if (d0VarC.m() == i10 && !d0VarC.t() && !d0VarC.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f3449a.a(h(i10));
    }

    int g() {
        return this.f3449a.f() - this.f3451c.size();
    }

    View i(int i10) {
        return this.f3449a.a(i10);
    }

    int j() {
        return this.f3449a.f();
    }

    void k(View view) {
        int iJ = this.f3449a.j(view);
        if (iJ >= 0) {
            this.f3450b.h(iJ);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iJ = this.f3449a.j(view);
        if (iJ == -1 || this.f3450b.d(iJ)) {
            return -1;
        }
        return iJ - this.f3450b.b(iJ);
    }

    boolean n(View view) {
        return this.f3451c.contains(view);
    }

    void o() {
        this.f3450b.g();
        for (int size = this.f3451c.size() - 1; size >= 0; size--) {
            this.f3449a.e((View) this.f3451c.get(size));
            this.f3451c.remove(size);
        }
        this.f3449a.h();
    }

    void p(View view) {
        int iJ = this.f3449a.j(view);
        if (iJ < 0) {
            return;
        }
        if (this.f3450b.f(iJ)) {
            t(view);
        }
        this.f3449a.g(iJ);
    }

    void q(int i10) {
        int iH = h(i10);
        View viewA = this.f3449a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f3450b.f(iH)) {
            t(viewA);
        }
        this.f3449a.g(iH);
    }

    boolean r(View view) {
        int iJ = this.f3449a.j(view);
        if (iJ == -1) {
            t(view);
            return true;
        }
        if (!this.f3450b.d(iJ)) {
            return false;
        }
        this.f3450b.f(iJ);
        t(view);
        this.f3449a.g(iJ);
        return true;
    }

    void s(View view) {
        int iJ = this.f3449a.j(view);
        if (iJ < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3450b.d(iJ)) {
            this.f3450b.a(iJ);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3450b.toString() + ", hidden list:" + this.f3451c.size();
    }
}
