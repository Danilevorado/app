package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.room.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class g implements u0.h, k {

    /* renamed from: m, reason: collision with root package name */
    private final u0.h f3640m;

    /* renamed from: n, reason: collision with root package name */
    private final a f3641n;

    /* renamed from: o, reason: collision with root package name */
    private final androidx.room.a f3642o;

    static final class a implements u0.g {

        /* renamed from: m, reason: collision with root package name */
        private final androidx.room.a f3643m;

        a(androidx.room.a aVar) {
            this.f3643m = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object U(u0.g gVar) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Integer V(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, u0.g gVar) {
            return Integer.valueOf(gVar.K(str, i10, contentValues, str2, objArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object s(String str, u0.g gVar) {
            gVar.p(str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object x(String str, Object[] objArr, u0.g gVar) {
            gVar.I(str, objArr);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean y(u0.g gVar) {
            return Boolean.valueOf(gVar.E());
        }

        @Override // u0.g
        public boolean A() {
            if (this.f3643m.d() == null) {
                return false;
            }
            return ((Boolean) this.f3643m.c(new l.a() { // from class: q0.c
                @Override // l.a
                public final Object a(Object obj) {
                    return Boolean.valueOf(((u0.g) obj).A());
                }
            })).booleanValue();
        }

        @Override // u0.g
        public Cursor B(u0.j jVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f3643m.e().B(jVar, cancellationSignal), this.f3643m);
            } catch (Throwable th) {
                this.f3643m.b();
                throw th;
            }
        }

        @Override // u0.g
        public boolean E() {
            return ((Boolean) this.f3643m.c(new l.a() { // from class: androidx.room.e
                @Override // l.a
                public final Object a(Object obj) {
                    return g.a.y((u0.g) obj);
                }
            })).booleanValue();
        }

        @Override // u0.g
        public void H() {
            u0.g gVarD = this.f3643m.d();
            if (gVarD == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            gVarD.H();
        }

        @Override // u0.g
        public void I(final String str, final Object[] objArr) {
            this.f3643m.c(new l.a() { // from class: androidx.room.d
                @Override // l.a
                public final Object a(Object obj) {
                    return g.a.x(str, objArr, (u0.g) obj);
                }
            });
        }

        @Override // u0.g
        public void J() {
            try {
                this.f3643m.e().J();
            } catch (Throwable th) {
                this.f3643m.b();
                throw th;
            }
        }

        @Override // u0.g
        public int K(final String str, final int i10, final ContentValues contentValues, final String str2, final Object[] objArr) {
            return ((Integer) this.f3643m.c(new l.a() { // from class: androidx.room.c
                @Override // l.a
                public final Object a(Object obj) {
                    return g.a.V(str, i10, contentValues, str2, objArr, (u0.g) obj);
                }
            })).intValue();
        }

        @Override // u0.g
        public Cursor S(String str) {
            try {
                return new c(this.f3643m.e().S(str), this.f3643m);
            } catch (Throwable th) {
                this.f3643m.b();
                throw th;
            }
        }

        void W() {
            this.f3643m.c(new l.a() { // from class: androidx.room.f
                @Override // l.a
                public final Object a(Object obj) {
                    return g.a.U((u0.g) obj);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3643m.a();
        }

        @Override // u0.g
        public void i() {
            if (this.f3643m.d() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.f3643m.d().i();
            } finally {
                this.f3643m.b();
            }
        }

        @Override // u0.g
        public void j() {
            try {
                this.f3643m.e().j();
            } catch (Throwable th) {
                this.f3643m.b();
                throw th;
            }
        }

        @Override // u0.g
        public boolean m() {
            u0.g gVarD = this.f3643m.d();
            if (gVarD == null) {
                return false;
            }
            return gVarD.m();
        }

        @Override // u0.g
        public List n() {
            return (List) this.f3643m.c(new l.a() { // from class: q0.a
                @Override // l.a
                public final Object a(Object obj) {
                    return ((u0.g) obj).n();
                }
            });
        }

        @Override // u0.g
        public void p(final String str) {
            this.f3643m.c(new l.a() { // from class: androidx.room.b
                @Override // l.a
                public final Object a(Object obj) {
                    return g.a.s(str, (u0.g) obj);
                }
            });
        }

        @Override // u0.g
        public Cursor r(u0.j jVar) {
            try {
                return new c(this.f3643m.e().r(jVar), this.f3643m);
            } catch (Throwable th) {
                this.f3643m.b();
                throw th;
            }
        }

        @Override // u0.g
        public u0.k u(String str) {
            return new b(str, this.f3643m);
        }

        @Override // u0.g
        public String z() {
            return (String) this.f3643m.c(new l.a() { // from class: q0.b
                @Override // l.a
                public final Object a(Object obj) {
                    return ((u0.g) obj).z();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements u0.k {

        /* renamed from: m, reason: collision with root package name */
        private final String f3644m;

        /* renamed from: n, reason: collision with root package name */
        private final ArrayList f3645n = new ArrayList();

        /* renamed from: o, reason: collision with root package name */
        private final androidx.room.a f3646o;

        b(String str, androidx.room.a aVar) {
            this.f3644m = str;
            this.f3646o = aVar;
        }

        private void c(u0.k kVar) {
            int i10 = 0;
            while (i10 < this.f3645n.size()) {
                int i11 = i10 + 1;
                Object obj = this.f3645n.get(i10);
                if (obj == null) {
                    kVar.v(i11);
                } else if (obj instanceof Long) {
                    kVar.G(i11, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.w(i11, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.q(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.L(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private Object e(final l.a aVar) {
            return this.f3646o.c(new l.a() { // from class: androidx.room.h
                @Override // l.a
                public final Object a(Object obj) {
                    return this.f3654a.f(aVar, (u0.g) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object f(l.a aVar, u0.g gVar) {
            u0.k kVarU = gVar.u(this.f3644m);
            c(kVarU);
            return aVar.a(kVarU);
        }

        private void g(int i10, Object obj) {
            int i11 = i10 - 1;
            if (i11 >= this.f3645n.size()) {
                for (int size = this.f3645n.size(); size <= i11; size++) {
                    this.f3645n.add(null);
                }
            }
            this.f3645n.set(i11, obj);
        }

        @Override // u0.i
        public void G(int i10, long j10) {
            g(i10, Long.valueOf(j10));
        }

        @Override // u0.i
        public void L(int i10, byte[] bArr) {
            g(i10, bArr);
        }

        @Override // u0.k
        public long R() {
            return ((Long) e(new l.a() { // from class: q0.e
                @Override // l.a
                public final Object a(Object obj) {
                    return Long.valueOf(((u0.k) obj).R());
                }
            })).longValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // u0.i
        public void q(int i10, String str) {
            g(i10, str);
        }

        @Override // u0.k
        public int t() {
            return ((Integer) e(new l.a() { // from class: q0.d
                @Override // l.a
                public final Object a(Object obj) {
                    return Integer.valueOf(((u0.k) obj).t());
                }
            })).intValue();
        }

        @Override // u0.i
        public void v(int i10) {
            g(i10, null);
        }

        @Override // u0.i
        public void w(int i10, double d10) {
            g(i10, Double.valueOf(d10));
        }
    }

    private static final class c implements Cursor {

        /* renamed from: m, reason: collision with root package name */
        private final Cursor f3647m;

        /* renamed from: n, reason: collision with root package name */
        private final androidx.room.a f3648n;

        c(Cursor cursor, androidx.room.a aVar) {
            this.f3647m = cursor;
            this.f3648n = aVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3647m.close();
            this.f3648n.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f3647m.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f3647m.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f3647m.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f3647m.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f3647m.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f3647m.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f3647m.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f3647m.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f3647m.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f3647m.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f3647m.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f3647m.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f3647m.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f3647m.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return u0.c.a(this.f3647m);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return u0.f.a(this.f3647m);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f3647m.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f3647m.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f3647m.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f3647m.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f3647m.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f3647m.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f3647m.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f3647m.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f3647m.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f3647m.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f3647m.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f3647m.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f3647m.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f3647m.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f3647m.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f3647m.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f3647m.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f3647m.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3647m.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f3647m.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f3647m.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            u0.e.a(this.f3647m, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f3647m.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List list) {
            u0.f.b(this.f3647m, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f3647m.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3647m.unregisterDataSetObserver(dataSetObserver);
        }
    }

    g(u0.h hVar, androidx.room.a aVar) {
        this.f3640m = hVar;
        this.f3642o = aVar;
        aVar.f(hVar);
        this.f3641n = new a(aVar);
    }

    @Override // u0.h
    public u0.g P() {
        this.f3641n.W();
        return this.f3641n;
    }

    @Override // androidx.room.k
    public u0.h a() {
        return this.f3640m;
    }

    androidx.room.a c() {
        return this.f3642o;
    }

    @Override // u0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            this.f3641n.close();
        } catch (IOException e5) {
            s0.e.a(e5);
        }
    }

    @Override // u0.h
    public String getDatabaseName() {
        return this.f3640m.getDatabaseName();
    }

    @Override // u0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f3640m.setWriteAheadLoggingEnabled(z10);
    }
}
