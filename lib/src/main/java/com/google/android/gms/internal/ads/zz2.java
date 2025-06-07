package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zz2 implements xz2 {
    /* synthetic */ zz2(yz2 yz2Var) {
    }

    @Override // com.google.android.gms.internal.ads.xz2
    public final ExecutorService a(int i10) {
        return c(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.xz2
    public final ExecutorService b(ThreadFactory threadFactory, int i10) {
        return c(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.xz2
    public final ExecutorService c(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
