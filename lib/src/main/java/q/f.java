package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    b f26045a;

    /* renamed from: b, reason: collision with root package name */
    c f26046b;

    /* renamed from: c, reason: collision with root package name */
    e f26047c;

    final class a implements Iterator {

        /* renamed from: m, reason: collision with root package name */
        final int f26048m;

        /* renamed from: n, reason: collision with root package name */
        int f26049n;

        /* renamed from: o, reason: collision with root package name */
        int f26050o;

        /* renamed from: p, reason: collision with root package name */
        boolean f26051p = false;

        a(int i10) {
            this.f26048m = i10;
            this.f26049n = f.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26050o < this.f26049n;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objB = f.this.b(this.f26050o, this.f26048m);
            this.f26050o++;
            this.f26051p = true;
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f26051p) {
                throw new IllegalStateException();
            }
            int i10 = this.f26050o - 1;
            this.f26050o = i10;
            this.f26049n--;
            this.f26051p = false;
            f.this.h(i10);
        }
    }

    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int iD = f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.g(entry.getKey(), entry.getValue());
            }
            return iD != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = f.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return q.c.c(f.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = f.this.d() - 1; iD >= 0; iD--) {
                Object objB = f.this.b(iD, 0);
                Object objB2 = f.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return f.j(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = f.this.d() - 1; iD >= 0; iD--) {
                Object objB = f.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = f.this.e(obj);
            if (iE < 0) {
                return false;
            }
            f.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return f.p(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 0);
        }
    }

    final class d implements Iterator, Map.Entry {

        /* renamed from: m, reason: collision with root package name */
        int f26055m;

        /* renamed from: o, reason: collision with root package name */
        boolean f26057o = false;

        /* renamed from: n, reason: collision with root package name */
        int f26056n = -1;

        d() {
            this.f26055m = f.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f26056n++;
            this.f26057o = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f26057o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return q.c.c(entry.getKey(), f.this.b(this.f26056n, 0)) && q.c.c(entry.getValue(), f.this.b(this.f26056n, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f26057o) {
                return f.this.b(this.f26056n, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f26057o) {
                return f.this.b(this.f26056n, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26056n < this.f26055m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f26057o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = f.this.b(this.f26056n, 0);
            Object objB2 = f.this.b(this.f26056n, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f26057o) {
                throw new IllegalStateException();
            }
            f.this.h(this.f26056n);
            this.f26056n--;
            this.f26055m--;
            this.f26057o = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f26057o) {
                return f.this.i(this.f26056n, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = f.this.f(obj);
            if (iF < 0) {
                return false;
            }
            f.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int iD = f.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < iD) {
                if (collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    iD--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int iD = f.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < iD) {
                if (!collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    iD--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 1);
        }
    }

    f() {
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i10, int i11);

    protected abstract Map c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(Object obj, Object obj2);

    protected abstract void h(int i10);

    protected abstract Object i(int i10, Object obj);

    public Set l() {
        if (this.f26045a == null) {
            this.f26045a = new b();
        }
        return this.f26045a;
    }

    public Set m() {
        if (this.f26046b == null) {
            this.f26046b = new c();
        }
        return this.f26046b;
    }

    public Collection n() {
        if (this.f26047c == null) {
            this.f26047c = new e();
        }
        return this.f26047c;
    }

    public Object[] q(int i10) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i10) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i11 = 0; i11 < iD; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
