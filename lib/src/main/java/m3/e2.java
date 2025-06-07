package m3;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public class e2 extends d2 {
    @Override // m3.b
    public final void f(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // m3.b
    public final boolean g(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // m3.b
    public final int h(Context context, TelephonyManager telephonyManager) {
        j3.t.r();
        return (b2.S(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
