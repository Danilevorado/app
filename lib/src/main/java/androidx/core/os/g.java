package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class g {

    private static class a implements Executor {

        /* renamed from: m, reason: collision with root package name */
        private final Handler f2259m;

        a(Handler handler) {
            this.f2259m = (Handler) androidx.core.util.h.f(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f2259m.post((Runnable) androidx.core.util.h.f(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f2259m + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
