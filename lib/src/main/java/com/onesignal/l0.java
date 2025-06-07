package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import com.onesignal.e3;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    static final String f22097a = Integer.toString(49);

    static void a(Context context, int i10) {
        try {
            c(context, i10);
        } catch (Throwable unused) {
            b(context, i10);
        }
    }

    static void b(Context context, int i10) {
        boolean zIsClosed;
        int count;
        l3 l3VarX = l3.x(context);
        Cursor cursorG = null;
        try {
            cursorG = l3VarX.g("notification", new String[]{"android_notification_id"}, l3.X().toString(), null, null, null, "_id", e() + i10);
            count = (cursorG.getCount() - d()) + i10;
        } catch (Throwable th) {
            try {
                e3.b(e3.z.ERROR, "Error clearing oldest notifications over limit! ", th);
                if (cursorG == null) {
                    return;
                } else {
                    if (zIsClosed) {
                        return;
                    }
                }
            } finally {
                if (cursorG != null && !cursorG.isClosed()) {
                    cursorG.close();
                }
            }
        }
        if (count < 1) {
            if (cursorG.isClosed()) {
                return;
            }
            cursorG.close();
            return;
        }
        while (cursorG.moveToNext()) {
            e3.t1(cursorG.getInt(cursorG.getColumnIndex("android_notification_id")));
            count--;
            if (count <= 0) {
                break;
            }
        }
        if (cursorG.isClosed()) {
        }
    }

    static void c(Context context, int i10) {
        StatusBarNotification[] statusBarNotificationArrD = m3.d(context);
        int length = (statusBarNotificationArrD.length - d()) + i10;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrD) {
            if (!f(statusBarNotification)) {
                treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            e3.t1(((Integer) ((Map.Entry) it.next()).getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }

    private static int d() {
        return 49;
    }

    private static String e() {
        return f22097a;
    }

    static boolean f(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}
