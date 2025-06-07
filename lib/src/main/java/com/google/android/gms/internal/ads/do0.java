package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class do0 extends uf2 {

    /* renamed from: a, reason: collision with root package name */
    private final if2 f7427a;

    /* renamed from: b, reason: collision with root package name */
    private final ho0 f7428b;

    /* renamed from: c, reason: collision with root package name */
    private final do0 f7429c = this;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f7430d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f7431e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f7432f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f7433g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f7434h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f7435i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f7436j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f7437k;

    /* renamed from: l, reason: collision with root package name */
    private final q44 f7438l;

    /* renamed from: m, reason: collision with root package name */
    private final q44 f7439m;

    /* renamed from: n, reason: collision with root package name */
    private final q44 f7440n;

    /* synthetic */ do0(ho0 ho0Var, if2 if2Var, co0 co0Var) {
        this.f7428b = ho0Var;
        this.f7427a = if2Var;
        this.f7430d = b44.c(new bu2(ho0Var.I));
        qf2 qf2Var = new qf2(if2Var);
        this.f7431e = qf2Var;
        q44 q44VarC = b44.c(vl1.a());
        this.f7432f = q44VarC;
        q44 q44VarC2 = b44.c(tl1.a());
        this.f7433g = q44VarC2;
        q44 q44VarC3 = b44.c(xl1.a());
        this.f7434h = q44VarC3;
        q44 q44VarC4 = b44.c(am1.a());
        this.f7435i = q44VarC4;
        f44 f44VarC = g44.c(4);
        f44VarC.b(fs2.GMS_SIGNALS, q44VarC);
        f44VarC.b(fs2.BUILD_URL, q44VarC2);
        f44VarC.b(fs2.HTTP, q44VarC3);
        f44VarC.b(fs2.PRE_PROCESS, q44VarC4);
        g44 g44VarC = f44VarC.c();
        this.f7436j = g44VarC;
        q44 q44VarC5 = b44.c(new bm1(qf2Var, ho0Var.f9295i, fr2.a(), g44VarC));
        this.f7437k = q44VarC5;
        m44 m44VarA = o44.a(0, 1);
        m44VarA.a(q44VarC5);
        o44 o44VarC = m44VarA.c();
        this.f7438l = o44VarC;
        os2 os2Var = new os2(o44VarC);
        this.f7439m = os2Var;
        this.f7440n = b44.c(new ns2(fr2.a(), ho0Var.f9307o, os2Var));
    }

    @Override // com.google.android.gms.internal.ads.uf2
    public final ne2 a() {
        Context contextA = this.f7428b.f9281b.a();
        k44.b(contextA);
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        xd0 xd0Var = new xd0();
        k44.b(bb3Var);
        ke2 ke2VarA = qh2.a(new tg2(xd0Var, bb3Var, jf2.a(this.f7427a)), ic2.a(), (ScheduledExecutorService) this.f7428b.f9307o.b(), 0);
        h70 h70Var = new h70();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f7428b.f9307o.b();
        Context contextA2 = this.f7428b.f9281b.a();
        k44.b(contextA2);
        ke2 ke2VarB = qh2.b(new dh2(h70Var, scheduledExecutorService, contextA2), (ScheduledExecutorService) this.f7428b.f9307o.b());
        ae0 ae0Var = new ae0();
        Context contextA3 = this.f7428b.f9281b.a();
        k44.b(contextA3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f7428b.f9307o.b();
        k44.b(bb3Var);
        ke2 ke2VarA2 = rh2.a(bf2.a(ae0Var, contextA3, scheduledExecutorService2, bb3Var, kf2.a(this.f7427a), mf2.a(this.f7427a), nf2.a(this.f7427a)), (ScheduledExecutorService) this.f7428b.f9307o.b());
        k44.b(bb3Var);
        ke2 ke2VarC = qh2.c(new zh2(bb3Var), (ScheduledExecutorService) this.f7428b.f9307o.b());
        oh2 oh2Var = oh2.f13250a;
        Context contextA4 = this.f7428b.f9281b.a();
        k44.b(contextA4);
        String strA = jf2.a(this.f7427a);
        k44.b(bb3Var);
        wf2 wf2Var = new wf2(null, contextA4, strA, bb3Var);
        em emVar = new em();
        k44.b(bb3Var);
        Context contextA5 = this.f7428b.f9281b.a();
        k44.b(contextA5);
        sq sqVar = new sq();
        k44.b(bb3Var);
        ae0 ae0Var2 = new ae0();
        k44.b(bb3Var);
        ae0 ae0Var3 = new ae0();
        int iA = kf2.a(this.f7427a);
        Context contextA6 = this.f7428b.f9281b.a();
        k44.b(contextA6);
        je0 je0Var = (je0) this.f7428b.f9294h0.b();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f7428b.f9307o.b();
        k44.b(bb3Var);
        String strA2 = jf2.a(this.f7427a);
        rl rlVar = new rl();
        je0 je0Var2 = (je0) this.f7428b.f9294h0.b();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f7428b.f9307o.b();
        k44.b(bb3Var);
        return new ne2(contextA, bb3Var, h63.z(ke2VarA, ke2VarB, ke2VarA2, ke2VarC, oh2Var, wf2Var, new mg2(emVar, bb3Var, contextA5), new xg2(sqVar, bb3Var, lf2.a(this.f7427a)), new gf2(ae0Var2, bb3Var, of2.a(this.f7427a), pf2.a(this.f7427a), kf2.a(this.f7427a)), new ig2(ae0Var3, iA, contextA6, je0Var, scheduledExecutorService3, bb3Var, jf2.a(this.f7427a)), (ke2) this.f7428b.J0.b(), eg2.a(strA2, rlVar, je0Var2, scheduledExecutorService4, bb3Var)), (au2) this.f7430d.b(), (xm1) this.f7428b.f9280a0.b());
    }

    @Override // com.google.android.gms.internal.ads.uf2
    public final ls2 b() {
        return (ls2) this.f7440n.b();
    }
}
