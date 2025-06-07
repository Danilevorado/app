package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class z43 extends AbstractCollection {

    /* renamed from: m, reason: collision with root package name */
    final Collection f18406m;

    /* renamed from: n, reason: collision with root package name */
    final j33 f18407n;

    z43(Collection collection, j33 j33Var) {
        this.f18406m = collection;
        this.f18407n = j33Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        i33.e(this.f18407n.a(obj));
        return this.f18406m.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i33.e(this.f18407n.a(it.next()));
        }
        return this.f18406m.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        i63.a(this.f18406m, this.f18407n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (a53.a(this.f18406m, obj)) {
            return this.f18407n.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.f18406m;
        j33 j33Var = this.f18407n;
        Iterator it = collection.iterator();
        i33.c(j33Var, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (j33Var.a(it.next())) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f18406m.iterator();
        j33 j33Var = this.f18407n;
        Objects.requireNonNull(it);
        Objects.requireNonNull(j33Var);
        return new j63(it, j33Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f18406m.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f18406m.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18407n.a(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f18406m.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18407n.a(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f18406m.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f18407n.a(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        m63.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        m63.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
