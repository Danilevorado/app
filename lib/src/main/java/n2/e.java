package n2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f25492a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f25493b = new b();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.t(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f25493b;
    }

    public static Executor b() {
        return f25492a;
    }
}
