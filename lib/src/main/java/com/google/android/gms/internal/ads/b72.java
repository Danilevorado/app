package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class b72 implements g72 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c72 f6368a;

    b72(c72 c72Var) {
        this.f6368a = c72Var;
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final void a() {
        synchronized (this.f6368a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f6368a) {
            this.f6368a.f6825c = ((ex0) obj).c();
            ((ex0) obj).b();
        }
    }
}
