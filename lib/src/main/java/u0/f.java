package u0;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static List a(Cursor cursor) {
        return cursor.getNotificationUris();
    }

    public static void b(Cursor cursor, ContentResolver contentResolver, List list) {
        cursor.setNotificationUris(contentResolver, list);
    }
}
