package w0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f27912e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final File f27913a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f27914b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27915c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f27916d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f27913a = file2;
        this.f27914b = a(file2.getAbsolutePath());
        this.f27915c = z10;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map map = f27912e;
        synchronized (map) {
            reentrantLock = (Lock) map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    public void b() throws IOException {
        c(this.f27915c);
    }

    public void c(boolean z10) throws IOException {
        this.f27914b.lock();
        if (z10) {
            try {
                File parentFile = this.f27913a.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f27913a).getChannel();
                this.f27916d = channel;
                channel.lock();
            } catch (IOException e5) {
                this.f27916d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e5);
            }
        }
    }

    public void d() {
        FileChannel fileChannel = this.f27916d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f27914b.unlock();
    }
}
