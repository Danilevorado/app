package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qr2 implements ab3 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f14457m;

    /* renamed from: n, reason: collision with root package name */
    private final String f14458n;

    /* renamed from: o, reason: collision with root package name */
    private final ab3 f14459o;

    public qr2(Object obj, String str, ab3 ab3Var) {
        this.f14457m = obj;
        this.f14458n = str;
        this.f14459o = ab3Var;
    }

    public final Object a() {
        return this.f14457m;
    }

    @Override // com.google.android.gms.internal.ads.ab3
    public final void b(Runnable runnable, Executor executor) {
        this.f14459o.b(runnable, executor);
    }

    public final String c() {
        return this.f14458n;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f14459o.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14459o.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f14459o.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14459o.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14459o.isDone();
    }

    public final String toString() {
        return this.f14458n + "@" + System.identityHashCode(this);
    }
}
