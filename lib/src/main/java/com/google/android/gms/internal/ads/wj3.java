package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class wj3 {

    /* renamed from: a, reason: collision with root package name */
    private final cw3 f17179a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f17180b;

    /* synthetic */ wj3(cw3 cw3Var, Class cls, vj3 vj3Var) {
        this.f17179a = cw3Var;
        this.f17180b = cls;
    }

    public static wj3 b(uj3 uj3Var, cw3 cw3Var, Class cls) {
        return new tj3(cw3Var, cls, uj3Var);
    }

    public abstract gc3 a(ll3 ll3Var, rd3 rd3Var);

    public final cw3 c() {
        return this.f17179a;
    }

    public final Class d() {
        return this.f17180b;
    }
}
