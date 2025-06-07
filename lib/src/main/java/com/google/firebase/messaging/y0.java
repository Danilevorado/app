package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class y0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f21603d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21604a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f21605b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f21606c;

    private y0(SharedPreferences sharedPreferences, Executor executor) {
        this.f21606c = executor;
        this.f21604a = sharedPreferences;
    }

    public static synchronized y0 a(Context context, Executor executor) {
        y0 y0Var;
        WeakReference weakReference = f21603d;
        y0Var = weakReference != null ? (y0) weakReference.get() : null;
        if (y0Var == null) {
            y0Var = new y0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            y0Var.c();
            f21603d = new WeakReference(y0Var);
        }
        return y0Var;
    }

    private synchronized void c() {
        this.f21605b = u0.c(this.f21604a, "topic_operation_queue", ",", this.f21606c);
    }

    synchronized x0 b() {
        return x0.a(this.f21605b.e());
    }

    synchronized boolean d(x0 x0Var) {
        return this.f21605b.f(x0Var.e());
    }
}
