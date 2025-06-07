package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p44 implements q44 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13588c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile q44 f13589a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f13590b = f13588c;

    private p44(q44 q44Var) {
        this.f13589a = q44Var;
    }

    public static q44 a(q44 q44Var) {
        if ((q44Var instanceof p44) || (q44Var instanceof b44)) {
            return q44Var;
        }
        Objects.requireNonNull(q44Var);
        return new p44(q44Var);
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final Object b() {
        Object obj = this.f13590b;
        if (obj != f13588c) {
            return obj;
        }
        q44 q44Var = this.f13589a;
        if (q44Var == null) {
            return this.f13590b;
        }
        Object objB = q44Var.b();
        this.f13590b = objB;
        this.f13589a = null;
        return objB;
    }
}
