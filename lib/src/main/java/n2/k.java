package n2;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class k {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static Collection c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return collection;
    }

    public static Object d(Object obj) {
        return e(obj, "Argument must not be null");
    }

    public static Object e(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }
}
