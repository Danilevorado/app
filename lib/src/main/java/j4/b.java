package j4;

import e4.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f24532a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f24533b = Executors.defaultThreadFactory();

    public b(String str) {
        p.m(str, "Name must not be null");
        this.f24532a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f24533b.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f24532a);
        return threadNewThread;
    }
}
