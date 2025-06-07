package x5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class x implements h6.b {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f28343b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f28342a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f28342a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        Iterator it = this.f28342a.iterator();
        while (it.hasNext()) {
            this.f28343b.add(((h6.b) it.next()).get());
        }
        this.f28342a = null;
    }

    synchronized void a(h6.b bVar) {
        Set set;
        Object obj;
        if (this.f28343b == null) {
            set = this.f28342a;
            obj = bVar;
        } else {
            set = this.f28343b;
            obj = bVar.get();
        }
        set.add(obj);
    }

    @Override // h6.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f28343b == null) {
            synchronized (this) {
                if (this.f28343b == null) {
                    this.f28343b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f28343b);
    }
}
