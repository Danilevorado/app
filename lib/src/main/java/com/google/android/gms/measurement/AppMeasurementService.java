package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.o8;
import x4.z;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements z {

    /* renamed from: m, reason: collision with root package name */
    private o8 f19730m;

    private final o8 c() {
        if (this.f19730m == null) {
            this.f19730m = new o8(this);
        }
        return this.f19730m;
    }

    @Override // x4.z
    public final void a(Intent intent) {
        l0.a.b(intent);
    }

    @Override // x4.z
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        c().a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c().j(intent);
        return true;
    }

    @Override // x4.z
    public final boolean y(int i10) {
        return stopSelfResult(i10);
    }
}
