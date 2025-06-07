package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Collection, Set {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f26018q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Object[] f26019r = new Object[0];

    /* renamed from: s, reason: collision with root package name */
    private static Object[] f26020s;

    /* renamed from: t, reason: collision with root package name */
    private static int f26021t;

    /* renamed from: u, reason: collision with root package name */
    private static Object[] f26022u;

    /* renamed from: v, reason: collision with root package name */
    private static int f26023v;

    /* renamed from: m, reason: collision with root package name */
    private int[] f26024m;

    /* renamed from: n, reason: collision with root package name */
    Object[] f26025n;

    /* renamed from: o, reason: collision with root package name */
    int f26026o;

    /* renamed from: p, reason: collision with root package name */
    private f f26027p;

    class a extends f {
        a() {
        }

        @Override // q.f
        protected void a() {
            b.this.clear();
        }

        @Override // q.f
        protected Object b(int i10, int i11) {
            return b.this.f26025n[i10];
        }

        @Override // q.f
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // q.f
        protected int d() {
            return b.this.f26026o;
        }

        @Override // q.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // q.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // q.f
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // q.f
        protected void h(int i10) {
            b.this.n(i10);
        }

        @Override // q.f
        protected Object i(int i10, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f26024m = f26018q;
            this.f26025n = f26019r;
        } else {
            e(i10);
        }
        this.f26026o = 0;
    }

    private void e(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f26022u;
                if (objArr != null) {
                    this.f26025n = objArr;
                    f26022u = (Object[]) objArr[0];
                    this.f26024m = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f26023v--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f26020s;
                if (objArr2 != null) {
                    this.f26025n = objArr2;
                    f26020s = (Object[]) objArr2[0];
                    this.f26024m = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f26021t--;
                    return;
                }
            }
        }
        this.f26024m = new int[i10];
        this.f26025n = new Object[i10];
    }

    private static void h(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f26023v < 10) {
                    objArr[0] = f26022u;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f26022u = objArr;
                    f26023v++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f26021t < 10) {
                    objArr[0] = f26020s;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f26020s = objArr;
                    f26021t++;
                }
            }
        }
    }

    private f i() {
        if (this.f26027p == null) {
            this.f26027p = new a();
        }
        return this.f26027p;
    }

    private int k(Object obj, int i10) {
        int i11 = this.f26026o;
        if (i11 == 0) {
            return -1;
        }
        int iA = c.a(this.f26024m, i11, i10);
        if (iA < 0 || obj.equals(this.f26025n[iA])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f26024m[i12] == i10) {
            if (obj.equals(this.f26025n[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f26024m[i13] == i10; i13--) {
            if (obj.equals(this.f26025n[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private int l() {
        int i10 = this.f26026o;
        if (i10 == 0) {
            return -1;
        }
        int iA = c.a(this.f26024m, i10, 0);
        if (iA < 0 || this.f26025n[iA] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f26024m[i11] == 0) {
            if (this.f26025n[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f26024m[i12] == 0; i12--) {
            if (this.f26025n[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iK;
        if (obj == null) {
            iK = l();
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iK = k(obj, iHashCode);
        }
        if (iK >= 0) {
            return false;
        }
        int i11 = ~iK;
        int i12 = this.f26026o;
        int[] iArr = this.f26024m;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f26025n;
            e(i13);
            int[] iArr2 = this.f26024m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f26025n, 0, objArr.length);
            }
            h(iArr, objArr, this.f26026o);
        }
        int i14 = this.f26026o;
        if (i11 < i14) {
            int[] iArr3 = this.f26024m;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f26025n;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f26026o - i11);
        }
        this.f26024m[i11] = i10;
        this.f26025n[i11] = obj;
        this.f26026o++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        f(this.f26026o + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f26026o;
        if (i10 != 0) {
            h(this.f26024m, this.f26025n, i10);
            this.f26024m = f26018q;
            this.f26025n = f26019r;
            this.f26026o = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f26026o; i10++) {
                try {
                    if (!set.contains(o(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i10) {
        int[] iArr = this.f26024m;
        if (iArr.length < i10) {
            Object[] objArr = this.f26025n;
            e(i10);
            int i11 = this.f26026o;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f26024m, 0, i11);
                System.arraycopy(objArr, 0, this.f26025n, 0, this.f26026o);
            }
            h(iArr, objArr, this.f26026o);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f26024m;
        int i10 = this.f26026o;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? l() : k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f26026o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return i().m().iterator();
    }

    public Object n(int i10) {
        Object[] objArr = this.f26025n;
        Object obj = objArr[i10];
        int i11 = this.f26026o;
        if (i11 <= 1) {
            h(this.f26024m, objArr, i11);
            this.f26024m = f26018q;
            this.f26025n = f26019r;
            this.f26026o = 0;
        } else {
            int[] iArr = this.f26024m;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f26026o = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f26025n;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f26026o - i10);
                }
                this.f26025n[this.f26026o] = null;
            } else {
                e(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f26026o--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f26024m, 0, i10);
                    System.arraycopy(objArr, 0, this.f26025n, 0, i10);
                }
                int i14 = this.f26026o;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f26024m, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f26025n, i10, this.f26026o - i10);
                }
            }
        }
        return obj;
    }

    public Object o(int i10) {
        return this.f26025n[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        n(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int i10 = this.f26026o - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f26025n[i10])) {
                n(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f26026o;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f26026o;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f26025n, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f26026o) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f26026o);
        }
        System.arraycopy(this.f26025n, 0, objArr, 0, this.f26026o);
        int length = objArr.length;
        int i10 = this.f26026o;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f26026o * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f26026o; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objO = o(i10);
            if (objO != this) {
                sb2.append(objO);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
