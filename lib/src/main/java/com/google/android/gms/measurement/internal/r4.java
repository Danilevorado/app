package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes.dex */
final class r4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f20335a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u4 f20336b;

    public r4(u4 u4Var, String str) {
        this.f20336b = u4Var;
        e4.p.l(str);
        this.f20335a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f20336b.f20269a.b().p().b(this.f20335a, th);
    }
}
