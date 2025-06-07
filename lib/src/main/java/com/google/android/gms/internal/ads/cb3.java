package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
final class cb3 implements Executor {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Executor f6865m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ b93 f6866n;

    cb3(Executor executor, b93 b93Var) {
        this.f6865m = executor;
        this.f6866n = b93Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f6865m.execute(runnable);
        } catch (RejectedExecutionException e5) {
            this.f6866n.i(e5);
        }
    }
}
