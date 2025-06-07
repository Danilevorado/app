package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class sj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15285a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f15286b;

    sj(bk bkVar, Activity activity, Bundle bundle) {
        this.f15285a = activity;
        this.f15286b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f15285a, this.f15286b);
    }
}
