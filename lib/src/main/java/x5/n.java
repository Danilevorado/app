package x5;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x5.n;

/* loaded from: classes.dex */
public class n extends x5.a implements z5.a {

    /* renamed from: g, reason: collision with root package name */
    private static final h6.b f28315g = new h6.b() { // from class: x5.k
        @Override // h6.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f28316a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f28317b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f28318c;

    /* renamed from: d, reason: collision with root package name */
    private final List f28319d;

    /* renamed from: e, reason: collision with root package name */
    private final u f28320e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f28321f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f28322a;

        /* renamed from: b, reason: collision with root package name */
        private final List f28323b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f28324c = new ArrayList();

        b(Executor executor) {
            this.f28322a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ i f(i iVar) {
            return iVar;
        }

        public b b(d dVar) {
            this.f28324c.add(dVar);
            return this;
        }

        public b c(final i iVar) {
            this.f28323b.add(new h6.b() { // from class: x5.o
                @Override // h6.b
                public final Object get() {
                    return n.b.f(iVar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f28323b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f28322a, this.f28323b, this.f28324c);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection) {
        this.f28316a = new HashMap();
        this.f28317b = new HashMap();
        this.f28318c = new HashMap();
        this.f28321f = new AtomicReference();
        u uVar = new u(executor);
        this.f28320e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.p(uVar, u.class, e6.d.class, e6.c.class));
        arrayList.add(d.p(this, z5.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f28319d = l(iterable);
        i(arrayList);
    }

    public static b h(Executor executor) {
        return new b(executor);
    }

    private void i(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f28319d.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = (i) ((h6.b) it.next()).get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (v e5) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            if (this.f28316a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f28316a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final d dVar = (d) it2.next();
                this.f28316a.put(dVar, new w(new h6.b() { // from class: x5.j
                    @Override // h6.b
                    public final Object get() {
                        return this.f28308a.m(dVar);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        p();
    }

    private void j(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            d dVar = (d) entry.getKey();
            h6.b bVar = (h6.b) entry.getValue();
            if (dVar.k() || (dVar.l() && z10)) {
                bVar.get();
            }
        }
        this.f28320e.d();
    }

    private static List l(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m(d dVar) {
        return dVar.f().a(new d0(dVar, this));
    }

    private void p() {
        Boolean bool = (Boolean) this.f28321f.get();
        if (bool != null) {
            j(this.f28316a, bool.booleanValue());
        }
    }

    private void q() {
        Map map;
        Class clsB;
        h6.b bVarC;
        for (d dVar : this.f28316a.keySet()) {
            for (q qVar : dVar.e()) {
                if (qVar.f() && !this.f28318c.containsKey(qVar.b())) {
                    map = this.f28318c;
                    clsB = qVar.b();
                    bVarC = x.b(Collections.emptySet());
                } else if (this.f28317b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.b()));
                    }
                    if (!qVar.f()) {
                        map = this.f28317b;
                        clsB = qVar.b();
                        bVarC = b0.c();
                    }
                }
                map.put(clsB, bVarC);
            }
        }
    }

    private List r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.m()) {
                final h6.b bVar = (h6.b) this.f28316a.get(dVar);
                for (Class cls : dVar.g()) {
                    if (this.f28317b.containsKey(cls)) {
                        final b0 b0Var = (b0) ((h6.b) this.f28317b.get(cls));
                        arrayList.add(new Runnable() { // from class: x5.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                b0Var.f(bVar);
                            }
                        });
                    } else {
                        this.f28317b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f28316a.entrySet()) {
            d dVar = (d) entry.getKey();
            if (!dVar.m()) {
                h6.b bVar = (h6.b) entry.getValue();
                for (Class cls : dVar.g()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f28318c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f28318c.get(entry2.getKey());
                for (final h6.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: x5.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f28318c.put((Class) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // x5.a, x5.e
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // x5.a, x5.e
    public /* bridge */ /* synthetic */ Set b(Class cls) {
        return super.b(cls);
    }

    @Override // x5.e
    public synchronized h6.b c(Class cls) {
        c0.c(cls, "Null interface requested.");
        return (h6.b) this.f28317b.get(cls);
    }

    @Override // x5.e
    public synchronized h6.b d(Class cls) {
        x xVar = (x) this.f28318c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return f28315g;
    }

    public void k(boolean z10) {
        HashMap map;
        if (this.f28321f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f28316a);
            }
            j(map, z10);
        }
    }
}
