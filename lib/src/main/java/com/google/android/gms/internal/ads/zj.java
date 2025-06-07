package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class zj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f18604a;

    zj(bk bkVar, Activity activity) {
        this.f18604a = activity;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f18604a);
    }
}
