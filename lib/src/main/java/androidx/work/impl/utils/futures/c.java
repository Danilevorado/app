package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
enum c implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
