package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import u0.h;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile u0.g f3658a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f3659b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f3660c;

    /* renamed from: d, reason: collision with root package name */
    private u0.h f3661d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3663f;

    /* renamed from: g, reason: collision with root package name */
    boolean f3664g;

    /* renamed from: h, reason: collision with root package name */
    protected List f3665h;

    /* renamed from: k, reason: collision with root package name */
    private androidx.room.a f3668k;

    /* renamed from: j, reason: collision with root package name */
    private final ReentrantReadWriteLock f3667j = new ReentrantReadWriteLock();

    /* renamed from: l, reason: collision with root package name */
    private final ThreadLocal f3669l = new ThreadLocal();

    /* renamed from: m, reason: collision with root package name */
    private final Map f3670m = Collections.synchronizedMap(new HashMap());

    /* renamed from: e, reason: collision with root package name */
    private final p f3662e = g();

    /* renamed from: n, reason: collision with root package name */
    private final Map f3671n = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    protected Map f3666i = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f3672a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3673b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f3674c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f3675d;

        /* renamed from: e, reason: collision with root package name */
        private f f3676e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f3677f;

        /* renamed from: g, reason: collision with root package name */
        private List f3678g;

        /* renamed from: h, reason: collision with root package name */
        private List f3679h;

        /* renamed from: i, reason: collision with root package name */
        private Executor f3680i;

        /* renamed from: j, reason: collision with root package name */
        private Executor f3681j;

        /* renamed from: k, reason: collision with root package name */
        private h.c f3682k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3683l;

        /* renamed from: n, reason: collision with root package name */
        private Intent f3685n;

        /* renamed from: p, reason: collision with root package name */
        private boolean f3687p;

        /* renamed from: r, reason: collision with root package name */
        private TimeUnit f3689r;

        /* renamed from: t, reason: collision with root package name */
        private Set f3691t;

        /* renamed from: u, reason: collision with root package name */
        private Set f3692u;

        /* renamed from: v, reason: collision with root package name */
        private String f3693v;

        /* renamed from: w, reason: collision with root package name */
        private File f3694w;

        /* renamed from: x, reason: collision with root package name */
        private Callable f3695x;

        /* renamed from: q, reason: collision with root package name */
        private long f3688q = -1;

        /* renamed from: m, reason: collision with root package name */
        private c f3684m = c.AUTOMATIC;

        /* renamed from: o, reason: collision with root package name */
        private boolean f3686o = true;

        /* renamed from: s, reason: collision with root package name */
        private final d f3690s = new d();

        a(Context context, Class cls, String str) {
            this.f3674c = context;
            this.f3672a = cls;
            this.f3673b = str;
        }

        public a a(b bVar) {
            if (this.f3675d == null) {
                this.f3675d = new ArrayList();
            }
            this.f3675d.add(bVar);
            return this;
        }

        public a b(r0.b... bVarArr) {
            if (this.f3692u == null) {
                this.f3692u = new HashSet();
            }
            for (r0.b bVar : bVarArr) {
                this.f3692u.add(Integer.valueOf(bVar.f26427a));
                this.f3692u.add(Integer.valueOf(bVar.f26428b));
            }
            this.f3690s.b(bVarArr);
            return this;
        }

        public a c() {
            this.f3683l = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.room.i0 d() {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.i0.a.d():androidx.room.i0");
        }

        public a e() {
            this.f3686o = false;
            this.f3687p = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f3682k = cVar;
            return this;
        }

        public a g(Executor executor) {
            this.f3680i = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(u0.g gVar) {
        }

        public void b(u0.g gVar) {
        }

        public void c(u0.g gVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean b(ActivityManager activityManager) {
            return u0.c.b(activityManager);
        }

        c d(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f3700a = new HashMap();

        private void a(r0.b bVar) {
            int i10 = bVar.f26427a;
            int i11 = bVar.f26428b;
            TreeMap treeMap = (TreeMap) this.f3700a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f3700a.put(Integer.valueOf(i10), treeMap);
            }
            r0.b bVar2 = (r0.b) treeMap.get(Integer.valueOf(i11));
            if (bVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i11), bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:13:0x0026->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List d(java.util.List r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap r0 = r6.f3700a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r0.b r9 = (r0.b) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = r5
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.i0.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(r0.b... bVarArr) {
            for (r0.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public List c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map e() {
            return Collections.unmodifiableMap(this.f3700a);
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(String str, List list);
    }

    private Object C(Class cls, u0.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof k) {
            return C(cls, ((k) hVar).a());
        }
        return null;
    }

    private void r() {
        c();
        u0.g gVarP = this.f3661d.P();
        this.f3662e.p(gVarP);
        if (gVarP.E()) {
            gVarP.J();
        } else {
            gVarP.j();
        }
    }

    private void s() {
        this.f3661d.P().i();
        if (p()) {
            return;
        }
        this.f3662e.h();
    }

    private static boolean u() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object w(u0.g gVar) {
        r();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x(u0.g gVar) {
        s();
        return null;
    }

    public Object A(Callable callable) {
        e();
        try {
            try {
                Object objCall = callable.call();
                B();
                i();
                return objCall;
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception e10) {
                s0.e.a(e10);
                i();
                return null;
            }
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    public void B() {
        this.f3661d.P().H();
    }

    public void c() {
        if (!this.f3663f && u()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!p() && this.f3669l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        androidx.room.a aVar = this.f3668k;
        if (aVar == null) {
            r();
        } else {
            aVar.c(new l.a() { // from class: q0.i
                @Override // l.a
                public final Object a(Object obj) {
                    return this.f26080a.w((u0.g) obj);
                }
            });
        }
    }

    public u0.k f(String str) {
        c();
        d();
        return this.f3661d.P().u(str);
    }

    protected abstract p g();

    protected abstract u0.h h(j jVar);

    public void i() {
        androidx.room.a aVar = this.f3668k;
        if (aVar == null) {
            s();
        } else {
            aVar.c(new l.a() { // from class: q0.j
                @Override // l.a
                public final Object a(Object obj) {
                    return this.f26081a.x((u0.g) obj);
                }
            });
        }
    }

    public List j(Map map) {
        return Collections.emptyList();
    }

    Lock k() {
        return this.f3667j.readLock();
    }

    public u0.h l() {
        return this.f3661d;
    }

    public Executor m() {
        return this.f3659b;
    }

    public Set n() {
        return Collections.emptySet();
    }

    protected Map o() {
        return Collections.emptyMap();
    }

    public boolean p() {
        return this.f3661d.P().A();
    }

    public void q(j jVar) {
        this.f3661d = h(jVar);
        Set setN = n();
        BitSet bitSet = new BitSet();
        Iterator it = setN.iterator();
        while (true) {
            int i10 = -1;
            if (!it.hasNext()) {
                for (int size = jVar.f3707g.size() - 1; size >= 0; size--) {
                    if (!bitSet.get(size)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator it2 = j(this.f3666i).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    r0.b bVar = (r0.b) it2.next();
                    if (!jVar.f3704d.e().containsKey(Integer.valueOf(bVar.f26427a))) {
                        jVar.f3704d.b(bVar);
                    }
                }
                k0 k0Var = (k0) C(k0.class, this.f3661d);
                if (k0Var != null) {
                    k0Var.f(jVar);
                }
                g gVar = (g) C(g.class, this.f3661d);
                if (gVar != null) {
                    androidx.room.a aVarC = gVar.c();
                    this.f3668k = aVarC;
                    this.f3662e.k(aVarC);
                }
                boolean z10 = jVar.f3709i == c.WRITE_AHEAD_LOGGING;
                this.f3661d.setWriteAheadLoggingEnabled(z10);
                this.f3665h = jVar.f3705e;
                this.f3659b = jVar.f3710j;
                this.f3660c = new m0(jVar.f3711k);
                this.f3663f = jVar.f3708h;
                this.f3664g = z10;
                Intent intent = jVar.f3713m;
                if (intent != null) {
                    this.f3662e.l(jVar.f3702b, jVar.f3703c, intent);
                }
                Map mapO = o();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapO.entrySet()) {
                    Class cls = (Class) entry.getKey();
                    for (Class cls2 : (List) entry.getValue()) {
                        int size2 = jVar.f3706f.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                size2 = -1;
                                break;
                            } else {
                                if (cls2.isAssignableFrom(jVar.f3706f.get(size2).getClass())) {
                                    bitSet2.set(size2);
                                    break;
                                }
                                size2--;
                            }
                        }
                        if (size2 < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                        }
                        this.f3671n.put(cls2, jVar.f3706f.get(size2));
                    }
                }
                for (int size3 = jVar.f3706f.size() - 1; size3 >= 0; size3--) {
                    if (!bitSet2.get(size3)) {
                        throw new IllegalArgumentException("Unexpected type converter " + jVar.f3706f.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
            Class cls3 = (Class) it.next();
            int size4 = jVar.f3707g.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (cls3.isAssignableFrom(jVar.f3707g.get(size4).getClass())) {
                    bitSet.set(size4);
                    i10 = size4;
                    break;
                }
                size4--;
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.");
            }
            this.f3666i.put(cls3, (r0.a) jVar.f3707g.get(i10));
        }
    }

    protected void t(u0.g gVar) {
        this.f3662e.e(gVar);
    }

    public boolean v() {
        androidx.room.a aVar = this.f3668k;
        if (aVar != null) {
            return aVar.g();
        }
        u0.g gVar = this.f3658a;
        return gVar != null && gVar.m();
    }

    public Cursor y(u0.j jVar) {
        return z(jVar, null);
    }

    public Cursor z(u0.j jVar, CancellationSignal cancellationSignal) {
        c();
        d();
        return cancellationSignal != null ? this.f3661d.P().B(jVar, cancellationSignal) : this.f3661d.P().r(jVar);
    }
}
