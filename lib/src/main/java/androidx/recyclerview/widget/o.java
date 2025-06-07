package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    final b f3585a;

    /* renamed from: b, reason: collision with root package name */
    a f3586b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f3587a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f3588b;

        /* renamed from: c, reason: collision with root package name */
        int f3589c;

        /* renamed from: d, reason: collision with root package name */
        int f3590d;

        /* renamed from: e, reason: collision with root package name */
        int f3591e;

        a() {
        }

        void a(int i10) {
            this.f3587a = i10 | this.f3587a;
        }

        boolean b() {
            int i10 = this.f3587a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f3590d, this.f3588b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f3587a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3590d, this.f3589c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3587a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3591e, this.f3588b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3587a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3591e, this.f3589c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f3587a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f3588b = i10;
            this.f3589c = i11;
            this.f3590d = i12;
            this.f3591e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    o(b bVar) {
        this.f3585a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iD = this.f3585a.d();
        int iB = this.f3585a.b();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f3585a.a(i10);
            this.f3586b.e(iD, iB, this.f3585a.c(viewA), this.f3585a.e(viewA));
            if (i12 != 0) {
                this.f3586b.d();
                this.f3586b.a(i12);
                if (this.f3586b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f3586b.d();
                this.f3586b.a(i13);
                if (this.f3586b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f3586b.e(this.f3585a.d(), this.f3585a.b(), this.f3585a.c(view), this.f3585a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f3586b.d();
        this.f3586b.a(i10);
        return this.f3586b.b();
    }
}
