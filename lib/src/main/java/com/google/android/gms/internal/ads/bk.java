package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class bk implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private final Application f6515m;

    /* renamed from: n, reason: collision with root package name */
    private final WeakReference f6516n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6517o = false;

    public bk(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f6516n = new WeakReference(activityLifecycleCallbacks);
        this.f6515m = application;
    }

    protected final void a(ak akVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6516n.get();
            if (activityLifecycleCallbacks != null) {
                akVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f6517o) {
                    return;
                }
                this.f6515m.unregisterActivityLifecycleCallbacks(this);
                this.f6517o = true;
            }
        } catch (Exception e5) {
            ze0.e("Error while dispatching lifecycle callback.", e5);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new sj(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new zj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new wj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new vj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new yj(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new tj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new xj(this, activity));
    }
}
