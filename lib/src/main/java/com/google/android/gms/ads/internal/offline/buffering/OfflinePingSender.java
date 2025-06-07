package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.w60;
import k3.t;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: r, reason: collision with root package name */
    private final w60 f5528r;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5528r = t.a().i(context, new l30());
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f5528r.e();
            return c.a.c();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }
}
