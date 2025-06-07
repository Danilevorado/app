package n2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: m, reason: collision with root package name */
    private final long f25487m;

    /* renamed from: n, reason: collision with root package name */
    private int f25488n;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f25487m = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f25488n += i10;
        } else if (this.f25487m - this.f25488n > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f25487m + ", but read: " + this.f25488n);
        }
        return i10;
    }

    public static InputStream c(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f25487m - this.f25488n, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
