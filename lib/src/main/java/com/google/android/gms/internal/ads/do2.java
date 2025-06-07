package com.google.android.gms.internal.ads;

import android.os.Bundle;
import g3.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class do2 {

    /* renamed from: a, reason: collision with root package name */
    public final k3.v3 f7442a;

    /* renamed from: b, reason: collision with root package name */
    public final e00 f7443b;

    /* renamed from: c, reason: collision with root package name */
    public final q62 f7444c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.c4 f7445d;

    /* renamed from: e, reason: collision with root package name */
    public final k3.h4 f7446e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7447f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7448g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7449h;

    /* renamed from: i, reason: collision with root package name */
    public final eu f7450i;

    /* renamed from: j, reason: collision with root package name */
    public final k3.n4 f7451j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7452k;

    /* renamed from: l, reason: collision with root package name */
    public final g3.a f7453l;

    /* renamed from: m, reason: collision with root package name */
    public final g3.g f7454m;

    /* renamed from: n, reason: collision with root package name */
    public final k3.y0 f7455n;

    /* renamed from: o, reason: collision with root package name */
    public final qn2 f7456o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7457p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7458q;

    /* renamed from: r, reason: collision with root package name */
    public final k3.c1 f7459r;

    /* synthetic */ do2(bo2 bo2Var, co2 co2Var) {
        this.f7446e = bo2Var.f6586b;
        this.f7447f = bo2Var.f6587c;
        this.f7459r = bo2Var.f6603s;
        int i10 = bo2Var.f6585a.f24614m;
        long j10 = bo2Var.f6585a.f24615n;
        Bundle bundle = bo2Var.f6585a.f24616o;
        int i11 = bo2Var.f6585a.f24617p;
        List list = bo2Var.f6585a.f24618q;
        boolean z10 = bo2Var.f6585a.f24619r;
        int i12 = bo2Var.f6585a.f24620s;
        boolean z11 = true;
        if (!bo2Var.f6585a.f24621t && !bo2Var.f6589e) {
            z11 = false;
        }
        this.f7445d = new k3.c4(i10, j10, bundle, i11, list, z10, i12, z11, bo2Var.f6585a.f24622u, bo2Var.f6585a.f24623v, bo2Var.f6585a.f24624w, bo2Var.f6585a.f24625x, bo2Var.f6585a.f24626y, bo2Var.f6585a.f24627z, bo2Var.f6585a.A, bo2Var.f6585a.B, bo2Var.f6585a.C, bo2Var.f6585a.D, bo2Var.f6585a.E, bo2Var.f6585a.F, bo2Var.f6585a.G, bo2Var.f6585a.H, m3.b2.x(bo2Var.f6585a.I), bo2Var.f6585a.J);
        this.f7442a = bo2Var.f6588d != null ? bo2Var.f6588d : bo2Var.f6592h != null ? bo2Var.f6592h.f7975r : null;
        this.f7448g = bo2Var.f6590f;
        this.f7449h = bo2Var.f6591g;
        this.f7450i = bo2Var.f6590f == null ? null : bo2Var.f6592h == null ? new eu(new e.a().a()) : bo2Var.f6592h;
        this.f7451j = bo2Var.f6593i;
        this.f7452k = bo2Var.f6597m;
        this.f7453l = bo2Var.f6594j;
        this.f7454m = bo2Var.f6595k;
        this.f7455n = bo2Var.f6596l;
        this.f7443b = bo2Var.f6598n;
        this.f7456o = new qn2(bo2Var.f6599o, null);
        this.f7457p = bo2Var.f6600p;
        this.f7444c = bo2Var.f6601q;
        this.f7458q = bo2Var.f6602r;
    }

    public final hw a() {
        g3.g gVar = this.f7454m;
        if (gVar == null && this.f7453l == null) {
            return null;
        }
        return gVar != null ? gVar.h() : this.f7453l.h();
    }

    public final boolean b() {
        return this.f7447f.matches((String) k3.w.c().b(ir.L2));
    }
}
