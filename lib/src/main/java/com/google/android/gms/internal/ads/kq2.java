package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class kq2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nq2 f11191a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ pq2 f11192b;

    kq2(pq2 pq2Var, nq2 nq2Var) {
        this.f11192b = pq2Var;
        this.f11191a = nq2Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        synchronized (this.f11192b) {
            this.f11192b.f14026e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f11192b) {
            this.f11192b.f14026e = null;
            this.f11192b.f14025d.addFirst(this.f11191a);
            pq2 pq2Var = this.f11192b;
            if (pq2Var.f14027f == 1) {
                pq2Var.h();
            }
        }
    }
}
