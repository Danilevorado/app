package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class pj2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g72 f13910a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ au2 f13911b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ot2 f13912c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ xv0 f13913d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ qj2 f13914e;

    pj2(qj2 qj2Var, g72 g72Var, au2 au2Var, ot2 ot2Var, xv0 xv0Var) {
        this.f13914e = qj2Var;
        this.f13910a = g72Var;
        this.f13911b = au2Var;
        this.f13912c = ot2Var;
        this.f13913d = xv0Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        au2 au2Var;
        final k3.w2 w2VarA = this.f13913d.d().a(th);
        synchronized (this.f13914e) {
            this.f13914e.f14377l = null;
            this.f13913d.e().u(w2VarA);
            if (((Boolean) k3.w.c().b(ir.D7)).booleanValue()) {
                this.f13914e.f14367b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oj2
                    @Override // java.lang.Runnable
                    public final void run() {
                        pj2 pj2Var = this.f13287m;
                        pj2Var.f13914e.f14369d.u(w2VarA);
                    }
                });
            }
            qj2 qj2Var = this.f13914e;
            qj2Var.f14373h.r0(qj2Var.f14375j.a());
            zo2.b(w2VarA.f24788m, th, "BannerAdLoader.onFailure");
            this.f13910a.a();
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f13911b) == null) {
                cu2 cu2Var = this.f13914e.f14374i;
                ot2 ot2Var = this.f13912c;
                ot2Var.u(w2VarA);
                ot2Var.D0(th);
                ot2Var.B0(false);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.c(w2VarA);
                ot2 ot2Var2 = this.f13912c;
                ot2Var2.D0(th);
                ot2Var2.B0(false);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        au2 au2Var;
        zu0 zu0Var = (zu0) obj;
        synchronized (this.f13914e) {
            this.f13914e.f14377l = null;
            this.f13914e.f14371f.removeAllViews();
            if (zu0Var.i() != null) {
                ViewParent parent = zu0Var.i().getParent();
                if (parent instanceof ViewGroup) {
                    ze0.g("Banner view provided from " + (zu0Var.c() != null ? zu0Var.c().h() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zu0Var.i());
                }
            }
            zq zqVar = ir.D7;
            if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
                s51 s51VarE = zu0Var.e();
                s51VarE.a(this.f13914e.f14369d);
                s51VarE.c(this.f13914e.f14370e);
            }
            this.f13914e.f14371f.addView(zu0Var.i());
            this.f13910a.b(zu0Var);
            if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
                qj2 qj2Var = this.f13914e;
                Executor executor = qj2Var.f14367b;
                final q62 q62Var = qj2Var.f14369d;
                q62Var.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nj2
                    @Override // java.lang.Runnable
                    public final void run() {
                        q62Var.m();
                    }
                });
            }
            this.f13914e.f14373h.r0(zu0Var.h());
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f13911b) == null) {
                cu2 cu2Var = this.f13914e.f14374i;
                ot2 ot2Var = this.f13912c;
                ot2Var.C0(zu0Var.g().f16413b);
                ot2Var.W(zu0Var.c().h());
                ot2Var.B0(true);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.f(zu0Var.g().f16413b);
                au2Var.e(zu0Var.c().h());
                ot2 ot2Var2 = this.f13912c;
                ot2Var2.B0(true);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }
}
