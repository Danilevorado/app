package r9;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import k9.h;

/* loaded from: classes2.dex */
public abstract class b {
    private static StatusBarNotification[] a() {
        NotificationManager notificationManagerI = c9.a.e().i();
        if (notificationManagerI == null) {
            return new StatusBarNotification[0];
        }
        try {
            return notificationManagerI.getActiveNotifications();
        } catch (Exception unused) {
            h.l("StatusBarNotificationHelper", "Failed to get list of active notifications");
            return new StatusBarNotification[0];
        }
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : a()) {
            if (statusBarNotification.getNotification().extras.getBoolean("is_summary_notification")) {
                arrayList.add(Pair.create(statusBarNotification.getNotification().getGroup(), Integer.valueOf(statusBarNotification.getId())));
            }
        }
        return arrayList;
    }
}
