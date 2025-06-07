package n2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25497a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f25498b;

    /* renamed from: c, reason: collision with root package name */
    private long f25499c;

    /* renamed from: d, reason: collision with root package name */
    private long f25500d;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f25501a;

        /* renamed from: b, reason: collision with root package name */
        final int f25502b;

        a(Object obj, int i10) {
            this.f25501a = obj;
            this.f25502b = i10;
        }
    }

    public h(long j10) {
        this.f25498b = j10;
        this.f25499c = j10;
    }

    private void f() {
        m(this.f25499c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f25497a.get(obj);
        return aVar != null ? aVar.f25501a : null;
    }

    public synchronized long h() {
        return this.f25499c;
    }

    protected int i(Object obj) {
        return 1;
    }

    protected void j(Object obj, Object obj2) {
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f25499c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f25500d += j10;
        }
        a aVar = (a) this.f25497a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f25500d -= aVar.f25502b;
            if (!aVar.f25501a.equals(obj2)) {
                j(obj, aVar.f25501a);
            }
        }
        f();
        return aVar != null ? aVar.f25501a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f25497a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f25500d -= aVar.f25502b;
        return aVar.f25501a;
    }

    protected synchronized void m(long j10) {
        while (this.f25500d > j10) {
            Iterator it = this.f25497a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f25500d -= aVar.f25502b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f25501a);
        }
    }
}
