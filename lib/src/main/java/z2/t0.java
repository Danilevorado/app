package z2;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class t0 extends SQLiteOpenHelper {

    /* renamed from: o, reason: collision with root package name */
    private static final String f28836o = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: p, reason: collision with root package name */
    static int f28837p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final a f28838q;

    /* renamed from: r, reason: collision with root package name */
    private static final a f28839r;

    /* renamed from: s, reason: collision with root package name */
    private static final a f28840s;

    /* renamed from: t, reason: collision with root package name */
    private static final a f28841t;

    /* renamed from: u, reason: collision with root package name */
    private static final a f28842u;

    /* renamed from: v, reason: collision with root package name */
    private static final List f28843v;

    /* renamed from: m, reason: collision with root package name */
    private final int f28844m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f28845n;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        r0 r0Var = new a() { // from class: z2.r0
            @Override // z2.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                t0.x(sQLiteDatabase);
            }
        };
        f28838q = r0Var;
        o0 o0Var = new a() { // from class: z2.o0
            @Override // z2.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                t0.y(sQLiteDatabase);
            }
        };
        f28839r = o0Var;
        p0 p0Var = new a() { // from class: z2.p0
            @Override // z2.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f28840s = p0Var;
        q0 q0Var = new a() { // from class: z2.q0
            @Override // z2.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                t0.V(sQLiteDatabase);
            }
        };
        f28841t = q0Var;
        s0 s0Var = new a() { // from class: z2.s0
            @Override // z2.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                t0.W(sQLiteDatabase);
            }
        };
        f28842u = s0Var;
        f28843v = Arrays.asList(r0Var, o0Var, p0Var, q0Var, s0Var);
    }

    t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f28845n = false;
        this.f28844m = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f28836o);
    }

    private void X(SQLiteDatabase sQLiteDatabase, int i10) {
        s(sQLiteDatabase);
        Y(sQLiteDatabase, 0, i10);
    }

    private void Y(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f28843v;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((a) f28843v.get(i10)).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void s(SQLiteDatabase sQLiteDatabase) {
        if (this.f28845n) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f28845n = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        X(sQLiteDatabase, this.f28844m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        X(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        s(sQLiteDatabase);
        Y(sQLiteDatabase, i10, i11);
    }
}
