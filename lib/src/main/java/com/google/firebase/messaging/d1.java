package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    static final long f21471a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f21472b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static a5.b f21473c;

    private static void b(Context context) {
        if (f21473c == null) {
            a5.b bVar = new a5.b(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f21473c = bVar;
            bVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f21472b) {
            if (f21473c != null && d(intent)) {
                g(intent, false);
                f21473c.c();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void f(Context context, i1 i1Var, final Intent intent) {
        synchronized (f21472b) {
            b(context);
            boolean zD = d(intent);
            g(intent, true);
            if (!zD) {
                f21473c.a(f21471a);
            }
            i1Var.c(intent).c(h.f21489m, new b5.d() { // from class: com.google.firebase.messaging.c1
                @Override // b5.d
                public final void a(b5.i iVar) {
                    d1.c(intent);
                }
            });
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName h(Context context, Intent intent) {
        synchronized (f21472b) {
            b(context);
            boolean zD = d(intent);
            g(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zD) {
                f21473c.a(f21471a);
            }
            return componentNameStartService;
        }
    }
}
