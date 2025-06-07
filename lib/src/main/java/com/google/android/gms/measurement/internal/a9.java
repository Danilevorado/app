package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class a9 extends c9 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f19767d;

    /* renamed from: e, reason: collision with root package name */
    private o f19768e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f19769f;

    protected a9(n9 n9Var) {
        super(n9Var);
        this.f19767d = (AlarmManager) this.f20269a.a().getSystemService("alarm");
    }

    private final int m() {
        if (this.f19769f == null) {
            this.f19769f = Integer.valueOf("measurement".concat(String.valueOf(this.f20269a.a().getPackageName())).hashCode());
        }
        return this.f19769f.intValue();
    }

    private final PendingIntent n() {
        Context contextA = this.f20269a.a();
        return PendingIntent.getBroadcast(contextA, 0, new Intent().setClassName(contextA, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.u0.f19325a);
    }

    private final o o() {
        if (this.f19768e == null) {
            this.f19768e = new z8(this, this.f19803b.c0());
        }
        return this.f19768e;
    }

    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f20269a.a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        AlarmManager alarmManager = this.f19767d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        p();
        return false;
    }

    public final void k() {
        g();
        this.f20269a.b().t().a("Unscheduling upload");
        AlarmManager alarmManager = this.f19767d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        o().b();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }

    public final void l(long j10) {
        g();
        this.f20269a.x();
        Context contextA = this.f20269a.a();
        if (!u9.Y(contextA)) {
            this.f20269a.b().o().a("Receiver not registered/enabled");
        }
        if (!u9.Z(contextA, false)) {
            this.f20269a.b().o().a("Service not registered/enabled");
        }
        k();
        this.f20269a.b().t().b("Scheduling upload, millis", Long.valueOf(j10));
        long jB = this.f20269a.d().b() + j10;
        this.f20269a.y();
        if (j10 < Math.max(0L, ((Long) i3.f20051y.a(null)).longValue()) && !o().e()) {
            o().d(j10);
        }
        this.f20269a.x();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f19767d;
            if (alarmManager != null) {
                this.f20269a.y();
                alarmManager.setInexactRepeating(2, jB, Math.max(((Long) i3.f20041t.a(null)).longValue(), j10), n());
                return;
            }
            return;
        }
        Context contextA2 = this.f20269a.a();
        ComponentName componentName = new ComponentName(contextA2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM = m();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.v0.a(contextA2, new JobInfo.Builder(iM, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
