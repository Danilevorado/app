package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class q43 extends AbstractCollection {

    /* renamed from: m, reason: collision with root package name */
    final Object f14137m;

    /* renamed from: n, reason: collision with root package name */
    Collection f14138n;

    /* renamed from: o, reason: collision with root package name */
    final q43 f14139o;

    /* renamed from: p, reason: collision with root package name */
    final Collection f14140p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ u43 f14141q;

    q43(u43 u43Var, Object obj, Collection collection, q43 q43Var) {
        this.f14141q = u43Var;
        this.f14137m = obj;
        this.f14138n = collection;
        this.f14139o = q43Var;
        this.f14140p = q43Var == null ? null : q43Var.f14138n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f14138n.isEmpty();
        boolean zAdd = this.f14138n.add(obj);
        if (zAdd) {
            this.f14141q.f16167q++;
            if (zIsEmpty) {
                e();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f14138n.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f14138n.size();
        this.f14141q.f16167q += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    final void b() {
        Collection collection;
        q43 q43Var = this.f14139o;
        if (q43Var != null) {
            q43Var.b();
            if (this.f14139o.f14138n != this.f14140p) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f14138n.isEmpty() || (collection = (Collection) this.f14141q.f16166p.get(this.f14137m)) == null) {
                return;
            }
            this.f14138n = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f14138n.clear();
        this.f14141q.f16167q -= size;
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f14138n.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.f14138n.containsAll(collection);
    }

    final void e() {
        q43 q43Var = this.f14139o;
        if (q43Var != null) {
            q43Var.e();
        } else {
            this.f14141q.f16166p.put(this.f14137m, this.f14138n);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f14138n.equals(obj);
    }

    final void f() {
        q43 q43Var = this.f14139o;
        if (q43Var != null) {
            q43Var.f();
        } else if (this.f14138n.isEmpty()) {
            this.f14141q.f16166p.remove(this.f14137m);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f14138n.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new p43(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f14138n.remove(obj);
        if (zRemove) {
            u43 u43Var = this.f14141q;
            u43Var.f16167q--;
            f();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f14138n.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f14138n.size();
            this.f14141q.f16167q += size2 - size;
            f();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean zRetainAll = this.f14138n.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f14138n.size();
            this.f14141q.f16167q += size2 - size;
            f();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f14138n.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f14138n.toString();
    }
}
