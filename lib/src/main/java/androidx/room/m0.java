package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class m0 implements Executor {

    /* renamed from: m, reason: collision with root package name */
    private final Executor f3743m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque f3744n = new ArrayDeque();

    /* renamed from: o, reason: collision with root package name */
    private Runnable f3745o;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f3746m;

        a(Runnable runnable) {
            this.f3746m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3746m.run();
            } finally {
                m0.this.a();
            }
        }
    }

    m0(Executor executor) {
        this.f3743m = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f3744n.poll();
        this.f3745o = runnable;
        if (runnable != null) {
            this.f3743m.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f3744n.offer(new a(runnable));
        if (this.f3745o == null) {
            a();
        }
    }
}
