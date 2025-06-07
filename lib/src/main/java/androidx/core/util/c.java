package androidx.core.util;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c {

    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(Object... objArr) {
        return a.b(objArr);
    }

    public static Object c(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    public static Object d(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }
}
