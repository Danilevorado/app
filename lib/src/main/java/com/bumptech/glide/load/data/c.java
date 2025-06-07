package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: m, reason: collision with root package name */
    private final OutputStream f5429m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f5430n;

    /* renamed from: o, reason: collision with root package name */
    private u1.b f5431o;

    /* renamed from: p, reason: collision with root package name */
    private int f5432p;

    public c(OutputStream outputStream, u1.b bVar) {
        this(outputStream, bVar, 65536);
    }

    c(OutputStream outputStream, u1.b bVar, int i10) {
        this.f5429m = outputStream;
        this.f5431o = bVar;
        this.f5430n = (byte[]) bVar.e(i10, byte[].class);
    }

    private void a() throws IOException {
        int i10 = this.f5432p;
        if (i10 > 0) {
            this.f5429m.write(this.f5430n, 0, i10);
            this.f5432p = 0;
        }
    }

    private void c() throws IOException {
        if (this.f5432p == this.f5430n.length) {
            a();
        }
    }

    private void e() {
        byte[] bArr = this.f5430n;
        if (bArr != null) {
            this.f5431o.d(bArr);
            this.f5430n = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f5429m.close();
            e();
        } catch (Throwable th) {
            this.f5429m.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f5429m.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f5430n;
        int i11 = this.f5432p;
        this.f5432p = i11 + 1;
        bArr[i11] = (byte) i10;
        c();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f5432p;
            if (i15 == 0 && i13 >= this.f5430n.length) {
                this.f5429m.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f5430n.length - i15);
            System.arraycopy(bArr, i14, this.f5430n, this.f5432p, iMin);
            this.f5432p += iMin;
            i12 += iMin;
            c();
        } while (i12 < i11);
    }
}
