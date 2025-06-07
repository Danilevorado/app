package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.w60;
import k3.t;
import l4.b;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: r, reason: collision with root package name */
    private final w60 f5527r;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5527r = t.a().i(context, new l30());
    }

    @Override // androidx.work.Worker
    public final c.a doWork() {
        try {
            this.f5527r.j3(b.p1(getApplicationContext()), getInputData().l("uri"), getInputData().l("gws_query_id"));
            return c.a.c();
        } catch (RemoteException unused) {
            return c.a.a();
        }
    }
}
