package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ja3 extends s53 implements Future {
    protected ja3() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return i().get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return i().get(j10, timeUnit);
    }

    protected abstract Future i();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return i().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return i().isDone();
    }
}
