package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kl3 implements ll3 {

    /* renamed from: a, reason: collision with root package name */
    private final cw3 f11136a;

    /* renamed from: b, reason: collision with root package name */
    private final ss3 f11137b;

    private kl3(ss3 ss3Var) {
        this.f11137b = ss3Var;
        this.f11136a = vl3.a(ss3Var.P());
    }

    public static kl3 a(ss3 ss3Var) {
        return new kl3(ss3Var);
    }

    public final ss3 b() {
        return this.f11137b;
    }

    @Override // com.google.android.gms.internal.ads.ll3
    public final cw3 f() {
        return this.f11136a;
    }
}
