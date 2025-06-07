package q;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f26037a;

    /* renamed from: b, reason: collision with root package name */
    private int f26038b;

    /* renamed from: c, reason: collision with root package name */
    private int f26039c;

    /* renamed from: d, reason: collision with root package name */
    private int f26040d;

    /* renamed from: e, reason: collision with root package name */
    private int f26041e;

    /* renamed from: f, reason: collision with root package name */
    private int f26042f;

    /* renamed from: g, reason: collision with root package name */
    private int f26043g;

    /* renamed from: h, reason: collision with root package name */
    private int f26044h;

    public e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f26039c = i10;
        this.f26037a = new LinkedHashMap(0, 0.75f, true);
    }

    private int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    protected Object a(Object obj) {
        return null;
    }

    protected void b(boolean z10, Object obj, Object obj2, Object obj3) {
    }

    public final Object c(Object obj) {
        Object objPut;
        Objects.requireNonNull(obj, "key == null");
        synchronized (this) {
            Object obj2 = this.f26037a.get(obj);
            if (obj2 != null) {
                this.f26043g++;
                return obj2;
            }
            this.f26044h++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this) {
                this.f26041e++;
                objPut = this.f26037a.put(obj, objA);
                if (objPut != null) {
                    this.f26037a.put(obj, objPut);
                } else {
                    this.f26038b += f(obj, objA);
                }
            }
            if (objPut != null) {
                b(false, obj, objA, objPut);
                return objPut;
            }
            i(this.f26039c);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f26040d++;
            this.f26038b += f(obj, obj2);
            objPut = this.f26037a.put(obj, obj2);
            if (objPut != null) {
                this.f26038b -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        i(this.f26039c);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        Objects.requireNonNull(obj, "key == null");
        synchronized (this) {
            objRemove = this.f26037a.remove(obj);
            if (objRemove != null) {
                this.f26038b -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    protected int g(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized Map h() {
        return new LinkedHashMap(this.f26037a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f26038b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap r0 = r4.f26037a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f26038b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f26038b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap r0 = r4.f26037a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap r0 = r4.f26037a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap r2 = r4.f26037a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f26038b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.f(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f26038b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f26042f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f26042f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.i(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f26043g;
        i11 = this.f26044h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f26039c), Integer.valueOf(this.f26043g), Integer.valueOf(this.f26044h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
