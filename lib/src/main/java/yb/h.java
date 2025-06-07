package yb;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class h extends n implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: r, reason: collision with root package name */
    public static final h f28604r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f28605s;

    static {
        Long l10;
        h hVar = new h();
        f28604r = hVar;
        m.W(hVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f28605s = timeUnit.toNanos(l10.longValue());
    }

    private h() {
    }

    private final synchronized void i0() {
        if (l0()) {
            debugStatus = 3;
            h0();
            notifyAll();
        }
    }

    private final synchronized Thread j0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean k0() {
        return debugStatus == 4;
    }

    private final boolean l0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean m0() {
        if (l0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void n0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // yb.o
    protected Thread Z() {
        Thread thread = _thread;
        return thread == null ? j0() : thread;
    }

    @Override // yb.n
    public void c0(Runnable runnable) {
        if (k0()) {
            n0();
        }
        super.c0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zF0;
        v.f28623a.a(this);
        b.a();
        try {
            if (!m0()) {
                if (zF0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jG0 = g0();
                if (jG0 == Long.MAX_VALUE) {
                    b.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f28605s + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        i0();
                        b.a();
                        if (f0()) {
                            return;
                        }
                        Z();
                        return;
                    }
                    jG0 = ub.f.c(jG0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jG0 > 0) {
                    if (l0()) {
                        _thread = null;
                        i0();
                        b.a();
                        if (f0()) {
                            return;
                        }
                        Z();
                        return;
                    }
                    b.a();
                    LockSupport.parkNanos(this, jG0);
                }
            }
        } finally {
            _thread = null;
            i0();
            b.a();
            if (!f0()) {
                Z();
            }
        }
    }
}
