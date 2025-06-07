package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class ha extends Thread {

    /* renamed from: m, reason: collision with root package name */
    private final BlockingQueue f9070m;

    /* renamed from: n, reason: collision with root package name */
    private final ga f9071n;

    /* renamed from: o, reason: collision with root package name */
    private final x9 f9072o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f9073p = false;

    /* renamed from: q, reason: collision with root package name */
    private final ea f9074q;

    public ha(BlockingQueue blockingQueue, ga gaVar, x9 x9Var, ea eaVar) {
        this.f9070m = blockingQueue;
        this.f9071n = gaVar;
        this.f9072o = x9Var;
        this.f9074q = eaVar;
    }

    private void b() {
        oa oaVar = (oa) this.f9070m.take();
        SystemClock.elapsedRealtime();
        oaVar.y(3);
        try {
            oaVar.r("network-queue-take");
            oaVar.B();
            TrafficStats.setThreadStatsTag(oaVar.d());
            ja jaVarA = this.f9071n.a(oaVar);
            oaVar.r("network-http-complete");
            if (jaVarA.f10400e && oaVar.A()) {
                oaVar.u("not-modified");
                oaVar.w();
                return;
            }
            ua uaVarM = oaVar.m(jaVarA);
            oaVar.r("network-parse-complete");
            if (uaVarM.f16246b != null) {
                this.f9072o.p(oaVar.o(), uaVarM.f16246b);
                oaVar.r("network-cache-written");
            }
            oaVar.v();
            this.f9074q.b(oaVar, uaVarM, null);
            oaVar.x(uaVarM);
        } catch (xa e5) {
            SystemClock.elapsedRealtime();
            this.f9074q.a(oaVar, e5);
            oaVar.w();
        } catch (Exception e10) {
            ab.c(e10, "Unhandled exception %s", e10.toString());
            xa xaVar = new xa(e10);
            SystemClock.elapsedRealtime();
            this.f9074q.a(oaVar, xaVar);
            oaVar.w();
        } finally {
            oaVar.y(4);
        }
    }

    public final void a() {
        this.f9073p = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f9073p) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ab.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
