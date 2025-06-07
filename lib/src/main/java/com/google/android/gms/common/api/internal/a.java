package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: q, reason: collision with root package name */
    private static final a f5640q = new a();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f5641m = new AtomicBoolean();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f5642n = new AtomicBoolean();

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f5643o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private boolean f5644p = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0094a {
        void a(boolean z10);
    }

    private a() {
    }

    public static a b() {
        return f5640q;
    }

    public static void c(Application application) {
        a aVar = f5640q;
        synchronized (aVar) {
            if (!aVar.f5644p) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f5644p = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f5640q) {
            Iterator it = this.f5643o.iterator();
            while (it.hasNext()) {
                ((InterfaceC0094a) it.next()).a(z10);
            }
        }
    }

    public void a(InterfaceC0094a interfaceC0094a) {
        synchronized (f5640q) {
            this.f5643o.add(interfaceC0094a);
        }
    }

    public boolean d() {
        return this.f5641m.get();
    }

    public boolean e(boolean z10) {
        if (!this.f5642n.get()) {
            if (!i4.m.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5642n.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5641m.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f5642n;
        boolean zCompareAndSet = this.f5641m.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f5642n;
        boolean zCompareAndSet = this.f5641m.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f5641m.compareAndSet(false, true)) {
            this.f5642n.set(true);
            f(true);
        }
    }
}
