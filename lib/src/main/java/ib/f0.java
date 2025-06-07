package ib;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f0 extends e0 {
    public static Set b() {
        return v.f24346m;
    }

    public static Set c(Object... objArr) {
        rb.h.e(objArr, "elements");
        return (Set) f.h(objArr, new LinkedHashSet(z.a(objArr.length)));
    }

    public static final Set d(Set set) {
        rb.h.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : e0.a(set.iterator().next()) : b();
    }
}
