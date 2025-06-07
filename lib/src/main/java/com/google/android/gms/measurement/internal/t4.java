package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class t4 extends Thread {

    /* renamed from: m, reason: collision with root package name */
    private final Object f20414m;

    /* renamed from: n, reason: collision with root package name */
    private final BlockingQueue f20415n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20416o = false;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ u4 f20417p;

    public t4(u4 u4Var, String str, BlockingQueue blockingQueue) {
        this.f20417p = u4Var;
        e4.p.l(str);
        e4.p.l(blockingQueue);
        this.f20414m = new Object();
        this.f20415n = blockingQueue;
        setName(str);
    }

    private final void b() {
        synchronized (this.f20417p.f20437i) {
            if (!this.f20416o) {
                this.f20417p.f20438j.release();
                this.f20417p.f20437i.notifyAll();
                u4 u4Var = this.f20417p;
                if (this == u4Var.f20431c) {
                    u4Var.f20431c = null;
                } else if (this == u4Var.f20432d) {
                    u4Var.f20432d = null;
                } else {
                    u4Var.f20269a.b().p().a("Current scheduler thread is neither worker nor network");
                }
                this.f20416o = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f20417p.f20269a.b().u().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f20414m) {
            this.f20414m.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f20417p.f20438j.acquire();
                z10 = true;
            } catch (InterruptedException e5) {
                c(e5);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                s4 s4Var = (s4) this.f20415n.poll();
                if (s4Var != null) {
                    Process.setThreadPriority(true != s4Var.f20363n ? 10 : threadPriority);
                    s4Var.run();
                } else {
                    synchronized (this.f20414m) {
                        if (this.f20415n.peek() == null) {
                            u4.A(this.f20417p);
                            try {
                                this.f20414m.wait(30000L);
                            } catch (InterruptedException e10) {
                                c(e10);
                            }
                        }
                    }
                    synchronized (this.f20417p.f20437i) {
                        if (this.f20415n.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
