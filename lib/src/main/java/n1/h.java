package n1;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private final Activity f25478b;

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f25477a = Executors.newSingleThreadScheduledExecutor(new b());

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f25479c = null;

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    public h(Activity activity) {
        this.f25478b = activity;
        b();
    }

    private void a() {
        ScheduledFuture scheduledFuture = this.f25479c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f25479c = null;
        }
    }

    public void b() {
        a();
        this.f25479c = this.f25477a.schedule(new g(this.f25478b), 300L, TimeUnit.SECONDS);
    }

    public void c() {
        a();
        this.f25477a.shutdown();
    }
}
