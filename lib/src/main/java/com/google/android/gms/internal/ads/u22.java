package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u22 {

    /* renamed from: a, reason: collision with root package name */
    private final uo2 f16136a;

    /* renamed from: b, reason: collision with root package name */
    private final nk1 f16137b;

    /* renamed from: c, reason: collision with root package name */
    private final xm1 f16138c;

    /* renamed from: d, reason: collision with root package name */
    private final ws2 f16139d;

    public u22(uo2 uo2Var, nk1 nk1Var, xm1 xm1Var, ws2 ws2Var) {
        this.f16136a = uo2Var;
        this.f16137b = nk1Var;
        this.f16138c = xm1Var;
        this.f16139d = ws2Var;
    }

    public final void a(ln2 ln2Var, hn2 hn2Var, int i10, ez1 ez1Var, long j10) {
        if (((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
            vs2 vs2VarB = vs2.b("adapter_status");
            vs2VarB.g(ln2Var);
            vs2VarB.f(hn2Var);
            vs2VarB.a("adapter_l", String.valueOf(j10));
            vs2VarB.a("sc", Integer.toString(i10));
            if (ez1Var != null) {
                vs2VarB.a("arec", Integer.toString(ez1Var.b().f24788m));
                String strA = this.f16136a.a(ez1Var.getMessage());
                if (strA != null) {
                    vs2VarB.a("areec", strA);
                }
            }
            mk1 mk1VarB = this.f16137b.b(hn2Var.f9273u);
            if (mk1VarB != null) {
                vs2VarB.a("ancn", mk1VarB.f12181a);
                z50 z50Var = mk1VarB.f12182b;
                if (z50Var != null) {
                    vs2VarB.a("adapter_v", z50Var.toString());
                }
                z50 z50Var2 = mk1VarB.f12183c;
                if (z50Var2 != null) {
                    vs2VarB.a("adapter_sv", z50Var2.toString());
                }
            }
            this.f16139d.a(vs2VarB);
            return;
        }
        wm1 wm1VarA = this.f16138c.a();
        wm1VarA.e(ln2Var);
        wm1VarA.d(hn2Var);
        wm1VarA.b("action", "adapter_status");
        wm1VarA.b("adapter_l", String.valueOf(j10));
        wm1VarA.b("sc", Integer.toString(i10));
        if (ez1Var != null) {
            wm1VarA.b("arec", Integer.toString(ez1Var.b().f24788m));
            String strA2 = this.f16136a.a(ez1Var.getMessage());
            if (strA2 != null) {
                wm1VarA.b("areec", strA2);
            }
        }
        mk1 mk1VarB2 = this.f16137b.b(hn2Var.f9273u);
        if (mk1VarB2 != null) {
            wm1VarA.b("ancn", mk1VarB2.f12181a);
            z50 z50Var3 = mk1VarB2.f12182b;
            if (z50Var3 != null) {
                wm1VarA.b("adapter_v", z50Var3.toString());
            }
            z50 z50Var4 = mk1VarB2.f12183c;
            if (z50Var4 != null) {
                wm1VarA.b("adapter_sv", z50Var4.toString());
            }
        }
        wm1VarA.g();
    }
}
