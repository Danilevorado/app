package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class le3 implements s43 {

    /* renamed from: b, reason: collision with root package name */
    private wy3 f11542b;

    /* renamed from: c, reason: collision with root package name */
    private String f11543c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11546f;

    /* renamed from: a, reason: collision with root package name */
    private final ys3 f11541a = new ys3();

    /* renamed from: d, reason: collision with root package name */
    private int f11544d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f11545e = 8000;

    public final le3 b(boolean z10) {
        this.f11546f = true;
        return this;
    }

    public final le3 c(int i10) {
        this.f11544d = i10;
        return this;
    }

    public final le3 d(int i10) {
        this.f11545e = i10;
        return this;
    }

    public final le3 e(wy3 wy3Var) {
        this.f11542b = wy3Var;
        return this;
    }

    public final le3 f(String str) {
        this.f11543c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.s43
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final rj3 a() {
        rj3 rj3Var = new rj3(this.f11543c, this.f11544d, this.f11545e, this.f11546f, this.f11541a);
        wy3 wy3Var = this.f11542b;
        if (wy3Var != null) {
            rj3Var.b(wy3Var);
        }
        return rj3Var;
    }
}
