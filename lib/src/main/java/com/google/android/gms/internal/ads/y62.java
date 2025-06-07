package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class y62 implements g72 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z62 f17903a;

    y62(z62 z62Var) {
        this.f17903a = z62Var;
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final void a() {
        synchronized (this.f17903a) {
            this.f17903a.f18455u = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        z91 z91Var = (z91) obj;
        synchronized (this.f17903a) {
            this.f17903a.f18455u = z91Var;
            this.f17903a.f18455u.b();
        }
    }
}
