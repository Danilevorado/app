package j4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import r4.e;

/* loaded from: classes.dex */
public class a implements Executor {

    /* renamed from: m, reason: collision with root package name */
    private final Handler f24531m;

    public a(Looper looper) {
        this.f24531m = new e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f24531m.post(runnable);
    }
}
