package i2;

import f2.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import n2.j;
import t1.i;
import t1.t;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final t f24272c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final q.a f24273a = new q.a();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f24274b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f24274b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f24273a) {
            tVar = (t) this.f24273a.get(jVarB);
        }
        this.f24274b.set(jVarB);
        return tVar;
    }

    public boolean c(t tVar) {
        return f24272c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f24273a) {
            q.a aVar = this.f24273a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f24272c;
            }
            aVar.put(jVar, tVar);
        }
    }
}
