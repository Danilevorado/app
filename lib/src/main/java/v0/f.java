package v0;

import android.database.sqlite.SQLiteProgram;
import u0.i;

/* loaded from: classes.dex */
class f implements i {

    /* renamed from: m, reason: collision with root package name */
    private final SQLiteProgram f27811m;

    f(SQLiteProgram sQLiteProgram) {
        this.f27811m = sQLiteProgram;
    }

    @Override // u0.i
    public void G(int i10, long j10) {
        this.f27811m.bindLong(i10, j10);
    }

    @Override // u0.i
    public void L(int i10, byte[] bArr) {
        this.f27811m.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27811m.close();
    }

    @Override // u0.i
    public void q(int i10, String str) {
        this.f27811m.bindString(i10, str);
    }

    @Override // u0.i
    public void v(int i10) {
        this.f27811m.bindNull(i10);
    }

    @Override // u0.i
    public void w(int i10, double d10) {
        this.f27811m.bindDouble(i10, d10);
    }
}
