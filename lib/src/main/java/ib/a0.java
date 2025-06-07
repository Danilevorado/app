package ib;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class a0 extends z {
    public static Map d() {
        u uVar = u.f24345m;
        rb.h.c(uVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return uVar;
    }

    public static final Map e(Map map) {
        rb.h.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : z.c(map) : d();
    }

    public static Map f(Map map, hb.k kVar) {
        rb.h.e(map, "<this>");
        rb.h.e(kVar, "pair");
        if (map.isEmpty()) {
            return z.b(kVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(kVar.c(), kVar.d());
        return linkedHashMap;
    }

    public static final void g(Map map, Iterable iterable) {
        rb.h.e(map, "<this>");
        rb.h.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hb.k kVar = (hb.k) it.next();
            map.put(kVar.a(), kVar.b());
        }
    }

    public static Map h(Iterable iterable) {
        rb.h.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(i(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return i(iterable, new LinkedHashMap(z.a(collection.size())));
        }
        return z.b((hb.k) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map i(Iterable iterable, Map map) {
        rb.h.e(iterable, "<this>");
        rb.h.e(map, "destination");
        g(map, iterable);
        return map;
    }

    public static Map j(Map map) {
        rb.h.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? k(map) : z.c(map) : d();
    }

    public static final Map k(Map map) {
        rb.h.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
