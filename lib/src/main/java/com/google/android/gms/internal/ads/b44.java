package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b44 implements q44, w34 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6335c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile q44 f6336a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f6337b = f6335c;

    private b44(q44 q44Var) {
        this.f6336a = q44Var;
    }

    public static w34 a(q44 q44Var) {
        if (q44Var instanceof w34) {
            return (w34) q44Var;
        }
        Objects.requireNonNull(q44Var);
        return new b44(q44Var);
    }

    public static q44 c(q44 q44Var) {
        Objects.requireNonNull(q44Var);
        return q44Var instanceof b44 ? q44Var : new b44(q44Var);
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final Object b() {
        Object objB = this.f6337b;
        Object obj = f6335c;
        if (objB == obj) {
            synchronized (this) {
                objB = this.f6337b;
                if (objB == obj) {
                    objB = this.f6336a.b();
                    Object obj2 = this.f6337b;
                    if (obj2 != obj && obj2 != objB) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objB + ". This is likely due to a circular dependency.");
                    }
                    this.f6337b = objB;
                    this.f6336a = null;
                }
            }
        }
        return objB;
    }
}
