package ib;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class e0 {
    public static final Set a(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        rb.h.d(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
