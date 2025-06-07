package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rx0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ma3 f15001a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ sx0 f15002b;

    rx0(sx0 sx0Var, ma3 ma3Var) {
        this.f15002b = sx0Var;
        this.f15001a = ma3Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.px0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14075m.d();
            }
        });
        this.f15001a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.px0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14075m.d();
            }
        });
        this.f15001a.b((ex0) obj);
    }
}
