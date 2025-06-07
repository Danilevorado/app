package j4;

import android.os.Process;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f24537m;

    public d(Runnable runnable, int i10) {
        this.f24537m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f24537m.run();
    }
}
