package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v02 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w02 f16514a;

    v02(w02 w02Var) {
        this.f16514a = w02Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        k3.w2 w2VarA = this.f16514a.f16926a.d().a(th);
        this.f16514a.f16929d.u(w2VarA);
        zo2.b(w2VarA.f24788m, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* synthetic */ void b(Object obj) {
        ((zu0) obj).b();
    }
}
