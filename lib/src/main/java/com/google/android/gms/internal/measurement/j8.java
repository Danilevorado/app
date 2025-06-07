package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class j8 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile j8 f19028b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile j8 f19029c;

    /* renamed from: d, reason: collision with root package name */
    static final j8 f19030d = new j8(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f19031a = Collections.emptyMap();

    j8(boolean z10) {
    }

    public static j8 a() {
        j8 j8Var = f19028b;
        if (j8Var == null) {
            synchronized (j8.class) {
                j8Var = f19028b;
                if (j8Var == null) {
                    j8Var = f19030d;
                    f19028b = j8Var;
                }
            }
        }
        return j8Var;
    }

    public static j8 b() {
        j8 j8Var = f19029c;
        if (j8Var != null) {
            return j8Var;
        }
        synchronized (j8.class) {
            j8 j8Var2 = f19029c;
            if (j8Var2 != null) {
                return j8Var2;
            }
            j8 j8VarA = p8.a(j8.class);
            f19029c = j8VarA;
            return j8VarA;
        }
    }

    public final t8 c(y9 y9Var, int i10) {
        a5.a.a(this.f19031a.get(new i8(y9Var, i10)));
        return null;
    }
}
