package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f5436o;

    /* renamed from: p, reason: collision with root package name */
    private static final int f5437p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f5438q;

    /* renamed from: m, reason: collision with root package name */
    private final byte f5439m;

    /* renamed from: n, reason: collision with root package name */
    private int f5440n;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f5436o = bArr;
        int length = bArr.length;
        f5437p = length;
        f5438q = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f5439m = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f5440n;
        int i12 = (i11 < 2 || i11 > (i10 = f5438q)) ? super.read() : i11 == i10 ? this.f5439m : f5436o[i11 - 2] & 255;
        if (i12 != -1) {
            this.f5440n++;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f5440n;
        int i14 = f5438q;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f5439m;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f5436o, this.f5440n - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f5440n += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f5440n = (int) (this.f5440n + jSkip);
        }
        return jSkip;
    }
}
