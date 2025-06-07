package n2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class i extends FilterInputStream {

    /* renamed from: m, reason: collision with root package name */
    private int f25503m;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f25503m = Integer.MIN_VALUE;
    }

    private long a(long j10) {
        int i10 = this.f25503m;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    private void c(long j10) {
        int i10 = this.f25503m;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f25503m = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f25503m;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f25503m = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        c(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iA = (int) a(i11);
        if (iA == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iA);
        c(i12);
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f25503m = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jA = a(j10);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        c(jSkip);
        return jSkip;
    }
}
