package ib;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class a implements Collection {

    /* renamed from: m, reason: collision with root package name */
    private final Object[] f24341m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f24342n;

    public a(Object[] objArr, boolean z10) {
        rb.h.e(objArr, "values");
        this.f24341m = objArr;
        this.f24342n = z10;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return f.b(this.f24341m, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        rb.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f24341m.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f24341m.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return rb.b.a(this.f24341m);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i.a(this.f24341m, this.f24342n);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        rb.h.e(objArr, "array");
        return rb.e.b(this, objArr);
    }
}
