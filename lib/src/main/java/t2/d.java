package t2;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static Object b(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    public static Object c(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }
}
