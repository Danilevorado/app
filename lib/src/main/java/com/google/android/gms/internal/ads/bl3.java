package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class bl3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f6535a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f6536b;

    /* synthetic */ bl3(Class cls, Class cls2, al3 al3Var) {
        this.f6535a = cls;
        this.f6536b = cls2;
    }

    public static bl3 b(zk3 zk3Var, Class cls, Class cls2) {
        return new yk3(cls, cls2, zk3Var);
    }

    public abstract Object a(gc3 gc3Var);

    public final Class c() {
        return this.f6535a;
    }

    public final Class d() {
        return this.f6536b;
    }
}
