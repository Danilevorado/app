package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Iterable {

    /* renamed from: m, reason: collision with root package name */
    c f24560m;

    /* renamed from: n, reason: collision with root package name */
    private c f24561n;

    /* renamed from: o, reason: collision with root package name */
    private WeakHashMap f24562o = new WeakHashMap();

    /* renamed from: p, reason: collision with root package name */
    private int f24563p = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        c c(c cVar) {
            return cVar.f24567p;
        }

        @Override // k.b.e
        c d(c cVar) {
            return cVar.f24566o;
        }
    }

    /* renamed from: k.b$b, reason: collision with other inner class name */
    private static class C0150b extends e {
        C0150b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        c c(c cVar) {
            return cVar.f24566o;
        }

        @Override // k.b.e
        c d(c cVar) {
            return cVar.f24567p;
        }
    }

    static class c implements Map.Entry {

        /* renamed from: m, reason: collision with root package name */
        final Object f24564m;

        /* renamed from: n, reason: collision with root package name */
        final Object f24565n;

        /* renamed from: o, reason: collision with root package name */
        c f24566o;

        /* renamed from: p, reason: collision with root package name */
        c f24567p;

        c(Object obj, Object obj2) {
            this.f24564m = obj;
            this.f24565n = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f24564m.equals(cVar.f24564m) && this.f24565n.equals(cVar.f24565n);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f24564m;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f24565n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f24564m.hashCode() ^ this.f24565n.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f24564m + "=" + this.f24565n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator, f {

        /* renamed from: m, reason: collision with root package name */
        private c f24568m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f24569n = true;

        d() {
        }

        @Override // k.b.f
        public void b(c cVar) {
            c cVar2 = this.f24568m;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f24567p;
                this.f24568m = cVar3;
                this.f24569n = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f24569n) {
                this.f24569n = false;
                cVar = b.this.f24560m;
            } else {
                c cVar2 = this.f24568m;
                cVar = cVar2 != null ? cVar2.f24566o : null;
            }
            this.f24568m = cVar;
            return this.f24568m;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24569n) {
                return b.this.f24560m != null;
            }
            c cVar = this.f24568m;
            return (cVar == null || cVar.f24566o == null) ? false : true;
        }
    }

    private static abstract class e implements Iterator, f {

        /* renamed from: m, reason: collision with root package name */
        c f24571m;

        /* renamed from: n, reason: collision with root package name */
        c f24572n;

        e(c cVar, c cVar2) {
            this.f24571m = cVar2;
            this.f24572n = cVar;
        }

        private c f() {
            c cVar = this.f24572n;
            c cVar2 = this.f24571m;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // k.b.f
        public void b(c cVar) {
            if (this.f24571m == cVar && cVar == this.f24572n) {
                this.f24572n = null;
                this.f24571m = null;
            }
            c cVar2 = this.f24571m;
            if (cVar2 == cVar) {
                this.f24571m = c(cVar2);
            }
            if (this.f24572n == cVar) {
                this.f24572n = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f24572n;
            this.f24572n = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24572n != null;
        }
    }

    interface f {
        void b(c cVar);
    }

    public Iterator descendingIterator() {
        C0150b c0150b = new C0150b(this.f24561n, this.f24560m);
        this.f24562o.put(c0150b, Boolean.FALSE);
        return c0150b;
    }

    public Map.Entry e() {
        return this.f24560m;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c f(Object obj) {
        c cVar = this.f24560m;
        while (cVar != null && !cVar.f24564m.equals(obj)) {
            cVar = cVar.f24566o;
        }
        return cVar;
    }

    public d h() {
        d dVar = new d();
        this.f24562o.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Map.Entry i() {
        return this.f24561n;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f24560m, this.f24561n);
        this.f24562o.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c k(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f24563p++;
        c cVar2 = this.f24561n;
        if (cVar2 == null) {
            this.f24560m = cVar;
        } else {
            cVar2.f24566o = cVar;
            cVar.f24567p = cVar2;
        }
        this.f24561n = cVar;
        return cVar;
    }

    public Object l(Object obj, Object obj2) {
        c cVarF = f(obj);
        if (cVarF != null) {
            return cVarF.f24565n;
        }
        k(obj, obj2);
        return null;
    }

    public Object n(Object obj) {
        c cVarF = f(obj);
        if (cVarF == null) {
            return null;
        }
        this.f24563p--;
        if (!this.f24562o.isEmpty()) {
            Iterator it = this.f24562o.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(cVarF);
            }
        }
        c cVar = cVarF.f24567p;
        c cVar2 = cVarF.f24566o;
        if (cVar != null) {
            cVar.f24566o = cVar2;
        } else {
            this.f24560m = cVar2;
        }
        c cVar3 = cVarF.f24566o;
        if (cVar3 != null) {
            cVar3.f24567p = cVar;
        } else {
            this.f24561n = cVar;
        }
        cVarF.f24566o = null;
        cVarF.f24567p = null;
        return cVarF.f24565n;
    }

    public int size() {
        return this.f24563p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
