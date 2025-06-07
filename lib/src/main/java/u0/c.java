package u0;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class c {
    public static Uri a(Cursor cursor) {
        return cursor.getNotificationUri();
    }

    public static boolean b(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
