package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class hi0 implements o34 {

    /* renamed from: m, reason: collision with root package name */
    private final ByteBuffer f9142m;

    hi0(ByteBuffer byteBuffer) {
        this.f9142m = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final int M(ByteBuffer byteBuffer) {
        if (this.f9142m.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f9142m.remaining());
        byte[] bArr = new byte[iMin];
        this.f9142m.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final ByteBuffer Q(long j10, long j11) {
        int iPosition = this.f9142m.position();
        this.f9142m.position((int) j10);
        ByteBuffer byteBufferSlice = this.f9142m.slice();
        byteBufferSlice.limit((int) j11);
        this.f9142m.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final long b() {
        return this.f9142m.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final long d() {
        return this.f9142m.limit();
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final void h(long j10) {
        this.f9142m.position((int) j10);
    }
}
