package p6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final p6.a f25952a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile p6.a f25953b;

    /* renamed from: p6.b$b, reason: collision with other inner class name */
    private static class C0174b implements p6.a {
        private C0174b() {
        }

        @Override // p6.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0174b c0174b = new C0174b();
        f25952a = c0174b;
        f25953b = c0174b;
    }

    public static p6.a a() {
        return f25953b;
    }
}
