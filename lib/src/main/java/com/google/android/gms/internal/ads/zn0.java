package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zn0 extends sf2 {

    /* renamed from: a, reason: collision with root package name */
    private final zg2 f18652a;

    /* renamed from: b, reason: collision with root package name */
    private final ho0 f18653b;

    /* renamed from: c, reason: collision with root package name */
    private final zn0 f18654c = this;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f18655d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f18656e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f18657f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f18658g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f18659h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f18660i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f18661j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f18662k;

    /* renamed from: l, reason: collision with root package name */
    private final q44 f18663l;

    /* renamed from: m, reason: collision with root package name */
    private final q44 f18664m;

    /* renamed from: n, reason: collision with root package name */
    private final q44 f18665n;

    /* synthetic */ zn0(ho0 ho0Var, zg2 zg2Var, yn0 yn0Var) {
        this.f18653b = ho0Var;
        this.f18652a = zg2Var;
        bh2 bh2Var = new bh2(zg2Var);
        this.f18655d = bh2Var;
        q44 q44VarC = b44.c(vl1.a());
        this.f18656e = q44VarC;
        q44 q44VarC2 = b44.c(tl1.a());
        this.f18657f = q44VarC2;
        q44 q44VarC3 = b44.c(xl1.a());
        this.f18658g = q44VarC3;
        q44 q44VarC4 = b44.c(am1.a());
        this.f18659h = q44VarC4;
        f44 f44VarC = g44.c(4);
        f44VarC.b(fs2.GMS_SIGNALS, q44VarC);
        f44VarC.b(fs2.BUILD_URL, q44VarC2);
        f44VarC.b(fs2.HTTP, q44VarC3);
        f44VarC.b(fs2.PRE_PROCESS, q44VarC4);
        g44 g44VarC = f44VarC.c();
        this.f18660i = g44VarC;
        q44 q44VarC5 = b44.c(new bm1(bh2Var, ho0Var.f9295i, fr2.a(), g44VarC));
        this.f18661j = q44VarC5;
        m44 m44VarA = o44.a(0, 1);
        m44VarA.a(q44VarC5);
        o44 o44VarC = m44VarA.c();
        this.f18662k = o44VarC;
        os2 os2Var = new os2(o44VarC);
        this.f18663l = os2Var;
        this.f18664m = b44.c(new ns2(fr2.a(), ho0Var.f9307o, os2Var));
        this.f18665n = b44.c(new bu2(ho0Var.I));
    }

    @Override // com.google.android.gms.internal.ads.sf2
    public final ne2 a() {
        Context contextA = this.f18653b.f9281b.a();
        k44.b(contextA);
        xd0 xd0Var = new xd0();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        tg2 tg2Var = new tg2(xd0Var, bb3Var, ah2.a(this.f18652a));
        k44.b(bb3Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f18653b.f9307o.b();
        au2 au2Var = (au2) this.f18665n.b();
        xm1 xm1Var = (xm1) this.f18653b.f9280a0.b();
        HashSet hashSet = new HashSet();
        hashSet.add(new oc2(tg2Var, 0L, scheduledExecutorService));
        return new ne2(contextA, bb3Var, hashSet, au2Var, xm1Var);
    }

    @Override // com.google.android.gms.internal.ads.sf2
    public final ls2 b() {
        return (ls2) this.f18664m.b();
    }
}
