package n2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private static final Queue f25489o = l.e(0);

    /* renamed from: m, reason: collision with root package name */
    private InputStream f25490m;

    /* renamed from: n, reason: collision with root package name */
    private IOException f25491n;

    d() {
    }

    public static d c(InputStream inputStream) {
        d dVar;
        Queue queue = f25489o;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.f(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f25491n;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f25490m.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25490m.close();
    }

    public void e() {
        this.f25491n = null;
        this.f25490m = null;
        Queue queue = f25489o;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void f(InputStream inputStream) {
        this.f25490m = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f25490m.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f25490m.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f25490m.read();
        } catch (IOException e5) {
            this.f25491n = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f25490m.read(bArr);
        } catch (IOException e5) {
            this.f25491n = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f25490m.read(bArr, i10, i11);
        } catch (IOException e5) {
            this.f25491n = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f25490m.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f25490m.skip(j10);
        } catch (IOException e5) {
            this.f25491n = e5;
            throw e5;
        }
    }
}
