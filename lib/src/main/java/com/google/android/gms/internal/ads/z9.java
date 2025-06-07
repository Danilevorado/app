package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class z9 extends Thread {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f18484s = ab.f6029b;

    /* renamed from: m, reason: collision with root package name */
    private final BlockingQueue f18485m;

    /* renamed from: n, reason: collision with root package name */
    private final BlockingQueue f18486n;

    /* renamed from: o, reason: collision with root package name */
    private final x9 f18487o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f18488p = false;

    /* renamed from: q, reason: collision with root package name */
    private final bb f18489q;

    /* renamed from: r, reason: collision with root package name */
    private final ea f18490r;

    public z9(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, x9 x9Var, ea eaVar) {
        this.f18485m = blockingQueue;
        this.f18486n = blockingQueue2;
        this.f18487o = x9Var;
        this.f18490r = eaVar;
        this.f18489q = new bb(this, blockingQueue2, eaVar);
    }

    private void c() {
        ea eaVar;
        oa oaVar = (oa) this.f18485m.take();
        oaVar.r("cache-queue-take");
        oaVar.y(1);
        try {
            oaVar.B();
            w9 w9VarO = this.f18487o.o(oaVar.o());
            if (w9VarO == null) {
                oaVar.r("cache-miss");
                if (!this.f18489q.c(oaVar)) {
                    this.f18486n.put(oaVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (w9VarO.a(jCurrentTimeMillis)) {
                oaVar.r("cache-hit-expired");
                oaVar.i(w9VarO);
                if (!this.f18489q.c(oaVar)) {
                    this.f18486n.put(oaVar);
                }
                return;
            }
            oaVar.r("cache-hit");
            ua uaVarM = oaVar.m(new ja(w9VarO.f17022a, w9VarO.f17028g));
            oaVar.r("cache-hit-parsed");
            if (!uaVarM.c()) {
                oaVar.r("cache-parsing-failed");
                this.f18487o.q(oaVar.o(), true);
                oaVar.i(null);
                if (!this.f18489q.c(oaVar)) {
                    this.f18486n.put(oaVar);
                }
                return;
            }
            if (w9VarO.f17027f < jCurrentTimeMillis) {
                oaVar.r("cache-hit-refresh-needed");
                oaVar.i(w9VarO);
                uaVarM.f16248d = true;
                if (!this.f18489q.c(oaVar)) {
                    this.f18490r.b(oaVar, uaVarM, new y9(this, oaVar));
                }
                eaVar = this.f18490r;
            } else {
                eaVar = this.f18490r;
            }
            eaVar.b(oaVar, uaVarM, null);
        } finally {
            oaVar.y(2);
        }
    }

    public final void b() {
        this.f18488p = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f18484s) {
            ab.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f18487o.b();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f18488p) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ab.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
