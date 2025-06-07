package w1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: n, reason: collision with root package name */
    private static final long f27917n = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: o, reason: collision with root package name */
    private static volatile int f27918o;

    /* renamed from: m, reason: collision with root package name */
    private final ExecutorService f27919m;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f27920a;

        /* renamed from: b, reason: collision with root package name */
        private int f27921b;

        /* renamed from: c, reason: collision with root package name */
        private int f27922c;

        /* renamed from: d, reason: collision with root package name */
        private final ThreadFactory f27923d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f27924e = e.f27938d;

        /* renamed from: f, reason: collision with root package name */
        private String f27925f;

        /* renamed from: g, reason: collision with root package name */
        private long f27926g;

        b(boolean z10) {
            this.f27920a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f27925f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f27925f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f27921b, this.f27922c, this.f27926g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f27923d, this.f27925f, this.f27924e, this.f27920a));
            if (this.f27926g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f27925f = str;
            return this;
        }

        public b c(int i10) {
            this.f27921b = i10;
            this.f27922c = i10;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: w1.a$c$a, reason: collision with other inner class name */
        class C0200a extends Thread {
            C0200a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0200a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f27928a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27929b;

        /* renamed from: c, reason: collision with root package name */
        final e f27930c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f27931d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f27932e = new AtomicInteger();

        /* renamed from: w1.a$d$a, reason: collision with other inner class name */
        class RunnableC0201a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Runnable f27933m;

            RunnableC0201a(Runnable runnable) {
                this.f27933m = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f27931d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f27933m.run();
                } catch (Throwable th) {
                    d.this.f27930c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f27928a = threadFactory;
            this.f27929b = str;
            this.f27930c = eVar;
            this.f27931d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f27928a.newThread(new RunnableC0201a(runnable));
            threadNewThread.setName("glide-" + this.f27929b + "-thread-" + this.f27932e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27935a = new C0202a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f27936b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f27937c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f27938d;

        /* renamed from: w1.a$e$a, reason: collision with other inner class name */
        class C0202a implements e {
            C0202a() {
            }

            @Override // w1.a.e
            public void a(Throwable th) {
            }
        }

        class b implements e {
            b() {
            }

            @Override // w1.a.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        class c implements e {
            c() {
            }

            @Override // w1.a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f27936b = bVar;
            f27937c = new c();
            f27938d = bVar;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f27919m = executorService;
    }

    public static int a() {
        if (f27918o == 0) {
            f27918o = Math.min(4, w1.b.a());
        }
        return f27918o;
    }

    public static b b() {
        return new b(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a c() {
        return b().a();
    }

    public static b d() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a e() {
        return d().a();
    }

    public static b f() {
        return new b(false).c(a()).b("source");
    }

    public static a h() {
        return f().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f27917n, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f27938d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f27919m.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f27919m.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f27919m.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f27919m.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f27919m.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f27919m.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f27919m.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f27919m.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f27919m.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f27919m.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f27919m.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f27919m.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f27919m.submit(callable);
    }

    public String toString() {
        return this.f27919m.toString();
    }
}
