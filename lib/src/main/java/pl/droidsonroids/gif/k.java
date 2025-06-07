package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes2.dex */
abstract class k implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final b f26015m;

    k(b bVar) {
        this.f26015m = bVar;
    }

    abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f26015m.e()) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
