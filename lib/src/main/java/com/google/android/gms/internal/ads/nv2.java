package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nv2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p, reason: collision with root package name */
    private static final nv2 f12878p = new nv2();

    /* renamed from: m, reason: collision with root package name */
    private boolean f12879m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12880n;

    /* renamed from: o, reason: collision with root package name */
    private tv2 f12881o;

    private nv2() {
    }

    public static nv2 a() {
        return f12878p;
    }

    private final void e() {
        boolean z10 = this.f12880n;
        Iterator it = mv2.a().c().iterator();
        while (it.hasNext()) {
            zv2 zv2VarG = ((cv2) it.next()).g();
            if (zv2VarG.k()) {
                rv2.a().b(zv2VarG.a(), "setState", true != z10 ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void f(boolean z10) {
        if (this.f12880n != z10) {
            this.f12880n = z10;
            if (this.f12879m) {
                e();
                if (this.f12881o != null) {
                    if (!z10) {
                        ow2.d().i();
                    } else {
                        ow2.d().h();
                    }
                }
            }
        }
    }

    public final void b() {
        this.f12879m = true;
        this.f12880n = false;
        e();
    }

    public final void c() {
        this.f12879m = false;
        this.f12880n = false;
        this.f12881o = null;
    }

    public final void d(tv2 tv2Var) {
        this.f12881o = tv2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewF;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i10 = runningAppProcessInfo.importance;
        boolean z10 = true;
        for (cv2 cv2Var : mv2.a().b()) {
            if (cv2Var.j() && (viewF = cv2Var.f()) != null && viewF.hasWindowFocus()) {
                z10 = false;
            }
        }
        f(i10 != 100 && z10);
    }
}
