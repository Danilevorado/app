package com.onesignal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class m3 {
    public static boolean a(Context context, String str) {
        if (!androidx.core.app.o.e(context).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        NotificationChannel notificationChannel = i(context).getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    static void b(Context context, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            androidx.core.app.o.e(context).g(statusBarNotification.getId(), Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    static ArrayList c(Context context) {
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : d(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean zF = l0.f(statusBarNotification);
            boolean z10 = notification.getGroup() == null || notification.getGroup().equals(g());
            if (!zF && z10) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    static StatusBarNotification[] d(Context context) {
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            return i(context).getActiveNotifications();
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    static Integer e(Context context) {
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : d(context)) {
            if (!androidx.core.app.l.b(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i10++;
            }
        }
        return Integer.valueOf(i10);
    }

    static int f() {
        return -718463522;
    }

    static String g() {
        return "os_group_undefined";
    }

    static Integer h(l3 l3Var, String str, boolean z10) {
        Cursor cursorG = l3Var.g("notification", null, (z10 ? "group_id IS NULL" : "group_id = ?") + " AND dismissed = 0 AND opened = 0 AND is_summary = 0", z10 ? null : new String[]{str}, null, null, "created_time DESC", "1");
        if (!cursorG.moveToFirst()) {
            cursorG.close();
            return null;
        }
        Integer numValueOf = Integer.valueOf(cursorG.getInt(cursorG.getColumnIndex("android_notification_id")));
        cursorG.close();
        return numValueOf;
    }

    static NotificationManager i(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }
}
