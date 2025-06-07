package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class vr2 {
    public static final cs2 a(Callable callable, Object obj, ds2 ds2Var) {
        return b(callable, ds2Var.f7495a, obj, ds2Var);
    }

    public static final cs2 b(Callable callable, bb3 bb3Var, Object obj, ds2 ds2Var) {
        return new cs2(ds2Var, obj, ds2.f7494d, Collections.emptyList(), bb3Var.g(callable));
    }

    public static final cs2 c(ab3 ab3Var, Object obj, ds2 ds2Var) {
        return new cs2(ds2Var, obj, ds2.f7494d, Collections.emptyList(), ab3Var);
    }

    public static final cs2 d(final or2 or2Var, bb3 bb3Var, Object obj, ds2 ds2Var) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.ur2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                or2Var.a();
                return null;
            }
        }, bb3Var, obj, ds2Var);
    }
}
