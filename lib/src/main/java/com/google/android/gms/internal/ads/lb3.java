package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class lb3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    ob3 f11442m;

    lb3(ob3 ob3Var) {
        this.f11442m = ob3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ab3 ab3Var;
        ob3 ob3Var = this.f11442m;
        if (ob3Var == null || (ab3Var = ob3Var.f13136t) == null) {
            return;
        }
        this.f11442m = null;
        if (ab3Var.isDone()) {
            ob3Var.w(ab3Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ob3Var.f13137u;
            ob3Var.f13137u = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    ob3Var.i(new nb3(str, null));
                    throw th;
                }
            }
            ob3Var.i(new nb3(str + ": " + ab3Var.toString(), null));
        } finally {
            ab3Var.cancel(true);
        }
    }
}
