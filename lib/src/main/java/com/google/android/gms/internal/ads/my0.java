package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class my0 {

    /* renamed from: a, reason: collision with root package name */
    private final js1 f12297a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f12298b;

    /* renamed from: c, reason: collision with root package name */
    private final ls2 f12299c;

    /* renamed from: d, reason: collision with root package name */
    private final ds0 f12300d;

    /* renamed from: e, reason: collision with root package name */
    private final y22 f12301e;

    /* renamed from: f, reason: collision with root package name */
    private final u61 f12302f;

    /* renamed from: g, reason: collision with root package name */
    private un2 f12303g;

    /* renamed from: h, reason: collision with root package name */
    private final pt1 f12304h;

    /* renamed from: i, reason: collision with root package name */
    private final o01 f12305i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f12306j;

    /* renamed from: k, reason: collision with root package name */
    private final at1 f12307k;

    /* renamed from: l, reason: collision with root package name */
    private final fz1 f12308l;

    /* renamed from: m, reason: collision with root package name */
    private final fu1 f12309m;

    /* renamed from: n, reason: collision with root package name */
    private final nu1 f12310n;

    my0(js1 js1Var, do2 do2Var, ls2 ls2Var, ds0 ds0Var, y22 y22Var, u61 u61Var, un2 un2Var, pt1 pt1Var, o01 o01Var, Executor executor, at1 at1Var, fz1 fz1Var, fu1 fu1Var, nu1 nu1Var) {
        this.f12297a = js1Var;
        this.f12298b = do2Var;
        this.f12299c = ls2Var;
        this.f12300d = ds0Var;
        this.f12301e = y22Var;
        this.f12302f = u61Var;
        this.f12303g = un2Var;
        this.f12304h = pt1Var;
        this.f12305i = o01Var;
        this.f12306j = executor;
        this.f12307k = at1Var;
        this.f12308l = fz1Var;
        this.f12309m = fu1Var;
        this.f12310n = nu1Var;
    }

    public final k3.w2 a(Throwable th) {
        return fp2.b(th, this.f12308l);
    }

    public final u61 c() {
        return this.f12302f;
    }

    final /* synthetic */ un2 d(un2 un2Var) {
        this.f12300d.a(un2Var);
        return un2Var;
    }

    public final ab3 e(final zp2 zp2Var) {
        qr2 qr2VarA = this.f12299c.b(fs2.GET_CACHE_KEY, this.f12305i.c()).f(new w93() { // from class: com.google.android.gms.internal.ads.jy0
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f10744a.f(zp2Var, (k90) obj);
            }
        }).a();
        qa3.q(qr2VarA, new ky0(this), this.f12306j);
        return qr2VarA;
    }

    final /* synthetic */ ab3 f(zp2 zp2Var, k90 k90Var) {
        k90Var.f10921u = zp2Var;
        return this.f12304h.a(k90Var);
    }

    final /* synthetic */ ab3 g(ab3 ab3Var, ab3 ab3Var2, ab3 ab3Var3) {
        return this.f12310n.c((k90) ab3Var.get(), (JSONObject) ab3Var2.get(), (n90) ab3Var3.get());
    }

    public final ab3 h(k90 k90Var) {
        qr2 qr2VarA = this.f12299c.b(fs2.NOTIFY_CACHE_HIT, this.f12304h.g(k90Var)).a();
        qa3.q(qr2VarA, new ly0(this), this.f12306j);
        return qr2VarA;
    }

    public final ab3 i(ab3 ab3Var) {
        cs2 cs2VarF = this.f12299c.b(fs2.RENDERER, ab3Var).e(new nr2() { // from class: com.google.android.gms.internal.ads.iy0
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                un2 un2Var = (un2) obj;
                this.f10215a.d(un2Var);
                return un2Var;
            }
        }).f(this.f12301e);
        if (!((Boolean) k3.w.c().b(ir.f5)).booleanValue()) {
            cs2VarF = cs2VarF.i(((Integer) k3.w.c().b(ir.f9951g5)).intValue(), TimeUnit.SECONDS);
        }
        return cs2VarF.a();
    }

    public final ab3 j() {
        k3.c4 c4Var = this.f12298b.f7445d;
        if (c4Var.J == null && c4Var.E == null) {
            return k(this.f12305i.c());
        }
        ls2 ls2Var = this.f12299c;
        return vr2.c(this.f12297a.a(), fs2.PRELOADED_LOADER, ls2Var).a();
    }

    public final ab3 k(final ab3 ab3Var) {
        cs2 cs2VarF;
        un2 un2Var = this.f12303g;
        if (un2Var != null) {
            cs2VarF = vr2.c(qa3.h(un2Var), fs2.SERVER_TRANSACTION, this.f12299c);
        } else {
            j3.t.e().j();
            if (!((Boolean) k3.w.c().b(ir.K9)).booleanValue() || ((Boolean) jt.f10694b.e()).booleanValue()) {
                cs2 cs2VarB = this.f12299c.b(fs2.SERVER_TRANSACTION, ab3Var);
                final at1 at1Var = this.f12307k;
                cs2VarF = cs2VarB.f(new w93() { // from class: com.google.android.gms.internal.ads.hy0
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        return at1Var.a((k90) obj);
                    }
                });
            } else {
                final fu1 fu1Var = this.f12309m;
                final ab3 ab3VarM = qa3.m(ab3Var, new w93() { // from class: com.google.android.gms.internal.ads.cy0
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        return fu1Var.a((k90) obj);
                    }
                }, this.f12306j);
                cs2 cs2VarB2 = this.f12299c.b(fs2.BUILD_URL, ab3VarM);
                final pt1 pt1Var = this.f12304h;
                final qr2 qr2VarA = cs2VarB2.f(new w93() { // from class: com.google.android.gms.internal.ads.dy0
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        return pt1Var.b((JSONObject) obj);
                    }
                }).a();
                cs2VarF = this.f12299c.a(fs2.SERVER_TRANSACTION, ab3Var, ab3VarM, qr2VarA).a(new Callable() { // from class: com.google.android.gms.internal.ads.fy0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f8502a.g(ab3Var, ab3VarM, qr2VarA);
                    }
                }).f(new w93() { // from class: com.google.android.gms.internal.ads.gy0
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        return (ab3) obj;
                    }
                });
            }
        }
        return cs2VarF.a();
    }

    public final void l(un2 un2Var) {
        this.f12303g = un2Var;
    }
}
