package h1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class r implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
