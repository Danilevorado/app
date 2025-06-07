package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class c63 extends x53 implements List, RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    private static final d83 f6791n = new a63(l73.f11358r, 0);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f6792o = 0;

    c63() {
    }

    public static c63 A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        j73.b(objArr, 6);
        return q(objArr, 6);
    }

    static c63 q(Object[] objArr, int i10) {
        return i10 == 0 ? l73.f11358r : new l73(objArr, i10);
    }

    public static c63 s(Collection collection) {
        if (!(collection instanceof x53)) {
            Object[] array = collection.toArray();
            int length = array.length;
            j73.b(array, length);
            return q(array, length);
        }
        c63 c63VarK = ((x53) collection).k();
        if (!c63VarK.n()) {
            return c63VarK;
        }
        Object[] array2 = c63VarK.toArray();
        return q(array2, array2.length);
    }

    public static c63 t(Object[] objArr) {
        if (objArr.length == 0) {
            return l73.f11358r;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        j73.b(objArr2, length);
        return q(objArr2, length);
    }

    public static c63 u() {
        return l73.f11358r;
    }

    public static c63 v(Object obj) {
        Object[] objArr = {obj};
        j73.b(objArr, 1);
        return q(objArr, 1);
    }

    public static c63 x(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        j73.b(objArr, 2);
        return q(objArr, 2);
    }

    public static c63 y(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        j73.b(objArr, 3);
        return q(objArr, 3);
    }

    public static c63 z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        j73.b(objArr, 5);
        return q(objArr, 5);
    }

    @Override // java.util.List
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final d83 listIterator(int i10) {
        i33.b(i10, size(), "index");
        return isEmpty() ? f6791n : new a63(this, i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.x53, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.ads.x53
    int e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (d33.a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !d33.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.x53
    public final c63 k() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.x53
    public final c83 l() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c63 subList(int i10, int i11) {
        i33.g(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? l73.f11358r : new b63(this, i10, i12);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
