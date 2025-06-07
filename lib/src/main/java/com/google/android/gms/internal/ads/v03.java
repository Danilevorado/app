package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v03 extends o13 {

    /* renamed from: a, reason: collision with root package name */
    private String f16515a;

    /* renamed from: b, reason: collision with root package name */
    private String f16516b;

    v03() {
    }

    @Override // com.google.android.gms.internal.ads.o13
    public final o13 a(String str) {
        this.f16516b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o13
    public final o13 b(String str) {
        this.f16515a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o13
    public final p13 c() {
        return new x03(this.f16515a, this.f16516b, null);
    }
}
