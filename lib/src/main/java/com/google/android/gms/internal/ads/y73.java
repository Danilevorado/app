package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class y73 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set b(Set set, j33 j33Var) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof v73) {
                v73 v73Var = (v73) set;
                return new v73(v73Var.f18406m, m33.a(v73Var.f18407n, j33Var));
            }
            Objects.requireNonNull(set);
            Objects.requireNonNull(j33Var);
            return new v73(set, j33Var);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof v73) {
            v73 v73Var2 = (v73) sortedSet;
            return new w73((SortedSet) v73Var2.f18406m, m33.a(v73Var2.f18407n, j33Var));
        }
        Objects.requireNonNull(sortedSet);
        Objects.requireNonNull(j33Var);
        return new w73(sortedSet, j33Var);
    }

    static boolean c(Set set, Object obj) {
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
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean d(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    static boolean e(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
