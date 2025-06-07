package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ew3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8011a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f8012b;

    /* renamed from: c, reason: collision with root package name */
    private int f8013c;

    public ew3(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f8011a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f8011a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f8012b = 0;
        this.f8013c = 0;
    }

    public final void a(byte[] bArr) {
        int i10 = this.f8012b;
        int i11 = this.f8013c;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f8011a;
            i10 = (i10 + 1) & 255;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & 255;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & 255] ^ bArr[i12]);
        }
        this.f8012b = i10;
        this.f8013c = i11;
    }
}
