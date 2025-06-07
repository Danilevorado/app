package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* loaded from: classes.dex */
final class z70 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f18463a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b80 f18464b;

    z70(b80 b80Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f18464b = b80Var;
        this.f18463a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f18464b.g(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18463a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable unused) {
                ze0.d("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f18463a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f18463a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
