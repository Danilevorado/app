package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class n9 implements m9 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f12531a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12532b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12533c;

    public n9(FileChannel fileChannel, long j10, long j11) {
        this.f12531a = fileChannel;
        this.f12532b = j10;
        this.f12533c = j11;
    }

    @Override // com.google.android.gms.internal.ads.m9
    public final long a() {
        return this.f12533c;
    }

    @Override // com.google.android.gms.internal.ads.m9
    public final void b(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f12531a.map(FileChannel.MapMode.READ_ONLY, this.f12532b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
