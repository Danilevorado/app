package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class l9 implements m9 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f11411a;

    public l9(ByteBuffer byteBuffer) {
        this.f11411a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.m9
    public final long a() {
        return this.f11411a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.m9
    public final void b(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f11411a) {
            int i11 = (int) j10;
            this.f11411a.position(i11);
            this.f11411a.limit(i11 + i10);
            byteBufferSlice = this.f11411a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
