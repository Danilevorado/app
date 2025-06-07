package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rf implements hy2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dx2 f14762a;

    rf(dx2 dx2Var) {
        this.f14762a = dx2Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void a(int i10, long j10, String str) {
        this.f14762a.e(i10, System.currentTimeMillis() - j10, str);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b(int i10, long j10) {
        this.f14762a.d(i10, System.currentTimeMillis() - j10);
    }
}
