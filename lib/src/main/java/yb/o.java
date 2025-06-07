package yb;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class o extends m {
    protected abstract Thread Z();

    protected final void a0() {
        Thread threadZ = Z();
        if (Thread.currentThread() != threadZ) {
            b.a();
            LockSupport.unpark(threadZ);
        }
    }
}
