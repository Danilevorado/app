package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oh3 extends qh3 {
    public oh3(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.qh3
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.qh3
    public final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        lh3.b(iArr2, this.f14323a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
