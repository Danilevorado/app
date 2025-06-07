package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class xj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17586a;

    xj(bk bkVar, Activity activity) {
        this.f17586a = activity;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f17586a);
    }
}
