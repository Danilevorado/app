package b5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g0 implements Executor {

    /* renamed from: m, reason: collision with root package name */
    private final Handler f4469m = new u4.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4469m.post(runnable);
    }
}
