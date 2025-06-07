package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class jg implements qg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f10470a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f10471b;

    jg(sg sgVar, Activity activity, Bundle bundle) {
        this.f10470a = activity;
        this.f10471b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.qg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f10470a, this.f10471b);
    }
}
