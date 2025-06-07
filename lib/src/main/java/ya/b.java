package ya;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class b implements Lock {

    /* renamed from: m, reason: collision with root package name */
    private final File f28592m;

    /* renamed from: n, reason: collision with root package name */
    private RandomAccessFile f28593n;

    /* renamed from: o, reason: collision with root package name */
    private FileChannel f28594o;

    /* renamed from: p, reason: collision with root package name */
    private FileLock f28595p;

    b(File file) {
        this.f28592m = file;
    }

    @Override // java.util.concurrent.locks.Lock
    public void lock() throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f28592m, "rwd");
            this.f28593n = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f28594o = channel;
            this.f28595p = channel.lock();
        } catch (Exception e5) {
            try {
                RandomAccessFile randomAccessFile2 = this.f28593n;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                FileChannel fileChannel = this.f28594o;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (Exception unused) {
            }
            throw new ja.b(e5);
        }
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() throws IOException {
        try {
            try {
                FileLock fileLock = this.f28595p;
                if (fileLock != null && fileLock.isValid()) {
                    this.f28595p.release();
                }
            } finally {
                try {
                    RandomAccessFile randomAccessFile = this.f28593n;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    FileChannel fileChannel = this.f28594o;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e5) {
            throw new ja.b(e5);
        }
    }
}
