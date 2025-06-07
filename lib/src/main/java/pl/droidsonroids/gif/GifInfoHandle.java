package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;

/* loaded from: classes2.dex */
final class GifInfoHandle {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f25970a;

    static {
        h.b();
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f25970a = n(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    GifInfoHandle(String str) {
        this.f25970a = openFile(str);
    }

    static native int createTempNativeFileDescriptor();

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10);

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    private static int h(FileDescriptor fileDescriptor, boolean z10) throws ErrnoException {
        try {
            int iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
            return iCreateTempNativeFileDescriptor;
        } finally {
            if (z10) {
                Os.close(fileDescriptor);
            }
        }
    }

    private static native boolean isOpaque(long j10);

    private static long n(FileDescriptor fileDescriptor, long j10, boolean z10) throws GifIOException {
        int iH;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                iH = h(fileDescriptor, z10);
            } catch (Exception e5) {
                throw new GifIOException(c.OPEN_FAILED.f26001n, e5.getMessage());
            }
        } else {
            iH = extractNativeFileDescriptor(fileDescriptor, z10);
        }
        return openNativeFileDescriptor(iH, j10);
    }

    static GifInfoHandle o(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return new GifInfoHandle(assetFileDescriptorOpenAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    static native long openFile(String str);

    static native long openNativeFileDescriptor(int i10, long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    synchronized int a() {
        return getCurrentFrameIndex(this.f25970a);
    }

    synchronized int b() {
        return getCurrentLoop(this.f25970a);
    }

    synchronized int c() {
        return getCurrentPosition(this.f25970a);
    }

    synchronized int d() {
        return getDuration(this.f25970a);
    }

    synchronized int e() {
        return getHeight(this.f25970a);
    }

    synchronized int f() {
        return getLoopCount(this.f25970a);
    }

    protected void finalize() throws Throwable {
        try {
            p();
        } finally {
            super.finalize();
        }
    }

    synchronized int g() {
        return getNativeErrorCode(this.f25970a);
    }

    synchronized int i() {
        return getNumberOfFrames(this.f25970a);
    }

    synchronized long[] j() {
        return getSavedState(this.f25970a);
    }

    synchronized int k() {
        return getWidth(this.f25970a);
    }

    synchronized boolean l() {
        return isOpaque(this.f25970a);
    }

    synchronized boolean m() {
        return this.f25970a == 0;
    }

    synchronized void p() {
        free(this.f25970a);
        this.f25970a = 0L;
    }

    synchronized long q(Bitmap bitmap) {
        return renderFrame(this.f25970a, bitmap);
    }

    synchronized boolean r() {
        return reset(this.f25970a);
    }

    synchronized long s() {
        return restoreRemainder(this.f25970a);
    }

    synchronized int t(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f25970a, jArr, bitmap);
    }

    synchronized void u() {
        saveRemainder(this.f25970a);
    }

    synchronized void v(int i10, Bitmap bitmap) {
        seekToTime(this.f25970a, i10, bitmap);
    }

    void w(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f25970a, (char) i10);
        }
    }
}
