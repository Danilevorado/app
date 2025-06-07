package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z02 extends la0 implements w21 {

    /* renamed from: m, reason: collision with root package name */
    private ma0 f18346m;

    /* renamed from: n, reason: collision with root package name */
    private v21 f18347n;

    /* renamed from: o, reason: collision with root package name */
    private r91 f18348o;

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void A0(l4.a aVar, int i10) {
        v21 v21Var = this.f18347n;
        if (v21Var != null) {
            v21Var.a(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void B4(l4.a aVar, int i10) {
        r91 r91Var = this.f18348o;
        if (r91Var != null) {
            ze0.g("Fail to initialize adapter ".concat(String.valueOf(((y32) r91Var).f17880c.f7557a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void F0(l4.a aVar) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ma0Var.F0(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void F1(l4.a aVar) {
        r91 r91Var = this.f18348o;
        if (r91Var != null) {
            Executor executor = ((y32) r91Var).f17881d.f5937b;
            final un2 un2Var = ((y32) r91Var).f17878a;
            final hn2 hn2Var = ((y32) r91Var).f17879b;
            final dz1 dz1Var = ((y32) r91Var).f17880c;
            final y32 y32Var = (y32) r91Var;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.x32
                @Override // java.lang.Runnable
                public final void run() {
                    y32 y32Var2 = y32Var;
                    un2 un2Var2 = un2Var;
                    hn2 hn2Var2 = hn2Var;
                    dz1 dz1Var2 = dz1Var;
                    a42 a42Var = y32Var2.f17881d;
                    a42.e(un2Var2, hn2Var2, dz1Var2);
                }
            });
        }
    }

    public final synchronized void M5(ma0 ma0Var) {
        this.f18346m = ma0Var;
    }

    public final synchronized void N5(r91 r91Var) {
        this.f18348o = r91Var;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void R(l4.a aVar) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ((z32) ma0Var).f18396m.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void R3(l4.a aVar) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ((z32) ma0Var).f18398o.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void d5(l4.a aVar, na0 na0Var) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ((z32) ma0Var).f18399p.M(na0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void i0(l4.a aVar) {
        v21 v21Var = this.f18347n;
        if (v21Var != null) {
            v21Var.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void k4(l4.a aVar) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ((z32) ma0Var).f18399p.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void m1(l4.a aVar) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ((z32) ma0Var).f18398o.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.w21
    public final synchronized void p1(v21 v21Var) {
        this.f18347n = v21Var;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final synchronized void zze(l4.a aVar) {
        ma0 ma0Var = this.f18346m;
        if (ma0Var != null) {
            ((z32) ma0Var).f18397n.O();
        }
    }
}
