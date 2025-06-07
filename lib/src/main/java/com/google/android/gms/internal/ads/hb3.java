package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class hb3 {
    public static bb3 a(ExecutorService executorService) {
        if (executorService instanceof bb3) {
            return (bb3) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new gb3((ScheduledExecutorService) executorService) : new db3(executorService);
    }

    public static Executor b() {
        return da3.INSTANCE;
    }

    static Executor c(Executor executor, b93 b93Var) {
        Objects.requireNonNull(executor);
        return executor == da3.INSTANCE ? executor : new cb3(executor, b93Var);
    }
}
