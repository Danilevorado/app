package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class xk3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f17616a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f17617b;

    /* synthetic */ xk3(Class cls, Class cls2, wk3 wk3Var) {
        this.f17616a = cls;
        this.f17617b = cls2;
    }

    public static xk3 a(vk3 vk3Var, Class cls, Class cls2) {
        return new uk3(cls, cls2, vk3Var);
    }

    public final Class b() {
        return this.f17616a;
    }

    public final Class c() {
        return this.f17617b;
    }
}
