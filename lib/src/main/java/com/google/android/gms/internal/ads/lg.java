package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class lg implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f11568a;

    lg(sg sgVar, Activity activity) {
        this.f11568a = activity;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f11568a);
    }
}
