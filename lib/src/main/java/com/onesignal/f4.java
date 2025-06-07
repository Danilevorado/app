package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
class f4 {

    /* renamed from: c, reason: collision with root package name */
    private static Class f22023c;

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f22024d;

    /* renamed from: e, reason: collision with root package name */
    private static AtomicLong f22025e;

    /* renamed from: f, reason: collision with root package name */
    private static s1 f22026f;

    /* renamed from: a, reason: collision with root package name */
    private Object f22027a;

    /* renamed from: b, reason: collision with root package name */
    private Context f22028b;

    f4(Context context) {
        this.f22028b = context;
    }

    static boolean a() {
        try {
            f22023c = FirebaseAnalytics.class;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private String b(s1 s1Var) {
        if (s1Var.l().isEmpty() || s1Var.k().isEmpty()) {
            return s1Var.m() != null ? s1Var.m().substring(0, Math.min(10, s1Var.m().length())) : "";
        }
        return s1Var.l() + " - " + s1Var.k();
    }

    private Object c(Context context) {
        if (this.f22027a == null) {
            try {
                this.f22027a = d(f22023c).invoke(null, context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f22027a;
    }

    private static Method d(Class cls) {
        try {
            return cls.getMethod("getInstance", Context.class);
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static Method e(Class cls) {
        try {
            return cls.getMethod("logEvent", String.class, Bundle.class);
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    void f() {
        if (f22024d == null || f22026f == null) {
            return;
        }
        long jB = e3.B0().b();
        if (jB - f22024d.get() > 120000) {
            return;
        }
        AtomicLong atomicLong = f22025e;
        if (atomicLong == null || jB - atomicLong.get() >= 30000) {
            try {
                Object objC = c(this.f22028b);
                Method methodE = e(f22023c);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString("medium", "notification");
                bundle.putString("notification_id", f22026f.i());
                bundle.putString("campaign", b(f22026f));
                methodE.invoke(objC, "os_notification_influence_open", bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    void g(b2 b2Var) {
        if (f22025e == null) {
            f22025e = new AtomicLong();
        }
        f22025e.set(e3.B0().b());
        try {
            Object objC = c(this.f22028b);
            Method methodE = e(f22023c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", b2Var.e().i());
            bundle.putString("campaign", b(b2Var.e()));
            methodE.invoke(objC, "os_notification_opened", bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void h(b2 b2Var) {
        try {
            Object objC = c(this.f22028b);
            Method methodE = e(f22023c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", b2Var.e().i());
            bundle.putString("campaign", b(b2Var.e()));
            methodE.invoke(objC, "os_notification_received", bundle);
            if (f22024d == null) {
                f22024d = new AtomicLong();
            }
            f22024d.set(e3.B0().b());
            f22026f = b2Var.e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
