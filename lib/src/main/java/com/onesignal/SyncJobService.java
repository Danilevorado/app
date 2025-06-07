package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.e3;
import com.onesignal.r2;

/* loaded from: classes.dex */
public class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) throws InterruptedException {
        r2.q().b(this, new r2.b(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean zL = r2.q().l();
        e3.a(e3.z.DEBUG, "SyncJobService onStopJob called, system conditions not available reschedule: " + zL);
        return zL;
    }
}
