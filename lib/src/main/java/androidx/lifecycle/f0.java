package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3118a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f3119b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3120c = false;

    private static void b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    final void a() {
        this.f3120c = true;
        Map map = this.f3118a;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.f3118a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        Set set = this.f3119b;
        if (set != null) {
            synchronized (set) {
                Iterator it2 = this.f3119b.iterator();
                while (it2.hasNext()) {
                    b((Closeable) it2.next());
                }
            }
        }
        d();
    }

    Object c(String str) {
        Object obj;
        Map map = this.f3118a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f3118a.get(str);
        }
        return obj;
    }

    protected void d() {
    }

    Object e(String str, Object obj) throws IOException {
        Object obj2;
        synchronized (this.f3118a) {
            obj2 = this.f3118a.get(str);
            if (obj2 == null) {
                this.f3118a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f3120c) {
            b(obj);
        }
        return obj;
    }
}
