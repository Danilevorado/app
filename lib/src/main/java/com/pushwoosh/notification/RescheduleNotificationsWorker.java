package com.pushwoosh.notification;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import c9.a;
import com.pushwoosh.notification.RescheduleNotificationsWorker;
import ka.e;
import ka.f;
import n9.b;
import z7.h;

/* loaded from: classes2.dex */
public class RescheduleNotificationsWorker extends Worker {
    public RescheduleNotificationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static long b() {
        h hVarL = a.d().l();
        return hVarL != null ? hVarL.b() : System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(long j10, b bVar) {
        k9.h.h("RescheduleNotificationsWorker", "Rescheduling local push: " + bVar.a().toString());
        LocalNotificationReceiver.e(bVar, j10);
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        final long jB = b();
        e.b().c(new f.a() { // from class: w9.h
            @Override // ka.f.a
            public final void a(n9.b bVar) {
                RescheduleNotificationsWorker.d(jB, bVar);
            }
        });
        return c.a.c();
    }
}
