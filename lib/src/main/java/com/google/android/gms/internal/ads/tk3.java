package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class tk3 {

    /* renamed from: a, reason: collision with root package name */
    private final cw3 f15882a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f15883b;

    /* synthetic */ tk3(cw3 cw3Var, Class cls, rk3 rk3Var) {
        this.f15882a = cw3Var;
        this.f15883b = cls;
    }

    public static tk3 a(qk3 qk3Var, cw3 cw3Var, Class cls) {
        return new pk3(cw3Var, cls, qk3Var);
    }

    public final cw3 b() {
        return this.f15882a;
    }

    public final Class c() {
        return this.f15883b;
    }
}
