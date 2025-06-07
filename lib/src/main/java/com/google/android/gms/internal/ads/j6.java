package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class j6 implements p6 {

    /* renamed from: a, reason: collision with root package name */
    private final x f10317a;

    /* renamed from: b, reason: collision with root package name */
    private final w f10318b;

    /* renamed from: c, reason: collision with root package name */
    private long f10319c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f10320d = -1;

    public j6(x xVar, w wVar) {
        this.f10317a = xVar;
        this.f10318b = wVar;
    }

    @Override // com.google.android.gms.internal.ads.p6
    public final long a(l lVar) {
        long j10 = this.f10320d;
        if (j10 < 0) {
            return -1L;
        }
        this.f10320d = -1L;
        return -(j10 + 2);
    }

    public final void b(long j10) {
        this.f10319c = j10;
    }

    @Override // com.google.android.gms.internal.ads.p6
    public final o0 c() {
        gt1.f(this.f10319c != -1);
        return new v(this.f10317a, this.f10319c);
    }

    @Override // com.google.android.gms.internal.ads.p6
    public final void h(long j10) {
        long[] jArr = this.f10318b.f16920a;
        this.f10320d = jArr[sv2.k(jArr, j10, true, true)];
    }
}
