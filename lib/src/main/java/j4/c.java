package j4;

import e4.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f24534a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f24535b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f24536c = Executors.defaultThreadFactory();

    public c(String str) {
        p.m(str, "Name must not be null");
        this.f24534a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f24536c.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f24534a + "[" + this.f24535b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
