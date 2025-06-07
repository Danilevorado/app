package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class i63 {
    public static boolean a(Iterable iterable, j33 j33Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(j33Var);
            return c((List) iterable, j33Var);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(j33Var);
        boolean z10 = false;
        while (it.hasNext()) {
            if (j33Var.a(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void b(List list, j33 j33Var, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (j33Var.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }

    private static boolean c(List list, j33 j33Var) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!j33Var.a(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        b(list, j33Var, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        b(list, j33Var, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
