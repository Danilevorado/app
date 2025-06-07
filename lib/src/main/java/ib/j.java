package ib;

import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class j extends i {
    public static final Collection c(Object[] objArr) {
        rb.h.e(objArr, "<this>");
        return new a(objArr, false);
    }

    public static final List d() {
        return t.f24344m;
    }

    public static List e(Object... objArr) {
        rb.h.e(objArr, "elements");
        return objArr.length > 0 ? e.a(objArr) : d();
    }

    public static List f(List list) {
        rb.h.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : i.b(list.get(0)) : d();
    }

    public static void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
