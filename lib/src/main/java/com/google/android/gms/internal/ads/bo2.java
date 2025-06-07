package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bo2 {

    /* renamed from: a, reason: collision with root package name */
    private k3.c4 f6585a;

    /* renamed from: b, reason: collision with root package name */
    private k3.h4 f6586b;

    /* renamed from: c, reason: collision with root package name */
    private String f6587c;

    /* renamed from: d, reason: collision with root package name */
    private k3.v3 f6588d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6589e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f6590f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f6591g;

    /* renamed from: h, reason: collision with root package name */
    private eu f6592h;

    /* renamed from: i, reason: collision with root package name */
    private k3.n4 f6593i;

    /* renamed from: j, reason: collision with root package name */
    private g3.a f6594j;

    /* renamed from: k, reason: collision with root package name */
    private g3.g f6595k;

    /* renamed from: l, reason: collision with root package name */
    private k3.y0 f6596l;

    /* renamed from: n, reason: collision with root package name */
    private e00 f6598n;

    /* renamed from: q, reason: collision with root package name */
    private q62 f6601q;

    /* renamed from: s, reason: collision with root package name */
    private k3.c1 f6603s;

    /* renamed from: m, reason: collision with root package name */
    private int f6597m = 1;

    /* renamed from: o, reason: collision with root package name */
    private final on2 f6599o = new on2();

    /* renamed from: p, reason: collision with root package name */
    private boolean f6600p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6602r = false;

    public final on2 F() {
        return this.f6599o;
    }

    public final bo2 G(do2 do2Var) {
        this.f6599o.a(do2Var.f7456o.f14418a);
        this.f6585a = do2Var.f7445d;
        this.f6586b = do2Var.f7446e;
        this.f6603s = do2Var.f7459r;
        this.f6587c = do2Var.f7447f;
        this.f6588d = do2Var.f7442a;
        this.f6590f = do2Var.f7448g;
        this.f6591g = do2Var.f7449h;
        this.f6592h = do2Var.f7450i;
        this.f6593i = do2Var.f7451j;
        H(do2Var.f7453l);
        d(do2Var.f7454m);
        this.f6600p = do2Var.f7457p;
        this.f6601q = do2Var.f7444c;
        this.f6602r = do2Var.f7458q;
        return this;
    }

    public final bo2 H(g3.a aVar) {
        this.f6594j = aVar;
        if (aVar != null) {
            this.f6589e = aVar.f();
        }
        return this;
    }

    public final bo2 I(k3.h4 h4Var) {
        this.f6586b = h4Var;
        return this;
    }

    public final bo2 J(String str) {
        this.f6587c = str;
        return this;
    }

    public final bo2 K(k3.n4 n4Var) {
        this.f6593i = n4Var;
        return this;
    }

    public final bo2 L(q62 q62Var) {
        this.f6601q = q62Var;
        return this;
    }

    public final bo2 M(e00 e00Var) {
        this.f6598n = e00Var;
        this.f6588d = new k3.v3(false, true, false);
        return this;
    }

    public final bo2 N(boolean z10) {
        this.f6600p = z10;
        return this;
    }

    public final bo2 O(boolean z10) {
        this.f6602r = true;
        return this;
    }

    public final bo2 P(boolean z10) {
        this.f6589e = z10;
        return this;
    }

    public final bo2 Q(int i10) {
        this.f6597m = i10;
        return this;
    }

    public final bo2 a(eu euVar) {
        this.f6592h = euVar;
        return this;
    }

    public final bo2 b(ArrayList arrayList) {
        this.f6590f = arrayList;
        return this;
    }

    public final bo2 c(ArrayList arrayList) {
        this.f6591g = arrayList;
        return this;
    }

    public final bo2 d(g3.g gVar) {
        this.f6595k = gVar;
        if (gVar != null) {
            this.f6589e = gVar.d();
            this.f6596l = gVar.f();
        }
        return this;
    }

    public final bo2 e(k3.c4 c4Var) {
        this.f6585a = c4Var;
        return this;
    }

    public final bo2 f(k3.v3 v3Var) {
        this.f6588d = v3Var;
        return this;
    }

    public final do2 g() {
        e4.p.m(this.f6587c, "ad unit must not be null");
        e4.p.m(this.f6586b, "ad size must not be null");
        e4.p.m(this.f6585a, "ad request must not be null");
        return new do2(this, null);
    }

    public final String i() {
        return this.f6587c;
    }

    public final boolean o() {
        return this.f6600p;
    }

    public final bo2 q(k3.c1 c1Var) {
        this.f6603s = c1Var;
        return this;
    }

    public final k3.c4 v() {
        return this.f6585a;
    }

    public final k3.h4 x() {
        return this.f6586b;
    }
}
