package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rq2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f14937a;

    /* renamed from: c, reason: collision with root package name */
    private long f14939c;

    /* renamed from: b, reason: collision with root package name */
    private final qq2 f14938b = new qq2();

    /* renamed from: d, reason: collision with root package name */
    private int f14940d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f14941e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f14942f = 0;

    public rq2() {
        long jA = j3.t.b().a();
        this.f14937a = jA;
        this.f14939c = jA;
    }

    public final int a() {
        return this.f14940d;
    }

    public final long b() {
        return this.f14937a;
    }

    public final long c() {
        return this.f14939c;
    }

    public final qq2 d() {
        qq2 qq2VarClone = this.f14938b.clone();
        qq2 qq2Var = this.f14938b;
        qq2Var.f14443m = false;
        qq2Var.f14444n = 0;
        return qq2VarClone;
    }

    public final String e() {
        return "Created: " + this.f14937a + " Last accessed: " + this.f14939c + " Accesses: " + this.f14940d + "\nEntries retrieved: Valid: " + this.f14941e + " Stale: " + this.f14942f;
    }

    public final void f() {
        this.f14939c = j3.t.b().a();
        this.f14940d++;
    }

    public final void g() {
        this.f14942f++;
        this.f14938b.f14444n++;
    }

    public final void h() {
        this.f14941e++;
        this.f14938b.f14443m = true;
    }
}
