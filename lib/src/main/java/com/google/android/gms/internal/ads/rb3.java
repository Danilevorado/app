package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
final class rb3 extends fa3 implements RunnableFuture {

    /* renamed from: t, reason: collision with root package name */
    private volatile za3 f14728t;

    rb3(v93 v93Var) {
        this.f14728t = new pb3(this, v93Var);
    }

    rb3(Callable callable) {
        this.f14728t = new qb3(this, callable);
    }

    static rb3 E(Runnable runnable, Object obj) {
        return new rb3(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final String f() {
        za3 za3Var = this.f14728t;
        if (za3Var == null) {
            return super.f();
        }
        return "task=[" + za3Var.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final void g() {
        za3 za3Var;
        if (x() && (za3Var = this.f14728t) != null) {
            za3Var.g();
        }
        this.f14728t = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        za3 za3Var = this.f14728t;
        if (za3Var != null) {
            za3Var.run();
        }
        this.f14728t = null;
    }
}
