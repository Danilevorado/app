package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vq2 {

    /* renamed from: a, reason: collision with root package name */
    private final nq2 f16834a;

    /* renamed from: b, reason: collision with root package name */
    private final ab3 f16835b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16836c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16837d = false;

    public vq2(final sp2 sp2Var, final mq2 mq2Var, final nq2 nq2Var) {
        this.f16834a = nq2Var;
        this.f16835b = qa3.f(qa3.m(mq2Var.b(nq2Var), new w93() { // from class: com.google.android.gms.internal.ads.tq2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f16006a.b(mq2Var, sp2Var, nq2Var, (bq2) obj);
            }
        }, nq2Var.b()), Exception.class, new w93() { // from class: com.google.android.gms.internal.ads.uq2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f16428a.c(mq2Var, (Exception) obj);
            }
        }, nq2Var.b());
    }

    public final synchronized ab3 a(nq2 nq2Var) {
        if (!this.f16837d && !this.f16836c) {
            if (this.f16834a.a() != null && nq2Var.a() != null && this.f16834a.a().equals(nq2Var.a())) {
                this.f16836c = true;
                return this.f16835b;
            }
            return null;
        }
        return null;
    }

    final /* synthetic */ ab3 b(mq2 mq2Var, sp2 sp2Var, nq2 nq2Var, bq2 bq2Var) {
        synchronized (this) {
            this.f16837d = true;
            mq2Var.a(bq2Var);
            if (this.f16836c) {
                return qa3.h(new lq2(bq2Var, nq2Var));
            }
            sp2Var.d(nq2Var.a(), bq2Var);
            return qa3.h(null);
        }
    }

    final /* synthetic */ ab3 c(mq2 mq2Var, Exception exc) {
        synchronized (this) {
            this.f16837d = true;
            throw exc;
        }
    }

    public final synchronized void d(ma3 ma3Var) {
        qa3.q(qa3.m(this.f16835b, new w93() { // from class: com.google.android.gms.internal.ads.sq2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.i();
            }
        }, this.f16834a.b()), ma3Var, this.f16834a.b());
    }
}
