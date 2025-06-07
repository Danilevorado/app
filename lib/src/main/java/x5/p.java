package x5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
abstract class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final d f28326a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f28327b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f28328c = new HashSet();

        b(d dVar) {
            this.f28326a = dVar;
        }

        void a(b bVar) {
            this.f28327b.add(bVar);
        }

        void b(b bVar) {
            this.f28328c.add(bVar);
        }

        d c() {
            return this.f28326a;
        }

        Set d() {
            return this.f28327b;
        }

        boolean e() {
            return this.f28327b.isEmpty();
        }

        boolean f() {
            return this.f28328c.isEmpty();
        }

        void g(b bVar) {
            this.f28328c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f28329a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28330b;

        private c(Class cls, boolean z10) {
            this.f28329a = cls;
            this.f28330b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f28329a.equals(this.f28329a) && cVar.f28330b == this.f28330b;
        }

        public int hashCode() {
            return ((this.f28329a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28330b).hashCode();
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().e()) {
                            if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            d dVar = (d) it.next();
            b bVar3 = new b(dVar);
            for (Class cls : dVar.g()) {
                c cVar = new c(cls, !dVar.m());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f28330b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
