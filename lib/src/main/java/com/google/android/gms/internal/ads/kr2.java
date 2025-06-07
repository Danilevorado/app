package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class kr2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11198a;

    public kr2(q44 q44Var) {
        this.f11198a = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ThreadFactory threadFactory = (ThreadFactory) this.f11198a.b();
        a03.a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        k44.b(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
