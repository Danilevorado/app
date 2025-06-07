package ib;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class k extends j {
    public static int h(Iterable iterable, int i10) {
        rb.h.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
