package s0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f26693e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final File f26694a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f26695b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26696c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f26697d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f26694a = file2;
        this.f26695b = a(file2.getAbsolutePath());
        this.f26696c = z10;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map map = f26693e;
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
        this.f26695b.lock();
        if (this.f26696c) {
            try {
                FileChannel channel = new FileOutputStream(this.f26694a).getChannel();
                this.f26697d = channel;
                channel.lock();
            } catch (IOException e5) {
                throw new IllegalStateException("Unable to grab copy lock.", e5);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f26697d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f26695b.unlock();
    }
}
