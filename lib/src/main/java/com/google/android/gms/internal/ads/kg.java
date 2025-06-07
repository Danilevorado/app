package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class kg implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f11022a;

    kg(sg sgVar, Activity activity) {
        this.f11022a = activity;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f11022a);
    }
}
