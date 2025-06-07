package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f12 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8083a;

    /* renamed from: b, reason: collision with root package name */
    private final dk1 f8084b;

    /* renamed from: c, reason: collision with root package name */
    private final bb1 f8085c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f8086d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f8087e;

    /* renamed from: f, reason: collision with root package name */
    private final ff0 f8088f;

    /* renamed from: g, reason: collision with root package name */
    private final iy f8089g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8090h = ((Boolean) k3.w.c().b(ir.f9998k8)).booleanValue();

    public f12(Context context, ff0 ff0Var, do2 do2Var, Executor executor, bb1 bb1Var, dk1 dk1Var, iy iyVar) {
        this.f8083a = context;
        this.f8086d = do2Var;
        this.f8085c = bb1Var;
        this.f8087e = executor;
        this.f8088f = ff0Var;
        this.f8084b = dk1Var;
        this.f8089g = iyVar;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        final hk1 hk1Var = new hk1();
        ab3 ab3VarM = qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.a12
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f5907a.c(hn2Var, un2Var, hk1Var, obj);
            }
        }, this.f8087e);
        ab3VarM.b(new Runnable() { // from class: com.google.android.gms.internal.ads.b12
            @Override // java.lang.Runnable
            public final void run() {
                hk1Var.b();
            }
        }, this.f8087e);
        return ab3VarM;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var = hn2Var.f9272t;
        return (nn2Var == null || nn2Var.f12718a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ab3 c(final hn2 hn2Var, un2 un2Var, hk1 hk1Var, Object obj) {
        final nk0 nk0VarA = this.f8084b.a(this.f8086d.f7446e, hn2Var, un2Var.f16413b.f15924b);
        nk0VarA.h1(hn2Var.X);
        hk1Var.a(this.f8083a, (View) nk0VarA);
        tf0 tf0Var = new tf0();
        final aa1 aa1VarC = this.f8085c.c(new tx0(un2Var, hn2Var, null), new da1(new e12(this.f8083a, this.f8088f, tf0Var, hn2Var, nk0VarA, this.f8086d, this.f8090h, this.f8089g), nk0VarA));
        tf0Var.e(aa1VarC);
        aa1VarC.b().o0(new f21() { // from class: com.google.android.gms.internal.ads.c12
            @Override // com.google.android.gms.internal.ads.f21
            public final void l() {
                nk0 nk0Var = nk0VarA;
                if (nk0Var.G() != null) {
                    nk0Var.G().q();
                }
            }
        }, of0.f13191f);
        aa1VarC.k().i(nk0VarA, true, this.f8090h ? this.f8089g : null);
        aa1VarC.k();
        nn2 nn2Var = hn2Var.f9272t;
        return qa3.l(ck1.j(nk0VarA, nn2Var.f12719b, nn2Var.f12718a), new w23() { // from class: com.google.android.gms.internal.ads.d12
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj2) {
                nk0 nk0Var = nk0VarA;
                hn2 hn2Var2 = hn2Var;
                aa1 aa1Var = aa1VarC;
                if (hn2Var2.N) {
                    nk0Var.e1();
                }
                nk0Var.D0();
                nk0Var.onPause();
                return aa1Var.i();
            }
        }, this.f8087e);
    }
}
