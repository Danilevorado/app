package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class t2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ u2 f19316m;

    t2(u2 u2Var) {
        this.f19316m = u2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f19316m.k(new l2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f19316m.k(new s2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f19316m.k(new o2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f19316m.k(new n2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b1 b1Var = new b1();
        this.f19316m.k(new r2(this, activity, b1Var));
        Bundle bundleW0 = b1Var.w0(50L);
        if (bundleW0 != null) {
            bundle.putAll(bundleW0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f19316m.k(new m2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f19316m.k(new q2(this, activity));
    }
}
