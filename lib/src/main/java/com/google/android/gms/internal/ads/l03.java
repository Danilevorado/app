package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class l03 extends y03 {

    /* renamed from: a, reason: collision with root package name */
    private String f11281a;

    /* renamed from: b, reason: collision with root package name */
    private String f11282b;

    l03() {
    }

    @Override // com.google.android.gms.internal.ads.y03
    public final y03 a(String str) {
        this.f11282b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.y03
    public final y03 b(String str) {
        this.f11281a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.y03
    public final z03 c() {
        return new n03(this.f11281a, this.f11282b, null);
    }
}
