package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u32 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16148a;

    /* renamed from: b, reason: collision with root package name */
    private final dk1 f16149b;

    /* renamed from: c, reason: collision with root package name */
    private final lj1 f16150c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f16151d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f16152e;

    /* renamed from: f, reason: collision with root package name */
    private final ff0 f16153f;

    /* renamed from: g, reason: collision with root package name */
    private final iy f16154g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16155h = ((Boolean) k3.w.c().b(ir.f9998k8)).booleanValue();

    public u32(Context context, ff0 ff0Var, do2 do2Var, Executor executor, lj1 lj1Var, dk1 dk1Var, iy iyVar) {
        this.f16148a = context;
        this.f16151d = do2Var;
        this.f16150c = lj1Var;
        this.f16152e = executor;
        this.f16153f = ff0Var;
        this.f16149b = dk1Var;
        this.f16154g = iyVar;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        final hk1 hk1Var = new hk1();
        ab3 ab3VarM = qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.m32
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f11917a.c(hn2Var, un2Var, hk1Var, obj);
            }
        }, this.f16152e);
        ab3VarM.b(new Runnable() { // from class: com.google.android.gms.internal.ads.n32
            @Override // java.lang.Runnable
            public final void run() {
                hk1Var.b();
            }
        }, this.f16152e);
        return ab3VarM;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var = hn2Var.f9272t;
        return (nn2Var == null || nn2Var.f12718a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ab3 c(final hn2 hn2Var, un2 un2Var, hk1 hk1Var, Object obj) {
        final nk0 nk0VarA = this.f16149b.a(this.f16151d.f7446e, hn2Var, un2Var.f16413b.f15924b);
        nk0VarA.h1(hn2Var.X);
        hk1Var.a(this.f16148a, (View) nk0VarA);
        tf0 tf0Var = new tf0();
        final hj1 hj1VarC = this.f16150c.c(new tx0(un2Var, hn2Var, null), new ij1(new t32(this.f16148a, this.f16149b, this.f16151d, this.f16153f, hn2Var, tf0Var, nk0VarA, this.f16154g, this.f16155h), nk0VarA));
        tf0Var.e(hj1VarC);
        wy.b(nk0VarA, hj1VarC.i());
        hj1VarC.b().o0(new f21() { // from class: com.google.android.gms.internal.ads.o32
            @Override // com.google.android.gms.internal.ads.f21
            public final void l() {
                nk0 nk0Var = nk0VarA;
                if (nk0Var.G() != null) {
                    nk0Var.G().q();
                }
            }
        }, of0.f13191f);
        hj1VarC.l().i(nk0VarA, true, this.f16155h ? this.f16154g : null);
        hj1VarC.l();
        nn2 nn2Var = hn2Var.f9272t;
        return qa3.l(ck1.j(nk0VarA, nn2Var.f12719b, nn2Var.f12718a), new w23() { // from class: com.google.android.gms.internal.ads.p32
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj2) {
                nk0 nk0Var = nk0VarA;
                hn2 hn2Var2 = hn2Var;
                hj1 hj1Var = hj1VarC;
                if (hn2Var2.N) {
                    nk0Var.e1();
                }
                nk0Var.D0();
                nk0Var.onPause();
                return hj1Var.k();
            }
        }, this.f16152e);
    }
}
