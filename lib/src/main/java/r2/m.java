package r2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class m implements Executor {

    /* renamed from: m, reason: collision with root package name */
    private final Executor f26522m;

    static class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final Runnable f26523m;

        a(Runnable runnable) {
            this.f26523m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f26523m.run();
            } catch (Exception e5) {
                v2.a.d("Executor", "Background execution failure.", e5);
            }
        }
    }

    m(Executor executor) {
        this.f26522m = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f26522m.execute(new a(runnable));
    }
}
