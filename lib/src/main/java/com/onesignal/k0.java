package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.DeadSystemException;
import com.onesignal.e3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f22092a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(android.content.Context r7, android.app.NotificationManager r8, org.json.JSONObject r9) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.k0.a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    private static String b(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return "fcm_fallback_notification_channel";
    }

    static String c(x1 x1Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context contextD = x1Var.d();
        JSONObject jSONObjectE = x1Var.e();
        NotificationManager notificationManagerI = m3.i(contextD);
        if (x1Var.n()) {
            return d(notificationManagerI);
        }
        if (jSONObjectE.has("oth_chnl")) {
            String strOptString = jSONObjectE.optString("oth_chnl");
            if (notificationManagerI.getNotificationChannel(strOptString) != null) {
                return strOptString;
            }
        }
        if (!jSONObjectE.has("chnl")) {
            return b(notificationManagerI);
        }
        try {
            return a(contextD, notificationManagerI, jSONObjectE);
        } catch (JSONException e5) {
            e3.b(e3.z.ERROR, "Could not create notification channel due to JSON payload error!", e5);
            return "fcm_fallback_notification_channel";
        }
    }

    private static String d(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel("restored_OS_notifications", "Restored", 2));
        return "restored_OS_notifications";
    }

    private static List e(NotificationManager notificationManager) {
        try {
            return notificationManager.getNotificationChannels();
        } catch (NullPointerException e5) {
            e3.i1(e3.z.ERROR, "Error when trying to delete notification channel: " + e5.getMessage());
            return null;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof DeadSystemException) {
                return null;
            }
            throw e10;
        }
    }

    private static int f(int i10) {
        if (i10 > 9) {
            return 5;
        }
        if (i10 > 7) {
            return 4;
        }
        if (i10 > 5) {
            return 3;
        }
        if (i10 > 3) {
            return 2;
        }
        return i10 > 1 ? 1 : 0;
    }

    static void g(Context context, JSONArray jSONArray) {
        List listE;
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManagerI = m3.i(context);
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                hashSet.add(a(context, notificationManagerI, jSONArray.getJSONObject(i10)));
            } catch (JSONException e5) {
                e3.b(e3.z.ERROR, "Could not create notification channel due to JSON payload error!", e5);
            }
        }
        if (hashSet.isEmpty() || (listE = e(notificationManagerI)) == null) {
            return;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            String id = ((NotificationChannel) it.next()).getId();
            if (id.startsWith("OS_") && !hashSet.contains(id)) {
                notificationManagerI.deleteNotificationChannel(id);
            }
        }
    }
}
