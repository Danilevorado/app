package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jk4 extends lk4 implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    private final int f10547q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f10548r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f10549s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f10550t;

    /* renamed from: u, reason: collision with root package name */
    private final int f10551u;

    /* renamed from: v, reason: collision with root package name */
    private final int f10552v;

    /* renamed from: w, reason: collision with root package name */
    private final int f10553w;

    /* renamed from: x, reason: collision with root package name */
    private final int f10554x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f10555y;

    public jk4(int i10, j31 j31Var, int i11, ek4 ek4Var, int i12, String str) {
        int iJ;
        super(i10, j31Var, i11);
        int i13 = 0;
        this.f10548r = pk4.r(i12, false);
        int i14 = this.f11651p.f10890d;
        int i15 = ek4Var.f12505u;
        this.f10549s = 1 == (i14 & 1);
        this.f10550t = (i14 & 2) != 0;
        c63 c63VarV = ek4Var.f12503s.isEmpty() ? c63.v("") : ek4Var.f12503s;
        int i16 = 0;
        while (true) {
            if (i16 >= c63VarV.size()) {
                i16 = Integer.MAX_VALUE;
                iJ = 0;
                break;
            } else {
                iJ = pk4.j(this.f11651p, (String) c63VarV.get(i16), false);
                if (iJ > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f10551u = i16;
        this.f10552v = iJ;
        int i17 = this.f11651p.f10891e;
        int iBitCount = Integer.bitCount(0);
        this.f10553w = iBitCount;
        int i18 = this.f11651p.f10891e;
        this.f10555y = false;
        int iJ2 = pk4.j(this.f11651p, str, pk4.n(str) == null);
        this.f10554x = iJ2;
        boolean z10 = iJ > 0 || (ek4Var.f12503s.isEmpty() && iBitCount > 0) || this.f10549s || (this.f10550t && iJ2 > 0);
        if (pk4.r(i12, ek4Var.f7885n0) && z10) {
            i13 = 1;
        }
        this.f10547q = i13;
    }

    @Override // com.google.android.gms.internal.ads.lk4
    public final int b() {
        return this.f10547q;
    }

    @Override // com.google.android.gms.internal.ads.lk4
    public final /* bridge */ /* synthetic */ boolean d(lk4 lk4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jk4 jk4Var) {
        q53 q53VarB = q53.i().d(this.f10548r, jk4Var.f10548r).c(Integer.valueOf(this.f10551u), Integer.valueOf(jk4Var.f10551u), k73.c().a()).b(this.f10552v, jk4Var.f10552v).b(this.f10553w, jk4Var.f10553w).d(this.f10549s, jk4Var.f10549s).c(Boolean.valueOf(this.f10550t), Boolean.valueOf(jk4Var.f10550t), this.f10552v == 0 ? k73.c() : k73.c().a()).b(this.f10554x, jk4Var.f10554x);
        if (this.f10553w == 0) {
            q53VarB = q53VarB.e(false, false);
        }
        return q53VarB.a();
    }
}
