package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class sg implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private final Application f15217m;

    /* renamed from: n, reason: collision with root package name */
    private final WeakReference f15218n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15219o = false;

    public sg(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f15218n = new WeakReference(activityLifecycleCallbacks);
        this.f15217m = application;
    }

    protected final void a(qg qgVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f15218n.get();
            if (activityLifecycleCallbacks != null) {
                qgVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f15219o) {
                    return;
                }
                this.f15217m.unregisterActivityLifecycleCallbacks(this);
                this.f15219o = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new jg(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new pg(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new mg(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new lg(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new og(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new kg(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new ng(this, activity));
    }
}
