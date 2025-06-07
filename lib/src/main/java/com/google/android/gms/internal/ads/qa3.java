package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class qa3 extends sa3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static pa3 a(Iterable iterable) {
        return new pa3(false, c63.s(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pa3 b(Iterable iterable) {
        int i10 = c63.f6792o;
        Objects.requireNonNull(iterable);
        return new pa3(true, c63.s(iterable), null);
    }

    public static pa3 c(ab3... ab3VarArr) {
        return new pa3(true, c63.t(ab3VarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ab3 d(Iterable iterable) {
        return new x93(c63.s(iterable), true);
    }

    public static ab3 e(ab3 ab3Var, Class cls, w23 w23Var, Executor executor) {
        n83 n83Var = new n83(ab3Var, cls, w23Var);
        ab3Var.b(n83Var, hb3.c(executor, n83Var));
        return n83Var;
    }

    public static ab3 f(ab3 ab3Var, Class cls, w93 w93Var, Executor executor) {
        m83 m83Var = new m83(ab3Var, cls, w93Var);
        ab3Var.b(m83Var, hb3.c(executor, m83Var));
        return m83Var;
    }

    public static ab3 g(Throwable th) {
        Objects.requireNonNull(th);
        return new ta3(th);
    }

    public static ab3 h(Object obj) {
        return obj == null ? ua3.f16253n : new ua3(obj);
    }

    public static ab3 i() {
        return ua3.f16253n;
    }

    public static ab3 j(Callable callable, Executor executor) {
        rb3 rb3Var = new rb3(callable);
        executor.execute(rb3Var);
        return rb3Var;
    }

    public static ab3 k(v93 v93Var, Executor executor) {
        rb3 rb3Var = new rb3(v93Var);
        executor.execute(rb3Var);
        return rb3Var;
    }

    public static ab3 l(ab3 ab3Var, w23 w23Var, Executor executor) {
        int i10 = l93.f11415v;
        Objects.requireNonNull(w23Var);
        k93 k93Var = new k93(ab3Var, w23Var);
        ab3Var.b(k93Var, hb3.c(executor, k93Var));
        return k93Var;
    }

    public static ab3 m(ab3 ab3Var, w93 w93Var, Executor executor) {
        int i10 = l93.f11415v;
        Objects.requireNonNull(executor);
        j93 j93Var = new j93(ab3Var, w93Var);
        ab3Var.b(j93Var, hb3.c(executor, j93Var));
        return j93Var;
    }

    public static ab3 n(ab3 ab3Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return ab3Var.isDone() ? ab3Var : ob3.F(ab3Var, j10, timeUnit, scheduledExecutorService);
    }

    public static Object o(Future future) {
        if (future.isDone()) {
            return tb3.a(future);
        }
        throw new IllegalStateException(y33.b("Future was expected to be done: %s", future));
    }

    public static Object p(Future future) {
        try {
            return tb3.a(future);
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof Error) {
                throw new ea3((Error) cause);
            }
            throw new sb3(cause);
        }
    }

    public static void q(ab3 ab3Var, ma3 ma3Var, Executor executor) {
        Objects.requireNonNull(ma3Var);
        ab3Var.b(new na3(ab3Var, ma3Var), executor);
    }
}
