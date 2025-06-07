package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lz1 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final nu0 f11877a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11878b;

    /* renamed from: c, reason: collision with root package name */
    private final dk1 f11879c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f11880d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f11881e;

    /* renamed from: f, reason: collision with root package name */
    private final ff0 f11882f;

    /* renamed from: g, reason: collision with root package name */
    private final iy f11883g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f11884h = ((Boolean) k3.w.c().b(ir.f9998k8)).booleanValue();

    public lz1(nu0 nu0Var, Context context, Executor executor, dk1 dk1Var, do2 do2Var, ff0 ff0Var, iy iyVar) {
        this.f11878b = context;
        this.f11877a = nu0Var;
        this.f11881e = executor;
        this.f11879c = dk1Var;
        this.f11880d = do2Var;
        this.f11882f = ff0Var;
        this.f11883g = iyVar;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        final hk1 hk1Var = new hk1();
        ab3 ab3VarM = qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.jz1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f10752a.c(hn2Var, un2Var, hk1Var, obj);
            }
        }, this.f11881e);
        ab3VarM.b(new Runnable() { // from class: com.google.android.gms.internal.ads.kz1
            @Override // java.lang.Runnable
            public final void run() {
                hk1Var.b();
            }
        }, this.f11881e);
        return ab3VarM;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var = hn2Var.f9272t;
        return (nn2Var == null || nn2Var.f12718a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ab3 c(final hn2 hn2Var, un2 un2Var, hk1 hk1Var, Object obj) {
        final nk0 nk0VarA = this.f11879c.a(this.f11880d.f7446e, hn2Var, un2Var.f16413b.f15924b);
        nk0VarA.h1(hn2Var.X);
        hk1Var.a(this.f11878b, (View) nk0VarA);
        tf0 tf0Var = new tf0();
        final ku0 ku0VarA = this.f11877a.a(new tx0(un2Var, hn2Var, null), new da1(new oz1(this.f11882f, tf0Var, hn2Var, nk0VarA, this.f11880d, this.f11884h, this.f11883g), nk0VarA), new lu0(hn2Var.f9239b0));
        ku0VarA.j().i(nk0VarA, false, this.f11884h ? this.f11883g : null);
        tf0Var.e(ku0VarA);
        ku0VarA.b().o0(new f21() { // from class: com.google.android.gms.internal.ads.hz1
            @Override // com.google.android.gms.internal.ads.f21
            public final void l() {
                nk0 nk0Var = nk0VarA;
                if (nk0Var.G() != null) {
                    nk0Var.G().q();
                }
            }
        }, of0.f13191f);
        ku0VarA.j();
        nn2 nn2Var = hn2Var.f9272t;
        return qa3.l(ck1.j(nk0VarA, nn2Var.f12719b, nn2Var.f12718a), new w23() { // from class: com.google.android.gms.internal.ads.iz1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj2) {
                nk0 nk0Var = nk0VarA;
                hn2 hn2Var2 = hn2Var;
                ku0 ku0Var = ku0VarA;
                if (hn2Var2.N) {
                    nk0Var.e1();
                }
                nk0Var.D0();
                nk0Var.onPause();
                return ku0Var.h();
            }
        }, this.f11881e);
    }
}
