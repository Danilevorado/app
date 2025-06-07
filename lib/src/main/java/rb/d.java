package rb;

import ib.a0;
import ib.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qb.l;
import qb.m;
import qb.n;
import qb.o;
import qb.p;
import qb.q;
import qb.r;
import qb.s;
import qb.t;
import qb.u;
import qb.v;
import qb.w;

/* loaded from: classes2.dex */
public final class d implements vb.a, c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f26679b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f26680c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f26681d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f26682e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f26683f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f26684g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f26685a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    static {
        int i10 = 0;
        List listE = ib.j.e(qb.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, qb.b.class, qb.c.class, qb.d.class, qb.e.class, qb.f.class, qb.g.class, qb.h.class, qb.i.class, qb.j.class, qb.k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(ib.k.h(listE, 10));
        for (Object obj : listE) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ib.j.g();
            }
            arrayList.add(hb.o.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f26680c = a0.h(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f26681d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f26682e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        h.d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            h.d(str, "kotlinName");
            sb2.append(xb.m.w(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            hb.k kVarA = hb.o.a(sb2.toString(), str + ".Companion");
            map3.put(kVarA.c(), kVarA.d());
        }
        for (Map.Entry entry : f26680c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f26683f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), xb.m.w((String) entry2.getValue(), '.', null, 2, null));
        }
        f26684g = linkedHashMap;
    }

    public d(Class cls) {
        h.e(cls, "jClass");
        this.f26685a = cls;
    }

    @Override // rb.c
    public Class a() {
        return this.f26685a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && h.a(pb.a.b(this), pb.a.b((vb.a) obj));
    }

    public int hashCode() {
        return pb.a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
