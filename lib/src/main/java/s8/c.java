package s8;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class c {
    private static int a(NotificationChannel notificationChannel) {
        if (c(notificationChannel)) {
            return 0;
        }
        return d(notificationChannel) ? 4 : 6;
    }

    public static int b(NotificationManager notificationManager) {
        NotificationChannel notificationChannel;
        String strB = a.b(ka.e.d().b().a());
        if (TextUtils.isEmpty(strB) || (notificationChannel = notificationManager.getNotificationChannel(strB)) == null) {
            return 6;
        }
        return a(notificationChannel);
    }

    private static boolean c(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance() == 0;
    }

    private static boolean d(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance() <= 2 || notificationChannel.getSound() == null;
    }
}
