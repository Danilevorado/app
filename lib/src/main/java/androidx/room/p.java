package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class p {

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f3751n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    final String[] f3753b;

    /* renamed from: c, reason: collision with root package name */
    private Map f3754c;

    /* renamed from: e, reason: collision with root package name */
    final i0 f3756e;

    /* renamed from: h, reason: collision with root package name */
    volatile u0.k f3759h;

    /* renamed from: i, reason: collision with root package name */
    private b f3760i;

    /* renamed from: j, reason: collision with root package name */
    private final n f3761j;

    /* renamed from: l, reason: collision with root package name */
    private q f3763l;

    /* renamed from: d, reason: collision with root package name */
    androidx.room.a f3755d = null;

    /* renamed from: f, reason: collision with root package name */
    AtomicBoolean f3757f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f3758g = false;

    /* renamed from: k, reason: collision with root package name */
    final k.b f3762k = new k.b();

    /* renamed from: m, reason: collision with root package name */
    Runnable f3764m = new a();

    /* renamed from: a, reason: collision with root package name */
    final HashMap f3752a = new HashMap();

    class a implements Runnable {
        a() {
        }

        private Set a() {
            HashSet hashSet = new HashSet();
            Cursor cursorY = p.this.f3756e.y(new u0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorY.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorY.getInt(0)));
                } catch (Throwable th) {
                    cursorY.close();
                    throw th;
                }
            }
            cursorY.close();
            if (!hashSet.isEmpty()) {
                p.this.f3759h.t();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.room.a aVar;
            androidx.room.a aVar2;
            Lock lockK = p.this.f3756e.k();
            lockK.lock();
            Set setA = null;
            try {
                try {
                } catch (SQLiteException | IllegalStateException e5) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
                    lockK.unlock();
                    aVar = p.this.f3755d;
                    if (aVar != null) {
                    }
                }
                if (!p.this.d()) {
                    if (aVar2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!p.this.f3757f.compareAndSet(true, false)) {
                    lockK.unlock();
                    androidx.room.a aVar3 = p.this.f3755d;
                    if (aVar3 != null) {
                        aVar3.b();
                        return;
                    }
                    return;
                }
                if (p.this.f3756e.p()) {
                    lockK.unlock();
                    androidx.room.a aVar4 = p.this.f3755d;
                    if (aVar4 != null) {
                        aVar4.b();
                        return;
                    }
                    return;
                }
                u0.g gVarP = p.this.f3756e.l().P();
                gVarP.J();
                try {
                    setA = a();
                    gVarP.H();
                    lockK.unlock();
                    aVar = p.this.f3755d;
                    if (aVar != null) {
                        aVar.b();
                    }
                    if (setA == null || setA.isEmpty()) {
                        return;
                    }
                    synchronized (p.this.f3762k) {
                        Iterator it = p.this.f3762k.iterator();
                        while (it.hasNext()) {
                            ((d) ((Map.Entry) it.next()).getValue()).a(setA);
                        }
                    }
                } finally {
                    gVarP.i();
                }
            } finally {
                lockK.unlock();
                aVar2 = p.this.f3755d;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final long[] f3766a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f3767b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f3768c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3769d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3770e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f3766a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f3767b = zArr;
            this.f3768c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f3769d && !this.f3770e) {
                    int length = this.f3766a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f3770e = true;
                            this.f3769d = false;
                            return this.f3768c;
                        }
                        boolean z10 = this.f3766a[i10] > 0;
                        boolean[] zArr = this.f3767b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f3768c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f3768c[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3766a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f3769d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3766a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f3769d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                this.f3770e = false;
            }
        }

        void e() {
            synchronized (this) {
                Arrays.fill(this.f3767b, false);
                this.f3769d = true;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String[] f3771a;

        public c(String[] strArr) {
            this.f3771a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        abstract boolean a();

        public abstract void b(Set set);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        final int[] f3772a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f3773b;

        /* renamed from: c, reason: collision with root package name */
        final c f3774c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f3775d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set setUnmodifiableSet;
            this.f3774c = cVar;
            this.f3772a = iArr;
            this.f3773b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = null;
            }
            this.f3775d = setUnmodifiableSet;
        }

        void a(Set set) {
            int length = this.f3772a.length;
            Set hashSet = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f3772a[i10]))) {
                    if (length == 1) {
                        hashSet = this.f3775d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet(length);
                        }
                        hashSet.add(this.f3773b[i10]);
                    }
                }
            }
            if (hashSet != null) {
                this.f3774c.b(hashSet);
            }
        }

        void b(String[] strArr) {
            Set set = null;
            if (this.f3773b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (strArr[i10].equalsIgnoreCase(this.f3773b[0])) {
                        set = this.f3775d;
                        break;
                    }
                    i10++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f3773b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f3774c.b(set);
            }
        }
    }

    public p(i0 i0Var, Map map, Map map2, String... strArr) {
        this.f3756e = i0Var;
        this.f3760i = new b(strArr.length);
        this.f3754c = map2;
        this.f3761j = new n(i0Var);
        int length = strArr.length;
        this.f3753b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3752a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) map.get(strArr[i10]);
            if (str2 != null) {
                this.f3753b[i10] = str2.toLowerCase(locale);
            } else {
                this.f3753b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f3752a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f3752a;
                map3.put(lowerCase3, (Integer) map3.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private static void c(u0.g gVar) {
        if (gVar.E()) {
            gVar.J();
        } else {
            gVar.j();
        }
    }

    private String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f3754c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f3754c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void m(u0.g gVar, int i10) {
        gVar.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f3753b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f3751n) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            gVar.p(sb2.toString());
        }
    }

    private void n(u0.g gVar, int i10) {
        String str = this.f3753b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f3751n) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            gVar.p(sb2.toString());
        }
    }

    public void a(c cVar) {
        d dVar;
        String[] strArrJ = j(cVar.f3771a);
        int[] iArr = new int[strArrJ.length];
        int length = strArrJ.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = (Integer) this.f3752a.get(strArrJ[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrJ[i10]);
            }
            iArr[i10] = num.intValue();
        }
        d dVar2 = new d(cVar, iArr, strArrJ);
        synchronized (this.f3762k) {
            dVar = (d) this.f3762k.l(cVar, dVar2);
        }
        if (dVar == null && this.f3760i.b(iArr)) {
            o();
        }
    }

    boolean d() {
        if (!this.f3756e.v()) {
            return false;
        }
        if (!this.f3758g) {
            this.f3756e.l().P();
        }
        if (this.f3758g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void e(u0.g gVar) {
        synchronized (this) {
            if (this.f3758g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.p("PRAGMA temp_store = MEMORY;");
            gVar.p("PRAGMA recursive_triggers='ON';");
            gVar.p("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            p(gVar);
            this.f3759h = gVar.u("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f3758g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.f3762k) {
            Iterator it = this.f3762k.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((c) entry.getKey()).a()) {
                    ((d) entry.getValue()).b(strArr);
                }
            }
        }
    }

    void g() {
        synchronized (this) {
            this.f3758g = false;
            this.f3760i.e();
        }
    }

    public void h() {
        if (this.f3757f.compareAndSet(false, true)) {
            androidx.room.a aVar = this.f3755d;
            if (aVar != null) {
                aVar.e();
            }
            this.f3756e.m().execute(this.f3764m);
        }
    }

    public void i(c cVar) {
        d dVar;
        synchronized (this.f3762k) {
            dVar = (d) this.f3762k.n(cVar);
        }
        if (dVar == null || !this.f3760i.c(dVar.f3772a)) {
            return;
        }
        o();
    }

    void k(androidx.room.a aVar) {
        this.f3755d = aVar;
        aVar.h(new Runnable() { // from class: androidx.room.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f3750m.g();
            }
        });
    }

    void l(Context context, String str, Intent intent) {
        this.f3763l = new q(context, str, intent, this, this.f3756e.m());
    }

    void o() {
        if (this.f3756e.v()) {
            p(this.f3756e.l().P());
        }
    }

    void p(u0.g gVar) {
        if (gVar.A()) {
            return;
        }
        while (true) {
            try {
                Lock lockK = this.f3756e.k();
                lockK.lock();
                try {
                    int[] iArrA = this.f3760i.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    c(gVar);
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                m(gVar, i10);
                            } else if (i11 == 2) {
                                n(gVar, i10);
                            }
                        } finally {
                        }
                    }
                    gVar.H();
                    gVar.i();
                    this.f3760i.d();
                } finally {
                    lockK.unlock();
                }
            } catch (SQLiteException | IllegalStateException e5) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
                return;
            }
        }
    }
}
