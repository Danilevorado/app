package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class vn0 extends df2 {
    private final q44 A;
    private final q44 B;

    /* renamed from: a, reason: collision with root package name */
    private final hh2 f16788a;

    /* renamed from: b, reason: collision with root package name */
    private final ho0 f16789b;

    /* renamed from: c, reason: collision with root package name */
    private final vn0 f16790c = this;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f16791d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f16792e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f16793f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f16794g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f16795h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f16796i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f16797j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f16798k;

    /* renamed from: l, reason: collision with root package name */
    private final q44 f16799l;

    /* renamed from: m, reason: collision with root package name */
    private final q44 f16800m;

    /* renamed from: n, reason: collision with root package name */
    private final q44 f16801n;

    /* renamed from: o, reason: collision with root package name */
    private final q44 f16802o;

    /* renamed from: p, reason: collision with root package name */
    private final q44 f16803p;

    /* renamed from: q, reason: collision with root package name */
    private final q44 f16804q;

    /* renamed from: r, reason: collision with root package name */
    private final q44 f16805r;

    /* renamed from: s, reason: collision with root package name */
    private final q44 f16806s;

    /* renamed from: t, reason: collision with root package name */
    private final q44 f16807t;

    /* renamed from: u, reason: collision with root package name */
    private final q44 f16808u;

    /* renamed from: v, reason: collision with root package name */
    private final q44 f16809v;

    /* renamed from: w, reason: collision with root package name */
    private final q44 f16810w;

    /* renamed from: x, reason: collision with root package name */
    private final q44 f16811x;

    /* renamed from: y, reason: collision with root package name */
    private final q44 f16812y;

    /* renamed from: z, reason: collision with root package name */
    private final q44 f16813z;

    /* synthetic */ vn0(ho0 ho0Var, hh2 hh2Var, tn0 tn0Var) {
        this.f16789b = ho0Var;
        this.f16788a = hh2Var;
        this.f16791d = b44.c(new bu2(ho0Var.I));
        jh2 jh2Var = new jh2(hh2Var);
        this.f16792e = jh2Var;
        kh2 kh2Var = new kh2(hh2Var);
        this.f16793f = kh2Var;
        mh2 mh2Var = new mh2(hh2Var);
        this.f16794g = mh2Var;
        this.f16795h = new bf2(wr0.f17248a, ho0Var.f9295i, ho0Var.f9307o, fr2.a(), jh2Var, kh2Var, mh2Var);
        ih2 ih2Var = new ih2(hh2Var);
        this.f16796i = ih2Var;
        this.f16797j = new yf2(fn0.f8335a, ho0Var.f9295i, ih2Var, fr2.a());
        this.f16798k = new kg2(wr0.f17248a, jh2Var, ho0Var.f9295i, ho0Var.f9294h0, ho0Var.f9307o, fr2.a(), ih2Var);
        this.f16799l = new og2(qr0.f14454a, fr2.a(), ho0Var.f9295i);
        this.f16800m = new vg2(sr0.f15538a, fr2.a(), ih2Var);
        this.f16801n = new gh2(ur0.f16430a, ho0Var.f9307o, ho0Var.f9295i);
        this.f16802o = new bi2(fr2.a());
        lh2 lh2Var = new lh2(hh2Var);
        this.f16803p = lh2Var;
        this.f16804q = new xh2(ho0Var.f9294h0, lh2Var, mh2Var, zr0.f18703a, fr2.a(), ih2Var, ho0Var.f9307o);
        this.f16805r = new eg2(ih2Var, or0.f13369a, ho0Var.f9294h0, ho0Var.f9307o, fr2.a());
        nh2 nh2Var = new nh2(hh2Var);
        this.f16806s = nh2Var;
        q44 q44VarC = b44.c(vl1.a());
        this.f16807t = q44VarC;
        q44 q44VarC2 = b44.c(tl1.a());
        this.f16808u = q44VarC2;
        q44 q44VarC3 = b44.c(xl1.a());
        this.f16809v = q44VarC3;
        q44 q44VarC4 = b44.c(am1.a());
        this.f16810w = q44VarC4;
        f44 f44VarC = g44.c(4);
        f44VarC.b(fs2.GMS_SIGNALS, q44VarC);
        f44VarC.b(fs2.BUILD_URL, q44VarC2);
        f44VarC.b(fs2.HTTP, q44VarC3);
        f44VarC.b(fs2.PRE_PROCESS, q44VarC4);
        g44 g44VarC = f44VarC.c();
        this.f16811x = g44VarC;
        q44 q44VarC5 = b44.c(new bm1(nh2Var, ho0Var.f9295i, fr2.a(), g44VarC));
        this.f16812y = q44VarC5;
        m44 m44VarA = o44.a(0, 1);
        m44VarA.a(q44VarC5);
        o44 o44VarC = m44VarA.c();
        this.f16813z = o44VarC;
        os2 os2Var = new os2(o44VarC);
        this.A = os2Var;
        this.B = b44.c(new ns2(fr2.a(), ho0Var.f9307o, os2Var));
    }

    private final gf2 e() {
        ae0 ae0Var = new ae0();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new gf2(ae0Var, bb3Var, this.f16788a.d(), this.f16788a.b(), this.f16788a.a());
    }

    private final xg2 f() {
        sq sqVar = new sq();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        List listF = this.f16788a.f();
        k44.b(listF);
        return new xg2(sqVar, bb3Var, listF);
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final ne2 a() {
        Context contextA = this.f16789b.f9281b.a();
        k44.b(contextA);
        xd0 xd0Var = new xd0();
        yd0 yd0Var = new yd0();
        Object objB = this.f16789b.J0.b();
        gf2 gf2VarE = e();
        xg2 xg2VarF = f();
        w34 w34VarA = b44.a(this.f16795h);
        w34 w34VarA2 = b44.a(this.f16797j);
        w34 w34VarA3 = b44.a(this.f16798k);
        w34 w34VarA4 = b44.a(this.f16799l);
        w34 w34VarA5 = b44.a(this.f16800m);
        w34 w34VarA6 = b44.a(this.f16801n);
        w34 w34VarA7 = b44.a(this.f16802o);
        w34 w34VarA8 = b44.a(this.f16804q);
        w34 w34VarA9 = b44.a(this.f16805r);
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return sh2.a(contextA, xd0Var, yd0Var, objB, gf2VarE, xg2VarF, w34VarA, w34VarA2, w34VarA3, w34VarA4, w34VarA5, w34VarA6, w34VarA7, w34VarA8, w34VarA9, bb3Var, (au2) this.f16791d.b(), (xm1) this.f16789b.f9280a0.b());
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final ne2 b() {
        Context contextA = this.f16789b.f9281b.a();
        k44.b(contextA);
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        xd0 xd0Var = new xd0();
        k44.b(bb3Var);
        String strC = this.f16788a.c();
        k44.b(strC);
        ke2 ke2VarA = qh2.a(new tg2(xd0Var, bb3Var, strC), ic2.a(), (ScheduledExecutorService) this.f16789b.f9307o.b(), -1);
        h70 h70Var = new h70();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16789b.f9307o.b();
        Context contextA2 = this.f16789b.f9281b.a();
        k44.b(contextA2);
        ke2 ke2VarB = qh2.b(new dh2(h70Var, scheduledExecutorService, contextA2), (ScheduledExecutorService) this.f16789b.f9307o.b());
        ae0 ae0Var = new ae0();
        Context contextA3 = this.f16789b.f9281b.a();
        k44.b(contextA3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f16789b.f9307o.b();
        k44.b(bb3Var);
        hh2 hh2Var = this.f16788a;
        ke2 ke2VarA2 = rh2.a(bf2.a(ae0Var, contextA3, scheduledExecutorService2, bb3Var, hh2Var.a(), kh2.c(hh2Var), mh2.c(this.f16788a)), (ScheduledExecutorService) this.f16789b.f9307o.b());
        k44.b(bb3Var);
        ke2 ke2VarC = qh2.c(new zh2(bb3Var), (ScheduledExecutorService) this.f16789b.f9307o.b());
        oh2 oh2Var = oh2.f13250a;
        Context contextA4 = this.f16789b.f9281b.a();
        k44.b(contextA4);
        String strC2 = this.f16788a.c();
        k44.b(strC2);
        k44.b(bb3Var);
        wf2 wf2Var = new wf2(null, contextA4, strC2, bb3Var);
        em emVar = new em();
        k44.b(bb3Var);
        Context contextA5 = this.f16789b.f9281b.a();
        k44.b(contextA5);
        ae0 ae0Var2 = new ae0();
        int iA = this.f16788a.a();
        Context contextA6 = this.f16789b.f9281b.a();
        k44.b(contextA6);
        je0 je0Var = (je0) this.f16789b.f9294h0.b();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f16789b.f9307o.b();
        k44.b(bb3Var);
        String strC3 = this.f16788a.c();
        k44.b(strC3);
        String strC4 = this.f16788a.c();
        k44.b(strC4);
        rl rlVar = new rl();
        je0 je0Var2 = (je0) this.f16789b.f9294h0.b();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f16789b.f9307o.b();
        k44.b(bb3Var);
        return new ne2(contextA, bb3Var, h63.z(ke2VarA, ke2VarB, ke2VarA2, ke2VarC, oh2Var, wf2Var, new mg2(emVar, bb3Var, contextA5), f(), e(), new ig2(ae0Var2, iA, contextA6, je0Var, scheduledExecutorService3, bb3Var, strC3), (ke2) this.f16789b.J0.b(), eg2.a(strC4, rlVar, je0Var2, scheduledExecutorService4, bb3Var)), (au2) this.f16791d.b(), (xm1) this.f16789b.f9280a0.b());
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final ls2 c() {
        return (ls2) this.B.b();
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final au2 d() {
        return (au2) this.f16791d.b();
    }
}
