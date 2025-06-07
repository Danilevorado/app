package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7626a;

    /* renamed from: b, reason: collision with root package name */
    public int f7627b;

    /* renamed from: c, reason: collision with root package name */
    public int f7628c;

    /* renamed from: d, reason: collision with root package name */
    public long f7629d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7630e;

    /* renamed from: f, reason: collision with root package name */
    private final jm2 f7631f;

    /* renamed from: g, reason: collision with root package name */
    private final jm2 f7632g;

    /* renamed from: h, reason: collision with root package name */
    private int f7633h;

    /* renamed from: i, reason: collision with root package name */
    private int f7634i;

    public e5(jm2 jm2Var, jm2 jm2Var2, boolean z10) throws oh0 {
        this.f7632g = jm2Var;
        this.f7631f = jm2Var2;
        this.f7630e = z10;
        jm2Var2.f(12);
        this.f7626a = jm2Var2.v();
        jm2Var.f(12);
        this.f7634i = jm2Var.v();
        o.b(jm2Var.m() == 1, "first_chunk must be 1");
        this.f7627b = -1;
    }

    public final boolean a() {
        int i10 = this.f7627b + 1;
        this.f7627b = i10;
        if (i10 == this.f7626a) {
            return false;
        }
        this.f7629d = this.f7630e ? this.f7631f.B() : this.f7631f.A();
        if (this.f7627b == this.f7633h) {
            this.f7628c = this.f7632g.v();
            this.f7632g.g(4);
            int i11 = this.f7634i - 1;
            this.f7634i = i11;
            this.f7633h = i11 > 0 ? (-1) + this.f7632g.v() : -1;
        }
        return true;
    }
}
