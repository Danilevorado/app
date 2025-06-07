package j;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f24347c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f24348d = new ExecutorC0146a();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f24349e = new b();

    /* renamed from: a, reason: collision with root package name */
    private c f24350a;

    /* renamed from: b, reason: collision with root package name */
    private c f24351b;

    /* renamed from: j.a$a, reason: collision with other inner class name */
    static class ExecutorC0146a implements Executor {
        ExecutorC0146a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    private a() {
        j.b bVar = new j.b();
        this.f24351b = bVar;
        this.f24350a = bVar;
    }

    public static Executor d() {
        return f24349e;
    }

    public static a e() {
        if (f24347c != null) {
            return f24347c;
        }
        synchronized (a.class) {
            if (f24347c == null) {
                f24347c = new a();
            }
        }
        return f24347c;
    }

    @Override // j.c
    public void a(Runnable runnable) {
        this.f24350a.a(runnable);
    }

    @Override // j.c
    public boolean b() {
        return this.f24350a.b();
    }

    @Override // j.c
    public void c(Runnable runnable) {
        this.f24350a.c(runnable);
    }
}
