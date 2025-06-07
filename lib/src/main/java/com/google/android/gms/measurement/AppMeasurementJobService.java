package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.o8;
import x4.z;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements z {

    /* renamed from: m, reason: collision with root package name */
    private o8 f19728m;

    private final o8 c() {
        if (this.f19728m == null) {
            this.f19728m = new o8(this);
        }
        return this.f19728m;
    }

    @Override // x4.z
    public final void a(Intent intent) {
    }

    @Override // x4.z
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        c().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        c().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c().j(intent);
        return true;
    }

    @Override // x4.z
    public final boolean y(int i10) {
        throw new UnsupportedOperationException();
    }
}
