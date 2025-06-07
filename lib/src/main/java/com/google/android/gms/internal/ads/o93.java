package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class o93 extends u93 {
    private static final Logger A = Logger.getLogger(o93.class.getName());

    /* renamed from: x, reason: collision with root package name */
    private x53 f13099x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f13100y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f13101z;

    o93(x53 x53Var, boolean z10, boolean z11) {
        super(x53Var.size());
        this.f13099x = x53Var;
        this.f13100y = z10;
        this.f13101z = z11;
    }

    private final void L(int i10, Future future) {
        try {
            Q(i10, qa3.o(future));
        } catch (Error e5) {
            e = e5;
            N(e);
        } catch (RuntimeException e10) {
            e = e10;
            N(e);
        } catch (ExecutionException e11) {
            N(e11.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void U(x53 x53Var) {
        int iE = E();
        int i10 = 0;
        i33.i(iE >= 0, "Less than 0 remaining futures");
        if (iE == 0) {
            if (x53Var != null) {
                c83 c83VarL = x53Var.l();
                while (c83VarL.hasNext()) {
                    Future future = (Future) c83VarL.next();
                    if (!future.isCancelled()) {
                        L(i10, future);
                    }
                    i10++;
                }
            }
            J();
            R();
            V(2);
        }
    }

    private final void N(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f13100y && !i(th) && P(G(), th)) {
            O(th);
        } else if (th instanceof Error) {
            O(th);
        }
    }

    private static void O(Throwable th) {
        A.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean P(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void K(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        thA.getClass();
        P(set, thA);
    }

    abstract void Q(int i10, Object obj);

    abstract void R();

    final void S() {
        x53 x53Var = this.f13099x;
        x53Var.getClass();
        if (x53Var.isEmpty()) {
            R();
            return;
        }
        if (!this.f13100y) {
            final x53 x53Var2 = this.f13101z ? this.f13099x : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.n93
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12550m.U(x53Var2);
                }
            };
            c83 c83VarL = this.f13099x.l();
            while (c83VarL.hasNext()) {
                ((ab3) c83VarL.next()).b(runnable, da3.INSTANCE);
            }
            return;
        }
        c83 c83VarL2 = this.f13099x.l();
        final int i10 = 0;
        while (c83VarL2.hasNext()) {
            final ab3 ab3Var = (ab3) c83VarL2.next();
            ab3Var.b(new Runnable() { // from class: com.google.android.gms.internal.ads.m93
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12020m.T(ab3Var, i10);
                }
            }, da3.INSTANCE);
            i10++;
        }
    }

    final /* synthetic */ void T(ab3 ab3Var, int i10) {
        try {
            if (ab3Var.isCancelled()) {
                this.f13099x = null;
                cancel(false);
            } else {
                L(i10, ab3Var);
            }
        } finally {
            U(null);
        }
    }

    void V(int i10) {
        this.f13099x = null;
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final String f() {
        x53 x53Var = this.f13099x;
        return x53Var != null ? "futures=".concat(x53Var.toString()) : super.f();
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final void g() {
        x53 x53Var = this.f13099x;
        V(1);
        if ((x53Var != null) && isCancelled()) {
            boolean zX = x();
            c83 c83VarL = x53Var.l();
            while (c83VarL.hasNext()) {
                ((Future) c83VarL.next()).cancel(zX);
            }
        }
    }
}
