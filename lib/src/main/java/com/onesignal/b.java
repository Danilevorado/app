package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes.dex */
class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private static b f21702m;

    /* renamed from: n, reason: collision with root package name */
    private static com.onesignal.a f21703n;

    /* renamed from: o, reason: collision with root package name */
    private static ComponentCallbacks f21704o;

    class a implements ComponentCallbacks {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            b.f21703n.p(configuration, b.f21703n.e());
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    b() {
    }

    public static com.onesignal.a b() {
        return f21703n;
    }

    static void c(Application application) {
        if (f21702m == null) {
            b bVar = new b();
            f21702m = bVar;
            application.registerActivityLifecycleCallbacks(bVar);
        }
        if (f21703n == null) {
            f21703n = new com.onesignal.a(new OSFocusHandler());
        }
        if (f21704o == null) {
            ComponentCallbacks aVar = new a();
            f21704o = aVar;
            application.registerComponentCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.onesignal.a aVar = f21703n;
        if (aVar != null) {
            aVar.j(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        com.onesignal.a aVar = f21703n;
        if (aVar != null) {
            aVar.k(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.onesignal.a aVar = f21703n;
        if (aVar != null) {
            aVar.l(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        com.onesignal.a aVar = f21703n;
        if (aVar != null) {
            aVar.m(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        com.onesignal.a aVar = f21703n;
        if (aVar != null) {
            aVar.n(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        com.onesignal.a aVar = f21703n;
        if (aVar != null) {
            aVar.o(activity);
        }
    }
}
