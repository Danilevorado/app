package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class w73 extends v73 implements SortedSet {
    w73(SortedSet sortedSet, j33 j33Var) {
        super(sortedSet, j33Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f18406m).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f18406m.iterator();
        j33 j33Var = this.f18407n;
        Objects.requireNonNull(it);
        Objects.requireNonNull(j33Var);
        while (it.hasNext()) {
            Object next = it.next();
            if (j33Var.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new w73(((SortedSet) this.f18406m).headSet(obj), this.f18407n);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f18406m;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f18407n.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new w73(((SortedSet) this.f18406m).subSet(obj, obj2), this.f18407n);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new w73(((SortedSet) this.f18406m).tailSet(obj), this.f18407n);
    }
}
