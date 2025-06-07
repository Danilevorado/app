package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qx0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ma3 f14523a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ sx0 f14524b;

    qx0(sx0 sx0Var, ma3 ma3Var) {
        this.f14524b = sx0Var;
        this.f14523a = ma3Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        this.f14523a.a(th);
        of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.px0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14075m.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        sx0.b(this.f14524b, ((lx0) obj).f11861a, this.f14523a);
    }
}
