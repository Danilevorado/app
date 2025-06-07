package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w42 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final hs f16969a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f16970b;

    /* renamed from: c, reason: collision with root package name */
    private final ls2 f16971c;

    /* renamed from: d, reason: collision with root package name */
    private final f52 f16972d;

    public w42(ls2 ls2Var, bb3 bb3Var, hs hsVar, f52 f52Var) {
        this.f16971c = ls2Var;
        this.f16970b = bb3Var;
        this.f16969a = hsVar;
        this.f16972d = f52Var;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(un2 un2Var, hn2 hn2Var) {
        tf0 tf0Var = new tf0();
        b52 b52Var = new b52();
        b52Var.c(new v42(this, tf0Var, un2Var, hn2Var, b52Var));
        nn2 nn2Var = hn2Var.f9272t;
        final bs bsVar = new bs(b52Var, nn2Var.f12719b, nn2Var.f12718a);
        ls2 ls2Var = this.f16971c;
        return vr2.d(new or2() { // from class: com.google.android.gms.internal.ads.u42
            @Override // com.google.android.gms.internal.ads.or2
            public final void a() {
                this.f16164a.c(bsVar);
            }
        }, this.f16970b, fs2.CUSTOM_RENDER_SYN, ls2Var).b(fs2.CUSTOM_RENDER_ACK).d(tf0Var).a();
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var;
        return (this.f16969a == null || (nn2Var = hn2Var.f9272t) == null || nn2Var.f12718a == null) ? false : true;
    }

    final /* synthetic */ void c(bs bsVar) {
        this.f16969a.Y1(bsVar);
    }
}
