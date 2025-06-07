package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
abstract class za3 extends AtomicReference implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f18508m = new ya3(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Runnable f18509n = new ya3(null);

    za3() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        wa3 wa3Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof wa3)) {
                if (runnable != f18509n) {
                    break;
                }
            } else {
                wa3Var = (wa3) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f18509n;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(wa3Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean f();

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            wa3 wa3Var = new wa3(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, wa3Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f18508m)) == f18509n) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f18508m)) == f18509n) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z10 = !f();
            if (z10) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        jb3.a(th);
                        if (!compareAndSet(threadCurrentThread, f18508m)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f18508m)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f18508m)) {
                c(threadCurrentThread);
            }
            if (z10) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f18508m) {
            str = "running=[DONE]";
        } else if (runnable instanceof wa3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
