package d8;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final ha.c f22981a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f22982b;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22983a;

        a(String str) {
            this.f22983a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return b.this.b(runnable, this.f22983a);
        }
    }

    public b(String str, ha.c cVar, Map map) {
        this.f22981a = cVar;
        this.f22982b = c(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Thread b(Runnable runnable, String str) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("binaryprefs-pool-%s", str));
        thread.setPriority(10);
        return thread;
    }

    private ExecutorService c(String str, Map map) {
        if (map.containsKey(str)) {
            return (ExecutorService) map.get(str);
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, d(str));
        map.put(str, executorServiceNewFixedThreadPool);
        return executorServiceNewFixedThreadPool;
    }

    private ThreadFactory d(String str) {
        return new a(str);
    }

    @Override // d8.c
    public d8.a submit(Runnable runnable) {
        return new d8.a(this.f22982b.submit(runnable), this.f22981a);
    }

    @Override // d8.c
    public d8.a submit(Callable callable) {
        return new d8.a(this.f22982b.submit(callable), this.f22981a);
    }
}
