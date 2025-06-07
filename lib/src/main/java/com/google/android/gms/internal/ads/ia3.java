package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ia3 extends ga3 {

    /* renamed from: t, reason: collision with root package name */
    private final ab3 f9657t;

    ia3(ab3 ab3Var) {
        Objects.requireNonNull(ab3Var);
        this.f9657t = ab3Var;
    }

    @Override // com.google.android.gms.internal.ads.b93, com.google.android.gms.internal.ads.ab3
    public final void b(Runnable runnable, Executor executor) {
        this.f9657t.b(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.b93, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f9657t.cancel(z10);
    }

    @Override // com.google.android.gms.internal.ads.b93, java.util.concurrent.Future
    public final Object get() {
        return this.f9657t.get();
    }

    @Override // com.google.android.gms.internal.ads.b93, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f9657t.get(j10, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.b93, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9657t.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.b93, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9657t.isDone();
    }

    @Override // com.google.android.gms.internal.ads.b93
    public final String toString() {
        return this.f9657t.toString();
    }
}
