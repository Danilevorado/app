package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class ak3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f6135a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f6136b;

    /* synthetic */ ak3(Class cls, Class cls2, zj3 zj3Var) {
        this.f6135a = cls;
        this.f6136b = cls2;
    }

    public static ak3 a(yj3 yj3Var, Class cls, Class cls2) {
        return new xj3(cls, cls2, yj3Var);
    }

    public final Class b() {
        return this.f6135a;
    }

    public final Class c() {
        return this.f6136b;
    }
}
