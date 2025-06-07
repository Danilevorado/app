package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
abstract class ba3 extends za3 {

    /* renamed from: o, reason: collision with root package name */
    private final Executor f6407o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ ca3 f6408p;

    ba3(ca3 ca3Var, Executor executor) {
        this.f6408p = ca3Var;
        Objects.requireNonNull(executor);
        this.f6407o = executor;
    }

    @Override // com.google.android.gms.internal.ads.za3
    final void d(Throwable th) {
        this.f6408p.B = null;
        if (th instanceof ExecutionException) {
            this.f6408p.i(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f6408p.cancel(false);
        } else {
            this.f6408p.i(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.za3
    final void e(Object obj) {
        this.f6408p.B = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.za3
    final boolean f() {
        return this.f6408p.isDone();
    }

    abstract void h(Object obj);

    final void j() {
        try {
            this.f6407o.execute(this);
        } catch (RejectedExecutionException e5) {
            this.f6408p.i(e5);
        }
    }
}
