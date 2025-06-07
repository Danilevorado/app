package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mw1 implements j81 {

    /* renamed from: o, reason: collision with root package name */
    private final String f12269o;

    /* renamed from: p, reason: collision with root package name */
    private final ws2 f12270p;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12267m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12268n = false;

    /* renamed from: q, reason: collision with root package name */
    private final m3.p1 f12271q = j3.t.q().h();

    public mw1(String str, ws2 ws2Var) {
        this.f12269o = str;
        this.f12270p = ws2Var;
    }

    private final vs2 a(String str) {
        String str2 = this.f12271q.S() ? "" : this.f12269o;
        vs2 vs2VarB = vs2.b(str);
        vs2VarB.a("tms", Long.toString(j3.t.b().b(), 10));
        vs2VarB.a("tid", str2);
        return vs2VarB;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void W(String str) {
        ws2 ws2Var = this.f12270p;
        vs2 vs2VarA = a("adapter_init_finished");
        vs2VarA.a("ancn", str);
        ws2Var.a(vs2VarA);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void Y(String str) {
        ws2 ws2Var = this.f12270p;
        vs2 vs2VarA = a("adapter_init_started");
        vs2VarA.a("ancn", str);
        ws2Var.a(vs2VarA);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final synchronized void c() {
        if (this.f12268n) {
            return;
        }
        this.f12270p.a(a("init_finished"));
        this.f12268n = true;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final synchronized void e() {
        if (this.f12267m) {
            return;
        }
        this.f12270p.a(a("init_started"));
        this.f12267m = true;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void o(String str) {
        ws2 ws2Var = this.f12270p;
        vs2 vs2VarA = a("aaia");
        vs2VarA.a("aair", "MalformedJson");
        ws2Var.a(vs2VarA);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void v(String str, String str2) {
        ws2 ws2Var = this.f12270p;
        vs2 vs2VarA = a("adapter_init_finished");
        vs2VarA.a("ancn", str);
        vs2VarA.a("rqe", str2);
        ws2Var.a(vs2VarA);
    }
}
