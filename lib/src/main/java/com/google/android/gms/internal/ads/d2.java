package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class d2 extends y {

    /* renamed from: b, reason: collision with root package name */
    private final long f7164b;

    public d2(l lVar, long j10) {
        super(lVar);
        gt1.d(lVar.e() >= j10);
        this.f7164b = j10;
    }

    @Override // com.google.android.gms.internal.ads.y, com.google.android.gms.internal.ads.l
    public final long c() {
        return super.c() - this.f7164b;
    }

    @Override // com.google.android.gms.internal.ads.y, com.google.android.gms.internal.ads.l
    public final long e() {
        return super.e() - this.f7164b;
    }

    @Override // com.google.android.gms.internal.ads.y, com.google.android.gms.internal.ads.l
    public final long f() {
        return super.f() - this.f7164b;
    }
}
