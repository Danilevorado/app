package com.google.android.gms.internal.ads;

import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class ql1 implements i41, a31, o11, f21, k3.a, w61 {

    /* renamed from: m, reason: collision with root package name */
    private final pm f14395m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14396n = false;

    public ql1(pm pmVar, al2 al2Var) {
        this.f14395m = pmVar;
        pmVar.c(2);
        if (al2Var != null) {
            pmVar.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final void N(final ln lnVar) {
        this.f14395m.b(new om() { // from class: com.google.android.gms.internal.ads.ol1
            @Override // com.google.android.gms.internal.ads.om
            public final void a(go goVar) {
                goVar.A(lnVar);
            }
        });
        this.f14395m.c(1102);
    }

    @Override // k3.a
    public final synchronized void O() {
        if (this.f14396n) {
            this.f14395m.c(8);
        } else {
            this.f14395m.c(7);
            this.f14396n = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final void a0(final ln lnVar) {
        this.f14395m.b(new om() { // from class: com.google.android.gms.internal.ads.pl1
            @Override // com.google.android.gms.internal.ads.om
            public final void a(go goVar) {
                goVar.A(lnVar);
            }
        });
        this.f14395m.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final void b0(boolean z10) {
        this.f14395m.c(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(final un2 un2Var) {
        this.f14395m.b(new om() { // from class: com.google.android.gms.internal.ads.ml1
            @Override // com.google.android.gms.internal.ads.om
            public final void a(go goVar) {
                un2 un2Var2 = un2Var;
                bn bnVar = (bn) goVar.u().i();
                tn tnVar = (tn) goVar.u().M().i();
                tnVar.u(un2Var2.f16413b.f15924b.f11674b);
                bnVar.v(tnVar);
                goVar.z(bnVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final void e0(final ln lnVar) {
        this.f14395m.b(new om() { // from class: com.google.android.gms.internal.ads.nl1
            @Override // com.google.android.gms.internal.ads.om
            public final void a(go goVar) {
                goVar.A(lnVar);
            }
        });
        this.f14395m.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final void f() {
        this.f14395m.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final synchronized void l() {
        this.f14395m.c(6);
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final void m() {
        this.f14395m.c(3);
    }

    @Override // com.google.android.gms.internal.ads.w61
    public final void n0(boolean z10) {
        this.f14395m.c(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(k3.w2 w2Var) {
        pm pmVar;
        int i10;
        switch (w2Var.f24788m) {
            case 1:
                pmVar = this.f14395m;
                i10 = 101;
                break;
            case 2:
                pmVar = this.f14395m;
                i10 = 102;
                break;
            case 3:
                pmVar = this.f14395m;
                i10 = 5;
                break;
            case 4:
                pmVar = this.f14395m;
                i10 = 103;
                break;
            case 5:
                pmVar = this.f14395m;
                i10 = 104;
                break;
            case 6:
                pmVar = this.f14395m;
                i10 = 105;
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                pmVar = this.f14395m;
                i10 = 106;
                break;
            default:
                pmVar = this.f14395m;
                i10 = 4;
                break;
        }
        pmVar.c(i10);
    }
}
