package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class ng implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12609a;

    ng(sg sgVar, Activity activity) {
        this.f12609a = activity;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f12609a);
    }
}
