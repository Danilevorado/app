package v0;

import android.database.sqlite.SQLiteStatement;
import u0.k;

/* loaded from: classes.dex */
class g extends f implements k {

    /* renamed from: n, reason: collision with root package name */
    private final SQLiteStatement f27812n;

    g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f27812n = sQLiteStatement;
    }

    @Override // u0.k
    public long R() {
        return this.f27812n.executeInsert();
    }

    @Override // u0.k
    public int t() {
        return this.f27812n.executeUpdateDelete();
    }
}
