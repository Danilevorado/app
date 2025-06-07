package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class vj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f16729a;

    vj(bk bkVar, Activity activity) {
        this.f16729a = activity;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f16729a);
    }
}
