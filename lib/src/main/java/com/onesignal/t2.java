package com.onesignal;

import com.onesignal.e3;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
class t2 {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f22443a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f22444b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private ExecutorService f22445c;

    /* renamed from: d, reason: collision with root package name */
    protected final r1 f22446d;

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
            return thread;
        }
    }

    private static class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private t2 f22448m;

        /* renamed from: n, reason: collision with root package name */
        private Runnable f22449n;

        /* renamed from: o, reason: collision with root package name */
        private long f22450o;

        b(t2 t2Var, Runnable runnable) {
            this.f22448m = t2Var;
            this.f22449n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22449n.run();
            this.f22448m.d(this.f22450o);
        }

        public String toString() {
            return "PendingTaskRunnable{innerTask=" + this.f22449n + ", taskId=" + this.f22450o + '}';
        }
    }

    t2(r1 r1Var) {
        this.f22446d = r1Var;
    }

    private void b(b bVar) {
        synchronized (this.f22443a) {
            bVar.f22450o = this.f22444b.incrementAndGet();
            ExecutorService executorService = this.f22445c;
            if (executorService != null) {
                if (!executorService.isShutdown()) {
                    this.f22446d.f("Executor is still running, add to the executor with ID: " + bVar.f22450o);
                    try {
                        this.f22445c.submit(bVar);
                    } catch (RejectedExecutionException e5) {
                        this.f22446d.e("Executor is shutdown, running task manually with ID: " + bVar.f22450o);
                        bVar.run();
                        e5.printStackTrace();
                    }
                }
            }
            this.f22446d.f("Adding a task to the pending queue with ID: " + bVar.f22450o);
            this.f22443a.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j10) {
        if (this.f22444b.get() == j10) {
            e3.a(e3.z.INFO, "Last Pending Task has ran, shutting down");
            this.f22445c.shutdown();
        }
    }

    void c(Runnable runnable) {
        b(new b(this, runnable));
    }

    boolean e() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        if (e3.U0() && this.f22445c == null) {
            return false;
        }
        if (e3.U0() || this.f22445c != null) {
            return !this.f22445c.isShutdown();
        }
        return true;
    }

    void f() {
        synchronized (this.f22443a) {
            e3.a(e3.z.DEBUG, "startPendingTasks with task queue quantity: " + this.f22443a.size());
            if (!this.f22443a.isEmpty()) {
                this.f22445c = Executors.newSingleThreadExecutor(new a());
                while (!this.f22443a.isEmpty()) {
                    this.f22445c.submit((Runnable) this.f22443a.poll());
                }
            }
        }
    }
}
