package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bj2 implements o11, m31, tk2, l3.t, y31, b21, f91 {

    /* renamed from: m, reason: collision with root package name */
    private final op2 f6506m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f6507n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f6508o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final AtomicReference f6509p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference f6510q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f6511r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f6512s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private bj2 f6513t = null;

    public bj2(op2 op2Var) {
        this.f6506m = op2Var;
    }

    public static bj2 a(bj2 bj2Var) {
        bj2 bj2Var2 = new bj2(bj2Var.f6506m);
        bj2Var2.f6513t = bj2Var;
        return bj2Var2;
    }

    public final void A(ll llVar) {
        this.f6507n.set(llVar);
    }

    @Override // l3.t
    public final void C(final int i10) {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.C(i10);
        } else {
            kk2.a(this.f6511r, new jk2() { // from class: com.google.android.gms.internal.ads.qi2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((l3.t) obj).C(i10);
                }
            });
        }
    }

    public final void D(pl plVar) {
        this.f6509p.set(plVar);
    }

    @Override // l3.t
    public final void L0() {
    }

    @Override // l3.t
    public final void b() {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.b();
            return;
        }
        kk2.a(this.f6511r, new jk2() { // from class: com.google.android.gms.internal.ads.ui2
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((l3.t) obj).b();
            }
        });
        kk2.a(this.f6509p, new jk2() { // from class: com.google.android.gms.internal.ads.vi2
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((pl) obj).e();
            }
        });
        kk2.a(this.f6509p, new jk2() { // from class: com.google.android.gms.internal.ads.wi2
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((pl) obj).c();
            }
        });
    }

    @Override // l3.t
    public final void c() {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.c();
        } else {
            kk2.a(this.f6511r, new jk2() { // from class: com.google.android.gms.internal.ads.yi2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((l3.t) obj).c();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.y31
    public final void d(final k3.j4 j4Var) {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.d(j4Var);
        } else {
            kk2.a(this.f6512s, new jk2() { // from class: com.google.android.gms.internal.ads.pi2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((k3.c2) obj).F2(j4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.tk2
    public final void e(tk2 tk2Var) {
        this.f6513t = (bj2) tk2Var;
    }

    public final void g() {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.g();
            return;
        }
        this.f6506m.a();
        kk2.a(this.f6508o, new jk2() { // from class: com.google.android.gms.internal.ads.ni2
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((ml) obj).a();
            }
        });
        kk2.a(this.f6509p, new jk2() { // from class: com.google.android.gms.internal.ads.oi2
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((pl) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final void h() {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.h();
        } else {
            kk2.a(this.f6510q, new jk2() { // from class: com.google.android.gms.internal.ads.aj2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((m31) obj).h();
                }
            });
        }
    }

    public final void o(final il ilVar) {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.o(ilVar);
        } else {
            kk2.a(this.f6507n, new jk2() { // from class: com.google.android.gms.internal.ads.ti2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((ll) obj).J3(ilVar);
                }
            });
        }
    }

    public final void p(l3.t tVar) {
        this.f6511r.set(tVar);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void r() {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.r();
        } else {
            kk2.a(this.f6509p, new jk2() { // from class: com.google.android.gms.internal.ads.zi2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((pl) obj).b();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(final k3.w2 w2Var) {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.u(w2Var);
        } else {
            kk2.a(this.f6507n, new jk2() { // from class: com.google.android.gms.internal.ads.mi2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((ll) obj).E1(w2Var);
                }
            });
            kk2.a(this.f6507n, new jk2() { // from class: com.google.android.gms.internal.ads.si2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((ll) obj).K(w2Var.f24788m);
                }
            });
        }
    }

    public final void v(k3.c2 c2Var) {
        this.f6512s.set(c2Var);
    }

    @Override // com.google.android.gms.internal.ads.b21
    public final void v0(final k3.w2 w2Var) {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.v0(w2Var);
        } else {
            kk2.a(this.f6509p, new jk2() { // from class: com.google.android.gms.internal.ads.xi2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((pl) obj).I0(w2Var);
                }
            });
        }
    }

    @Override // l3.t
    public final void w0() {
    }

    @Override // l3.t
    public final void x4() {
        bj2 bj2Var = this.f6513t;
        if (bj2Var != null) {
            bj2Var.x4();
        } else {
            kk2.a(this.f6511r, new jk2() { // from class: com.google.android.gms.internal.ads.ri2
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((l3.t) obj).x4();
                }
            });
        }
    }
}
