package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class pg implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f13874a;

    pg(sg sgVar, Activity activity) {
        this.f13874a = activity;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f13874a);
    }
}
