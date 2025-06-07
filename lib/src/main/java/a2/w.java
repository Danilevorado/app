package a2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class w extends FilterInputStream {

    /* renamed from: m, reason: collision with root package name */
    private volatile byte[] f86m;

    /* renamed from: n, reason: collision with root package name */
    private int f87n;

    /* renamed from: o, reason: collision with root package name */
    private int f88o;

    /* renamed from: p, reason: collision with root package name */
    private int f89p;

    /* renamed from: q, reason: collision with root package name */
    private int f90q;

    /* renamed from: r, reason: collision with root package name */
    private final u1.b f91r;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, u1.b bVar) {
        this(inputStream, bVar, 65536);
    }

    w(InputStream inputStream, u1.b bVar, int i10) {
        super(inputStream);
        this.f89p = -1;
        this.f91r = bVar;
        this.f86m = (byte[]) bVar.e(i10, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f89p;
        if (i10 != -1) {
            int i11 = this.f90q - i10;
            int i12 = this.f88o;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f87n == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f91r.e(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f86m = bArr2;
                    this.f91r.d(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f90q - this.f89p;
                this.f90q = i13;
                this.f89p = 0;
                this.f87n = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f90q;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f87n = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f89p = -1;
            this.f90q = 0;
            this.f87n = i16;
        }
        return i16;
    }

    private static IOException f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f86m == null || inputStream == null) {
            throw f();
        }
        return (this.f87n - this.f90q) + inputStream.available();
    }

    public synchronized void c() {
        this.f88o = this.f86m.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f86m != null) {
            this.f91r.d(this.f86m);
            this.f86m = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        if (this.f86m != null) {
            this.f91r.d(this.f86m);
            this.f86m = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f88o = Math.max(this.f88o, i10);
        this.f89p = this.f90q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f86m;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw f();
        }
        if (this.f90q >= this.f87n && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f86m && (bArr = this.f86m) == null) {
            throw f();
        }
        int i10 = this.f87n;
        int i11 = this.f90q;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f90q = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f86m;
        if (bArr2 == null) {
            throw f();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw f();
        }
        int i14 = this.f90q;
        int i15 = this.f87n;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f90q += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f89p == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f86m && (bArr2 = this.f86m) == null) {
                    throw f();
                }
                int i17 = this.f87n;
                int i18 = this.f90q;
                i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f90q += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f86m == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f89p;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f90q + " markLimit: " + this.f88o);
        }
        this.f90q = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f86m;
        if (bArr == null) {
            throw f();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw f();
        }
        int i10 = this.f87n;
        int i11 = this.f90q;
        if (i10 - i11 >= j10) {
            this.f90q = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f90q = i10;
        if (this.f89p == -1 || j10 > this.f88o) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f89p = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f87n;
        int i13 = this.f90q;
        if (i12 - i13 >= j10 - j11) {
            this.f90q = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f90q = i12;
        return j12;
    }
}
