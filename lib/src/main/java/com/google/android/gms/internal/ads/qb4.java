package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qb4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14224a;

    /* renamed from: b, reason: collision with root package name */
    private int f14225b;

    /* renamed from: c, reason: collision with root package name */
    private long f14226c;

    /* renamed from: d, reason: collision with root package name */
    private hh4 f14227d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14228e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14229f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ rb4 f14230g;

    public qb4(rb4 rb4Var, String str, int i10, hh4 hh4Var) {
        this.f14230g = rb4Var;
        this.f14224a = str;
        this.f14225b = i10;
        this.f14226c = hh4Var == null ? -1L : hh4Var.f10404d;
        if (hh4Var == null || !hh4Var.b()) {
            return;
        }
        this.f14227d = hh4Var;
    }

    public final void g(int i10, hh4 hh4Var) {
        if (this.f14226c == -1 && i10 == this.f14225b && hh4Var != null) {
            this.f14226c = hh4Var.f10404d;
        }
    }

    public final boolean j(int i10, hh4 hh4Var) {
        if (hh4Var == null) {
            return i10 == this.f14225b;
        }
        hh4 hh4Var2 = this.f14227d;
        return hh4Var2 == null ? !hh4Var.b() && hh4Var.f10404d == this.f14226c : hh4Var.f10404d == hh4Var2.f10404d && hh4Var.f10402b == hh4Var2.f10402b && hh4Var.f10403c == hh4Var2.f10403c;
    }

    public final boolean k(j94 j94Var) {
        hh4 hh4Var = j94Var.f10389d;
        if (hh4Var == null) {
            return this.f14225b != j94Var.f10388c;
        }
        long j10 = this.f14226c;
        if (j10 == -1) {
            return false;
        }
        if (hh4Var.f10404d > j10) {
            return true;
        }
        if (this.f14227d == null) {
            return false;
        }
        int iA = j94Var.f10387b.a(hh4Var.f10401a);
        int iA2 = j94Var.f10387b.a(this.f14227d.f10401a);
        hh4 hh4Var2 = j94Var.f10389d;
        if (hh4Var2.f10404d < this.f14227d.f10404d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        boolean zB = hh4Var2.b();
        hh4 hh4Var3 = j94Var.f10389d;
        if (!zB) {
            int i10 = hh4Var3.f10405e;
            return i10 == -1 || i10 > this.f14227d.f10402b;
        }
        int i11 = hh4Var3.f10402b;
        int i12 = hh4Var3.f10403c;
        hh4 hh4Var4 = this.f14227d;
        int i13 = hh4Var4.f10402b;
        if (i11 <= i13) {
            return i11 == i13 && i12 > hh4Var4.f10403c;
        }
        return true;
    }

    public final boolean l(h11 h11Var, h11 h11Var2) {
        int i10 = this.f14225b;
        if (i10 < h11Var.c()) {
            h11Var.e(i10, this.f14230g.f14731a, 0L);
            for (int i11 = this.f14230g.f14731a.f8542m; i11 <= this.f14230g.f14731a.f8543n; i11++) {
                int iA = h11Var2.a(h11Var.f(i11));
                if (iA != -1) {
                    i10 = h11Var2.d(iA, this.f14230g.f14732b, false).f8041c;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= h11Var2.c()) {
            i10 = -1;
        }
        this.f14225b = i10;
        if (i10 == -1) {
            return false;
        }
        hh4 hh4Var = this.f14227d;
        return hh4Var == null || h11Var2.a(hh4Var.f10401a) != -1;
    }
}
