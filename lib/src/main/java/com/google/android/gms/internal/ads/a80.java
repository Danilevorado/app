package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* loaded from: classes.dex */
final class a80 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f5985a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b80 f5986b;

    a80(b80 b80Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5986b = b80Var;
        this.f5985a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f5986b.g(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5985a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable unused) {
                ze0.d("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f5985a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f5985a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
