package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class k44 {
    public static Object a(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static Object b(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    public static void c(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
