package u1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements u1.b {

    /* renamed from: a, reason: collision with root package name */
    private final g f27545a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final b f27546b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map f27547c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f27548d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f27549e;

    /* renamed from: f, reason: collision with root package name */
    private int f27550f;

    private static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final b f27551a;

        /* renamed from: b, reason: collision with root package name */
        int f27552b;

        /* renamed from: c, reason: collision with root package name */
        private Class f27553c;

        a(b bVar) {
            this.f27551a = bVar;
        }

        @Override // u1.l
        public void a() {
            this.f27551a.c(this);
        }

        void b(int i10, Class cls) {
            this.f27552b = i10;
            this.f27553c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27552b == aVar.f27552b && this.f27553c == aVar.f27553c;
        }

        public int hashCode() {
            int i10 = this.f27552b * 31;
            Class cls = this.f27553c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f27552b + "array=" + this.f27553c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f27549e = i10;
    }

    private void f(int i10, Class cls) {
        NavigableMap navigableMapM = m(cls);
        Integer num = (Integer) navigableMapM.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
        int iIntValue = num.intValue();
        Integer numValueOf = Integer.valueOf(i10);
        if (iIntValue == 1) {
            navigableMapM.remove(numValueOf);
        } else {
            navigableMapM.put(numValueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private void g() {
        h(this.f27549e);
    }

    private void h(int i10) {
        while (this.f27550f > i10) {
            Object objF = this.f27545a.f();
            n2.k.d(objF);
            u1.a aVarI = i(objF);
            this.f27550f -= aVarI.b(objF) * aVarI.c();
            f(aVarI.b(objF), objF.getClass());
            if (Log.isLoggable(aVarI.a(), 2)) {
                Log.v(aVarI.a(), "evicted: " + aVarI.b(objF));
            }
        }
    }

    private u1.a i(Object obj) {
        return j(obj.getClass());
    }

    private u1.a j(Class cls) {
        u1.a fVar = (u1.a) this.f27548d.get(cls);
        if (fVar == null) {
            if (cls.equals(int[].class)) {
                fVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                fVar = new f();
            }
            this.f27548d.put(cls, fVar);
        }
        return fVar;
    }

    private Object k(a aVar) {
        return this.f27545a.a(aVar);
    }

    private Object l(a aVar, Class cls) {
        u1.a aVarJ = j(cls);
        Object objK = k(aVar);
        if (objK != null) {
            this.f27550f -= aVarJ.b(objK) * aVarJ.c();
            f(aVarJ.b(objK), cls);
        }
        if (objK != null) {
            return objK;
        }
        if (Log.isLoggable(aVarJ.a(), 2)) {
            Log.v(aVarJ.a(), "Allocated " + aVar.f27552b + " bytes");
        }
        return aVarJ.newArray(aVar.f27552b);
    }

    private NavigableMap m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f27547c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f27547c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i10 = this.f27550f;
        return i10 == 0 || this.f27549e / i10 >= 2;
    }

    private boolean o(int i10) {
        return i10 <= this.f27549e / 2;
    }

    private boolean p(int i10, Integer num) {
        return num != null && (n() || num.intValue() <= i10 * 8);
    }

    @Override // u1.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f27549e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // u1.b
    public synchronized void b() {
        h(0);
    }

    @Override // u1.b
    public synchronized Object c(int i10, Class cls) {
        return l(this.f27546b.e(i10, cls), cls);
    }

    @Override // u1.b
    public synchronized void d(Object obj) {
        Class<?> cls = obj.getClass();
        u1.a aVarJ = j(cls);
        int iB = aVarJ.b(obj);
        int iC = aVarJ.c() * iB;
        if (o(iC)) {
            a aVarE = this.f27546b.e(iB, cls);
            this.f27545a.d(aVarE, obj);
            NavigableMap navigableMapM = m(cls);
            Integer num = (Integer) navigableMapM.get(Integer.valueOf(aVarE.f27552b));
            Integer numValueOf = Integer.valueOf(aVarE.f27552b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM.put(numValueOf, Integer.valueOf(iIntValue));
            this.f27550f += iC;
            g();
        }
    }

    @Override // u1.b
    public synchronized Object e(int i10, Class cls) {
        Integer num;
        num = (Integer) m(cls).ceilingKey(Integer.valueOf(i10));
        return l(p(i10, num) ? this.f27546b.e(num.intValue(), cls) : this.f27546b.e(i10, cls), cls);
    }
}
