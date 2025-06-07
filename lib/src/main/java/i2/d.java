package i2;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n2.j;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f24275a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final q.a f24276b = new q.a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f24275a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f24276b) {
            list = (List) this.f24276b.get(jVar);
        }
        this.f24275a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f24276b) {
            this.f24276b.put(new j(cls, cls2, cls3), list);
        }
    }
}
