package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class ib extends FilterInputStream {

    /* renamed from: m, reason: collision with root package name */
    private final long f9663m;

    /* renamed from: n, reason: collision with root package name */
    private long f9664n;

    ib(InputStream inputStream, long j10) {
        super(inputStream);
        this.f9663m = j10;
    }

    final long a() {
        return this.f9663m - this.f9664n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f9664n++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f9664n += i12;
        }
        return i12;
    }
}
