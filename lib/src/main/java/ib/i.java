package ib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class i {
    public static final Object[] a(Object[] objArr, boolean z10) {
        rb.h.e(objArr, "<this>");
        if (z10 && rb.h.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        rb.h.d(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    public static List b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        rb.h.d(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
