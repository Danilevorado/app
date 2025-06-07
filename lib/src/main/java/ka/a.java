package ka;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes2.dex */
public class a extends SQLiteOpenHelper implements n9.g {

    /* renamed from: m, reason: collision with root package name */
    private final Object f24882m;

    public a(Context context) {
        super(context, "inboxNotificationDb.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f24882m = new Object();
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", str) + String.format("%s TEXT, ", "inbox_message_id") + String.format("%s TEXT, ", "notification_tag") + String.format("%s INTEGER ", "notification_id") + ");");
    }

    private void c(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        a(sQLiteDatabase, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        a(sQLiteDatabase, "inboxNotifications");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        c(sQLiteDatabase, "inboxNotifications");
    }
}
