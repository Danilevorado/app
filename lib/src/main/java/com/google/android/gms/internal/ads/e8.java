package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
final class e8 extends xn4 {
    public e8(rt2 rt2Var, long j10, long j11) {
        super(new sn4(), new d8(rt2Var, null), j10, 0L, j10 + 1, 0L, j11, 188L, AdError.NETWORK_ERROR_CODE);
    }

    static /* bridge */ /* synthetic */ int h(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
