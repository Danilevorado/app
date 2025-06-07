package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20251a;

    public o8(Context context) {
        e4.p.l(context);
        this.f20251a = context;
    }

    private final s3 k() {
        return w4.H(this.f20251a, null, null).b();
    }

    public final int a(final Intent intent, int i10, final int i11) {
        w4 w4VarH = w4.H(this.f20251a, null, null);
        final s3 s3VarB = w4VarH.b();
        if (intent == null) {
            s3VarB.u().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        w4VarH.x();
        s3VarB.t().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.m8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20182m.c(i11, s3VarB, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().p().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new o5(n9.f0(this.f20251a), null);
        }
        k().u().b("onBind received unknown action", action);
        return null;
    }

    final /* synthetic */ void c(int i10, s3 s3Var, Intent intent) {
        if (((x4.z) this.f20251a).y(i10)) {
            s3Var.t().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            k().t().a("Completed wakeful intent.");
            ((x4.z) this.f20251a).a(intent);
        }
    }

    final /* synthetic */ void d(s3 s3Var, JobParameters jobParameters) {
        s3Var.t().a("AppMeasurementJobService processed last upload request.");
        ((x4.z) this.f20251a).b(jobParameters, false);
    }

    public final void e() {
        w4 w4VarH = w4.H(this.f20251a, null, null);
        s3 s3VarB = w4VarH.b();
        w4VarH.x();
        s3VarB.t().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        w4 w4VarH = w4.H(this.f20251a, null, null);
        s3 s3VarB = w4VarH.b();
        w4VarH.x();
        s3VarB.t().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().p().a("onRebind called with null intent");
        } else {
            k().t().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) {
        n9 n9VarF0 = n9.f0(this.f20251a);
        n9VarF0.B().y(new n8(this, n9VarF0, runnable));
    }

    public final boolean i(final JobParameters jobParameters) {
        w4 w4VarH = w4.H(this.f20251a, null, null);
        final s3 s3VarB = w4VarH.b();
        String string = jobParameters.getExtras().getString("action");
        w4VarH.x();
        s3VarB.t().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        h(new Runnable() { // from class: com.google.android.gms.measurement.internal.l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f20161m.d(s3VarB, jobParameters);
            }
        });
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().p().a("onUnbind called with null intent");
            return true;
        }
        k().t().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
