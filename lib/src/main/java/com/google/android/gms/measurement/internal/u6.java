package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
final class u6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ v6 f20450m;

    /* synthetic */ u6(v6 v6Var, x4.v vVar) {
        this.f20450m = v6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f20450m.f20269a.b().t().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f20450m.f20269a.N();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z10 = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z10 = false;
                    }
                    this.f20450m.f20269a.B().y(new t6(this, z10, data, str, queryParameter));
                }
            } catch (RuntimeException e5) {
                this.f20450m.f20269a.b().p().b("Throwable caught in onActivityCreated", e5);
            }
        } finally {
            this.f20450m.f20269a.K().y(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f20450m.f20269a.K().z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f20450m.f20269a.K().A(activity);
        x8 x8VarM = this.f20450m.f20269a.M();
        x8VarM.f20269a.B().y(new q8(x8VarM, x8VarM.f20269a.d().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        x8 x8VarM = this.f20450m.f20269a.M();
        x8VarM.f20269a.B().y(new p8(x8VarM, x8VarM.f20269a.d().b()));
        this.f20450m.f20269a.K().C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f20450m.f20269a.K().D(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
