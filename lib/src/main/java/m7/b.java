package m7;

import android.database.Cursor;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
