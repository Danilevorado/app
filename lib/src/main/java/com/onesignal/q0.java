package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.e3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class q0 {
    static void a(Context context, l3 l3Var, String str) {
        Integer numB = b(l3Var, str);
        boolean zEquals = str.equals(m3.g());
        NotificationManager notificationManagerI = m3.i(context);
        Integer numH = m3.h(l3Var, str, zEquals);
        if (numH != null) {
            if (!e3.S()) {
                e3.t1(numH.intValue());
                return;
            }
            if (zEquals) {
                numB = Integer.valueOf(m3.f());
            }
            if (numB != null) {
                notificationManagerI.cancel(numB.intValue());
            }
        }
    }

    static Integer b(k3 k3Var, String str) {
        Integer num;
        Cursor cursorA;
        Cursor cursor = null;
        try {
            cursorA = k3Var.a("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{str}, null, null, null);
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        try {
            if (!cursorA.moveToFirst()) {
                cursorA.close();
                if (!cursorA.isClosed()) {
                    cursorA.close();
                }
                return null;
            }
            Integer numValueOf = Integer.valueOf(cursorA.getInt(cursorA.getColumnIndex("android_notification_id")));
            cursorA.close();
            if (cursorA.isClosed()) {
                return numValueOf;
            }
            cursorA.close();
            return numValueOf;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorA;
            num = null;
            try {
                e3.b(e3.z.ERROR, "Error getting android notification id for summary notification group: " + str, th);
                return num;
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    private static Cursor c(Context context, k3 k3Var, String str, boolean z10) {
        Long lValueOf;
        String string;
        Cursor cursorA = k3Var.a("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, "_id DESC");
        int count = cursorA.getCount();
        if (count == 0 && !str.equals(m3.g())) {
            cursorA.close();
            Integer numB = b(k3Var, str);
            if (numB == null) {
                return cursorA;
            }
            m3.i(context).cancel(numB.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z10 ? "dismissed" : "opened", (Integer) 1);
            k3Var.f("notification", contentValues, "android_notification_id = " + numB, null);
            return cursorA;
        }
        if (count == 1) {
            cursorA.close();
            if (b(k3Var, str) == null) {
                return cursorA;
            }
            d(context, str);
            return cursorA;
        }
        try {
            cursorA.moveToFirst();
            lValueOf = Long.valueOf(cursorA.getLong(cursorA.getColumnIndex("created_time")));
            string = cursorA.getString(cursorA.getColumnIndex("full_data"));
            cursorA.close();
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        if (b(k3Var, str) == null) {
            return cursorA;
        }
        x1 x1Var = new x1(context);
        x1Var.y(true);
        x1Var.z(lValueOf);
        x1Var.q(new JSONObject(string));
        u.N(x1Var);
        return cursorA;
    }

    private static void d(Context context, String str) {
        String[] strArr = {str};
        Cursor cursorA = null;
        try {
            cursorA = l3.x(context).a("notification", OSNotificationRestoreWorkManager.f21642a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, null, null, null);
            OSNotificationRestoreWorkManager.e(context, cursorA, 0);
            if (cursorA == null || cursorA.isClosed()) {
            }
        } catch (Throwable th) {
            try {
                e3.b(e3.z.ERROR, "Error restoring notification records! ", th);
            } finally {
                if (cursorA != null && !cursorA.isClosed()) {
                    cursorA.close();
                }
            }
        }
    }

    static void e(Context context, k3 k3Var, int i10) {
        Cursor cursorA = k3Var.a("notification", new String[]{"group_id"}, "android_notification_id = " + i10, null, null, null, null);
        if (!cursorA.moveToFirst()) {
            cursorA.close();
            return;
        }
        String string = cursorA.getString(cursorA.getColumnIndex("group_id"));
        cursorA.close();
        if (string != null) {
            f(context, k3Var, string, true);
        }
    }

    static void f(Context context, k3 k3Var, String str, boolean z10) {
        try {
            Cursor cursorC = c(context, k3Var, str, z10);
            if (cursorC == null || cursorC.isClosed()) {
                return;
            }
            cursorC.close();
        } finally {
        }
    }
}
