package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class xj4 extends lk4 implements Comparable {
    private final int A;
    private final boolean B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final boolean G;
    private final boolean H;

    /* renamed from: q, reason: collision with root package name */
    private final int f17596q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f17597r;

    /* renamed from: s, reason: collision with root package name */
    private final String f17598s;

    /* renamed from: t, reason: collision with root package name */
    private final ek4 f17599t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f17600u;

    /* renamed from: v, reason: collision with root package name */
    private final int f17601v;

    /* renamed from: w, reason: collision with root package name */
    private final int f17602w;

    /* renamed from: x, reason: collision with root package name */
    private final int f17603x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f17604y;

    /* renamed from: z, reason: collision with root package name */
    private final int f17605z;

    public xj4(int i10, j31 j31Var, int i11, ek4 ek4Var, int i12, boolean z10, j33 j33Var) {
        int i13;
        int iJ;
        int iJ2;
        boolean z11;
        super(i10, j31Var, i11);
        this.f17599t = ek4Var;
        this.f17598s = pk4.n(this.f11651p.f10889c);
        int i14 = 0;
        this.f17600u = pk4.r(i12, false);
        int i15 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i15 >= ek4Var.f12498n.size()) {
                iJ = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iJ = pk4.j(this.f11651p, (String) ek4Var.f12498n.get(i15), false);
                if (iJ > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f17602w = i15;
        this.f17601v = iJ;
        int i16 = this.f11651p.f10891e;
        this.f17603x = Integer.bitCount(0);
        k9 k9Var = this.f11651p;
        int i17 = k9Var.f10891e;
        this.f17604y = true;
        this.B = 1 == (k9Var.f10890d & 1);
        this.C = k9Var.f10911y;
        this.D = k9Var.f10912z;
        this.E = k9Var.f10894h;
        this.f17597r = j33Var.a(k9Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = sv2.f15560a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{sv2.E(configuration.locale)};
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = sv2.G(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                iJ2 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                iJ2 = pk4.j(this.f11651p, strArrSplit[i19], false);
                if (iJ2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.f17605z = i19;
        this.A = iJ2;
        int i20 = 0;
        while (true) {
            if (i20 >= ek4Var.f12502r.size()) {
                break;
            }
            String str = this.f11651p.f10898l;
            if (str != null && str.equals(ek4Var.f12502r.get(i20))) {
                i13 = i20;
                break;
            }
            i20++;
        }
        this.F = i13;
        this.G = (i12 & 384) == 128;
        this.H = (i12 & 64) == 64;
        ek4 ek4Var2 = this.f17599t;
        if (pk4.r(i12, ek4Var2.f7885n0) && ((z11 = this.f17597r) || ek4Var2.f7879h0)) {
            i14 = (!pk4.r(i12, false) || !z11 || this.f11651p.f10894h == -1 || (!ek4Var2.f7887p0 && z10)) ? 1 : 2;
        }
        this.f17596q = i14;
    }

    @Override // com.google.android.gms.internal.ads.lk4
    public final int b() {
        return this.f17596q;
    }

    @Override // com.google.android.gms.internal.ads.lk4
    public final /* bridge */ /* synthetic */ boolean d(lk4 lk4Var) {
        String str;
        xj4 xj4Var = (xj4) lk4Var;
        boolean z10 = this.f17599t.f7882k0;
        k9 k9Var = this.f11651p;
        int i10 = k9Var.f10911y;
        if (i10 == -1) {
            return false;
        }
        k9 k9Var2 = xj4Var.f11651p;
        if (i10 != k9Var2.f10911y || (str = k9Var.f10898l) == null || !TextUtils.equals(str, k9Var2.f10898l)) {
            return false;
        }
        boolean z11 = this.f17599t.f7881j0;
        int i11 = this.f11651p.f10912z;
        return i11 != -1 && i11 == xj4Var.f11651p.f10912z && this.G == xj4Var.G && this.H == xj4Var.H;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xj4 xj4Var) {
        k73 k73VarA = (this.f17597r && this.f17600u) ? pk4.f13925k : pk4.f13925k.a();
        q53 q53VarC = q53.i().d(this.f17600u, xj4Var.f17600u).c(Integer.valueOf(this.f17602w), Integer.valueOf(xj4Var.f17602w), k73.c().a()).b(this.f17601v, xj4Var.f17601v).b(this.f17603x, xj4Var.f17603x).d(this.B, xj4Var.B).d(true, true).c(Integer.valueOf(this.f17605z), Integer.valueOf(xj4Var.f17605z), k73.c().a()).b(this.A, xj4Var.A).d(this.f17597r, xj4Var.f17597r).c(Integer.valueOf(this.F), Integer.valueOf(xj4Var.F), k73.c().a());
        Integer numValueOf = Integer.valueOf(this.E);
        Integer numValueOf2 = Integer.valueOf(xj4Var.E);
        boolean z10 = this.f17599t.f12507w;
        q53 q53VarC2 = q53VarC.c(numValueOf, numValueOf2, pk4.f13926l).d(this.G, xj4Var.G).d(this.H, xj4Var.H).c(Integer.valueOf(this.C), Integer.valueOf(xj4Var.C), k73VarA).c(Integer.valueOf(this.D), Integer.valueOf(xj4Var.D), k73VarA);
        Integer numValueOf3 = Integer.valueOf(this.E);
        Integer numValueOf4 = Integer.valueOf(xj4Var.E);
        if (!sv2.b(this.f17598s, xj4Var.f17598s)) {
            k73VarA = pk4.f13926l;
        }
        return q53VarC2.c(numValueOf3, numValueOf4, k73VarA).a();
    }
}
