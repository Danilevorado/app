package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class gk implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private Activity f8772m;

    /* renamed from: n, reason: collision with root package name */
    private Context f8773n;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f8779t;

    /* renamed from: v, reason: collision with root package name */
    private long f8781v;

    /* renamed from: o, reason: collision with root package name */
    private final Object f8774o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private boolean f8775p = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8776q = false;

    /* renamed from: r, reason: collision with root package name */
    private final List f8777r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final List f8778s = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private boolean f8780u = false;

    gk() {
    }

    private final void k(Activity activity) {
        synchronized (this.f8774o) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f8772m = activity;
            }
        }
    }

    public final Activity a() {
        return this.f8772m;
    }

    public final Context b() {
        return this.f8773n;
    }

    public final void f(hk hkVar) {
        synchronized (this.f8774o) {
            this.f8777r.add(hkVar);
        }
    }

    public final void g(Application application, Context context) {
        if (this.f8780u) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f8773n = application;
        this.f8781v = ((Long) k3.w.c().b(ir.O0)).longValue();
        this.f8780u = true;
    }

    public final void h(hk hkVar) {
        synchronized (this.f8774o) {
            this.f8777r.remove(hkVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f8774o) {
            Activity activity2 = this.f8772m;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f8772m = null;
                }
                Iterator it = this.f8778s.iterator();
                while (it.hasNext()) {
                    try {
                        if (((wk) it.next()).a()) {
                            it.remove();
                        }
                    } catch (Exception e5) {
                        j3.t.q().u(e5, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        ze0.e("", e5);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f8774o) {
            Iterator it = this.f8778s.iterator();
            while (it.hasNext()) {
                try {
                    ((wk) it.next()).b();
                } catch (Exception e5) {
                    j3.t.q().u(e5, "AppActivityTracker.ActivityListener.onActivityPaused");
                    ze0.e("", e5);
                }
            }
        }
        this.f8776q = true;
        Runnable runnable = this.f8779t;
        if (runnable != null) {
            m3.b2.f25197i.removeCallbacks(runnable);
        }
        b03 b03Var = m3.b2.f25197i;
        fk fkVar = new fk(this);
        this.f8779t = fkVar;
        b03Var.postDelayed(fkVar, this.f8781v);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f8776q = false;
        boolean z10 = !this.f8775p;
        this.f8775p = true;
        Runnable runnable = this.f8779t;
        if (runnable != null) {
            m3.b2.f25197i.removeCallbacks(runnable);
        }
        synchronized (this.f8774o) {
            Iterator it = this.f8778s.iterator();
            while (it.hasNext()) {
                try {
                    ((wk) it.next()).d();
                } catch (Exception e5) {
                    j3.t.q().u(e5, "AppActivityTracker.ActivityListener.onActivityResumed");
                    ze0.e("", e5);
                }
            }
            if (z10) {
                Iterator it2 = this.f8777r.iterator();
                while (it2.hasNext()) {
                    try {
                        ((hk) it2.next()).a(true);
                    } catch (Exception e10) {
                        ze0.e("", e10);
                    }
                }
            } else {
                ze0.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
