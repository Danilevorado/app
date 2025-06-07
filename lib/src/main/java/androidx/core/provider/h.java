package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f2314a;

        /* renamed from: b, reason: collision with root package name */
        private int f2315b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        private static class C0028a extends Thread {

            /* renamed from: m, reason: collision with root package name */
            private final int f2316m;

            C0028a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f2316m = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f2316m);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f2314a = str;
            this.f2315b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0028a(runnable, this.f2314a, this.f2315b);
        }
    }

    private static class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private Callable f2317m;

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.util.a f2318n;

        /* renamed from: o, reason: collision with root package name */
        private Handler f2319o;

        class a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f2320m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Object f2321n;

            a(androidx.core.util.a aVar, Object obj) {
                this.f2320m = aVar;
                this.f2321n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2320m.a(this.f2321n);
            }
        }

        b(Handler handler, Callable callable, androidx.core.util.a aVar) {
            this.f2317m = callable;
            this.f2318n = aVar;
            this.f2319o = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f2317m.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f2319o.post(new a(this.f2318n, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, androidx.core.util.a aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            throw e5;
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
