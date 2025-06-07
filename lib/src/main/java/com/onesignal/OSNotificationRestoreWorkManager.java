package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import b1.l;
import com.onesignal.e3;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class OSNotificationRestoreWorkManager {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f21642a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* renamed from: b, reason: collision with root package name */
    private static final String f21643b = NotificationRestoreWorker.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21644c;

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public c.a doWork() {
            Context applicationContext = getApplicationContext();
            if (e3.f21882e == null) {
                e3.Q0(applicationContext);
            }
            if (OSUtils.a(applicationContext) && !OSNotificationRestoreWorkManager.f21644c) {
                OSNotificationRestoreWorkManager.f21644c = true;
                e3.a(e3.z.INFO, "Restoring notifications");
                l3 l3VarX = l3.x(applicationContext);
                StringBuilder sbX = l3.X();
                OSNotificationRestoreWorkManager.f(applicationContext, sbX);
                OSNotificationRestoreWorkManager.d(applicationContext, l3VarX, sbX);
                return c.a.c();
            }
            return c.a.a();
        }
    }

    public static void c(Context context, boolean z10) {
        d3.a(context).d(f21643b, b1.d.KEEP, (b1.l) ((l.a) new l.a(NotificationRestoreWorker.class).l(z10 ? 15 : 0, TimeUnit.SECONDS)).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, l3 l3Var, StringBuilder sb2) {
        e3.a(e3.z.INFO, "Querying DB for notifications to restore: " + sb2.toString());
        Cursor cursorG = null;
        try {
            cursorG = l3Var.g("notification", f21642a, sb2.toString(), null, null, null, "_id DESC", l0.f22097a);
            e(context, cursorG, 200);
            k.c(l3Var, context);
            if (cursorG == null || cursorG.isClosed()) {
            }
        } catch (Throwable th) {
            try {
                e3.b(e3.z.ERROR, "Error restoring notification records! ", th);
            } finally {
                if (cursorG != null && !cursorG.isClosed()) {
                    cursorG.close();
                }
            }
        }
    }

    static void e(Context context, Cursor cursor, int i10) throws InterruptedException {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.b(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i10 > 0) {
                    OSUtils.V(i10);
                }
            } while (cursor.moveToNext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context, StringBuilder sb2) {
        StatusBarNotification[] statusBarNotificationArrD = m3.d(context);
        if (statusBarNotificationArrD.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrD) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        sb2.append(" AND android_notification_id NOT IN (");
        sb2.append(TextUtils.join(",", arrayList));
        sb2.append(")");
    }
}
