package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class mg implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f12091a;

    mg(sg sgVar, Activity activity) {
        this.f12091a = activity;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f12091a);
    }
}
