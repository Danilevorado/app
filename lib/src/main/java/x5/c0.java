package x5;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object b(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    public static Object c(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static void d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
