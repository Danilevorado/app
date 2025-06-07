package com.onesignal;

/* loaded from: classes.dex */
public abstract class r0 {
    public final void d(Runnable runnable, String str) {
        rb.h.e(runnable, "runnable");
        rb.h.e(str, "threadName");
        if (OSUtils.H()) {
            new Thread(runnable, str).start();
        } else {
            runnable.run();
        }
    }
}
