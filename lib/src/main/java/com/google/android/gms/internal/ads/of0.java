package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class of0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bb3 f13186a;

    /* renamed from: b, reason: collision with root package name */
    public static final bb3 f13187b;

    /* renamed from: c, reason: collision with root package name */
    public static final bb3 f13188c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f13189d;

    /* renamed from: e, reason: collision with root package name */
    public static final bb3 f13190e;

    /* renamed from: f, reason: collision with root package name */
    public static final bb3 f13191f;

    static {
        Executor threadPoolExecutor;
        Executor executorC;
        Executor executorB;
        if (i4.d.a()) {
            a03.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new if0("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new if0("Default"));
        }
        kf0 kf0Var = null;
        f13186a = new nf0(threadPoolExecutor, kf0Var);
        if (i4.d.a()) {
            executorC = a03.a().c(5, new if0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new if0("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorC = threadPoolExecutor2;
        }
        f13187b = new nf0(executorC, kf0Var);
        if (i4.d.a()) {
            executorB = a03.a().b(new if0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new if0("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorB = threadPoolExecutor3;
        }
        f13188c = new nf0(executorB, kf0Var);
        f13189d = new hf0(3, new if0("Schedule"));
        f13190e = new nf0(new jf0(), kf0Var);
        f13191f = new nf0(hb3.b(), kf0Var);
    }
}
