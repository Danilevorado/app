package v0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import u0.j;
import u0.k;

/* loaded from: classes.dex */
class c implements u0.g {

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f27782n = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f27783o = new String[0];

    /* renamed from: m, reason: collision with root package name */
    private final SQLiteDatabase f27784m;

    c(SQLiteDatabase sQLiteDatabase) {
        this.f27784m = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor f(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        jVar.c(new f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor g(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        jVar.c(new f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // u0.g
    public boolean A() {
        return this.f27784m.inTransaction();
    }

    @Override // u0.g
    public Cursor B(final j jVar, CancellationSignal cancellationSignal) {
        return u0.b.c(this.f27784m, jVar.a(), f27783o, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: v0.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.g(jVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // u0.g
    public boolean E() {
        return u0.b.b(this.f27784m);
    }

    @Override // u0.g
    public void H() {
        this.f27784m.setTransactionSuccessful();
    }

    @Override // u0.g
    public void I(String str, Object[] objArr) throws SQLException {
        this.f27784m.execSQL(str, objArr);
    }

    @Override // u0.g
    public void J() {
        this.f27784m.beginTransactionNonExclusive();
    }

    @Override // u0.g
    public int K(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("UPDATE ");
        sb2.append(f27782n[i10]);
        sb2.append(str);
        sb2.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i11 = 0;
        for (String str3 : contentValues.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str3);
            objArr2[i11] = contentValues.get(str3);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(" WHERE ");
            sb2.append(str2);
        }
        k kVarU = u(sb2.toString());
        u0.a.d(kVarU, objArr2);
        return kVarU.t();
    }

    @Override // u0.g
    public Cursor S(String str) {
        return r(new u0.a(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27784m.close();
    }

    boolean e(SQLiteDatabase sQLiteDatabase) {
        return this.f27784m == sQLiteDatabase;
    }

    @Override // u0.g
    public void i() {
        this.f27784m.endTransaction();
    }

    @Override // u0.g
    public void j() {
        this.f27784m.beginTransaction();
    }

    @Override // u0.g
    public boolean m() {
        return this.f27784m.isOpen();
    }

    @Override // u0.g
    public List n() {
        return this.f27784m.getAttachedDbs();
    }

    @Override // u0.g
    public void p(String str) throws SQLException {
        this.f27784m.execSQL(str);
    }

    @Override // u0.g
    public Cursor r(final j jVar) {
        return this.f27784m.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: v0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.f(jVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, jVar.a(), f27783o, null);
    }

    @Override // u0.g
    public k u(String str) {
        return new g(this.f27784m.compileStatement(str));
    }

    @Override // u0.g
    public String z() {
        return this.f27784m.getPath();
    }
}
