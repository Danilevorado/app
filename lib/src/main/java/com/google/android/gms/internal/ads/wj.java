package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class wj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17174a;

    wj(bk bkVar, Activity activity) {
        this.f17174a = activity;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f17174a);
    }
}
