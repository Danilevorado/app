package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class qh2 {
    public static ke2 a(tg2 tg2Var, gc2 gc2Var, ScheduledExecutorService scheduledExecutorService, int i10) {
        return i10 == 0 ? new oc2(gc2Var, 0L, scheduledExecutorService) : new oc2(tg2Var, 0L, scheduledExecutorService);
    }

    public static ke2 b(dh2 dh2Var, ScheduledExecutorService scheduledExecutorService) {
        return new oc2(dh2Var, ((Long) k3.w.c().b(ir.K3)).longValue(), scheduledExecutorService);
    }

    public static ke2 c(zh2 zh2Var, ScheduledExecutorService scheduledExecutorService) {
        return new oc2(zh2Var, 0L, scheduledExecutorService);
    }
}
