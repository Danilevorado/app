package b5;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class l {
    public static Object a(i iVar) {
        e4.p.j();
        e4.p.h();
        e4.p.m(iVar, "Task must not be null");
        if (iVar.m()) {
            return f(iVar);
        }
        n nVar = new n(null);
        g(iVar, nVar);
        nVar.c();
        return f(iVar);
    }

    public static Object b(i iVar, long j10, TimeUnit timeUnit) throws TimeoutException {
        e4.p.j();
        e4.p.h();
        e4.p.m(iVar, "Task must not be null");
        e4.p.m(timeUnit, "TimeUnit must not be null");
        if (iVar.m()) {
            return f(iVar);
        }
        n nVar = new n(null);
        g(iVar, nVar);
        if (nVar.e(j10, timeUnit)) {
            return f(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static i c(Executor executor, Callable callable) {
        e4.p.m(executor, "Executor must not be null");
        e4.p.m(callable, "Callback must not be null");
        h0 h0Var = new h0();
        executor.execute(new i0(h0Var, callable));
        return h0Var;
    }

    public static i d(Exception exc) {
        h0 h0Var = new h0();
        h0Var.p(exc);
        return h0Var;
    }

    public static i e(Object obj) {
        h0 h0Var = new h0();
        h0Var.q(obj);
        return h0Var;
    }

    private static Object f(i iVar) throws ExecutionException {
        if (iVar.n()) {
            return iVar.j();
        }
        if (iVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.i());
    }

    private static void g(i iVar, o oVar) {
        Executor executor = k.f4480b;
        iVar.e(executor, oVar);
        iVar.d(executor, oVar);
        iVar.a(executor, oVar);
    }
}
