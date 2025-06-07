package z2;

import a3.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import r2.i;
import u2.a;
import u2.c;

/* loaded from: classes.dex */
public class m0 implements z2.d, a3.b, z2.c {

    /* renamed from: r, reason: collision with root package name */
    private static final p2.b f28803r = p2.b.b("proto");

    /* renamed from: m, reason: collision with root package name */
    private final t0 f28804m;

    /* renamed from: n, reason: collision with root package name */
    private final b3.a f28805n;

    /* renamed from: o, reason: collision with root package name */
    private final b3.a f28806o;

    /* renamed from: p, reason: collision with root package name */
    private final e f28807p;

    /* renamed from: q, reason: collision with root package name */
    private final gb.a f28808q;

    interface b {
        Object a(Object obj);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f28809a;

        /* renamed from: b, reason: collision with root package name */
        final String f28810b;

        private c(String str, String str2) {
            this.f28809a = str;
            this.f28810b = str2;
        }
    }

    interface d {
        Object a();
    }

    m0(b3.a aVar, b3.a aVar2, e eVar, t0 t0Var, gb.a aVar3) {
        this.f28804m = t0Var;
        this.f28805n = aVar;
        this.f28806o = aVar2;
        this.f28807p = eVar;
        this.f28808q = aVar3;
    }

    private boolean A0() {
        return v0() * w0() >= this.f28807p.f();
    }

    private List B0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                i.a aVarL = kVar.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    aVarL.c(cVar.f28809a, cVar.f28810b);
                }
                listIterator.set(k.a(kVar.c(), kVar.d(), aVarL.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object C0(Cursor cursor) {
        while (cursor.moveToNext()) {
            f(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer D0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        j1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: z2.h0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28788a.C0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object E0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object F0(Throwable th) {
        throw new a3.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase G0(Throwable th) {
        throw new a3.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long H0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u2.f I0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return u2.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u2.f J0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (u2.f) j1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: z2.l
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.I0(j10, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long K0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean L0(r2.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lY0 = y0(sQLiteDatabase, oVar);
        return lY0 == null ? Boolean.FALSE : (Boolean) j1(t0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lY0.toString()}), new b() { // from class: z2.y
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List M0(SQLiteDatabase sQLiteDatabase) {
        return (List) j1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: z2.t
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.N0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List N0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(r2.o.a().b(cursor.getString(1)).d(c3.a.b(cursor.getInt(2))).c(d1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List O0(r2.o oVar, SQLiteDatabase sQLiteDatabase) {
        List listB1 = b1(sQLiteDatabase, oVar, this.f28807p.d());
        for (p2.d dVar : p2.d.values()) {
            if (dVar != oVar.d()) {
                int iD = this.f28807p.d() - listB1.size();
                if (iD <= 0) {
                    break;
                }
                listB1.addAll(b1(sQLiteDatabase, oVar.f(dVar), iD));
            }
        }
        return B0(listB1, c1(sQLiteDatabase, listB1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u2.a P0(Map map, a.C0193a c0193a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarP0 = p0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(u2.c.c().c(bVarP0).b(j10).a());
        }
        e1(c0193a, map);
        c0193a.e(x0());
        c0193a.d(u0());
        c0193a.c((String) this.f28808q.get());
        return c0193a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u2.a Q0(String str, final Map map, final a.C0193a c0193a, SQLiteDatabase sQLiteDatabase) {
        return (u2.a) j1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: z2.o
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28819a.P0(map, c0193a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object R0(List list, r2.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a aVarK = r2.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            aVarK.h(z10 ? new r2.h(h1(cursor.getString(4)), cursor.getBlob(5)) : new r2.h(h1(cursor.getString(4)), f1(j10)));
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object S0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long T0(r2.i iVar, r2.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (A0()) {
            f(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jR0 = r0(sQLiteDatabase, oVar);
        int iE = this.f28807p.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jR0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(bArrA.length / iE);
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] U0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object V0(Cursor cursor) {
        while (cursor.moveToNext()) {
            f(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object W0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        j1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: z2.i0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28790a.V0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean X0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Y0(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) j1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())}), new b() { // from class: z2.x
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.X0((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.b())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.b()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Z0(long j10, r2.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(c3.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(c3.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f28805n.a()).execute();
        return null;
    }

    private List b1(SQLiteDatabase sQLiteDatabase, final r2.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lY0 = y0(sQLiteDatabase, oVar);
        if (lY0 == null) {
            return arrayList;
        }
        j1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lY0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: z2.n
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28811a.R0(arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map c1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        j1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: z2.g0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.S0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] d1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void e1(a.C0193a c0193a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0193a.a(u2.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] f1(long j10) {
        return (byte[]) j1(t0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: z2.s
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.U0((Cursor) obj);
            }
        });
    }

    private Object g1(d dVar, b bVar) {
        long jA = this.f28806o.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e5) {
                if (this.f28806o.a() >= this.f28807p.b() + jA) {
                    return bVar.a(e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static p2.b h1(String str) {
        return str == null ? f28803r : p2.b.b(str);
    }

    private static String i1(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object j1(Cursor cursor, b bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b p0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.b()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.b()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.b()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.b()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.b()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.b()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.b()) {
            return bVar7;
        }
        v2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void q0(final SQLiteDatabase sQLiteDatabase) {
        g1(new d() { // from class: z2.c0
            @Override // z2.m0.d
            public final Object a() {
                return m0.E0(sQLiteDatabase);
            }
        }, new b() { // from class: z2.b0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.F0((Throwable) obj);
            }
        });
    }

    private long r0(SQLiteDatabase sQLiteDatabase, r2.o oVar) {
        Long lY0 = y0(sQLiteDatabase, oVar);
        if (lY0 != null) {
            return lY0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(c3.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private u2.b u0() {
        return u2.b.b().b(u2.e.c().b(s0()).c(e.f28779a.f()).a()).a();
    }

    private long v0() {
        return t0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long w0() {
        return t0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private u2.f x0() {
        final long jA = this.f28805n.a();
        return (u2.f) z0(new b() { // from class: z2.w
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.J0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long y0(SQLiteDatabase sQLiteDatabase, r2.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(c3.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) j1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: z2.v
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.K0((Cursor) obj);
            }
        });
    }

    @Override // z2.d
    public Iterable C() {
        return (Iterable) z0(new b() { // from class: z2.z
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.M0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // z2.d
    public Iterable D(final r2.o oVar) {
        return (Iterable) z0(new b() { // from class: z2.q
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28827a.O0(oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // z2.d
    public k F(final r2.o oVar, final r2.i iVar) {
        v2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) z0(new b() { // from class: z2.p
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28823a.T0(iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    @Override // z2.d
    public void N(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            z0(new b() { // from class: z2.l0
                @Override // z2.m0.b
                public final Object a(Object obj) {
                    return this.f28796a.W0(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // z2.d
    public long O(r2.o oVar) {
        return ((Long) j1(t0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(c3.a.a(oVar.d()))}), new b() { // from class: z2.u
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.H0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // z2.d
    public boolean T(final r2.o oVar) {
        return ((Boolean) z0(new b() { // from class: z2.r
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28830a.L0(oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // a3.b
    public Object a(b.a aVar) {
        SQLiteDatabase sQLiteDatabaseT0 = t0();
        q0(sQLiteDatabaseT0);
        try {
            Object objA = aVar.a();
            sQLiteDatabaseT0.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseT0.endTransaction();
        }
    }

    @Override // z2.c
    public u2.a c() {
        final a.C0193a c0193aE = u2.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (u2.a) z0(new b() { // from class: z2.m
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28799a.Q0(str, map, c0193aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28804m.close();
    }

    @Override // z2.c
    public void e() {
        z0(new b() { // from class: z2.j0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28792a.a1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // z2.c
    public void f(final long j10, final c.b bVar, final String str) {
        z0(new b() { // from class: z2.f0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.Y0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // z2.d
    public int k() {
        final long jA = this.f28805n.a() - this.f28807p.c();
        return ((Integer) z0(new b() { // from class: z2.k0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return this.f28793a.D0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // z2.d
    public void l(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            t0().compileStatement("DELETE FROM events WHERE _id in " + i1(iterable)).execute();
        }
    }

    @Override // z2.d
    public void o(final r2.o oVar, final long j10) {
        z0(new b() { // from class: z2.e0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.Z0(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    long s0() {
        return v0() * w0();
    }

    SQLiteDatabase t0() {
        final t0 t0Var = this.f28804m;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) g1(new d() { // from class: z2.d0
            @Override // z2.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: z2.a0
            @Override // z2.m0.b
            public final Object a(Object obj) {
                return m0.G0((Throwable) obj);
            }
        });
    }

    Object z0(b bVar) {
        SQLiteDatabase sQLiteDatabaseT0 = t0();
        sQLiteDatabaseT0.beginTransaction();
        try {
            Object objA = bVar.a(sQLiteDatabaseT0);
            sQLiteDatabaseT0.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseT0.endTransaction();
        }
    }
}
