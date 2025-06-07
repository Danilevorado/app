package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zs2 implements ws2 {

    /* renamed from: a, reason: collision with root package name */
    private final ws2 f18749a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue f18750b = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    private final int f18751c = ((Integer) k3.w.c().b(ir.f9901b8)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f18752d = new AtomicBoolean(false);

    public zs2(ws2 ws2Var, ScheduledExecutorService scheduledExecutorService) {
        this.f18749a = ws2Var;
        long jIntValue = ((Integer) k3.w.c().b(ir.f9890a8)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.ys2
            @Override // java.lang.Runnable
            public final void run() {
                zs2.c(this.f18263m);
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void c(zs2 zs2Var) {
        while (!zs2Var.f18750b.isEmpty()) {
            zs2Var.f18749a.a((vs2) zs2Var.f18750b.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.ws2
    public final void a(vs2 vs2Var) {
        if (this.f18750b.size() < this.f18751c) {
            this.f18750b.offer(vs2Var);
            return;
        }
        if (this.f18752d.getAndSet(true)) {
            return;
        }
        Queue queue = this.f18750b;
        vs2 vs2VarB = vs2.b("dropped_event");
        Map mapJ = vs2Var.j();
        if (mapJ.containsKey("action")) {
            vs2VarB.a("dropped_action", (String) mapJ.get("action"));
        }
        queue.offer(vs2VarB);
    }

    @Override // com.google.android.gms.internal.ads.ws2
    public final String b(vs2 vs2Var) {
        return this.f18749a.b(vs2Var);
    }
}
