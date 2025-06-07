package ib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f extends e {
    public static final boolean b(Object[] objArr, Object obj) {
        rb.h.e(objArr, "<this>");
        return e(objArr, obj) >= 0;
    }

    public static List c(Object[] objArr) {
        rb.h.e(objArr, "<this>");
        return (List) d(objArr, new ArrayList());
    }

    public static final Collection d(Object[] objArr, Collection collection) {
        rb.h.e(objArr, "<this>");
        rb.h.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final int e(Object[] objArr, Object obj) {
        rb.h.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (rb.h.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static char f(char[] cArr) {
        rb.h.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object g(Object[] objArr) {
        rb.h.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Collection h(Object[] objArr, Collection collection) {
        rb.h.e(objArr, "<this>");
        rb.h.e(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static List i(Object[] objArr) {
        rb.h.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(objArr) : i.b(objArr[0]) : j.d();
    }

    public static final List j(Object[] objArr) {
        rb.h.e(objArr, "<this>");
        return new ArrayList(j.c(objArr));
    }
}
