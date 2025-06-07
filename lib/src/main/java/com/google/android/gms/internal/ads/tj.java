package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class tj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15869a;

    tj(bk bkVar, Activity activity) {
        this.f15869a = activity;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f15869a);
    }
}
