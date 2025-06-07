package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class iu0 {

    /* renamed from: a, reason: collision with root package name */
    private final ws2 f10178a;

    /* renamed from: b, reason: collision with root package name */
    private final xm1 f10179b;

    /* renamed from: c, reason: collision with root package name */
    private final un2 f10180c;

    public iu0(xm1 xm1Var, un2 un2Var, ws2 ws2Var) {
        this.f10178a = ws2Var;
        this.f10179b = xm1Var;
        this.f10180c = un2Var;
    }

    private static String b(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j10, int i10) {
        if (((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
            ws2 ws2Var = this.f10178a;
            vs2 vs2VarB = vs2.b("ad_closed");
            vs2VarB.g(this.f10180c.f16413b.f15924b);
            vs2VarB.a("show_time", String.valueOf(j10));
            vs2VarB.a("ad_format", "app_open_ad");
            vs2VarB.a("acr", b(i10));
            ws2Var.a(vs2VarB);
            return;
        }
        wm1 wm1VarA = this.f10179b.a();
        wm1VarA.e(this.f10180c.f16413b.f15924b);
        wm1VarA.b("action", "ad_closed");
        wm1VarA.b("show_time", String.valueOf(j10));
        wm1VarA.b("ad_format", "app_open_ad");
        wm1VarA.b("acr", b(i10));
        wm1VarA.g();
    }
}
