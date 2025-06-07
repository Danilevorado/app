package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class og implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f13234a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f13235b;

    og(sg sgVar, Activity activity, Bundle bundle) {
        this.f13234a = activity;
        this.f13235b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f13234a, this.f13235b);
    }
}
