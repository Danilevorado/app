package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class um2 implements h72 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16392a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16393b;

    /* renamed from: c, reason: collision with root package name */
    private final km0 f16394c;

    /* renamed from: d, reason: collision with root package name */
    private final km2 f16395d;

    /* renamed from: e, reason: collision with root package name */
    private final wk2 f16396e;

    /* renamed from: f, reason: collision with root package name */
    private final vn2 f16397f;

    /* renamed from: g, reason: collision with root package name */
    private final cu2 f16398g;

    /* renamed from: h, reason: collision with root package name */
    private final bo2 f16399h;

    /* renamed from: i, reason: collision with root package name */
    private ab3 f16400i;

    public um2(Context context, Executor executor, km0 km0Var, wk2 wk2Var, km2 km2Var, bo2 bo2Var, vn2 vn2Var) {
        this.f16392a = context;
        this.f16393b = executor;
        this.f16394c = km0Var;
        this.f16396e = wk2Var;
        this.f16395d = km2Var;
        this.f16399h = bo2Var;
        this.f16397f = vn2Var;
        this.f16398g = km0Var.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kj1 k(uk2 uk2Var) {
        kj1 kj1VarL = this.f16394c.l();
        s01 s01Var = new s01();
        s01Var.e(this.f16392a);
        s01Var.i(((tm2) uk2Var).f15898a);
        s01Var.h(this.f16397f);
        kj1VarL.f(s01Var.j());
        kj1VarL.b(new a71().q());
        return kj1VarL;
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // com.google.android.gms.internal.ads.h72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(k3.c4 r10, java.lang.String r11, com.google.android.gms.internal.ads.f72 r12, com.google.android.gms.internal.ads.g72 r13) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.ha0 r12 = new com.google.android.gms.internal.ads.ha0
            r12.<init>(r10, r11)
            java.lang.String r10 = r12.f9076n
            r11 = 1
            r0 = 0
            if (r10 != 0) goto L1d
            java.lang.String r10 = "Ad unit ID should not be null for rewarded video ad."
            com.google.android.gms.internal.ads.ze0.d(r10)
            java.util.concurrent.Executor r10 = r9.f16393b
            com.google.android.gms.internal.ads.nm2 r11 = new com.google.android.gms.internal.ads.nm2
            r11.<init>()
            r10.execute(r11)
        L1a:
            r11 = r0
            goto Lcc
        L1d:
            com.google.android.gms.internal.ads.ab3 r10 = r9.f16400i
            if (r10 == 0) goto L28
            boolean r10 = r10.isDone()
            if (r10 != 0) goto L28
            goto L1a
        L28:
            com.google.android.gms.internal.ads.os r10 = com.google.android.gms.internal.ads.vs.f16842c
            java.lang.Object r10 = r10.e()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0 = 5
            r1 = 0
            if (r10 == 0) goto L56
            com.google.android.gms.internal.ads.wk2 r10 = r9.f16396e
            java.lang.Object r2 = r10.f()
            if (r2 == 0) goto L56
            java.lang.Object r10 = r10.f()
            com.google.android.gms.internal.ads.lj1 r10 = (com.google.android.gms.internal.ads.lj1) r10
            com.google.android.gms.internal.ads.au2 r10 = r10.g()
            r10.h(r0)
            k3.c4 r2 = r12.f9075m
            java.lang.String r2 = r2.B
            r10.b(r2)
            r6 = r10
            goto L57
        L56:
            r6 = r1
        L57:
            android.content.Context r10 = r9.f16392a
            k3.c4 r2 = r12.f9075m
            boolean r2 = r2.f24619r
            com.google.android.gms.internal.ads.zo2.a(r10, r2)
            com.google.android.gms.internal.ads.zq r10 = com.google.android.gms.internal.ads.ir.f10009l8
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()
            java.lang.Object r10 = r2.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L81
            k3.c4 r10 = r12.f9075m
            boolean r10 = r10.f24619r
            if (r10 == 0) goto L81
            com.google.android.gms.internal.ads.km0 r10 = r9.f16394c
            com.google.android.gms.internal.ads.xp1 r10 = r10.n()
            r10.m(r11)
        L81:
            com.google.android.gms.internal.ads.bo2 r10 = r9.f16399h
            java.lang.String r2 = r12.f9076n
            r10.J(r2)
            k3.h4 r2 = k3.h4.x()
            r10.I(r2)
            k3.c4 r2 = r12.f9075m
            r10.e(r2)
            com.google.android.gms.internal.ads.do2 r10 = r10.g()
            android.content.Context r2 = r9.f16392a
            int r3 = com.google.android.gms.internal.ads.zt2.f(r10)
            k3.c4 r12 = r12.f9075m
            com.google.android.gms.internal.ads.ot2 r7 = com.google.android.gms.internal.ads.nt2.b(r2, r3, r0, r12)
            com.google.android.gms.internal.ads.tm2 r8 = new com.google.android.gms.internal.ads.tm2
            r8.<init>(r1)
            r8.f15898a = r10
            r8.f15899b = r1
            com.google.android.gms.internal.ads.wk2 r10 = r9.f16396e
            com.google.android.gms.internal.ads.xk2 r12 = new com.google.android.gms.internal.ads.xk2
            r12.<init>(r8, r1)
            com.google.android.gms.internal.ads.om2 r0 = new com.google.android.gms.internal.ads.om2
            r0.<init>()
            com.google.android.gms.internal.ads.ab3 r10 = r10.a(r12, r0, r1)
            r9.f16400i = r10
            com.google.android.gms.internal.ads.rm2 r12 = new com.google.android.gms.internal.ads.rm2
            r3 = r12
            r4 = r9
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r13 = r9.f16393b
            com.google.android.gms.internal.ads.qa3.q(r10, r12, r13)
        Lcc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.um2.b(k3.c4, java.lang.String, com.google.android.gms.internal.ads.f72, com.google.android.gms.internal.ads.g72):boolean");
    }

    final /* synthetic */ void i() {
        this.f16395d.u(fp2.d(6, null, null));
    }

    final void j(int i10) {
        this.f16399h.F().a(i10);
    }
}
