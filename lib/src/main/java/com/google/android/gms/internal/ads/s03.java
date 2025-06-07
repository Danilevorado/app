package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class s03 extends l13 {

    /* renamed from: a, reason: collision with root package name */
    private int f15035a;

    /* renamed from: b, reason: collision with root package name */
    private String f15036b;

    /* renamed from: c, reason: collision with root package name */
    private byte f15037c;

    s03() {
    }

    @Override // com.google.android.gms.internal.ads.l13
    public final l13 a(String str) {
        this.f15036b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l13
    public final l13 b(int i10) {
        this.f15035a = i10;
        this.f15037c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l13
    public final m13 c() {
        if (this.f15037c == 1) {
            return new u03(this.f15035a, this.f15036b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
