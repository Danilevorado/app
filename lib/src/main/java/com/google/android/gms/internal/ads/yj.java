package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class yj implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f18069a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f18070b;

    yj(bk bkVar, Activity activity, Bundle bundle) {
        this.f18069a = activity;
        this.f18070b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f18069a, this.f18070b);
    }
}
