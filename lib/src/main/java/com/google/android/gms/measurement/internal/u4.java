package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u4 extends q5 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f20430l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private t4 f20431c;

    /* renamed from: d, reason: collision with root package name */
    private t4 f20432d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f20433e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f20434f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f20435g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f20436h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f20437i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f20438j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f20439k;

    u4(w4 w4Var) {
        super(w4Var);
        this.f20437i = new Object();
        this.f20438j = new Semaphore(2);
        this.f20433e = new PriorityBlockingQueue();
        this.f20434f = new LinkedBlockingQueue();
        this.f20435g = new r4(this, "Thread death: Uncaught exception on worker thread");
        this.f20436h = new r4(this, "Thread death: Uncaught exception on network thread");
    }

    static /* bridge */ /* synthetic */ boolean A(u4 u4Var) {
        boolean z10 = u4Var.f20439k;
        return false;
    }

    private final void D(s4 s4Var) {
        synchronized (this.f20437i) {
            this.f20433e.add(s4Var);
            t4 t4Var = this.f20431c;
            if (t4Var == null) {
                t4 t4Var2 = new t4(this, "Measurement Worker", this.f20433e);
                this.f20431c = t4Var2;
                t4Var2.setUncaughtExceptionHandler(this.f20435g);
                this.f20431c.start();
            } else {
                t4Var.a();
            }
        }
    }

    public final boolean C() {
        return Thread.currentThread() == this.f20431c;
    }

    @Override // com.google.android.gms.measurement.internal.p5
    public final void e() {
        if (Thread.currentThread() != this.f20432d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.p5
    public final void f() {
        if (Thread.currentThread() != this.f20431c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final boolean h() {
        return false;
    }

    final Object p(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f20269a.B().y(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.f20269a.b().u().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f20269a.b().u().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future q(Callable callable) {
        i();
        e4.p.l(callable);
        s4 s4Var = new s4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f20431c) {
            if (!this.f20433e.isEmpty()) {
                this.f20269a.b().u().a("Callable skipped the worker queue.");
            }
            s4Var.run();
        } else {
            D(s4Var);
        }
        return s4Var;
    }

    public final Future r(Callable callable) {
        i();
        e4.p.l(callable);
        s4 s4Var = new s4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f20431c) {
            s4Var.run();
        } else {
            D(s4Var);
        }
        return s4Var;
    }

    public final void w(Runnable runnable) {
        i();
        e4.p.l(runnable);
        s4 s4Var = new s4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f20437i) {
            this.f20434f.add(s4Var);
            t4 t4Var = this.f20432d;
            if (t4Var == null) {
                t4 t4Var2 = new t4(this, "Measurement Network", this.f20434f);
                this.f20432d = t4Var2;
                t4Var2.setUncaughtExceptionHandler(this.f20436h);
                this.f20432d.start();
            } else {
                t4Var.a();
            }
        }
    }

    public final void y(Runnable runnable) {
        i();
        e4.p.l(runnable);
        D(new s4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void z(Runnable runnable) {
        i();
        e4.p.l(runnable);
        D(new s4(this, runnable, true, "Task exception on worker thread"));
    }
}
