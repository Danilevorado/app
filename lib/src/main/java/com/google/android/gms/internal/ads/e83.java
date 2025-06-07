package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
final class e83 extends OutputStream {
    e83() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr);
        i33.g(i10, i11 + i10, bArr.length);
    }
}
