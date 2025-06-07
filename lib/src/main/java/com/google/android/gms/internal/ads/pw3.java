package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pw3 extends sw3 {

    /* renamed from: r, reason: collision with root package name */
    private final int f14073r;

    /* renamed from: s, reason: collision with root package name */
    private final int f14074s;

    pw3(byte[] bArr, int i10, int i11) {
        super(bArr);
        ww3.B(i10, i10 + i11, bArr.length);
        this.f14073r = i10;
        this.f14074s = i11;
    }

    @Override // com.google.android.gms.internal.ads.sw3
    protected final int O() {
        return this.f14073r;
    }

    @Override // com.google.android.gms.internal.ads.sw3, com.google.android.gms.internal.ads.ww3
    public final byte h(int i10) {
        ww3.L(i10, this.f14074s);
        return this.f15583q[this.f14073r + i10];
    }

    @Override // com.google.android.gms.internal.ads.sw3, com.google.android.gms.internal.ads.ww3
    final byte k(int i10) {
        return this.f15583q[this.f14073r + i10];
    }

    @Override // com.google.android.gms.internal.ads.sw3, com.google.android.gms.internal.ads.ww3
    public final int n() {
        return this.f14074s;
    }

    @Override // com.google.android.gms.internal.ads.sw3, com.google.android.gms.internal.ads.ww3
    protected final void o(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15583q, this.f14073r + i10, bArr, i11, i12);
    }
}
